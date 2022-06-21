package com.empresa.poc.iptuapi.repository;

import com.empresa.poc.iptuapi.domain.Iptu;
import com.empresa.poc.iptuapi.dto.IptuDto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IptuRepository extends PagingAndSortingRepository<Iptu, Integer> {

    Iptu findByContribuinte(String contribuinte);

    @Query(value = "SELECT " +

            " i.\"numeroDoContribuinte\", " +
            " i.\"anoDoExercicio\", " +
            " i.\"numeroDaNl\", " +
            " i.\"dataDoCadastramento\", " +
            " i.\"tipoDeContribuinte1\", " +
            " i.\"cpfCnpjDoContribuinte1\", " +
            " i.\"nomeDoContribuinte1\", " +
            " i.\"tipoDeContribuinte2\", " +
            " i.\"cpfCnpjDoContribuinte2\", " +
            " i.\"nomeDoContribuinte2\", " +
            " i.\"numeroDoCondominio\", " +
            " i.\"codlogDoImovel\", " +
            " i.\"logradouro\", " +
            " i.\"numero\", " +
            " i.\"complementoDoImovel\", " +
            " i.\"bairroDoImovel\", " +
            " i.\"referenciaDoImovel\", " +
            " i.\"cepDoImovel\", " +
            " i.\"quantidadeDeEsquinasFrentes\", " +
            " i.\"fracaoIdeal\", " +
            " i.\"areaDoTerreno\", " +
            " i.\"areaConstruida\", " +
            " i.\"areaOcupada\", " +
            " i.\"valorDoMQDoTerreno\", " +
            " i.\"valorDoMQDeConstrucao\", " +
            " i.\"anoDaConstrucaoCorrigido\", " +
            " i.\"quantidadeDePavimentos\", " +
            " i.\"testadaDeCalculo\", " +
            " i.\"tipoDeUsoDoImovel\", " +
            " i.\"tipoDePadraoDaCostrucao\", " +
            " i.\"tipoDeTerreno\", " +
            " i.\"fatorDeObsolescencia\", " +
            " i.\"anoDeInicioDaVidaDoContribuinte\", " +
            " i.\"mesDeInicioDaVidaDoContribuinte\", " +
            " i.\"faseDoContribuinte\" " +





            " FROM Iptu i WHERE upper(i.logradouro) LIKE CONCAT('%', upper(:withPartOfLogradouro), '%') and " +
            "i.numero = :numero", nativeQuery = true)
      List<Iptu> findByContribuinteWithPartOfLogradouroAndNumero(@Param("withPartOfLogradouro") String withPartOfLogradouro,
                                                                 @Param("numero") String numero);

}
  //  List<Iptu> findContribuinteWithPartOfLogradouroAndNumeroimovel(@Param("logradouro") String logradouro,
  //                                                                 @Param("numerodoimovel") String numerodoimovel);

//@Query("select contribuinte, logradouro, numerodoimovel, areadoterreno, areaconstruida, " +
//        "areaocupada, valordomqdoterreno, valordomqdeconstrucao, anodaconstrucao " +
//        "from iptu where upper(logradouro) " +
//        "like CONCAT('%',upper(rtrim('Silva Bueno')),'%') and numerodoimovel = '199'")
/*
    CREATE VIEW vw_resultado as
select "NUMERO DO CONTRIBUINTE","NOME DE LOGRADOURO DO IMOVEL","NUMERO DO IMOVEL",
        "AREA DO TERRENO", "AREA CONSTRUIDA", "AREA OCUPADA", "VALOR DO M2 DO TERRENO", "VALOR DO M2 DE CONSTRUCAO",
        "ANO DA CONSTRUCAO CORRIGIDO"
        from dados d
        INNER JOIN casas c on upper("NOME DE LOGRADOURO DO IMOVEL") like CONCAT('%',upper(rtrim(c."Endereco")),'%') WHERE c."numero" = d."NUMERO DO IMOVEL"
*/

//    @Query("SELECT u.username FROM User u WHERE u.username LIKE CONCAT('%',:username,'%')")
//    List<String> findUsersWithPartOfName(@Param("username") String username);

//    @Query(value = "SELECT c.id, c.nome, c.populacao from Cidade c WHERE c.nome LIKE CONCAT ('%', :parteDoNome, '%')", nativeQuery = true)
//    List<Cidade> findByParteDoNome(@Param("parteDoNome") String parteDoNome);
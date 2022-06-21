package com.empresa.poc.iptuapi.controller;

import com.empresa.poc.iptuapi.domain.Iptu;
import com.empresa.poc.iptuapi.dto.IptuDto;
import com.empresa.poc.iptuapi.service.IptuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/iptus")
@CrossOrigin("*")
public class IptuController {

    @Autowired
    private IptuService iptuService;

    @GetMapping
    public Page<Iptu> todosPaginados(@RequestParam(defaultValue = "0") int page,
                                     @RequestParam(defaultValue = "3") int size) {
        Pageable paging = PageRequest.of(page, size);
        return iptuService.todosPaginados(paging);

        }

    @GetMapping("/{contribuinte}")
    public IptuDto um(@PathVariable String contribuinte) {

        Iptu iptuReturn = iptuService.findByContribuinte(contribuinte);
        IptuDto dtoReturn = new IptuDto();
        dtoReturn.setContribuinte(iptuReturn.getContribuinte());
        dtoReturn.setAno(iptuReturn.getAno());
        dtoReturn.setNumerodanl(iptuReturn.getNumerodanl());
        dtoReturn.setData(iptuReturn.getData());
        dtoReturn.setTipo1(iptuReturn.getTipo1());
        dtoReturn.setCpfcnpj1(iptuReturn.getCpfcnpj1());
        dtoReturn.setNome1(iptuReturn.getNome1());
        dtoReturn.setTipo2(iptuReturn.getTipo2());
        dtoReturn.setCpfcnpj2(iptuReturn.getCpfcnpj2());
        dtoReturn.setNome2(iptuReturn.getNome2());
        dtoReturn.setNumerodocondominio(iptuReturn.getNumerodocondominio());
        dtoReturn.setCodlog(iptuReturn.getCodlog());
        dtoReturn.setLogradouro(iptuReturn.getLogradouro());
        dtoReturn.setNumerodoimovel(iptuReturn.getNumerodoimovel());
        dtoReturn.setComplemento(iptuReturn.getComplemento());
        dtoReturn.setBairro(iptuReturn.getBairro());
        dtoReturn.setReferencia(iptuReturn.getReferencia());
        dtoReturn.setCep(iptuReturn.getCep());
        dtoReturn.setQuantidadedeesquinasfrentes(iptuReturn.getQuantidadedeesquinasfrentes());
        dtoReturn.setFracaoideal(iptuReturn.getFracaoideal());
        dtoReturn.setAreadoterreno(iptuReturn.getAreadoterreno());
        dtoReturn.setAreaconstruida(iptuReturn.getAreaconstruida());
        dtoReturn.setAreaocupada(iptuReturn.getAreaocupada());
        dtoReturn.setValordomqdoterreno(iptuReturn.getValordomqdoterreno());
        dtoReturn.setValordomqdeconstrucao(iptuReturn.getValordomqdeconstrucao());
        dtoReturn.setAnodaconstrucao(iptuReturn.getAnodaconstrucao());
        dtoReturn.setQuantidadedepavimentos(iptuReturn.getQuantidadedepavimentos());
        dtoReturn.setTestada(iptuReturn.getTestada());
        dtoReturn.setTipodeuso(iptuReturn.getTipodeuso());
        dtoReturn.setTipodepadrao(iptuReturn.getTipodepadrao());
        dtoReturn.setTipodeterreno(iptuReturn.getTipodeterreno());
        dtoReturn.setObsolescencia(iptuReturn.getObsolescencia());
        dtoReturn.setAnodeiniciodavida(iptuReturn.getAnodeiniciodavida());
        dtoReturn.setMesdeiniciodavida(iptuReturn.getMesdeiniciodavida());
        dtoReturn.setFase(iptuReturn.getFase());

        return dtoReturn;
    }

    @GetMapping("/{logradouro}/{numero}")
    public List<IptuDto> pesquisa(@PathVariable String logradouro, @PathVariable String numero) {
        List<Iptu> iptuReturn =  iptuService.findByContribuinteWithPartOfLogradouroAndNumero(logradouro, numero);
         List<IptuDto> iptuDto = new ArrayList<>();


//        public IptuDto pesquisa(@PathVariable String logradouro, @PathVariable String numerodoimovel) {
//            List<Iptu> iptuReturn =  iptuService.findContribuinteLikeLogradouroAndNumerodoimovel(logradouro, numerodoimovel);
//            List<IptuDto> iptuDto = new ArrayList<>();

        for(Iptu i : iptuReturn){

            IptuDto dto = new IptuDto();
            dto.setContribuinte(i.getContribuinte());
            ;
            dto.setAno(i.getAno());
            dto.setNumerodanl(i.getNumerodanl());
            dto.setData(i.getData());
            dto.setTipo1(i.getTipo1());
            dto.setCpfcnpj1(i.getCpfcnpj1());
            dto.setNome1(i.getNome1());
            dto.setTipo2(i.getTipo2());
            dto.setCpfcnpj2(i.getCpfcnpj2());
            dto.setNome2(i.getNome2());
            dto.setNumerodocondominio(i.getNumerodocondominio());
            dto.setCodlog(i.getCodlog());
            dto.setLogradouro(i.getLogradouro());
            dto.setNumerodoimovel(i.getNumerodoimovel());
            dto.setComplemento(i.getComplemento());
            dto.setBairro(i.getBairro());
            dto.setReferencia(i.getReferencia());
            dto.setCep(i.getCep());
            dto.setQuantidadedeesquinasfrentes(i.getQuantidadedeesquinasfrentes());
            dto.setFracaoideal(i.getFracaoideal());
            dto.setAreadoterreno(i.getAreadoterreno());
            dto.setAreaconstruida(i.getAreaconstruida());
            dto.setAreaocupada(i.getAreaocupada());
            dto.setValordomqdoterreno(i.getValordomqdoterreno());
            dto.setValordomqdeconstrucao(i.getValordomqdeconstrucao());
            dto.setAnodaconstrucao(i.getAnodaconstrucao());
            dto.setQuantidadedepavimentos(i.getQuantidadedepavimentos());
            dto.setTestada(i.getTestada());
            dto.setTipodeuso(i.getTipodeuso());
            dto.setTipodepadrao(i.getTipodepadrao());
            dto.setTipodeterreno(i.getTipodeterreno());
            dto.setObsolescencia(i.getObsolescencia());
            dto.setAnodeiniciodavida(i.getAnodeiniciodavida());
            dto.setMesdeiniciodavida(i.getMesdeiniciodavida());
            dto.setFase(i.getFase());







            iptuDto.add(dto);
        }



    return iptuDto;
    }
}
//    @Query("select numeroDoContribuinte, NomeDoContribuinte1, NomeDeLogradouroDoImovel, NumeroDoImovel, AreaConstruida" +
//            "from iptu d like d.")





//    @Query("select count(ped) from Pedido ped where ped.cliente =:cliente")
//    public int pedidosDoClienteEncontrados(@Param("iptu") Iptu iptu);



/*
    CREATE VIEW vw_resultado as
select "NUMERO DO CONTRIBUINTE","NOME DE LOGRADOURO DO IMOVEL","NUMERO DO IMOVEL",
        "AREA DO TERRENO", "AREA CONSTRUIDA", "AREA OCUPADA", "VALOR DO M2 DO TERRENO", "VALOR DO M2 DE CONSTRUCAO",
        "ANO DA CONSTRUCAO CORRIGIDO"
        from dados d
        INNER JOIN casas c on upper("NOME DE LOGRADOURO DO IMOVEL") like CONCAT('%',upper(rtrim(c."Endereco")),'%') WHERE c."numero" = d."NUMERO DO IMOVEL"
*/
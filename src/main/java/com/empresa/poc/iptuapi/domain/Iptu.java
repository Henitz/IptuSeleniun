package com.empresa.poc.iptuapi.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Iptu {


    @Id
    @Column(name = "\"numeroDoContribuinte\"")
    private String contribuinte;

    @Column(name = "\"anoDoExercicio\"")
    private String ano;

    @Column(name = "\"numeroDaNl\"")
    private String numerodanl;

    @Column(name = "\"dataDoCadastramento\"")
    private String data;


    @Column(name = "\"tipoDeContribuinte1\"")
    private String tipo1;

    @Column(name = "\"cpfCnpjDoContribuinte1\"")
    private String cpfcnpj1;

    @Column(name = "\"nomeDoContribuinte1\"")
    private String nome1;

    @Column(name = "\"tipoDeContribuinte2\"")
    private String tipo2;

    @Column(name = "\"cpfCnpjDoContribuinte2\"")
    private String cpfcnpj2;

    @Column(name = "\"nomeDoContribuinte2\"")
    private String nome2;

    @Column(name = "\"numeroDoCondominio\"")
    private String numerodocondominio;

    @Column(name = "\"codlogDoImovel\"")
    private String codlog;

    @Column(name = "\"logradouro\"")
    private String logradouro;

    @Column(name = "\"numero\"")
    private String numerodoimovel;

    @Column(name = "\"complementoDoImovel\"")
    private String complemento;

    @Column(name = "\"bairroDoImovel\"")
    private String bairro;

    @Column(name = "\"referenciaDoImovel\"")
    private String referencia;

    @Column(name = "\"cepDoImovel\"")
    private String cep;

    @Column(name = "\"quantidadeDeEsquinasFrentes\"")
    private String quantidadedeesquinasfrentes;

    @Column(name = "\"fracaoIdeal\"")
    private String fracaoideal;

    @Column(name = "\"areaDoTerreno\"")
    private String areadoterreno;

    @Column(name = "\"areaConstruida\"")
    private String areaconstruida;

    @Column(name = "\"areaOcupada\"")
    private String areaocupada;

    @Column(name = "\"valorDoMQDoTerreno\"")
    private String valordomqdoterreno;

    @Column(name = "\"valorDoMQDeConstrucao\"")
    private String valordomqdeconstrucao;

    @Column(name = "\"anoDaConstrucaoCorrigido\"")
    private String anodaconstrucao;

    @Column(name = "\"quantidadeDePavimentos\"")
    private String quantidadedepavimentos;

    @Column(name = "\"testadaDeCalculo\"")
    private String testada;

    @Column(name = "\"tipoDeUsoDoImovel\"")
    private String tipodeuso;

    @Column(name = "\"tipoDePadraoDaCostrucao\"")
    private String tipodepadrao;

    @Column(name = "\"tipoDeTerreno\"")
    private String tipodeterreno;

    @Column(name = "\"fatorDeObsolescencia\"")
    private String obsolescencia;

    @Column(name = "\"anoDeInicioDaVidaDoContribuinte\"")
    private String anodeiniciodavida;

    @Column(name = "\"mesDeInicioDaVidaDoContribuinte\"")
    private String mesdeiniciodavida;

    @Column(name = "\"faseDoContribuinte\"")
    private String fase;


    public String getContribuinte() {
        return contribuinte;
    }

    public String getAno() {
        return ano;
    }

    public String getNumerodanl() {
        return numerodanl;
    }

    public String getData() {
        return data;
    }

    public String getTipo1() {
        return tipo1;
    }

    public String getCpfcnpj1() {
        return cpfcnpj1;
    }

    public String getNome1() {
        return nome1;
    }

    public String getTipo2() {
        return tipo2;
    }

    public String getCpfcnpj2() {
        return cpfcnpj2;
    }

    public String getNome2() {
        return nome2;
    }

    public String getNumerodocondominio() {
        return numerodocondominio;
    }

    public String getCodlog() {
        return codlog;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getNumerodoimovel() {
        return numerodoimovel;
    }

    public String getComplemento() {
        return complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public String getReferencia() {
        return referencia;
    }

    public String getCep() {
        return cep;
    }

    public String getQuantidadedeesquinasfrentes() {
        return quantidadedeesquinasfrentes;
    }

    public String getFracaoideal() {
        return fracaoideal;
    }

    public String getAreadoterreno() {
        return areadoterreno;
    }

    public String getAreaconstruida() {
        return areaconstruida;
    }

    public String getAreaocupada() {
        return areaocupada;
    }

    public String getValordomqdoterreno() {
        return valordomqdoterreno;
    }

    public String getValordomqdeconstrucao() {
        return valordomqdeconstrucao;
    }

    public String getAnodaconstrucao() {
        return anodaconstrucao;
    }

    public String getQuantidadedepavimentos() {
        return quantidadedepavimentos;
    }

    public String getTestada() {
        return testada;
    }

    public String getTipodeuso() {
        return tipodeuso;
    }

    public String getTipodepadrao() {
        return tipodepadrao;
    }

    public String getTipodeterreno() {
        return tipodeterreno;
    }

    public String getObsolescencia() {
        return obsolescencia;
    }

    public String getAnodeiniciodavida() {
        return anodeiniciodavida;
    }

    public String getMesdeiniciodavida() {
        return mesdeiniciodavida;
    }

    public String getFase() {
        return fase;
    }
}

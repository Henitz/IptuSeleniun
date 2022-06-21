package com.empresa.poc.iptuapi.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class IptuLite {

    @Id
    @Column(name = "\"numeroDoContribuinte\"")
    private String contribuinte;

    @Column(name = "\"nomeDeLogradouroDoImovel\"")
    private String logradouro;

    public String getContribuinte() {
        return contribuinte;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setContribuinte(String contribuinte) {
        this.contribuinte = contribuinte;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }
}

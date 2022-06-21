package com.empresa.poc.iptuapi.dto;

public class IptuDtoLite {

    private String contribuinte;
    private String logradouro;

    public String getLogradouro() {
        return logradouro;
    }

    public String getContribuinte() {
        return contribuinte;
    }

    public void setContribuinte(String contribuinte) {
        this.contribuinte = contribuinte;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }
}

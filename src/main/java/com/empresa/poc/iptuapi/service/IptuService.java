package com.empresa.poc.iptuapi.service;

import com.empresa.poc.iptuapi.domain.Iptu;
import com.empresa.poc.iptuapi.dto.IptuDto;
import com.empresa.poc.iptuapi.repository.IptuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IptuService {

    @Autowired
    IptuRepository iptuRepository;


    public Page<Iptu> todosPaginados(Pageable pageable) {
        return iptuRepository.findAll(pageable);
    }

    public Iptu findByContribuinte(String contribuinte) {
        return iptuRepository.findByContribuinte(contribuinte);
    }


    public List<Iptu> findByContribuinteWithPartOfLogradouroAndNumero(String withPartOf, String numero) {
        return iptuRepository.findByContribuinteWithPartOfLogradouroAndNumero(withPartOf, numero);
    }

 //   public List<Iptu> findContribuinteLikeLogradouroAndNumerodoimovel(String logradouro, String numerodoimovel) {
//    public List<Iptu> findContribuinteLikeLogradouroAndNumerodoimovel(String logradouro, String numerodoimovel) {
//        return iptuRepository.findContribuinteLikeLogradouroAndNumerodoimovel(logradouro,numerodoimovel);


//    @Query(value = "SELECT c.id, c.nome, c.populacao from Cidade c WHERE c.nome LIKE CONCAT ('%', :parteDoNome, '%')", nativeQuery = true)
//    List<Cidade> findByParteDoNome(@Param("parteDoNome") String parteDoNome);

}

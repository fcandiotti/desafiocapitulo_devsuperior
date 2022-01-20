package com.devsuperior.desafio.dto;

import com.devsuperior.desafio.entities.Client;

import java.time.Instant;

public class ClientDTO {
    private static final long SerialVersionUID = 1;

    private Long id;
    private String name;
    private String cpf;
    private Double income;
    private Instant BirthDate;
    private Integer children;

    public ClientDTO() {
    }

    public ClientDTO(Client entity) {
        this.id = entity.getId();
        this.name = entity.getName();
        this.cpf = entity.getCpf();
        this.income = entity.getIncome();
        BirthDate = entity.getBirthDate();
        this.children = entity.getChildren();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Double getIncome() {
        return income;
    }

    public void setIncome(Double income) {
        this.income = income;
    }

    public Instant getBirthDate() {
        return BirthDate;
    }

    public void setBirthDate(Instant birthDate) {
        BirthDate = birthDate;
    }

    public Integer getChildren() {
        return children;
    }

    public void setChildren(Integer children) {
        this.children = children;
    }
}

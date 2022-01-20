package com.devsuperior.desafio.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;

@Entity
@Table(name = "tb_cliente")
public class Cliente implements Serializable {
    private static final long SerialVersionUID = 1;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String cpf;
    private Double income;

    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant BirthDate;

    private Integer children;

    public Cliente() {
    }

    public Cliente(Long id, String name, String cpf, Double income, Instant birthDate, Integer children) {
        this.id = id;
        this.name = name;
        this.cpf = cpf;
        this.income = income;
        BirthDate = birthDate;
        this.children = children;
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

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result * ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if(getClass() != obj.getClass())
            return false;
        Cliente cliente = (Cliente) obj;
        if  (id == null) {
            return false;
        } else if (!id.equals(cliente.id))
            return false;
        return true;
    }
}

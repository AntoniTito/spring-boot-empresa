package com.tci.springbootempresa.dao.entity;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "empresa")
public class Empresa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idEmpresa")
    private Long id;

    @Column(name = "ruc", nullable = false)
    private String ruc;

    @Column(name = "razonSocial", nullable = false)
    private String razonSocial;

    @Column(name = "direccion" , nullable = false)
    private String direccion;

    @Column(name = "estado", nullable = false)
    private int estado;

}

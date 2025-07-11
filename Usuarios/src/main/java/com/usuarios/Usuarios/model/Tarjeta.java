package com.usuarios.Usuarios.model;

import java.sql.Date;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tarjeta")

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Tarjeta {

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_tarjeta;

    @Column(unique = true,length = 16,nullable = false)
    private String numero_Tarjeta;
    
    @Column(unique = false,length = 3, nullable = true)
    private String cvv;

    @Column(unique = false,length = 100,nullable = false)
    private String nom_titular;

    @Column(unique = false,nullable = false)
    private Date fecha_vencimiento;

    @ManyToOne
    @JoinColumn(name = "id_usuario",nullable = false)
    private Usuario usuario;





}

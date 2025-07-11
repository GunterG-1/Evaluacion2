package com.usuarios.Usuarios.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "direccion")

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Direccion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_dirección;

    @Column(unique = true,length = 50,nullable = false)
    private String calle;

    @Column(unique = false,length = 50,nullable = false)
    private String numero;

    @Column(unique = false,length = 50,nullable = false)
    private String ciudad;

    @Column(unique = false,length = 50,nullable = false)
    private String region;

    @Column(unique = false,length = 255,nullable = true)
    private String detalle;
}

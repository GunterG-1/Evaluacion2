package com.usuarios.Usuarios.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name="usuario")

@Data
@AllArgsConstructor
@NoArgsConstructor


public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_usuario;

    @Column(unique = true,length = 25,nullable = false)
    private String nom_usuario;

    @Column(unique = false,length = 25,nullable = false)
    private String ap_usuario; 

    @Column(unique = false,length = 25,nullable=true)
    private String dir_usuario;

    @Column(unique=false,length = 25,nullable=false)
    private String tipo_usuario;

    @Column(unique = true,length = 50,nullable = false)
    private String email_Usuario;
    

    
}

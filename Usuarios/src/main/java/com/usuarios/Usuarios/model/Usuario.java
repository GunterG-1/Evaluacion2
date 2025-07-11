package com.usuarios.Usuarios.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
    private long id_usuario;

    @Column(unique = false,length = 25,nullable = false)
    private String nom_usuario;

    @Column(unique = false,length = 25,nullable = false)
    private String ap_usuario; 

    @Column(unique = true,length = 50,nullable = false)
    private String email_Usuario;

    @Column(unique = false,length = 25,nullable = false)
    private String contraseña_usuario;

    @OneToMany(mappedBy = "usuario",cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Direccion> direcciones_usuario = new ArrayList<>();

    @OneToMany(mappedBy = "usuario",cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Tarjeta> tarjetas_usuario = new ArrayList<>();
    
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
        name = "rol",
        joinColumns = @JoinColumn(name = "id_usuario"),
        inverseJoinColumns = @JoinColumn(name = "id_rol")
    )
    private Set<Rol> roles = new HashSet<>();
}

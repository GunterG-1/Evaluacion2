package com.usuarios.Usuarios.model;

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

    private int id_usuario;
    private int numero_Tarjeta;
    

}

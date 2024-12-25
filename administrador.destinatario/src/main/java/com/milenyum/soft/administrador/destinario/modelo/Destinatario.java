package com.milenyum.soft.administrador.destinario.modelo;


import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@ToString
public class Destinatario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDestinatario;
    private String dniDestinatario;
    private String nombre;
    private String apellido;
    private String direccion;
    private String telefono;
    @ElementCollection
    private List<String> listaEnvios;

}

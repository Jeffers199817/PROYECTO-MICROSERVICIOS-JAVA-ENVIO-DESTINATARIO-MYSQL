package com.milenyum.soft.administrador.destinario.modelo;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

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

}

package com.milenyum.soft.administrador.envio.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Entity
@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Envio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEnvio;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate fechaDeCreacion;
    private String estadoDeProcesamiento;
    private String descripcionDelEnvio;
}

package com.milenyum.soft.administrador.envio.modelo;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;


    @Setter
    @Getter
    @AllArgsConstructor
    @NoArgsConstructor
    @ToString
    public class Destinatario {
        private Long idDestinatario;
        private String dniDestinatario;
        private String nombre;
        private String apellido;
        private String direccion;
        private String telefono;
        private List<String> listaEnvios;

    }



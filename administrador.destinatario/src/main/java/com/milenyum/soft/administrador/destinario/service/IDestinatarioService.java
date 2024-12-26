package com.milenyum.soft.administrador.destinario.service;


import com.milenyum.soft.administrador.destinario.modelo.Destinatario;

import java.util.List;

public interface IDestinatarioService {


    public void crearDestinatario(Destinatario destinatario);

    public void eliminarDestinatario( Long idDestinatario);

    public Destinatario obtenerDestinatario( Long idDestinatario);

    public List<Destinatario> listarDestinatarios( );

    public Destinatario actualizarDestinatario( Destinatario destinatario);


    public List<Destinatario> getDestinatario(List<String> dniLista);
}

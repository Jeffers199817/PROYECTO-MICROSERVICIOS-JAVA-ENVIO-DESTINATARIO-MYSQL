package com.milenyum.soft.administrador.envio.service;

import com.milenyum.soft.administrador.envio.modelo.Envio;

import java.util.List;

public interface IEnvioService {

    public String crearEnvio(Envio envio);

    public void eliminarEnvio( Long idEnvio);

    public List<Envio> listarEnvios( );

    public Envio obtenerEnvio( Long idEnvio);

    public Envio actualizarEnvio( Envio envio);

}

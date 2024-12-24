package com.milenyum.soft.administrador.envio.service;

import com.milenyum.soft.administrador.envio.modelo.Envio;

import java.util.List;

public interface IEnvioService {

    public void crearEnvio();

    public void eliminarEnvio();

    public List<Envio> listarEnvios();

    public Envio obtenerEnvio();

    public Envio actualizarEnvio();

}

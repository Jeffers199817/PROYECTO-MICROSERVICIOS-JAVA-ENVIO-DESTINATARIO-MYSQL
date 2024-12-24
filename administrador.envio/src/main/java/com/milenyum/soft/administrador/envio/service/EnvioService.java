package com.milenyum.soft.administrador.envio.service;

import com.milenyum.soft.administrador.envio.modelo.Envio;
import com.milenyum.soft.administrador.envio.repository.IEnvioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnvioService implements IEnvioService {

    @Autowired
    private IEnvioRepository envioRespository;


    @Override
    public void crearEnvio(Envio envio) {
        envioRespository.save(envio);
    }

    @Override
    public void eliminarEnvio(Long idEnvio) {
        envioRespository.deleteById(idEnvio);
    }

    @Override
    public List<Envio> listarEnvios() {
        return envioRespository.findAll();
    }

    @Override
    public Envio obtenerEnvio(Long idEnvio) {
        return envioRespository.findById(idEnvio).get();
    }

    @Override
    public Envio actualizarEnvio(Envio envio) {
        Envio envi =this.obtenerEnvio(envio.getIdEnvio());
        if(envi!=null){
            envi.setDescripcionDelEnvio(envio.getDescripcionDelEnvio());
            envi.setEstadoDeProcesamiento(envio.getEstadoDeProcesamiento());
            envi.setFechaDeCreacion(envio.getFechaDeCreacion());
            return envioRespository.save(envi);
        }
        return null;

    }
}

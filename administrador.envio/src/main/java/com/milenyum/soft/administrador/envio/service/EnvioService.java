package com.milenyum.soft.administrador.envio.service;

import com.milenyum.soft.administrador.envio.modelo.Destinatario;
import com.milenyum.soft.administrador.envio.modelo.Envio;
import com.milenyum.soft.administrador.envio.repository.IAppConfig;
import com.milenyum.soft.administrador.envio.repository.IEnvioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EnvioService implements IEnvioService {

    @Autowired
    private IEnvioRepository envioRespository;
    @Autowired
    private IAppConfig appConfig;



    @Override
    public String crearEnvio(Envio envio) {
        List<Destinatario> listaDestinatario = appConfig.getDestinatario(envio.getListaDestinatarios());
        List<String> noEncontrados= new ArrayList<>();
        List<String> encontrados= new ArrayList<>();

        if (listaDestinatario != null) {


            for (Destinatario destinatario : listaDestinatario){

                for (String dni : envio.getListaDestinatarios()) {
                    if (dni.equals(destinatario.getDniDestinatario())) {

                        encontrados.add(dni);

                    } else {
                        noEncontrados.add(dni);
                    }
                }
            }

            for(String dni: encontrados)
            {
                envio.getListaDestinatarios().add(dni);
            }


            envioRespository.save(envio);
        }
        return "Envio creado correctamente con: "+ encontrados.toString() +  "destinatarios no encontrados: " + noEncontrados.toString();

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



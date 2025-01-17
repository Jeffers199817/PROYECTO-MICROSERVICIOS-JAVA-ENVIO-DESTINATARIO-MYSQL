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
        System.out.println("comienzo de envio");
        List<Destinatario> listaDestinatario = appConfig.getDestinatario(envio.getListaDestinatarios());
        List<String> noEncontrados= new ArrayList<>();
        System.out.println("Comienzo de crear un envio");
        List<String> encontrados= new ArrayList<>();
        System.out.println(     " ");


        System.out.println("El sistema está creando un envio");

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
            System.out.println(  );
        }
        return "Envio creado correctamente con: "+ encontrados.toString() +  "destinatarios no encontrados: " + noEncontrados.toString();

    }


    @Override
    public void eliminarEnvio(Long idEnvio) {
        System.out.println("El sistema está eliminando el envio con id: "+idEnvio);
        envioRespository.deleteById(idEnvio);
    }

    @Override
    public List<Envio> listarEnvios() {

        System.out.println( "");

        return envioRespository.findAll();
    }

    @Override
    public Envio obtenerEnvio(Long idEnvio) {
        System.out.println("El sistema está buscando el envio con id: "+idEnvio);
        System.out.println();
        System.out.println("El sistema ");
        return envioRespository.findById(idEnvio).get();
    }

    @Override
    public Envio actualizarEnvio(Envio envio) {
        Envio envi =this.obtenerEnvio(envio.getIdEnvio());
        if(envi!=null){
            envi.setDescripcionDelEnvio(envio.getDescripcionDelEnvio());
            System.out.println("Lisot");
            System.out.println("Validnado la actualización ");
            envi.setEstadoDeProcesamiento(envio.getEstadoDeProcesamiento());
            envi.setFechaDeCreacion(envio.getFechaDeCreacion());

            System.out.println("El sistema está actualizando el envio con id: "+envio.getIdEnvio());
            return envioRespository.save(envi);


        }
        System.out.println("El sistema falló al actualizar el envio");
        return null;

    }
}



package com.milenyum.soft.administrador.destinario.service;

import com.milenyum.soft.administrador.destinario.modelo.Destinatario;
import com.milenyum.soft.administrador.destinario.repository.IDestinatarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DestinatarioService implements IDestinatarioService {

    @Autowired
    private IDestinatarioRepository destinatarioRepository;


    @Override
    public void crearDestinatario(Destinatario destinatario) {

        destinatarioRepository.save(destinatario);

    }

    @Override
    public void eliminarDestinatario(Long idDestinatario) {

        destinatarioRepository.deleteById(idDestinatario);
    }

    @Override
    public Destinatario obtenerDestinatario(Long idDestinatario) {
        return destinatarioRepository.findById(idDestinatario).get();
    }

    @Override
    public List<Destinatario> listarDestinatarios() {
        return destinatarioRepository.findAll();
    }

    @Override
    public Destinatario actualizarDestinatario(Destinatario destinatario) {

        Destinatario desti =this.obtenerDestinatario(destinatario.getIdDestinatario());
        if(desti!=null){
            desti.setNombre(destinatario.getNombre());
            desti.setDireccion(destinatario.getDireccion());
            desti.setTelefono(destinatario.getTelefono());
            return destinatarioRepository.save(desti);
        }
        return  null;
    }

    @Override
    public List<Destinatario> getDestinatario(List<String> dniLista) {
        List<Destinatario> listaDestinatario = new ArrayList<>();
        for(String dni : dniLista){
           listaDestinatario.add( destinatarioRepository.getDestinatarioDni(dni));
        }




        return listaDestinatario;
    }
}

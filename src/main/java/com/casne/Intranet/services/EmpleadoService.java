package com.casne.Intranet.services;

import java.util.ArrayList;
import java.util.Optional;

import com.casne.Intranet.models.EmpleadoModel;
import com.casne.Intranet.repositories.EmpleadoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpleadoService {
    @Autowired
    EmpleadoRepository empleadoRepository;

    public ArrayList<EmpleadoModel> obtenerEmpleados(){
        return (ArrayList<EmpleadoModel>) empleadoRepository.findAll();
    }

    public EmpleadoModel guardarEmpleado(EmpleadoModel empleado){
        return empleadoRepository.save(empleado);
    }

    public Optional<EmpleadoModel> obetenerPorId(Long id){
        return empleadoRepository.findById(id);
    }

    public ArrayList<EmpleadoModel> obtenerPorNombre(String nombre){
        return empleadoRepository.findByNombre(nombre);
    }

    public boolean eliminarEmpleado(Long id) {
        try{
            empleadoRepository.deleteById(id);
            return true;
        }catch(Exception err){
            return false;
        }
    }
}

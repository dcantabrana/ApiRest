package com.casne.Intranet.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.casne.Intranet.models.EmpleadoModel;
import com.casne.Intranet.services.EmpleadoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/empleado")
public class EmpleadoController {
    @Autowired
    EmpleadoService empleadoService;

    @GetMapping()
    public ArrayList<EmpleadoModel> obtenerEmpleados(){
        return empleadoService.obtenerEmpleados();
    }

    @PostMapping()
    public EmpleadoModel guardarEmpleado(@RequestBody EmpleadoModel empleado){
        return this.empleadoService.guardarEmpleado(empleado);
    }

    @GetMapping( path = "/{id}")
    public Optional<EmpleadoModel> obetenerPorId(@PathVariable("id") Long id){
        return this.empleadoService.obetenerPorId(id);
    }

    @GetMapping("/query")
    public ArrayList<EmpleadoModel> obtenerEmpleadoPorNombre(@RequestParam("Nombre") String nombre){
        return this.empleadoService.obtenerPorNombre(nombre);
    }

    @DeleteMapping( path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id){
        boolean ok = this.empleadoService.eliminarEmpleado(id);
        if (ok){
            return "Se ha eliminado el empleado con id " + id;
        }else {
            return "No se pudo eliminar el empleado con id " + id;
        }
    }
    
}

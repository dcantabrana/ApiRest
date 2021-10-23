package com.casne.Intranet.repositories;

import java.util.ArrayList;

import com.casne.Intranet.models.EmpleadoModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpleadoRepository extends CrudRepository<EmpleadoModel, Long> {
    public abstract ArrayList<EmpleadoModel> findByNombre(String nombre);
}

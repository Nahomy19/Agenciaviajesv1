package com.aplication.agenciaviajesrest.repositories;

import com.aplication.agenciaviajesrest.models.ServicioModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IServicioRepository extends JpaRepository<ServicioModel, Long> {
}

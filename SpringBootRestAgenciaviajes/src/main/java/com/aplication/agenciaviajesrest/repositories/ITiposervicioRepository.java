package com.aplication.agenciaviajesrest.repositories;

import com.aplication.agenciaviajesrest.models.TiposervicioModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITiposervicioRepository extends JpaRepository<TiposervicioModel, Long> {
}

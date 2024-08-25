package com.aplication.agenciaviajesrest.repositories;

import com.aplication.agenciaviajesrest.models.ServicioModel;
import com.aplication.agenciaviajesrest.models.TarifaequipajeModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITarifaequipajeRepository  extends JpaRepository<TarifaequipajeModel, Long> {
}

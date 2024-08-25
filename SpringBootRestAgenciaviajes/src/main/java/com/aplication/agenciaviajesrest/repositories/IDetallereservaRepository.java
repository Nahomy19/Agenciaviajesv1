package com.aplication.agenciaviajesrest.repositories;

import com.aplication.agenciaviajesrest.models.DetallereservaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDetallereservaRepository extends JpaRepository<DetallereservaModel, Long> {
}
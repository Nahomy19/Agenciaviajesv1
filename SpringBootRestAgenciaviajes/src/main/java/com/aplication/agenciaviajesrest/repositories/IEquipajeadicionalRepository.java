package com.aplication.agenciaviajesrest.repositories;

import com.aplication.agenciaviajesrest.models.EquipajeadicionalModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEquipajeadicionalRepository extends JpaRepository<EquipajeadicionalModel, Long> {
}

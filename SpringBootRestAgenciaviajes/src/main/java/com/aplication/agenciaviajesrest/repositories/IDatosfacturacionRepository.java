package com.aplication.agenciaviajesrest.repositories;

import com.aplication.agenciaviajesrest.models.DatosfacturacionModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDatosfacturacionRepository extends JpaRepository<DatosfacturacionModel, Long> {
}

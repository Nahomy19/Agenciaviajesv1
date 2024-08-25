package com.aplication.agenciaviajesrest.repositories;

import com.aplication.agenciaviajesrest.models.MetodopagoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMetodopagoRepository extends JpaRepository<MetodopagoModel, Long > {
}

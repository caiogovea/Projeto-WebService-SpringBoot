package com.educandoweb.ProjetoCurso.repositories;

import com.educandoweb.ProjetoCurso.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {



}

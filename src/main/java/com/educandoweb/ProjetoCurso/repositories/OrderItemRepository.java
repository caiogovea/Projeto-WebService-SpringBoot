package com.educandoweb.ProjetoCurso.repositories;

import com.educandoweb.ProjetoCurso.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {



}

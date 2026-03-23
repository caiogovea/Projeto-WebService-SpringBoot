package com.educandoweb.ProjetoCurso.repositories;

import com.educandoweb.ProjetoCurso.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {



}

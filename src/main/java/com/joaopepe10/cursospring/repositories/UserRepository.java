package com.joaopepe10.cursospring.repositories;

import com.joaopepe10.cursospring.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

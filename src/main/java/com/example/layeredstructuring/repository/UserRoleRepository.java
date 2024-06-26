package com.example.layeredstructuring.repository;

import com.example.layeredstructuring.entity.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRoleRepository extends JpaRepository<UserRole, Integer> {

    UserRole findByName(String roleName);
}

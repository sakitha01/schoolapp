package com.school.app.schoolapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.school.app.schoolapp.model.Role;
@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

	Role findRoleByName(String role);

	List<Role> findByUsers_FirstName(String firstName);

}

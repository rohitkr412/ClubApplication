package edu.iss.ca.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import edu.iss.ca.models.Role;

public interface RoleRepository extends  JpaRepository<Role, Integer>{
	
/*	@Query("SELECT r.name FROM Role r")
	ArrayList<String> findAllRolesNames();*/
	
/*	@Query("SELECT r FROM Role r WHERE r.name = :name")
	ArrayList<Role> findRoleByName(@Param("name") String name);*/

}

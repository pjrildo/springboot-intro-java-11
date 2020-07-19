package com.pjrildo.springfs.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pjrildo.springfs.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}

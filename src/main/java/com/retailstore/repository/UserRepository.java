package com.retailstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.retailstore.model.User;


@Repository
public interface UserRepository extends JpaRepository<User,Long>{

}

package com.ecovoit.EcoVoitAPI.dao;


import com.ecovoit.EcoVoitAPI.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<User, Integer> {
}

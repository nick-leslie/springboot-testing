package com.example.springboottesting.repositories;

import com.example.springboottesting.models.user;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface userRepository extends JpaRepository<user,Long> {
    @Query(value = "SELECT * FROM main.user where user.name = ?1", nativeQuery = true)
    public List<user> findByUsername(String username);
    @Query(value = "SELECT * FROM main.user where id = ?1", nativeQuery = true)
    public List<user> findByUserId(String id);
}

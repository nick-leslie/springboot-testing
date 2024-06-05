package com.example.springboottesting.repositories;

import com.example.springboottesting.models.user;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface userRepository extends JpaRepository<user,Long> {
    @Query(value = "SELECT (id,name) FROM user where user.name = ?1", nativeQuery = true)
    public user findByUsername(String username);
    @Query(value = "SELECT (id,name) FROM user where user.id = ?1", nativeQuery = true)
    public user findByUserId(String id);
}

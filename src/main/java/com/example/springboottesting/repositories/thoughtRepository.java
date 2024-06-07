package com.example.springboottesting.repositories;

import com.example.springboottesting.models.thought;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface thoughtRepository extends JpaRepository<thought, Long> {

}

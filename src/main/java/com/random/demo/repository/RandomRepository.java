package com.random.demo.repository;

import com.random.demo.model.Randomness;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RandomRepository extends JpaRepository<Randomness, Long> {
}

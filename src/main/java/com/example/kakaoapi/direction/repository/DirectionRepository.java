package com.example.kakaoapi.direction.repository;

import com.example.kakaoapi.direction.entity.Direction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DirectionRepository extends JpaRepository<Direction, Long> {
}

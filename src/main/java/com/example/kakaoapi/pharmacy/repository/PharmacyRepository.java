package com.example.kakaoapi.pharmacy.repository;

import com.example.kakaoapi.pharmacy.entity.Pharmacy;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PharmacyRepository extends JpaRepository<Pharmacy, Long> {
}

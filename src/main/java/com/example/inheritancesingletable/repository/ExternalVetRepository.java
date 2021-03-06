package com.example.inheritancesingletable.repository;

import com.example.inheritancesingletable.domain.ExternalVet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExternalVetRepository extends JpaRepository<ExternalVet, Integer> {
}

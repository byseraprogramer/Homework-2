package com.example.demo.repository;

import com.example.demo.model.CompanyData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CompanyDataRepository extends JpaRepository<CompanyData, Long> {}
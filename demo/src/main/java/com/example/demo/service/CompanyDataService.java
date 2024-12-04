package com.example.demo.service;

import com.example.demo.model.CompanyData;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface CompanyDataService {
    public List<CompanyData> getAllCompanyData();
    public CompanyData getCompanyDataById(Long id);
    public List<CompanyData> getDataByCode(String code);
}

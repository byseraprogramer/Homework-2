package com.example.demo.service.impl;

import com.example.demo.model.CompanyData;
import com.example.demo.repository.CompanyDataRepository;
import com.example.demo.service.CompanyDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CompanyDataServiceImpl implements CompanyDataService {
    @Autowired
    private final CompanyDataRepository companyDataRepository;

    public CompanyDataServiceImpl(CompanyDataRepository companyDataRepository) {
        this.companyDataRepository = companyDataRepository;
    }

    @Override
    public List<CompanyData> getAllCompanyData() {
        return companyDataRepository.findAll();
    }

    @Override
    public CompanyData getCompanyDataById(Long id) {
        return companyDataRepository.findById(id).orElse(null);
    }

    @Override
    public List<CompanyData> getDataByCode(String code) {
        return companyDataRepository.findAll().stream().filter(companyData -> companyData.getCompanyCode().equals(code)).collect(Collectors.toList());
    }
}

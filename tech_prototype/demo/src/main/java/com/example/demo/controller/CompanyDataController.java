package com.example.demo.controller;

import com.example.demo.model.CompanyData;
import com.example.demo.service.CompanyDataService;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/api")
@Validated
@CrossOrigin(origins = "*")
public class CompanyDataController {
    private final CompanyDataService companyDataService;

    public CompanyDataController(CompanyDataService companyDataService) {
        this.companyDataService = companyDataService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<CompanyData>> getAllData() {
        return ResponseEntity.ok(companyDataService.getAllCompanyData());
    }

    @GetMapping("/{id}")
    public ResponseEntity<CompanyData> getCompanyDataById(@PathVariable Long id) {
        return ResponseEntity.ok(companyDataService.getCompanyDataById(id));
    }

    @GetMapping("/companies")
    public ResponseEntity<List<String>> getAllCompanies() {
        return ResponseEntity.ok(companyDataService.getAllCompanyData().stream()
                .map(companyData -> companyData.getCompanyCode()).distinct()
                .collect(Collectors.toList()));
    }

    @GetMapping("/transactions/{code}")
    public ResponseEntity<List<CompanyData>> getDataByCode(@PathVariable String code) {
        return ResponseEntity.ok(companyDataService.getDataByCode(code));
    }
}

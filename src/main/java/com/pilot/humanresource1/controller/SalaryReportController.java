package com.pilot.humanresource1.controller;

import com.pilot.humanresource1.model.SalaryReport;
import com.pilot.humanresource1.service.SalaryReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/salaryreport")
public class SalaryReportController {

    private SalaryReportService service;
    private SalaryReportController dao;


    @GetMapping("/get/{id}")
    public SalaryReport getSalaryReportById(@PathVariable int id) {
        return service.getSalaryReportById(id);
    }

    @GetMapping("/get/all")
    public List<SalaryReport> getAllSalaryReports() {
        return service.getAllSalaryReports();
    }

    @PostMapping("/new")
    public void addSalaryReport(@RequestBody SalaryReport temp){

        dao.addSalaryReport(temp);
    }

    public SalaryReportService getService() {
        return service;
    }

    @Autowired
    public void setService(SalaryReportService service) {
        this.service = service;
    }
}

package com.pilot.humanresource1.service;

import com.pilot.humanresource1.dao.SalaryReportRepository;
import com.pilot.humanresource1.helper.SalaryReportHelper;
import com.pilot.humanresource1.model.SalaryReport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalaryReportService {
    @Autowired
    private SalaryReportHelper helper;
    private SalaryReportRepository repo;

    public SalaryReport getSalaryReportById(int id) {
        return helper.getSalaryReportById(id);
    }

    public List<SalaryReport> getAllSalaryReports() {
        return helper.getAllSalaryReports();
    }

    public void addSalaryReport(SalaryReport temp) {
        helper.addSalaryReport(temp);
    }
}

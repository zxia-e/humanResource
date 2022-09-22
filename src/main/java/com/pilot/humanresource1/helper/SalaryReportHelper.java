package com.pilot.humanresource1.helper;

import com.pilot.humanresource1.dao.SalaryReportRepository;
import com.pilot.humanresource1.model.SalaryReport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SalaryReportHelper {
    private SalaryReportRepository repo;

    @Autowired
    public SalaryReportHelper(SalaryReportRepository repo) {
        this.repo = repo;
    }

    public SalaryReport getSalaryReportById(int id) {
        return repo.getSalaryReportById(id);
    }

    public List<SalaryReport> getAllSalaryReports() {
        return repo.getAllSalaryReports();
    }

    public void addSalaryReport(SalaryReport temp) {
        repo.addSalaryReport(temp);
    }
}

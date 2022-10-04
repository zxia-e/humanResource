package com.pilot.humanresource1.dao;

import com.pilot.humanresource1.model.SalaryReport;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public class SalaryReportRepository {
    static List<SalaryReport> salaryreports;
//    static {
//        salaryreports = new ArrayList<>();
//        salaryreports.add(new SalaryReport(1, 65000));
//        salaryreports.add(new SalaryReport(2, 70000));
//    }

    public List<SalaryReport> getAllSalaryReports() {
        return salaryreports;
    }

    public SalaryReport getSalaryReportById(int id) {
        return salaryreports.stream().filter(e -> id == e.getId()).findFirst().orElse(null);
    }



    public void addSalaryReport(SalaryReport temp){
        int maxId = salaryreports.stream().mapToInt(e -> e.getId()).max().getAsInt();
        temp.setId(maxId + 1);
        salaryreports.add(temp);
    }
}

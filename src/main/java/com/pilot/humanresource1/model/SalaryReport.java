package com.pilot.humanresource1.model;

public class SalaryReport {
    private int id;
    private int iid;


    public SalaryReport() {}
    public SalaryReport(int id, int iid) {
        this.id = id;
        this.iid = iid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIid() {
        return iid;
    }

    public void setIid(int iid) {
        this.iid = iid;
    }
}

package com.example.resttemplatefirst.dto;

public class EmployeeDto {
    int empId;
    String empName;
    String empPos;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpPos() {
        return empPos;
    }

    public void setEmpPos(String empPos) {
        this.empPos = empPos;
    }

    @Override
    public String toString() {
        return "EmployeeDto{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empPos='" + empPos + '\'' +
                '}';
    }
}

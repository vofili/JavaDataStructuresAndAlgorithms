package com.javacode.polymorphism;

public class BasePlusCommissionEmployeeDefault {

    private String firstName;
    private String lastName;
    private String socialSecNo;
    private double commissionRate;
    private double grossSales;
    private double baseSalary;

    public BasePlusCommissionEmployeeDefault(String firstName, String lastName, String socialSecurityNo, double commissionRate, double grossSales, double baseSalary) {

        if(baseSalary <= 0.0){
            throw new IllegalArgumentException("Base Salary cannot be less than 0.0");
        }
        if(commissionRate <= 0.0 || commissionRate >= 1.0){
            throw new IllegalArgumentException("Commission must be between 0.0  and 1.0");
        }
        if(grossSales < 0.0){
            throw new IllegalArgumentException("Gross Sales cannot be less than 0.0");
        }

        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecNo = socialSecurityNo;
        this.commissionRate = commissionRate;
        this.grossSales = grossSales;
        this.baseSalary = baseSalary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSocialSecurityNo() {
        return socialSecNo;
    }

    public void setSocialSecurityNo(String socialSecurityNo) {
        this.socialSecNo = socialSecurityNo;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        if(commissionRate <=0.0 || commissionRate >= 1.0){
            throw new IllegalArgumentException("Commission Rate Incorrect");

        }
        this.commissionRate = commissionRate;
    }

    public double getGrossSales() {

        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        if(grossSales < 0.0){
            throw new IllegalArgumentException("Gross sales error:  < 0.0");
        }
        this.grossSales = grossSales;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {

        if(baseSalary <=0.0){
            throw new IllegalArgumentException("Base Salary Incorrect <= 0.0");
        }
        this.baseSalary = baseSalary;
    }

    @Override
    public String toString(){
        return String.format("%s: %s %s%n %s: %s%n %s: %.2f%n %s: %.2f%n %s: %.2f%n",
                "CustomerName",firstName,lastName,"social security", socialSecNo,"Commission",commissionRate,"Gross Sales",grossSales,
                "Base Salary",baseSalary);
    }

    public double earnings(){
        return baseSalary + (commissionRate * grossSales);
    }


}

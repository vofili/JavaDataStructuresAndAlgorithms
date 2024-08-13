package com.javacode.polymorphism;



public class CommissionEmployee extends Object{
    private String firstName;
    private String lastName;
    private String socialSecNo;
    private double commissionRate, grossSales;

    public CommissionEmployee(){

    }

    public CommissionEmployee(String firstName,String lastName,String socialSecNo,double commissionRate,double grossSale){
        if(grossSales < 0.0){
            throw new IllegalArgumentException("Gross Sales Rate must be greater than 0.0");
        }

        if(commissionRate <= 0.0 || commissionRate >= 1.0){
            throw new IllegalArgumentException("Commission Rate must be between 0.0 and 1.0");
        }

        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecNo = socialSecNo;
        this.commissionRate = commissionRate;
        this.grossSales = grossSale;

    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSocialSecNo() {
        return socialSecNo;
    }

    public void setSocialSecNo(String socialSecNo) {
        this.socialSecNo = socialSecNo;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        if(commissionRate <= 0.0 || commissionRate >= 1.0){
            throw new IllegalArgumentException("Commission Rate cannot be less 0.0 or more than 1.0");
        }
        this.commissionRate = commissionRate;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSaleRate) {
        if(grossSaleRate <= 0.0){
            throw new IllegalArgumentException("GrossSaleRate cannot be less tha 0.0");
        }
        this.grossSales = grossSaleRate;
    }

    public String getFirstName(){
        return this.firstName;
    }
    public void setFirstName(String firstName){
        this.firstName=firstName;
    }

    public double earnings(){
        return getGrossSales() * getCommissionRate();
    }

    @Override
    public String toString(){
        return String.format("%s: %s %s%n %s: %s%n %s: %.2f%n%s: %.2f%n","Commission Employee",getFirstName(),getLastName(),
                "Social Security",getSocialSecNo()
                ,"Sales Figures", getGrossSales(),"commission rate",getCommissionRate());
    }

    public static void main(String[] args) {

    }
}


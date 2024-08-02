package com.nubeero.polymorphism;

public class BasePlusCommissionEmployee extends CommissionEmployee{



    private double baseSalary;
    public BasePlusCommissionEmployee(String firstName,String lastName,String socialSecNo,double commissionRate,
                                      double grossSales,double baseSalary){
        super(firstName,lastName,socialSecNo,commissionRate,grossSales);

        if(baseSalary <= 0.0){

             throw new IllegalArgumentException("BaseSalary cannot be <= 0.0");
        }
        this.baseSalary=baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if(baseSalary <= 0.0){

            throw new IllegalArgumentException("BaseSalary cannot be <= 0.0");
        }
        this.baseSalary = baseSalary;
    }

    @Override
    public double earnings(){
        return getBaseSalary() + super.earnings();
    }

    @Override
    public String toString()
    {
        return String.format("%s: %s %s%n %s: %s%n %s: %.2f%n %s: %.2f%n %s: %.2f%n",
                "CustomerName",getFirstName(),getLastName(),"social security",getSocialSecNo(),"Commission",getCommissionRate(),"Gross Sales",getGrossSales(),
                "Base Salary",getBaseSalary());
    }

}

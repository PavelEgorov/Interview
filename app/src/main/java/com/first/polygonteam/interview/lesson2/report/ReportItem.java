package com.first.polygonteam.interview.lesson2.report;

class ReportItem implements IReportItems{
    private String description;
    private float amount;

    public ReportItem(String description, float amount){
        this.description = description;
        this.amount = amount;
    }
    public String getDescription(){
        return description;
    }
    public Float getAmount(){
        return amount;
    }
}
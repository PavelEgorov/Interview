package com.first.polygonteam.interview.lesson2.report;

import java.util.*;
class Report{
    private List<ReportItem> items; // Отчетные данные
    private OutputMethod method;

    public Report(OutputMethod method){
        this.method = method;
    }

    // расчет отчетных данных
    public void calculate(){
        items =  new ArrayList<ReportItem>();
        items.add(new ReportItem("First", (float)5));
        items.add(new ReportItem("Second", (float)6));
    }

    public void output(){
        method.output(items);
    }
}
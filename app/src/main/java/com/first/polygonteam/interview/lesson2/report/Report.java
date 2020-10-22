package com.first.polygonteam.interview.lesson2.report;

import org.jetbrains.annotations.NotNull;

import java.util.*;
class Report implements IReport{
    private List<IReportItems> items; // Отчетные данные

    // расчет отчетных данных
    public void calculate(){
        items =  new ArrayList<IReportItems>();
        items.add(new ReportItem("First", (float)5));
        items.add(new ReportItem("Second", (float)6));
    }

    @Override
    public List<IReportItems> getItems() {
        return items;
    }
}
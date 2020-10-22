package com.first.polygonteam.interview.lesson2.report;

import java.util.*;
class PrintReport implements OutputMethod{
    public void output(IReport report){
        System.out.println("Output to printer");
        if (!(report.getItems() == null)) {
            for (IReportItems item : report.getItems()) {
                System.out.format("printer %s - %f \n\r", item.getDescription(), item.getAmount());
            }
        }
    }
}

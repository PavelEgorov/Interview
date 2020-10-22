package com.first.polygonteam.interview.lesson2.report;

import java.util.*;
class PrintReport implements OutputMethod{
    public void output(List<? extends ReportItem> items){
        System.out.println("Output to printer");
        for(ReportItem item : items){
            System.out.format("printer %s - %f \n\r", item.getDescription(), item.getAmount());
        }
    }
}

package com.first.polygonteam.interview.lesson2.report;

class Programm{
    public static void main(String[] args){
        Report report = new Report();
        report.calculate();

        OutputMethod methodPrint = new PrintReport();
        OutputMethod methodDisplay = new ViewReport();

        methodPrint.output(report);
        methodDisplay.output(report);
    }
}

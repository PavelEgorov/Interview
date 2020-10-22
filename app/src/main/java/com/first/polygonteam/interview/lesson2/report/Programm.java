package com.first.polygonteam.interview.lesson2.report;

class Programm{
    public static void main(String[] args){
        Report report = new Report(new ViewReport());
        report.calculate();
        report.output();
    }
}

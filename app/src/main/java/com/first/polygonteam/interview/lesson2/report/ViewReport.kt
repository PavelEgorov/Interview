package com.first.polygonteam.interview.lesson2.report

internal class ViewReport: OutputMethod {
    override fun output(report: IReport) {
        println("Output to display")
        report.getItems()?.let {
            for (item in it) {
                System.out.format("display %s - %f \n\r", item.getDescription(), item.getAmount())
            }
        }
    }
}
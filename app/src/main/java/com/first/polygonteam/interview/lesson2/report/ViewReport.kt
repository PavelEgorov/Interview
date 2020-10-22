package com.first.polygonteam.interview.lesson2.report

internal class ViewReport: OutputMethod {
    override fun output(items: List<ReportItem>) {
        println("Output to display")
        for (item in items) {
            System.out.format("display %s - %f \n\r", item.description, item.amount)
        }
    }
}
package com.first.polygonteam.interview.lesson2.report

internal interface IReport {
    fun calculate()
    fun getItems(): List<IReportItems>?
}
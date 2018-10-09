package com.anhvu.handwallet.datamodel

import com.anhvu.handwallet.model.Spending

interface IDataModel {
    fun getSpendingByPeriod(start: Long, end: Long): String
    fun getSpendingList(): List<Spending>
}
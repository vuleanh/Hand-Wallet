package com.anhvu.handwallet.datamodel

import com.anhvu.handwallet.model.Spending

class DataModel : IDataModel{

    override fun getSpendingByPeriod(start: Long, end: Long): String {
        return ""
    }

    override fun getSpendingList(): List<Spending> {
        return ArrayList()
    }

}
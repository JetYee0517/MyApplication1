package com.example.myapplication1.data.model

import java.math.BigDecimal

data class Transaction(

    var recipientID: String = "",
    var amount: Float = 0.00F,
    var createdAt: Long = System.currentTimeMillis()
)
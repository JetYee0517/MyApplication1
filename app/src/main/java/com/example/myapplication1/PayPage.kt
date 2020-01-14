package com.example.myapplication1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication1.data.model.Transaction
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.activity_pay_page.*

class PayPage : AppCompatActivity() {
    private val db = FirebaseDatabase.getInstance()
    private val transactions = db.getReference().child("users").child("EWNeiVHkI2dAtPDUXlSVG28RZs32")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pay_page)

        buttonPay.setOnClickListener {
            pay()
        }
    }

    private fun pay() {

        val recipientID = editTextRecipientId.text.toString()
        val amount = editTextAmount.text.toString().toFloat()

        val transaction = Transaction (recipientID =  recipientID ,  amount = amount, createdAt = System.currentTimeMillis())

        transactions.child("transaction").push().setValue(transaction)

        finish()
    }


}

package com.example.viewmodelexample.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.example.viewmodelexample.R
import com.example.viewmodelexample.ViewModel.AddNumber

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var viewModel: AddNumber = ViewModelProvider(this).get(AddNumber::class.java)

        var textView:TextView = findViewById(R.id.textView)
        textView.text = viewModel.number.toString()

        var but: Button = findViewById(R.id.click)
        but.setOnClickListener {
            viewModel.addNum()
            textView.text = viewModel.number.toString()
        }
    }
}
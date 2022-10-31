package com.example.androidpipelinetest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        doActivity()
    }

    private fun doActivity() {
       // adding first comment to see if pipeline is triggering on master.
        // adding second comment to see if pipeline is triggering on master-3.
        // making a small change -1
        // branch change
    }
}
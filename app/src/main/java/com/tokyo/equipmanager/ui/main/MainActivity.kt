package com.tokyo.equipmanager.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tokyo.equipmanager.R
import com.tokyo.equipmanager.common.ext.setContentWithBind

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

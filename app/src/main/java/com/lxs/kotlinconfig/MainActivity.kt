package com.lxs.kotlinconfig

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun defaultKotlin(view: View) {
        startActivity(Intent(this, DefaultKotlin::class.java))
    }

    fun dataBindingKotlin(view: View) {
        startActivity(Intent(this, DataBindingKotlin::class.java))
    }
}

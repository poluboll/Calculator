package com.calculator

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity(R.layout.activity_main) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

supportFragmentManager
    .beginTransaction()
    .add(R.id.container,CalcFragment())
    .commit()

    }
}
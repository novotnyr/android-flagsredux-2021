package com.github.novotnyr.android.flagsredux

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentManager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        // https://github.com/material-components/material-components-android/issues/2215#issuecomment-847033187
        FragmentManager.enableNewStateManager(false)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
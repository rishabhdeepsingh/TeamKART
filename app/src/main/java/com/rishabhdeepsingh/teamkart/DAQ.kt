package com.rishabhdeepsingh.teamkart

import android.content.Context
import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import android.util.AttributeSet
import android.view.View
import android.widget.Button
import android.widget.LinearLayout

class DAQ : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.daq_activity)
    }

    override fun onCreateView(name: String?, context: Context?, attrs: AttributeSet?): View? {
        setContentView(R.layout.daq_activity)
        return super.onCreateView(name, context, attrs)
    }
}
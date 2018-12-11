package com.rishabhdeepsingh.teamkart

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.util.AttributeSet
import android.view.View

class Services() : AppCompatActivity() {

    override fun onCreateView(name: String?, context: Context?, attrs: AttributeSet?): View? {
        setContentView(R.layout.services_activity)
        System.err.println("[==] Services View ")
        return super.onCreateView(name, context, attrs)
    }

}
package com.rishabhdeepsingh.teamkart

import android.content.Context
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import android.util.AttributeSet
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.LinearLayout
import android.widget.RelativeLayout
import kotlinx.android.synthetic.main.daq_activity.view.*
import kotlinx.android.synthetic.main.main_activity.*


class MainActivity : AppCompatActivity() {
    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_daq -> {
                System.err.println("DAQ Layout selected From MainActivity")
                setContentView(R.layout.daq_activity)
                val buttonSelectAll = findViewById<Button>(R.id.btn_selectAll)
                val buttonGetDetails = findViewById<Button>(R.id.btn_get_details)
                val daqList = findViewById<LinearLayout>(R.id.list_daq)
                val daqListButtons = findViewById<LinearLayout>(R.id.daq_buttons)
                val topButtonsDAQ = findViewById<RelativeLayout>(R.id.topButtons)
                val viewRPM = findViewById<LinearLayout>(R.id.view_rpm_image)

                val buttonRPM = findViewById<Button>(R.id.btn_rpm)
                buttonSelectAll.setOnClickListener {
                    val checkBox = ArrayList<CheckBox>()
                    checkBox.add(findViewById(R.id.checkBox_rpmOfWheels) as CheckBox)
                    checkBox.add(findViewById(R.id.checkBox_acceleration) as CheckBox)
                    checkBox.add(findViewById(R.id.checkBox_steeringAngle) as CheckBox)
                    checkBox.add(findViewById(R.id.checkBox_coolentTemperature) as CheckBox)
                    checkBox.add(findViewById(R.id.checkBox_crankShaftRPM) as CheckBox)
                    checkBox.add(findViewById(R.id.checkBox_throttlePosition) as CheckBox)
                    checkBox.add(findViewById(R.id.checkBox_coolentFlow) as CheckBox)
                    checkBox.add(findViewById(R.id.checkBox_breakPressure) as CheckBox)
                    checkBox.add(findViewById(R.id.checkBox_fuelLevel) as CheckBox)
                    checkBox.add(findViewById(R.id.checkBox_intakeAirPressure) as CheckBox)
                    for (i in checkBox) {
                        i.isChecked = true
                    }
                }
                buttonGetDetails.setOnClickListener {
                    daqList.visibility = View.GONE
                    daqListButtons.visibility = View.VISIBLE
                    topButtonsDAQ.visibility = View.GONE
                }
                buttonRPM.setOnClickListener {
                    println("[+] RPM of Wheel")
                    daqListButtons.visibility = View.GONE
                    viewRPM.visibility = View.VISIBLE
                }
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_forum -> {
                setContentView(R.layout.main_activity)
                System.err.println("FORUM Layout selected From MainActivity")
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_services -> {
                setContentView(R.layout.services_activity)
                System.err.println("Services Layout selected From MainActivity")
                val goButton = findViewById<Button>(R.id.btn_go)
                val findServiceButton = findViewById<Button>(R.id.btn_find_service)
                val serviceLayout = findViewById<LinearLayout>(R.id.services_layout)
                val findService = findViewById<LinearLayout>(R.id.find_service)
                findServiceButton.setOnClickListener {
                    serviceLayout.visibility = View.GONE
                    findService.visibility = View.VISIBLE
                }
                val layoutData = findViewById<LinearLayout>(R.id.services_information)
                goButton.setOnClickListener {
                    layoutData.visibility = View.VISIBLE
                }
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_activity)
        val button = findViewById<View>(R.id.button)
        button.setOnClickListener {
            setContentView(R.layout.main_activity)
            navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
        }
    }

    override fun onSaveInstanceState(outState: Bundle?) {
        // Store the current navigation position.
        super.onSaveInstanceState(outState)
    }

    override fun onBackPressed() {
        super.onBackPressed()
    }
}

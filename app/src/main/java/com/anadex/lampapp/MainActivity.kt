package com.anadex.lampapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

//Танцевать я не умею
//И стихов я не пишу,
//Самолётики не клею,
//За футболом не слежу.

//Не умею петь я басом
//И из глины не леплю,
//НО ЗАТО — ОДИН ИЗ КЛАССА —
//Я УШАМИ ШЕВЕЛЮ!!!

const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG, "Танцевать я не умею")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "И стихов я не пишу,")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "Самолётики не клею,")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "За футболом не слежу.")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "Не умею петь я басом")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "И из глины не леплю, \n НО ЗАТО — ОДИН ИЗ КЛАССА — \n Я УШАМИ ШЕВЕЛЮ!!!")
    }


}
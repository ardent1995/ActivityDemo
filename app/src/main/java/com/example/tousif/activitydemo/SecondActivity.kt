package com.example.tousif.activitydemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    val TAG = SecondActivity::class.java.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        Log.d(TAG,"onCreate()")
        if(intent.extras.containsKey("Name")) {
            textView.text = intent.extras.getString("Name")
        }
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG,"onRestart()")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG,"onStart()")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.d(TAG,"onRestoreInstanceState()")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG,"onResume()")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG,"onPause()")
    }

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        Log.d(TAG,"onSaveInstanceState()")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG,"onStop()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG,"onDestroy()")
    }
}

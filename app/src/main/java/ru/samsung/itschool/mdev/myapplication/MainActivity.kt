package ru.samsung.itschool.mdev.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.widget.Button
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    var counter = 0
    lateinit var tv: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("RRR","onCreate()")
        val button = findViewById<Button>(R.id.button2)
        tv = findViewById<TextView>(R.id.textView)
        button.setOnClickListener {
            counter++
            tv.setText(counter.toString())
        }

    }

    override fun onRestart() {
        super.onRestart()
        Log.d("RRR","onRestart()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("RRR","onDestroy()")
    }

    override fun onStop() {
        super.onStop()
        Log.d("RRR","onStop()")
    }

    override fun onStart() {
        super.onStart()
        Log.d("RRR","onStart()")
    }

    override fun onPause() {
        super.onPause()
        Log.d("RRR","onPause()")
    }

    override fun onResume() {
        super.onResume()
        Log.d("RRR","onResume()")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d("TTT save",counter.toString())
        outState.putInt("ccc",counter)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        val cc = savedInstanceState.getInt("ccc")
        Log.d("TTT get",cc.toString())
        tv.setText(cc.toString())
    }

}
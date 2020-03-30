package com.tutorialkart.androidlistview
 
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
 
 
class MainActivity : AppCompatActivity() {
 
    var array = arrayOf("My full name: Ada David-Worlu", "Slack Username:Ada David-Worlu", "Start.NG email address: adaacin@yahoo.co.uk", "Tracks i belong to: frontend, backend, design, mobile")
 
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
 
        val adapter = ArrayAdapter(this,
                R.layout.listview_item, array)
 
        val listView:ListView = findViewById(R.id.listview_1)
        listView.setAdapter(adapter)
    }
}

package com.tamersarioglu.todo_mvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.tamersarioglu.todo_mvvm.adapter.ItemAdapter
import com.tamersarioglu.todo_mvvm.data.DataSource

class MainActivity : AppCompatActivity() {

    //lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)

        val myDataSet = DataSource().loadTask()
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_View)
        recyclerView.adapter = ItemAdapter(this, myDataSet)

        recyclerView.setHasFixedSize(true)


        /*binding.fabAddTask.setOnClickListener {
            Toast.makeText(applicationContext, "Clicked", Toast.LENGTH_SHORT).show()
        }*/
    }
}
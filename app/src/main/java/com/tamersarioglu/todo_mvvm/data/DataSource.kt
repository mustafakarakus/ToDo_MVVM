package com.tamersarioglu.todo_mvvm.data

import com.tamersarioglu.todo_mvvm.R
import com.tamersarioglu.todo_mvvm.model.Task_Model

class DataSource {
    fun loadTask(): List<Task_Model> {
        return listOf(
                Task_Model(R.string.Dummy_Task_1),
                Task_Model(R.string.Dummy_Task_2),
                Task_Model(R.string.Dummy_Task_3),
                Task_Model(R.string.Dummy_Task_4),
                Task_Model(R.string.Dummy_Task_5),
                Task_Model(R.string.Dummy_Task_6),
                Task_Model(R.string.Dummy_Task_7)
        )
    }
}
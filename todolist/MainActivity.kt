package com.example.todolist

import CustomItem
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.Checkbox
import androidx.compose.material.CheckboxDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.dp
import com.example.todolist.repository.listOfTasks
import com.example.todolist.ui.theme.ToDoListTheme
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalOf
import checkBox

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {


            ToDoListTheme {

                val taskList = listOfTasks()
                val getData = taskList.getAllData()

                LazyColumn(contentPadding = PaddingValues(all = 12.dp),
                verticalArrangement = Arrangement.spacedBy(12.dp)



                ) {
                    itemsIndexed(items = getData,
                    key = { index, tasks ->
                        tasks.num

                    }
                    ) {

                            index, tasks ->
                        Log.d("MainAct", index.toString())
                        CustomItem(task = tasks)
                        checkBox()
                    }
                }
            }
        }
    }
}


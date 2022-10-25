package com.example.todolist.repository
import com.example.todolist.model.Tasks

class listOfTasks {
    fun getAllData(): List<Tasks> {
        return listOf(
            Tasks(
                num = 1,
                todo = "Make bed"
            ),
            Tasks(
                num = 2,
                todo = "Brush teeth"
            ),
            Tasks(
                num = 3,
                todo = "Wash face"
            ),
            Tasks(
                num = 4,
                todo = "Take a shower"
            ),
            Tasks(
                num = 5,
                todo = "Prepare bag"
            ),
            Tasks(
                num = 6,
                todo = "Get stationary"
            ),
            Tasks(
                num = 7,
                todo = "Lock all doors"
            ),
            Tasks(
                num = 8,
                todo = "Go to school"
            ),
            Tasks(
                num = 9,
                todo = "Study"
            ),
            Tasks(
                num = 10,
                todo = "Do homework"
            ),
            Tasks(
                num = 11,
                todo = "Sleep before 11 PM"
            )
        )
    }
}
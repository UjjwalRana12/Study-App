package com.android.studyapp.ui.Presentations.Components

data class Task(
    val title: String,
    val description: String,
    val dueDate:Long,
    val priority:Int,
    val relatedSubject:String,
    val isCompleted:String
)

package com.android.studyapp.domain.models

data class Task(
    val title: String,
    val description: String,
    val dueDate:Long,
    val priority:Int,
    val relatedSubject:String,
    val isCompleted:Boolean,
    val taskId:Int,
    val taskSubjectId:Int
)

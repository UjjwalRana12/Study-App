package com.android.studyapp.domain.models

import androidx.compose.ui.graphics.Color

data class Subject(
    val name:String,
    val goalHours:Float,
    val colors:List<Color>

){
    companion object{
        private val gradient1 = listOf(Color(0xFFFF4081), Color(0xFFFFEBEE))
        private val gradient2 = listOf(Color(0xFFFFFF00), Color(0xFFC8E6C9))
        private val gradient3 = listOf(Color(0xFF18FFFF), Color(0xFFC8E6C9))
        private val gradient4 = listOf(Color(0xFF69F0AE), Color(0xFFC8E6C9))
        private val gradient5 = listOf(Color(0xFFFF6E40), Color(0xFFBBDEFB))



        val subjectCardColors = listOf(gradient1, gradient2, gradient3, gradient4, gradient5)
    }

}

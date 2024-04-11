package com.android.studyapp.domain.models

import androidx.compose.ui.graphics.Color

data class Subject(
    val name:String,
    val goalHours:Float,
    val colors:List<Color>,
    val subjectId:Int
){
    companion object{
        private val gradient1 = listOf(Color(0xFFFF4081), Color(0xFF494747))
        private val gradient2 = listOf(Color(0xFFFFFF00), Color(0xFF3F423F))
        private val gradient3 = listOf(Color(0xFF18FFFF), Color(0xFF4B4E4B))
        private val gradient4 = listOf(Color(0xFF69F0AE), Color(0xFF3A3D3A))
        private val gradient5 = listOf(Color(0xFFFF6E40), Color(0xFF454647))



        val subjectCardColors = listOf(gradient1, gradient2, gradient3, gradient4, gradient5)
    }

}

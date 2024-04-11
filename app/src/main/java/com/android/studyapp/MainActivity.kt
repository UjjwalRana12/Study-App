package com.android.studyapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.android.studyapp.ui.Presentations.Dashboard.DashBoard
import com.android.studyapp.ui.Presentations.StudyAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            StudyAppTheme {
                DashBoard()
            }
        }
    }
}

@Preview
@Composable
fun previewdash(){
    DashBoard()
}
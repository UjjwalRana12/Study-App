package com.android.studyapp.ui.Presentations.Dashboard

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.android.studyapp.R
import com.android.studyapp.domain.models.Task


fun LazyListScope.TasksList(
    sectionTitle: String, emptyListText: String, tasks: List<Task>
) {

    item {
        Text(
            text = sectionTitle,
            style = MaterialTheme.typography.bodySmall,
            modifier = Modifier.padding(12.dp)
        )
    }

    if (tasks.isEmpty()) {

        item {

            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    modifier = Modifier
                        .height(230.dp)
                        .width(320.dp)
                        .align(Alignment.CenterHorizontally),
                    alignment = Alignment.Center,
                    painter = painterResource(R.drawable.yg_girl_studying),
                    contentDescription = emptyListText
                )
                Spacer(modifier = Modifier.height(5.dp))
                Text(
                    modifier = Modifier.fillMaxWidth(),
                    text = emptyListText,
                    color = Color.DarkGray,
                    style = MaterialTheme.typography.bodySmall,
                    textAlign = TextAlign.Center
                )
            }
        }
    }
    items(tasks) { task ->
        TaskCard(modifier = Modifier.padding(horizontal = 12.dp, vertical = 4.dp),
            task =task, onCheckBoxClick = { /*TODO*/ }, onClick = { })



    }
}


@Composable
private fun TaskCard(
    modifier: Modifier = Modifier,
    task: Task,
    onCheckBoxClick: () -> Unit,
    onClick: () -> Unit
) {
    ElevatedCard(
        modifier = Modifier.clickable { onClick }
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            TaskCheckBox(
                isComplete = task.isCompleted,
                borderColor = Color.Black
            ) {

            }
            Spacer(modifier = Modifier.width(10.dp))
            Column {
                Text(
                    text = task.title,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                    style = MaterialTheme.typography.titleMedium,
                    textDecoration = if (task.isCompleted) {
                        TextDecoration.LineThrough
                    } else TextDecoration.None


                )
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = "${task.dueDate}",
                    style = MaterialTheme.typography.bodySmall
                )

            }
        }
    }

}























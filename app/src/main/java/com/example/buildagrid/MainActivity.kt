package com.example.buildagrid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.buildagrid.model.Topic
import com.example.buildagrid.ui.theme.BuildAGridTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BuildAGridTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background
                ) {

                }
            }
        }
    }
}

@Composable
fun TopicCard(topic: Topic, modifier: Modifier = Modifier) {
    Card(
        modifier = modifier, shape = RoundedCornerShape(6.dp), colors = CardDefaults.cardColors()
    ) {
        Image(
            painter = painterResource(id = topic.image),
            contentDescription = stringResource(id = topic.title),
            modifier = Modifier
                .width(68.dp)
                .height(68.dp)
        )
        Column(modifier = Modifier.padding(top = 16.dp, end = 16.dp)) {
            Text(
                text = stringResource(id = R.string.photography),
                modifier = Modifier.padding(start = 16.dp)
            )
            Row(modifier = Modifier.padding(top = 8.dp)) {
                Image(
                    painter = painterResource(id = R.drawable.painting),
                    contentDescription = "Cube",
                    modifier = Modifier.padding(start = 16.dp, end = 8.dp)
                )
                Text(text = stringResource(id = topic.number))
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TopicCardPreview() {
    TopicCard(
        topic = Topic(
            image = R.drawable.photographer,
            title = R.string.photography,
            number = (0..100).random()
        )
    )
}

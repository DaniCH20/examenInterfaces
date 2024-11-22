package com.example.jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcompose.ui.theme.JetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetpackComposeTheme {
                Greeting()
            }
        }
    }
}

@Composable
fun Greeting() {
    Column(modifier = Modifier
        .background(Color.Blue)
        .fillMaxSize()) {
        Row(modifier = Modifier
            .padding(80.dp)
            .fillMaxWidth()) {

        }
        Row(modifier = Modifier
            .background(Color.Gray)
            .align(Alignment.CenterHorizontally)) {
            Column(modifier = Modifier.padding(end = 30.dp, top = 20.dp, bottom = 20.dp)) {
                Text("Hello Android!", modifier = Modifier.background(Color.Red))
            }
            Column(modifier = Modifier.padding(start = 30.dp, top = 20.dp, bottom = 20.dp)) {
                Text("Hello Android!", modifier = Modifier.background(Color.Red))
                Text("Hello Android!", modifier = Modifier.background(Color.Red))
                Text("Hello Android!", modifier = Modifier.background(Color.Red))
            }
        }
        Row(
            modifier = Modifier
                .background(Color.White)
                .align(Alignment.CenterHorizontally)
                .padding(30.dp)
        ) {
            Text("Hello Android!")
        }
        Row(modifier = Modifier.align(Alignment.CenterHorizontally)) {
            Column(
                modifier = Modifier
                    .background(Color.Green)
                    .padding(start = 10.dp, end = 10.dp)
            ) {
                Button(onClick = {}, modifier = Modifier
                    .background(Color.Blue)
                    .size(60.dp)) {
                    Text("1")
                }
                Button(onClick = {}, modifier = Modifier
                    .background(Color.Blue)
                    .size(60.dp)) {
                    Text("2")
                }
                Button(onClick = {}, modifier = Modifier
                    .background(Color.Blue)
                    .size(60.dp)) {
                    Text("3")
                }
            }
            Column(
                modifier = Modifier
                    .background(Color.Magenta)
                    .padding(start = 20.dp, end = 20.dp)
            ) {
                Button(onClick = {}, modifier = Modifier
                    .background(Color.Magenta)
                    .size(60.dp)) {
                    Text("4")
                }
                Button(onClick = {}, modifier = Modifier
                    .background(Color.Magenta)
                    .size(60.dp)) {
                    Text("5")
                }
                Button(onClick = {}, modifier = Modifier
                    .background(Color.Magenta)
                    .size(60.dp)) {
                    Text("6")
                }
            }
            Column(
                modifier = Modifier
                    .background(Color.Green)
                    .padding(start = 10.dp, end = 10.dp)
            ) {
                Button(onClick = {}, modifier = Modifier
                    .background(Color.Black)
                    .size(60.dp)) {
                    Text("7")
                }
                Button(onClick = {}, modifier = Modifier
                    .background(Color.Black)
                    .size(60.dp)) {
                    Text("8")
                }
                Button(onClick = {}, modifier = Modifier
                    .background(Color.Black)
                    .size(60.dp)) {
                    Text("9")
                }
            }
        }

    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    Greeting()
}
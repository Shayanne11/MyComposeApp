package com.shayanne.mycomposeapp

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.shayanne.mycomposeapp.ui.theme.MyComposeAppTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApp {
                Greeting("Android")
            }
        }
    }
}//main

@Preview("Text Preview")
@Composable
fun DefaultPreview() {
    MyApp {
        Greeting( "Android")
    }
}


@Composable
fun MyApp(content: @Composable () -> Unit ) {
    MyComposeAppTheme {
        Surface(color = Color.Yellow) {
            content()
        }
    }
}


@Composable
fun Greeting(name: String) {
        Text(text = "Hello $name!", modifier = Modifier.padding(24.dp))
}


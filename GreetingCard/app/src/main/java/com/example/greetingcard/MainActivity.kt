package com.example.greetingcard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.greetingcard.ui.theme.GreetingCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
//            GreetingCardTheme {
//                 Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//                     Greeting(
//                         name = "Anderson Macharia!!",
//                         modifier = Modifier.padding(innerPadding)
//                     )}
            GreetingPreview()
            }
        }
    }
//}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Surface(color = Color.Cyan){
        Text(
            text = "Hi, my name is $name!",
            modifier = modifier
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    GreetingCardTheme {
//        Scaffold(modifier = Modifier.fillMaxSize()) {
            Greeting(
                name = "MachTechie!!!",
                modifier = Modifier.padding(vertical = 35.dp, horizontal = 20.dp)
            )
//        }

    }
}
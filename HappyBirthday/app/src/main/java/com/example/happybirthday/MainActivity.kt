package com.example.happybirthday

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.movableContentOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import com.example.happybirthday.ui.theme.HappyBirthdayTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            HappyBirthdayTheme {
                Surface(modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background) {
                    GreetingText("Happy Birthday Anderson Macharia",
                    Modifier.padding(top = Dp(35.0f), start = Dp(10.0f)))
                }
//                Scaffold(modifier = Modifier.fillMaxSize()) {
//                    innerPadding -> HappyBirthday(
//                        name = "Android",
//                        modifier = Modifier.padding(innerPadding)
////                    )
//                }
            }
        }
    }
}

@Composable
fun GreetingText(text: String = "Happy Birthday MachTechie!!!", modifier: Modifier = Modifier){
    Text(
        text = text,
        modifier = modifier
    )
}



@Preview(showBackground = true)
@Composable
fun HappyBirthdayPreview() {
    HappyBirthdayTheme {
//        HappyBirthday("MachTechie")
        GreetingText("Happy Birthday Anderson Macharia")
    }
}
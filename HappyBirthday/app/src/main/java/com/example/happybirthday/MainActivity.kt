package com.example.happybirthday

import android.os.Bundle
import android.provider.CalendarContract.Colors
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.movableContentOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.happybirthday.ui.theme.HappyBirthdayTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            HappyBirthdayTheme {
                Surface(modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingImage(text = "Happy Birthday Mash",
                    modifier = Modifier.padding(top = Dp(35.0f), start = Dp(10.0f)),
                        from = "from Vee!!!")
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
fun GreetingImage(modifier: Modifier = Modifier, text: String = "Happy Birthday MachTechie!!!", from: String){
    var image = painterResource(R.drawable.androidparty)
    Box(){
        Image(image, null)
        GreetingText(text = text, from = from, modifier = Modifier.fillMaxSize().padding(8.dp))
    }
}
@Composable
fun GreetingText( modifier: Modifier = Modifier, text: String, from: String) {
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = modifier.padding(8.dp)
    ) {
        Text(
            text = text,
            modifier = Modifier.padding(8.dp),
            fontSize = 100.sp,
            lineHeight = 100.sp,
            textAlign = TextAlign.Center
        )
        Text(
            text = from,
            fontSize = 36.sp,
            modifier = Modifier
                .padding(16.dp)
                .align(alignment = Alignment.End),
            lineHeight = 100.sp,
            textAlign = TextAlign.Center,
            color = Color.Blue
        )
    }
}



@Preview(showBackground = true)
@Composable
fun HappyBirthdayPreview() {
    HappyBirthdayTheme {
//        HappyBirthday("MachTechie")
        GreetingText(text = "Happy Birthday Anderson Macharia", from = "from Vee")
    }
}
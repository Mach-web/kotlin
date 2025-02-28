package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BusinessCardTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//                    Greeting(
//                        name = "Mash",
//                        modifier = Modifier.padding(innerPadding)
//                    )
                    BusinessCard(
                        modifier = Modifier
                            .background(
                                color = Color(110, 172, 157)
                            )
                            .padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun BusinessCard(modifier: Modifier = Modifier) {
    Column(modifier = modifier.fillMaxSize()) {
        var image = painterResource(R.drawable.android_logo)
        Column(
            modifier = Modifier
                .weight(1.5f)
                .fillMaxWidth(),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
//
            Box(
                modifier = Modifier
                    .size(140.dp) // Border will be outside the image
                    .border(
                        width = 10.dp,
                        color = Color(16, 43, 50),
                    ), // Border color same as background
                contentAlignment = Alignment.Center
            ) {
                Image(
                    image, "Android Logo", modifier = Modifier
                        .size(120.dp) // Ensures the image itself remains the original size
                        .background(color = Color(16, 43, 50))
                )
            }

            Text(
                "Jennifer Doe",
                color = Color.Black,
                fontSize = 35.sp,
                modifier = Modifier.padding(top = 10.dp)
            )
            Text(
                "Android Developer Extraordinaire",
                color = Color(1, 121, 21),
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(top = 5.dp)
            )

        }
        Row(
            modifier = Modifier
                .weight(1f)
                .padding(bottom = 16.dp)
                .fillMaxWidth(),
            verticalAlignment = Alignment.Bottom,
            horizontalArrangement = Arrangement.Center
        ) {
            Column(
                verticalArrangement = Arrangement.SpaceBetween
            ) {
                Icon(
                    Icons.Default.Call,
                    contentDescription = "Call",
                    tint = Color(1, 121, 21),
                    modifier = Modifier.size(20.dp)
                )
                Icon(
                    Icons.Default.Share,
                    contentDescription = "Share",
                    tint = Color(1, 121, 21),
                    modifier = Modifier.size(20.dp)
                )
                Icon(
                    Icons.Default.Email,
                    contentDescription = "Email",
                    tint = Color(1, 121, 21),
                    modifier = Modifier.size(20.dp)
                )
            }
            Column(
                verticalArrangement = Arrangement.SpaceEvenly,
            ) {
                Text(
                    "+11 (123) 444 555 666",
                    color = Color.Black,
                    fontSize = 18.sp,
                    modifier = Modifier.padding(start = 15.dp)
                )
                Text(
                    "@AndroidDev",
                    color = Color.Black,
                    fontSize = 18.sp,
                    modifier = Modifier.padding(start = 15.dp)
                )
                Text(
                    "jen.doe@android.com",
                    color = Color.Black,
                    fontSize = 18.sp,
                    modifier = Modifier.padding(start = 15.dp)
                )
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BusinessCardTheme {
        Greeting("Android")
    }
}
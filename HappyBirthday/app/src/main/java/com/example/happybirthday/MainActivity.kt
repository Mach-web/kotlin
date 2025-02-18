package com.example.happybirthday

import android.os.Bundle
import android.os.ParcelFileDescriptor
import android.provider.CalendarContract.Colors
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
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
                Scaffold(modifier = Modifier.fillMaxSize()) {
                        innerPadding ->
                    ComposeQuadrant(modifier = Modifier.padding(innerPadding))
//                    LearnTogether(modifier = Modifier.padding(innerPadding))
//                    Surface(
//                        modifier = Modifier.fillMaxSize(),
//                        color = MaterialTheme.colorScheme.background
//                    ) {
//                    GreetingImage(text = stringResource(R.string.happy_birthday_text),
//                    modifier = Modifier.padding(top = Dp(35.0f), start = Dp(10.0f)),
//                        from = stringResource(R.string.signature_text)
//                    )

//                        TaskCompleted()
                    }

                }
                }
            }
        }


@Composable
fun ComposeQuadrant(modifier: Modifier){
    Column (
        verticalArrangement = Arrangement.SpaceEvenly,
        modifier = Modifier.fillMaxSize()
    ) {
        Row (
            horizontalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier.weight(1f)
        ){
            Quadrant(
                "Text composable",
                "Displays text and follows the recommended Material Design guidelines.",
                Color(0xFFEADDFF),
                modifier = Modifier.weight(1f)
            )
            Quadrant(
                "Image composable",
                "Creates a composable that lays out and draws a given Painter class object.",
                Color(0xFFD0BCFF),
                modifier = Modifier.weight(1f)
            )
        }
        Row (
            horizontalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier.weight(1f)
        ){
            Quadrant(
                "Row composable",
                "A layout composable that places its children in a horizontal sequence.",
                Color(0xFFB69DF8),
                modifier = Modifier.weight(1f)
            )
            Quadrant(
                "Column composable",
                "A layout composable that places its children in a vertical sequence.",
                Color(0xFFF6EDFF),
                modifier = Modifier.weight(1f)
            )
        }
    }
}

@Composable
fun Quadrant(title: String, description: String, color: Color, modifier: Modifier){
    Column (
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier.fillMaxSize().background(color = color).padding(all = 8.dp)

    ){
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            color = Color.Black
        )
        Text(
            text = description,
            textAlign = TextAlign.Justify,
            color = Color.Black
        )
    }
}


@Composable
fun LearnTogether(modifier: Modifier, header: String = stringResource(R.string.header_text)){
    Column {
        var image = painterResource(R.drawable.bg_compose_background)
        Image(image,  contentDescription = "Splash Image", contentScale = ContentScale.FillWidth)
        Text(
            text = header,
            fontSize = 24.sp,
            modifier = Modifier.padding(all = 16.dp)
        )
        Text(
            text = stringResource(R.string.introduction),
            modifier = Modifier.padding(horizontal = 16.dp),
//            TextAlign = TextAlign.Center
            style = TextStyle(textAlign = TextAlign.Justify)
        )
        Text(
            text = stringResource(R.string.paragraph),
            modifier = Modifier.padding(all = 16.dp),
            style = TextStyle(textAlign = TextAlign.Justify)
        )


    }
}

@Composable
fun TaskCompleted(){
    Column (
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        var image = painterResource(R.drawable.ic_task_completed)
        Image(image, contentDescription = "Tick image")
        Text(
            text = "All tasks completed",
            style = TextStyle(fontWeight = FontWeight.Bold),
            modifier = Modifier.padding(top = 24.dp, bottom = 8.dp)
        )
        Text(
            text = "Nice work!",
            fontSize = 16.sp
        )
    }
}

@Composable
fun GreetingImage(modifier: Modifier = Modifier, text: String = "Happy Birthday MachTechie!!!", from: String){
    var image = painterResource(R.drawable.androidparty)
    Box(){
        Image(image,
            null,
            contentScale = ContentScale.Crop,
            alpha = 0.4f
            )
        GreetingText(text = text, from = from, modifier = Modifier
            .fillMaxSize()
            .padding(8.dp))
    }
}
@Composable
fun GreetingText( modifier: Modifier = Modifier, text: String, from: String) {
    Column(
        verticalArrangement = Arrangement.SpaceEvenly,
        modifier = modifier.padding(8.dp)
    ) {
        Text(
            text = text,
            modifier = Modifier.padding(8.dp),
            fontSize = 90.sp,
            lineHeight = 100.sp,
            textAlign = TextAlign.Center,

        )
        Text(
            text = from,
            fontSize = 36.sp,
            modifier = Modifier
                .padding(all = 16.dp)
                .align(alignment = Alignment.CenterHorizontally)
                ,
            lineHeight = 100.sp,
//            textAlign = TextAlign.Center,
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
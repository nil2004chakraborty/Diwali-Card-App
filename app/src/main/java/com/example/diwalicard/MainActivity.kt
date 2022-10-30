package com.example.diwalicard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.diwalicard.ui.theme.DiwaliCardTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DiwaliCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    DiwaliGreetingWithImage(message = getString(R.string.happy_diwali_text), from =getString(
                                            R.string.signature_text) )
                }
            }
        }
    }
}

@Composable
fun DiwaliGreetingWithText(message:String,from:String){
    Column {
        Text(
            text = message,
            fontSize = 36.sp,
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentWidth(Alignment.Start)
                .padding(start = 30.dp, top=16.dp)
        )
        Text(
            text = from,
            fontSize = 24.sp,
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentWidth(Alignment.End)
                .padding(start=16.dp, end=25.dp,top=400.dp)
        )
    }
}

@Composable
fun DiwaliGreetingWithImage(message: String, from: String){
    val image= painterResource(id = R.drawable.diwali_g98d73e231_1920)
    Box {
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier.padding(top=200.dp)

            /*modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth(),
            contentScale = Crop

             */
        )
        DiwaliGreetingWithText(message = message, from = from )
    }
}

@Preview(showBackground = false)
@Composable
fun DefaultPreview() {
    DiwaliCardTheme {
    
        DiwaliGreetingWithImage(message = "Wishing you a very happy and safe Diwali to you and your family!!" , "- from Nilakshi")
    }
}
package com.example.angelabusinesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.angelabusinesscard.ui.theme.AngelaBusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AngelaBusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.Green // Set the background color to green
                ) {

                }
            }
        }
    }
}

@Composable
fun GreetingImage(){
    val image = painterResource(R.drawable.angela)
    //Step 3 create a box to overlap image and texts
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .padding(8.dp),
    ){
        Image(
            painter = image,
            contentDescription = null,
            Modifier.size(90.dp)
        )
        Text("Angela Gabrielle Tungky",
            textAlign = TextAlign.Center,
            fontSize = 30.sp,
            fontFamily = androidx.compose.ui.text.font.FontFamily.Serif)
        Text("Teknik Informatika 2021",
            textAlign = TextAlign.Center,
            fontSize = 18.sp,
            fontFamily = androidx.compose.ui.text.font.FontFamily.SansSerif,
            fontWeight = FontWeight.Bold,
            color = Color.Magenta
        )
    }
}

@Composable
fun GreetingContact(){
    Column (modifier = Modifier
        .padding(100.dp, 20.dp),
        verticalArrangement = Arrangement.Bottom
    ){
        Row {
            Icon(imageVector = Icons.Default.Phone,
                contentDescription = null,
                tint = Color.DarkGray )
            Text(text = "0853 9988 1898")
        }
        Row {
            Icon(imageVector = Icons.Default.Person,
                contentDescription = null,
                tint = Color.DarkGray )
            Text(text = "@angelatungky")
        }
        Row {
            Icon(imageVector = Icons.Default.Email,
                contentDescription = null,
                tint = Color.DarkGray )
            Text(text = "angelagtungky@gmail.com")
        }
    }
}

@Preview(name = "My Business Card",
    showBackground = true,
    showSystemUi = true
)
@Composable
fun GreetingPreview() {
    AngelaBusinessCardTheme {
        GreetingImage()
        GreetingContact()
    }
}
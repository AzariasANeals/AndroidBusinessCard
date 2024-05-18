package com.example.android_business_card

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.android_business_card.ui.theme.AndroidBusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidBusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    AzariasBusinessCard()
                }
            }
        }
    }
}
@Composable
fun AzariasBusinessCard() {
    BusinessCard(
            imagePainter = painterResource(R.drawable.profile),
            backgroundColor = Color(0xFFEADDFF),
            name = stringResource(R.string.card_name),
            profession = stringResource(R.string.profession),
            phone = stringResource(R.string.phonenumber),
            email = stringResource(R.string.email),
            address = stringResource(R.string.address)
    )
}

@Composable
private fun BusinessCard(
    imagePainter: Painter,
    backgroundColor: Color,
    name: String,
    profession: String,
    phone: String,
    email: String,
    address: String,
    modifier: Modifier = Modifier,
){
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(backgroundColor)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
    ){
        Image(
            painter = imagePainter,
            contentDescription = null,
            modifier = Modifier.align(alignment = Alignment.CenterHorizontally)
        )
        Text(
            text = name,
            modifier = Modifier.padding(8.dp),
            fontSize = 30.sp,
            textAlign = TextAlign.Left
        )
        Text(
            text = profession,
            modifier = Modifier.padding(8.dp),
            fontSize = 25.sp,
            textAlign = TextAlign.Left
        )
        Text(
            text = phone,
            modifier = Modifier.padding(8.dp),
            fontSize = 25.sp
        )
        Text(
            text = email,
            modifier = Modifier.padding(8.dp),
            fontSize = 25.sp
        )
        Text(
            text = address,
            modifier = Modifier.padding(8.dp),
            lineHeight = 30.sp,
            fontSize = 25.sp
        )
    }
}

@Preview(showBackground = true)
@Composable
fun BusinessCardPreview() {
    AndroidBusinessCardTheme {
        AzariasBusinessCard()
    }
}
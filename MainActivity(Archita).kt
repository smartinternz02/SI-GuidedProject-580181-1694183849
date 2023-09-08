package main.first.assignment1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import main.first.assignment1.ui.theme.Assignment1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(modifier=Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {
                simpleTitle()
            }
            Column(modifier=Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
                simpleLogin()
                Spacer(modifier = Modifier.height(16.dp))
                simplePwd()
                simpleButton()
            }
        }
    }
}

@Composable
fun simpleTitle(){
    Text(text = "LOGIN", modifier=Modifier.padding(16.dp), fontSize = 20.sp)
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun simpleLogin(){
    var text by remember {
        mutableStateOf("")
    }
    TextField(value = text, onValueChange = {it->text=it}, label = {Text(text="Username")})
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun simplePwd(){
    var text1 by remember {
        mutableStateOf("")
    }
    TextField(value = text1, onValueChange = {it->text1=it}, label = {Text(text="Password")})
}
@Composable
fun simpleButton(){
    Button(onClick = { /*TODO*/ }, modifier=Modifier.padding(16.dp)) {
        Text(text = "SUBMIT")
    }
}

@Preview(showBackground = true)
@Composable
fun simplePreview() {
    Column(modifier=Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {
        simpleTitle()
    }
    Column(modifier=Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
        simpleLogin()
        Spacer(modifier = Modifier.height(16.dp))
        simplePwd()
        simpleButton()
    }
}
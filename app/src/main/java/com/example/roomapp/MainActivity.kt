package com.example.roomapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.roomapp.ui.theme.RoomAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RoomAppTheme {
                var id by remember {  mutableStateOf(0L) }
                var title by remember { mutableStateOf("") }
                var artist by remember { mutableStateOf("") }
                var year by remember { mutableStateOf(0) }

                Column {
                    TextField(value="$id", onValueChange = {
                        id = it.toLongOrNull() ?: 0
                    }, placeholder = {
                        Text("ID")
                    })

                    TextField(value=title, onValueChange = {
                        title = it
                    }, placeholder = {
                        Text("Title")
                    })

                    TextField(value=artist, onValueChange = {
                       artist = it
                    }, placeholder = {
                        Text("Artist")
                    })

                    TextField(value="$year", onValueChange = {
                        year = it.toIntOrNull() ?: 0
                    }, placeholder = {
                        Text("Year")
                    })

                    Row {
                        Button(onClick = {
                            // TODO add the song to the database.
                        }) {
                            Text("Add")
                        }
                    }
                }
            }
        }
    }
}

package com.example.imagecard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.imagecard.ui.theme.ImageCardTheme
import com.example.imagecardlib.ImagePreview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ImageCardTheme {
                Box(modifier = Modifier.fillMaxSize()) {
                    ImagePreview(
                        image = painterResource(id = R.drawable.ic_launcher_background),
                        description = "Hello Anurodh",
                        modifier = Modifier
                            .align(Alignment.Center)
                            .size(150.dp)
                    )
                }
            }
        }
    }
}

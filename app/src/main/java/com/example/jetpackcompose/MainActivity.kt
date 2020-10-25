package com.example.jetpackcompose

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.setContent
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            test("Android")
        }


    }

    @Composable
    private fun test(name: String) {
        val image = imageResource(R.drawable.header)
        val typography = MaterialTheme.typography

        MaterialTheme {
            Column(modifier = Modifier.padding(16.dp)) {
                val imageModifier = Modifier
                        .preferredHeight(180.dp)
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(8.dp))

                Image(
                        image,
                        modifier = imageModifier,
                        contentScale = ContentScale.Crop
                )

                Spacer(Modifier.preferredHeight(16.dp))

                Text(
                        text = "A day wandering through the sandhills " +
                                "in Shark Fin Cove, and a few of the sights I saw",
                        style = typography.h5,
                        maxLines = 2,
                        overflow = TextOverflow.Ellipsis
                )

                Spacer(Modifier.preferredHeight(8.dp))

                Text(text = "This is a test", style = typography.body1)
                Text(text = "This is second test", style = typography.body2)
            }
        }

    }

    @Preview
    @Composable
    fun preview() {
        test("Android")
    }

}
@file:OptIn(ExperimentalMaterial3Api::class)

package com.samkt.gdsc

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.samkt.gdsc.component.ProfileImage
import com.samkt.gdsc.component.UserDetailTextField
import com.samkt.gdsc.ui.theme.GDSCTheme
import com.samkt.gdsc.ui.theme.roboto

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProfileScreen(
    modifier: Modifier = Modifier,
) {
    Scaffold(
        modifier = Modifier.fillMaxSize(),
    ) { paddingValues ->
        Column(
            modifier = Modifier.fillMaxSize().padding(paddingValues),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Row(
                modifier = Modifier.fillMaxWidth().padding(20.dp),
            ) {
                FloatingActionButton(
                    modifier = Modifier
                        .size(36.dp),
                    onClick = { },
                    shape = CircleShape,
                    containerColor = Color(0xFFD3E2F8),
                    contentColor = Color(0xFF3E7FE0),
                ) {
                    Icon(
                        imageVector = Icons.Default.ArrowBack,
                        contentDescription = "Add",
                    )
                }
            }
            Spacer(modifier = Modifier.height(15.dp))
            Text(
                text = "Profile",
                style = MaterialTheme.typography.titleSmall.copy(
                    fontWeight = FontWeight.Bold,
                ),
            )
            Spacer(modifier = Modifier.height(45.dp))
            ProfileImage(
                image = R.drawable.profile,
                onEditClick = {
                },
            )
            Spacer(modifier = Modifier.height(50.dp))
            UserDetailTextField(
                icon = R.drawable.user,
                value = "Somto Ferdinand",
            )
            UserDetailTextField(
                icon = R.drawable.call,
                value = "+234 012 345 6789",
            )
            Button(
                modifier = Modifier.fillMaxWidth()
                    .padding(horizontal = 25.dp, vertical = 10.dp),
                onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF3E7FE0),
                ),
            ) {
                Text(
                    text = "COMPLETED",
                    modifier = Modifier,
                    fontFamily = roboto,
                    fontSize = 22.sp,
                )
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun ProfileScreenPreview() {
    GDSCTheme {
        ProfileScreen()
    }
}

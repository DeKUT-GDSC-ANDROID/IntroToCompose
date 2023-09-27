package com.samkt.gdsc.component

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.samkt.gdsc.R
import com.samkt.gdsc.ui.theme.GDSCTheme

@Composable
fun ProfileImage(
    modifier: Modifier = Modifier,
    @DrawableRes image: Int,
    onEditClick: () -> Unit,
) {
    Box(
        modifier = modifier.size(160.dp),
        content = {
            Image(
                modifier = Modifier.fillMaxSize().clip(CircleShape),
                painter = painterResource(id = image),
                contentDescription = "Profile Image",
                contentScale = ContentScale.Crop,
            )
            FloatingActionButton(
                modifier = Modifier.align(Alignment.BottomEnd)
                    .padding(end = 5.dp, bottom = 10.dp)
                    .size(38.dp),
                onClick = onEditClick,
                shape = CircleShape,
                containerColor = Color(0xFF3E7FE0),
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.edit),
                    contentDescription = "Edit",
                    tint = Color.White,
                )
            }
        },
    )
}

@Preview
@Composable
fun PreviewProfileImage() {
    GDSCTheme {
        ProfileImage(
            image = R.drawable.profile,
            onEditClick = {
            },
        )
    }
}

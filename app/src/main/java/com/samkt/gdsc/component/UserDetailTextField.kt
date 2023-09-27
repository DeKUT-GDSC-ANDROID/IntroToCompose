package com.samkt.gdsc.component

import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.samkt.gdsc.R
import com.samkt.gdsc.ui.theme.GDSCTheme
import com.samkt.gdsc.ui.theme.roboto

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun UserDetailTextField(
    modifier: Modifier = Modifier,
    @DrawableRes icon: Int,
    value: String,
) {
    Card(
        modifier = modifier.fillMaxWidth()
            .padding(
                horizontal = 25.dp,
                vertical = 10.dp,
            ).height(50.dp),
        shape = RoundedCornerShape(100),
    ) {
        Row(
            modifier = Modifier.fillMaxSize().padding(horizontal = 20.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Icon(
                modifier = Modifier.size(24.dp),
                painter = painterResource(id = icon),
                contentDescription = null,
            )
            Row(
                modifier = Modifier.fillMaxSize().weight(1f),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Text(text = value, fontFamily = roboto, fontSize = 22.sp)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TextFieldPreview() {
    GDSCTheme {
        UserDetailTextField(
            icon = R.drawable.user,
            value = "Samto Ferdinand",
        )
    }
}

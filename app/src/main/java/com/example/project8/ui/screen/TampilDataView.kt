package com.example.project8.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.project8.R
import com.example.project8.model.Mahasiswa
import com.example.project8.model.RencanaStudi

@Composable
fun TampilDataView(
    mahasiswa: Mahasiswa,
    rencanaStudi: RencanaStudi,
    onBackButtonClicked: () -> Unit
) {
    Column(
        Modifier
            .fillMaxSize()
            .background(color = colorResource(id = R.color.primary))
    ) {
        Row(
            Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.umylogo),
                contentDescription = "",
                Modifier.size(50.dp)
            )
            Spacer(modifier = Modifier.padding(16.dp))
            Column (Modifier.weight(1f)) {
                Text(text = mahasiswa.Nama,
                    fontWeight = FontWeight.Bold,
                    fontSize = 12.sp,
                    color = Color.White)
                Text(text = mahasiswa.NIM,
                    fontWeight = FontWeight.Light,
                    fontSize = 12.sp,
                    color = Color.White)
            }
            Box {
                Icon(
                    imageVector = Icons.Filled.Notifications,
                    contentDescription = "",
                    tint = Color.White
                )
            }
        }
    }
}
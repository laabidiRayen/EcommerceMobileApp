package com.example.ecommerceshop.ui.feature.account.profile

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.ecommerceshop.ShopperSession
import androidx.navigation.NavController
import com.example.ecommerceshop.R
import com.example.ecommerceshop.navigation.LoginScreen

@Composable
/*
fun ProfileScreen(navController: NavController) {
    val user = ShopperSession.getUser()

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(24.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Image(
                    painter = androidx.compose.ui.res.painterResource(id = R.drawable.ic_profile),
                    contentDescription = null,
                    modifier = Modifier
                        .size(48.dp)
                        .clip(CircleShape)
                        .background(Color.LightGray)
            )
            }
            Spacer(modifier = Modifier.height(16.dp))

            Text(text = user?.name ?: "Guest", style = MaterialTheme.typography.titleLarge)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = user?.email ?: "No email", style = MaterialTheme.typography.bodyMedium)

            Spacer(modifier = Modifier.height(32.dp))

            Button(onClick = {
                // Clear user session here and navigate to registration screen
                ShopperSession.clearUser()  // you need to implement this method if not exist
                navController.navigate(LoginScreen.route) {
                    // Clear backstack so user can't go back
                    popUpTo(0)
                }
            }) {
                Text(text = "Logout")
            }
    }
}*/
fun ProfileScreen(navController: NavController) {
    val user = ShopperSession.getUser()

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                modifier = Modifier.padding(24.dp)
            ) {
                Image(
                    painter = androidx.compose.ui.res.painterResource(id = R.drawable.ic_profile),
                    contentDescription = null,
                    modifier = Modifier
                        .size(100.dp)
                        .clip(CircleShape)
                        .background(Color.LightGray)
                )

                Spacer(modifier = Modifier.height(24.dp))

                Text(
                    text = user?.name ?: "Guest",
                    style = MaterialTheme.typography.titleLarge
                )

                Spacer(modifier = Modifier.height(8.dp))

                Text(
                    text = user?.email ?: "No email",
                    style = MaterialTheme.typography.bodyMedium
                )

                Spacer(modifier = Modifier.height(32.dp))

                Button(onClick = {
                    ShopperSession.clearUser()
                    navController.navigate("login") {
                        popUpTo("profile") { inclusive = true }
                        launchSingleTop = true
                    }

                }) {
                    Text(text = "Logout")
                }
            }
        }
    }
}
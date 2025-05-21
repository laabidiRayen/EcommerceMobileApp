package com.example.ecommerceshop.ui.feature.chatbot

import android.webkit.WebViewClient
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.material3.MaterialTheme
import com.google.accompanist.web.WebView
import com.google.accompanist.web.rememberWebViewState
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Chat
import androidx.compose.material.icons.filled.Close
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Alignment
import android.webkit.WebView


@Composable
fun FloatingChatbotIcon(onClick: () -> Unit) {
    IconButton(onClick = onClick) {
        Icon(
            imageVector = Icons.Filled.Chat,
            contentDescription = "Open Chatbot"
        )
    }
}

@Composable
fun EmbeddedChatbot(onClose: () -> Unit) {
    val url = "https://ayasaadawi.github.io/chatbot/"
    val state = rememberWebViewState(url = url)

    Surface(
        tonalElevation = 4.dp,
        shape = MaterialTheme.shapes.medium,
        modifier = Modifier
            .width(300.dp)
            .height(400.dp)
    ) {
        Box {
            WebView(state = state, modifier = Modifier.fillMaxSize(),
                onCreated = { webView ->
                    webView.settings.javaScriptEnabled = true
                    WebView.setWebContentsDebuggingEnabled(true)  // enable debugging
                    webView.webViewClient = WebViewClient() // optional, for better control
                }
            )

            // Close button (top-right corner)
            IconButton(
                onClick = onClose,
                modifier = Modifier.align(Alignment.TopEnd)
            ) {
                Icon(imageVector = Icons.Filled.Close, contentDescription = "Close Chat")
            }
        }
    }
}

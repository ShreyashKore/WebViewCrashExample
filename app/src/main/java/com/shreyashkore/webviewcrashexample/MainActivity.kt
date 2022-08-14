package com.shreyashkore.webviewcrashexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val webView = findViewById<WebView>(R.id.webview)
        webView.loadData("WebView Crash Sample \n This is a sample project created to show the crash " +
                "occurring on WebViews in latest version of AppCompat(1.6). Long press on any text" +
                "to open the pop-up. This should cause the crash.",
            "text", "utf-8")
    }
}
package biz.consultant.webviewchat

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.WebSettings
import android.webkit.WebView

class MainActivity : AppCompatActivity() {

    private lateinit var webview: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        webview = findViewById(R.id.webview)

        val settings = webview.settings;
        settings.javaScriptEnabled = true
        settings.cacheMode = WebSettings.LOAD_DEFAULT
        settings.useWideViewPort = true
        settings.domStorageEnabled = true
        settings.allowContentAccess = true

        webview.loadUrl("file:///android_asset/index.html")



    }
}
package com.example.web_view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        webView=findViewById(R.id.web_view);
        WebSettings webSettings=webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        webView.loadUrl("https://www.tutorialspoint.com");
        webView.setWebViewClient(new WebViewClient());
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        if (webView.canGoBack()){
            webView.goBack();
        }

        else {
            super.onBackPressed();
        }
    }
}

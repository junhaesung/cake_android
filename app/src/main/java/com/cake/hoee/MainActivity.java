package com.cake.hoee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

import com.google.firebase.messaging.FirebaseMessaging;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // webview init
        WebView myWebView = (WebView) findViewById(R.id.webView);
        myWebView.loadUrl("http://10.0.2.2:8080/BusProject/main.html");

        // firebase subscribe topic
        FirebaseMessaging.getInstance().subscribeToTopic("foo-bar");
    }
}

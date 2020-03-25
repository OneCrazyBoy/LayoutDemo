package com.tj.lyout;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class _WebView extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState){
		// TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.webview);

        setTitle("WebView");
        
        WebView webview=(WebView)findViewById(R.id.webview);
        
     // 配置浏览器，使其可支持 JavaScript
        WebSettings webSettings=webview.getSettings();
        webSettings.setJavaScriptEnabled(true);
        
        // 清除浏览器缓存
        webview.clearCache(true);
        // 指定浏览器需要解析的 url 地址
        //webview.loadUrl("http://webabcd.cnblogs.com/");
        // 指定浏览器需要解析的 html 数据
         webview.loadData("<a href='http://www.baidu.com/'>webabcd</a>", "text/html", "utf-8");
	}
}

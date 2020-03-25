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
        
     // �����������ʹ���֧�� JavaScript
        WebSettings webSettings=webview.getSettings();
        webSettings.setJavaScriptEnabled(true);
        
        // ������������
        webview.clearCache(true);
        // ָ���������Ҫ������ url ��ַ
        //webview.loadUrl("http://webabcd.cnblogs.com/");
        // ָ���������Ҫ������ html ����
         webview.loadData("<a href='http://www.baidu.com/'>webabcd</a>", "text/html", "utf-8");
	}
}

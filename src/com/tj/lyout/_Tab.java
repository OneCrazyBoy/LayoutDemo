package com.tj.lyout;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.TabHost;

public class _Tab extends TabActivity{
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        TabHost tabHost=getTabHost();
        LayoutInflater.from(this).inflate(R.layout.tab,tabHost.getTabContentView(),true);
        
     // Tab 1 的内容
        tabHost.addTab(tabHost.newTabSpec("tab1")
        		.setIndicator("tab1")
        		.setContent(R.id.view1));
        
     // Tab 1 的内容
        tabHost.addTab(tabHost.newTabSpec("tab2")
        		.setIndicator("tab2",getResources().getDrawable(R.drawable.icon2))
        		.setContent(R.id.view2));
      // Tab 3 的内容（设置 Tab 的内容为指定的 Activity）
        tabHost.addTab(tabHost.newTabSpec("tab3")
        		.setIndicator("tab3")
        		.setContent(new Intent(this,_DigitalClock.class)));
	}
}

package com.tj.lyout;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;
import android.widget.ZoomControls;

public class _ZoomControls extends Activity{
	@Override
    protected void onCreate(Bundle savedInstanceState){
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.zoomcontrols);

        setTitle("ZoomControls");
        
        ZoomControls zoomControls=(ZoomControls)findViewById(R.id.zoomControls);
        //setOnZoomInClickListener() - 响应单击放大按钮的事件
        zoomControls.setOnZoomInClickListener(new OnClickListener(){
        	public void onClick(View v){
        		Toast.makeText(_ZoomControls.this, "单击了放大按钮", Toast.LENGTH_SHORT).show();	
        	}
        });
     // setOnZoomOutClickListener() - 响应单击缩小按钮的事件
        zoomControls.setOnZoomOutClickListener(new OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(_ZoomControls.this, "单击了缩小按钮", Toast.LENGTH_SHORT).show(); 
        	}
        });
	}
}

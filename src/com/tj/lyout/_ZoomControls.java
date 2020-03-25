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
        //setOnZoomInClickListener() - ��Ӧ�����Ŵ�ť���¼�
        zoomControls.setOnZoomInClickListener(new OnClickListener(){
        	public void onClick(View v){
        		Toast.makeText(_ZoomControls.this, "�����˷Ŵ�ť", Toast.LENGTH_SHORT).show();	
        	}
        });
     // setOnZoomOutClickListener() - ��Ӧ������С��ť���¼�
        zoomControls.setOnZoomOutClickListener(new OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(_ZoomControls.this, "��������С��ť", Toast.LENGTH_SHORT).show(); 
        	}
        });
	}
}

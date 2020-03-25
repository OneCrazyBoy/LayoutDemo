package com.tj.lyout;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class _ImageButton extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
	        // TODO Auto-generated method stub
	        super.onCreate(savedInstanceState);
	        this.setContentView(R.layout.imagebutton);
	        
	        setTitle("ImageButton");
	        ImageButton imageButton=(ImageButton)findViewById(R.id.imageButton);
			//设置图片按钮的背景
	        imageButton.setBackgroundResource(R.drawable.icon);
	        // setOnClickListener() - 响应图片按钮的鼠标单击事件
	        imageButton.setOnClickListener(new Button.OnClickListener(){
	            @Override
	            public void onClick(View v) {
	                TextView textview = (TextView) _ImageButton.this.findViewById(R.id.textview);
	                textview.setText("图片按钮被单击了");
	      }
     });
  }
	}
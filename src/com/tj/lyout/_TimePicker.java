package com.tj.lyout;

import android.app.Activity;
import android.os.Bundle;

public class _TimePicker extends Activity{
	 @Override
	    protected void onCreate(Bundle savedInstanceState)  {
	        // TODO Auto-generated method stub
	        super.onCreate(savedInstanceState);
	        this.setContentView(R.layout.timepicker);
	        // 具体的应用可参见对话框中的示例
	        setTitle("TimePicker");
	 }
}

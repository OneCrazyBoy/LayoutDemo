package com.tj.lyout;

import android.app.Activity;
import android.os.Bundle;

public class _DatePicker extends Activity{
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.datepicker);

        // 具体的应用可参见对话框中的示例
        setTitle("DatePicker");
	}
}

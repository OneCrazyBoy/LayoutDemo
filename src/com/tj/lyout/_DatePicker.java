package com.tj.lyout;

import android.app.Activity;
import android.os.Bundle;

public class _DatePicker extends Activity{
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.datepicker);

        // �����Ӧ�ÿɲμ��Ի����е�ʾ��
        setTitle("DatePicker");
	}
}

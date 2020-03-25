package com.tj.lyout;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class _Spinner extends Activity{
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.spinner);
		
		setTitle("Spinner");
		
		Spinner spinner=(Spinner)findViewById(R.id.spinner);
		 // ����������ؼ��ı����ı�
		spinner.setPrompt("��ѡ��");
		// ʵ������������ָ����ʾ��ʽ������Դ
		ArrayAdapter<CharSequence>adapter=ArrayAdapter.createFromResource(this, R.array.colors,android.R.layout.simple_spinner_dropdown_item);
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        // setOnItemSelectedListener() - ��Ӧ�������ѡ��ֵ�����仯���¼�
        
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
        	 @Override
             public void onItemSelected(AdapterView<?> arg0, View arg1,
                     int arg2, long arg3) {
                 TextView textview4 = (TextView)_Spinner.this.findViewById(R.id.textview4);
                 textview4.setText(((TextView)arg1).getText());
             }

             @Override
             public void onNothingSelected(AdapterView<?> arg0) {
            	 
             }
		});
	}
}

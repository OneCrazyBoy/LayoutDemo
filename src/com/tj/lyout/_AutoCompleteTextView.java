package com.tj.lyout;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class _AutoCompleteTextView extends Activity{
	  @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.autocompletetextview);

	        setTitle("AutoCompleteTextView");
	     // ʵ������������ָ����ʾ��ʽ������Դ
	        ArrayAdapter<String>adapter=new ArrayAdapter<String>(
	        this,
	        android.R.layout.simple_dropdown_item_1line,
	        ary);
	        AutoCompleteTextView textView = (AutoCompleteTextView) findViewById(R.id.editText);
	        // ָ���Զ���ɿؼ���������
	        textView.setAdapter(adapter);
	  }
	  // �Զ���ɿؼ����������ݵ�����Դ
	  private String[]ary=new String[]{
	  "abc",
	  "abcd",
	  "abcde",
	  "abcdef",
	  "hij",
	  "hijk",
	  "hijkl",
	  "hijklm",
	  "hijklmn",
   };
}
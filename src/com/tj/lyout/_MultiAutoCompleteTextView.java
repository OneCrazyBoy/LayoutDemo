package com.tj.lyout;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.MultiAutoCompleteTextView;

public class _MultiAutoCompleteTextView extends Activity{
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.multiautocompletetextview);

        setTitle("MultiAutoCompleteTextView");
        // ʵ������������ָ����ʾ��ʽ������Դ
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_dropdown_item_1line, 
                ary);
        MultiAutoCompleteTextView textView = (MultiAutoCompleteTextView) findViewById(R.id.editText1);
        textView.setAdapter(adapter);
        
        // ���ö��ֵ֮��ķָ������˴�Ϊ����
        textView.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
    }

    // �Զ���ɿؼ����������ݵ�����Դ
    private String[] ary = new String[] {
        "abc",
        "abcd",
        "abcde",
        "abcdef",
        "abcdefg",
        "hij",
        "hijk",
        "hijkl",
        "hijklm",
        "hijklmn",
    };
}

package com.tj.lyout;

import android.app.Activity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class _RadioGroup extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState){
		 // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.radiogroup);
        
        setTitle("RadioButton");
        
        	RadioGroup group=(RadioGroup)findViewById(R.id.radioGroup);
        	  // setOnCheckedChangeListener() - ��Ӧ��ѡ�����ڵ�ѡ������仯ʱ���¼�
            group.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {    
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {
                    TextView txt= (TextView) _RadioGroup.this.findViewById(R.id.textView);
                    txt.setText(((RadioButton)findViewById(checkedId)).getText() + " ��ѡ��");                    
                }
            });
	}

}

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
        	  // setOnCheckedChangeListener() - 响应单选框组内的选中项发生变化时的事件
            group.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {    
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {
                    TextView txt= (TextView) _RadioGroup.this.findViewById(R.id.textView);
                    txt.setText(((RadioButton)findViewById(checkedId)).getText() + " 被选中");                    
                }
            });
	}

}

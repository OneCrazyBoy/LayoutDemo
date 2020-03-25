package com.tj.lyout;

import android.app.Activity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

public class _CheckBox extends Activity {
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.checkbox);
        
        setTitle("CheckBox");
        
        CheckBox chk=(CheckBox)this.findViewById(R.id.chk1);
        // setOnCheckedChangeListener() - 响应复选框的选中状态改变事件
        chk.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
        	@Override
        	public void onCheckedChanged(CompoundButton buttonView,
				boolean isChecked) {
        		TextView text = (TextView)_CheckBox.this.findViewById(R.id.textview1);
        		text.setText("CheckBox01 的选中状态：" + String.valueOf(isChecked));       
        	}				
			});
}
}
package com.tj.lyout;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ToggleButton;

public class _ToggleButton extends Activity{
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.togglebutton);
      
        setTitle("ToggleButton");
        
        final ToggleButton btn=(ToggleButton)findViewById(R.id.togglebutton);
     // setOnClickListener() - ��Ӧ��ť����굥���¼�
        btn.setOnClickListener(new Button.OnClickListener(){
        	  @Override
              public void onClick(View v) {
                  TextView txt = (TextView) _ToggleButton.this.findViewById(R.id.textview2);
                  // ToggleButton.isChecked() - ˫״̬��ť�İ�ť״̬
                  txt.setText("��ť״̬��" + String.valueOf(btn.isChecked()));
        }
	});
}
}
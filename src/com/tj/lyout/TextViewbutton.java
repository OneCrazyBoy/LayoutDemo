package com.tj.lyout;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TextViewbutton extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.textviewbutton);
        setTitle("Button");
        
        Button button = (Button) this.findViewById(R.id.button);
        
        // setOnClickListener() - ��Ӧ��ť����굥���¼�
        button.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                TextView wenzi= (TextView)TextViewbutton.this.findViewById(R.id.wenzi);
                wenzi.setText("��ť��������");
            }
        });
    }
}




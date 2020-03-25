package com.tj.lyout;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
public class _ScrollView extends Activity{
		protected void onCreate(Bundle savedInstanceState){
			super.onCreate(savedInstanceState);
			
			setContentView(R.layout.scrollview);
			
			  setTitle("ScrollView");

		        TextView textView = (TextView)this.findViewById(R.id.textview5);
		        textView.setText("a\na\na\na\na\na\na\na\na\na\na\na\na\na\na\na\na\na\na\na\na\na\na\na\na\na\na\na\na\na\na\na\na\na");
		        
		
		
		}
}

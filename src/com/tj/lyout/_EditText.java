package com.tj.lyout;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;

public class _EditText extends Activity{
	   @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        // TODO Auto-generated method stub
	        super.onCreate(savedInstanceState);
	        this.setContentView(R.layout.edittext);
	        setTitle("EditText");
	        
	        EditText txt = (EditText) this.findViewById(R.id.editText);
	        txt.setText("Œ“ø…±‡º≠≈∂(°—o°—)");
	   }
}

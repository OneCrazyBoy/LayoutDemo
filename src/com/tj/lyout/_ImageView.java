package com.tj.lyout;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

public class _ImageView extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.imageview);
        
        setTitle("ImageView");
        
        ImageView imgView = (ImageView) this.findViewById(R.id.imageView);
        imgView.setBackgroundResource(R.drawable.icon1);
    }
}

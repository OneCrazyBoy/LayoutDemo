package com.tj.lyout;

import android.app.Activity;
import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.TextView;

public  class _RatingBar extends Activity implements RatingBar.OnRatingBarChangeListener {
		private RatingBar mRatingBar;
		private TextView mTextView;
		 @Override
		    protected void onCreate(Bundle savedInstanceState) {
		        // TODO Auto-generated method stub
		        super.onCreate(savedInstanceState);
		        this.setContentView(R.layout.ratingbar);
		        setTitle("RatingBar");
		        
		        mTextView = (TextView) findViewById(R.id.textview3);
		        mRatingBar = (RatingBar) findViewById(R.id.ratingBar);
		        
		     // setOnRatingBarChangeListener() - ��Ӧ����ֵ�����ı���¼�
		        mRatingBar.setOnRatingBarChangeListener(this);
		 }
		 @Override
		    public void onRatingChanged(RatingBar ratingBar, float rating,
		            boolean fromUser) {
		        mTextView.setText(String.valueOf(rating));
		 }
}

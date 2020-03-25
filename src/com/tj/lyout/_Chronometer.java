package com.tj.lyout;

import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Chronometer;

public class _Chronometer extends Activity{
	private Chronometer mChronometer;

	protected void onCreate(Bundle savedInstanceState){
		// TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.chronometer);

        setTitle("Chronometer");
        Button button;
        
        mChronometer = (Chronometer) findViewById(R.id.chronometer);
        
        // ���ü�ʱ������ʾ��ʱ���ʽ
        mChronometer.setFormat("��ʱ��(%s)");
        
        button = (Button) findViewById(R.id.btnStatr);
        button.setOnClickListener(mStartListener);

        button = (Button) findViewById(R.id.btnStop);
        button.setOnClickListener(mStopListener);

        button = (Button) findViewById(R.id.btnReset);
        button.setOnClickListener(mResetListener);
    }

    View.OnClickListener mStartListener = new OnClickListener() {
        public void onClick(View v) {
			// ������ʱ��
        	mChronometer.start();
        }
    };

    View.OnClickListener mStopListener = new OnClickListener() {
        public void onClick(View v) {
			// ��ͣ��ʱ��
        	mChronometer.stop();
        }
    };

    View.OnClickListener mResetListener = new OnClickListener() {
        public void onClick(View v) {
			// ��λ��ʱ������ֹͣ��ʱ��
        	mChronometer.setBase(SystemClock.elapsedRealtime());
        }
    };
	}


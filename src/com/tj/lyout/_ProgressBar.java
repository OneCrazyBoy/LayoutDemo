package com.tj.lyout;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

public class _ProgressBar extends Activity{
	  @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        // TODO Auto-generated method stub
	        super.onCreate(savedInstanceState);     
	        // ����������������Ӧ�ó���ı���������ʾ����������״��
	        requestWindowFeature(Window.FEATURE_PROGRESS);
	        // ����������������Ӧ�ó���ı���������ʾ��������ԲȦ״��
	        requestWindowFeature(Window.FEATURE_INDETERMINATE_PROGRESS);
	        
	        this.setContentView(R.layout.progressbar);
	        
	        setTitle("ProgressBar");
	        
	     // �ڱ���������ʾ����������״��
	        setProgressBarVisibility(true);
	     // �ڱ���������ʾ��������ԲȦ״��
	        setProgressBarIndeterminateVisibility(true);
	     // ָ���������Ľ���
	        setProgress(50*100);
	        setSecondaryProgress(75*100);
	  }
}

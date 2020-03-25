package com.tj.lyout;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

public class _ProgressBar extends Activity{
	  @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        // TODO Auto-generated method stub
	        super.onCreate(savedInstanceState);     
	        // 设置特性以允许在应用程序的标题栏上显示进度条（条状）
	        requestWindowFeature(Window.FEATURE_PROGRESS);
	        // 设置特性以允许在应用程序的标题栏上显示进度条（圆圈状）
	        requestWindowFeature(Window.FEATURE_INDETERMINATE_PROGRESS);
	        
	        this.setContentView(R.layout.progressbar);
	        
	        setTitle("ProgressBar");
	        
	     // 在标题栏上显示进度条（条状）
	        setProgressBarVisibility(true);
	     // 在标题栏上显示进度条（圆圈状）
	        setProgressBarIndeterminateVisibility(true);
	     // 指定进度条的进度
	        setProgress(50*100);
	        setSecondaryProgress(75*100);
	  }
}

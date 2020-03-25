package com.tj.lyout;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
public class LyoutDemo extends Activity {
    /** Called when the activity is first created. */

    private Button TextViewbutton;
    private Button _ImageButton;
    private Button _CheckBox;
    private Button _RadioGroup;
    private Button _AnalogClock;
    private Button _DigitalClock;
    private Button _ImageView;
    private Button _DatePicker;
    private Button _TimePicker;
    private Button _ToggleButton;
    private Button _EditText;
    private Button _ProgressBar;
    private Button _SeekBar;
    private Button _AutoCompleteTextView;
    private Button _MultiAutoCompleteTextView;
    private Button _ZoomControls;
    private Button _Include;
    private Button _VideoView;
    private Button _WebView;
    private Button _RatingBar;
    private Button _Tab;
    private Button _Spinner;
    private Button _Chronometer;
    private Button _ScrollView;
    private Button _TextSwitcher;
    private Button _Gallery;
    private Button _ImageSwitcher;
    private Button _GridView;
    private Button _Expandable;
    
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        Button frameLayout=(Button)findViewById(R.id.frameLayout);
        Button imagebutton=(Button)findViewById(R.id.imagebutton);
        Button check=(Button)findViewById(R.id.check);
        Button rad=(Button)findViewById(R.id.rad);
        Button ana=(Button)findViewById(R.id.ana);
        Button dig=(Button)findViewById(R.id.dig);
        Button Im=(Button)findViewById(R.id.Im);
        Button date=(Button)findViewById(R.id.date);
        Button time=(Button)findViewById(R.id.time);
        Button togg=(Button)findViewById(R.id.togg);
        Button edit=(Button)findViewById(R.id.edit);
        Button prog=(Button)findViewById(R.id.prog);
        Button seek=(Button)findViewById(R.id.seek);
        Button auto=(Button)findViewById(R.id.auto);
        Button mult=(Button)findViewById(R.id.mult);
        Button zoom=(Button)findViewById(R.id.zoom);
        Button ind=(Button)findViewById(R.id.ind);
        Button video=(Button)findViewById(R.id.video);
        Button web=(Button)findViewById(R.id.web);
        Button rat=(Button)findViewById(R.id.rat);
        Button tab=(Button)findViewById(R.id.tab);
        Button spinner=(Button)findViewById(R.id.spinner);
        Button chronometer=(Button)findViewById(R.id.chronometer);
        Button sv=(Button)findViewById(R.id.sv);
        Button TS=(Button)findViewById(R.id.ts);
        Button ga=(Button)findViewById(R.id.ga);
        Button is=(Button)findViewById(R.id.is);
        Button gd=(Button)findViewById(R.id.gd);
        Button edb=(Button)findViewById(R.id.edb);
        
        //1文本显示和按钮
        frameLayout.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent intent=new Intent();
				intent.setClass(LyoutDemo.this, TextViewbutton.class);
				startActivity(intent);
			}
		});
        //2图片按钮
        imagebutton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent intent=new Intent();
				intent.setClass(LyoutDemo.this, _ImageButton.class);
				startActivity(intent);
			}
		});
        //3复选框
        check.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent=new Intent();
				intent.setClass(LyoutDemo.this,_CheckBox.class);
				startActivity(intent);
			}
		});
        //4单选框
        rad.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent=new Intent();
				intent.setClass(LyoutDemo.this,_RadioGroup.class);
				startActivity(intent);
        }
        });
        //5钟表
        ana.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent=new Intent();
				intent.setClass(LyoutDemo.this,_AnalogClock.class);
				startActivity(intent);
        }
        });
        //6电子表
        dig.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent=new Intent();
				intent.setClass(LyoutDemo.this,_DigitalClock.class);
				startActivity(intent);
        }
        });
        //7图片显示
        Im.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent=new Intent();
				intent.setClass(LyoutDemo.this,_ImageView.class);
				startActivity(intent);
			 }
        });
        //8日期选择控件
        date.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent=new Intent();
				intent.setClass(LyoutDemo.this,_DatePicker.class);
				startActivity(intent);
			 }
        });
        //9时间选择控件
        time.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent=new Intent();
				intent.setClass(LyoutDemo.this,_TimePicker.class);
				startActivity(intent);
			}
		});
        //10双状态按钮控件
        togg.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent=new Intent();
				intent.setClass(LyoutDemo.this,_ToggleButton.class);
				startActivity(intent);
			}
		});
        //11文本显示
        edit.setOnClickListener(new View.OnClickListener() {	
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent=new Intent();
				intent.setClass(LyoutDemo.this,_EditText.class);
				startActivity(intent);
			}
		});
        //12进度条控件
        prog.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent=new Intent();
				intent.setClass(LyoutDemo.this,_ProgressBar.class);
				startActivity(intent);
			}
		});
        //13可拖动的进度条控件
        seek.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent=new Intent();
				intent.setClass(LyoutDemo.this,_SeekBar.class);
				startActivity(intent);
			}
		});
        //14支持自动完成功能的可编辑文本控件
        auto.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent=new Intent();
				intent.setClass(LyoutDemo.this,_AutoCompleteTextView.class);
				startActivity(intent);
			}
		});
        //15支持自动完成功能的可编辑文本控件，允许输入多值【多值之间会自动地用指定的分隔符分开】） 的 Demo
        mult.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent=new Intent();
				intent.setClass(LyoutDemo.this,_MultiAutoCompleteTextView.class);
				startActivity(intent);
			}
		});
        //16放大/缩小控件
        zoom.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent=new Intent();
				intent.setClass(LyoutDemo.this,_ZoomControls.class);
				startActivity(intent);
			}
		});
        //17整合控件
        ind.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent=new Intent();
				intent.setClass(LyoutDemo.this,_Include.class);
				startActivity(intent);
			}
		});
        //18视频播放
        video.setOnClickListener(new View.OnClickListener() {			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent=new Intent();
				intent.setClass(LyoutDemo.this,_VideoView.class);
				startActivity(intent);
			}
		});
        //19浏览器控件
        web.setOnClickListener(new View.OnClickListener() {			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent=new Intent();
				intent.setClass(LyoutDemo.this,_WebView.class);
				startActivity(intent);
			}
		});
        //20评分控件
        rat.setOnClickListener(new View.OnClickListener() {			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent=new Intent();
				intent.setClass(LyoutDemo.this,_RatingBar.class);
				startActivity(intent);
			}
		});
        //21选项卡控件
        tab.setOnClickListener(new View.OnClickListener() {			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent=new Intent();
				intent.setClass(LyoutDemo.this,_Tab.class);
				startActivity(intent);
			}
		});
        //22下拉框控件
        spinner.setOnClickListener(new View.OnClickListener() {			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent=new Intent();
				intent.setClass(LyoutDemo.this,_Spinner.class);
				startActivity(intent);
			}
		});
        //23计时控件
        chronometer.setOnClickListener(new View.OnClickListener() {			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent=new Intent();
				intent.setClass(LyoutDemo.this,_Chronometer.class);
				startActivity(intent);
			}
		});
        //24滚动条控件
        sv.setOnClickListener(new View.OnClickListener(){
        	@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent=new Intent();
				intent.setClass(LyoutDemo.this,_ScrollView.class);
				startActivity(intent);
        	}
        }); 
        //25.文字装换控件
        TS.setOnClickListener(new View.OnClickListener(){
        	@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent=new Intent();
				intent.setClass(LyoutDemo.this,_TextSwitcher.class);
				startActivity(intent);
        	}
        }); 
        //26.缩略图浏览器控件
        ga.setOnClickListener(new View.OnClickListener(){
        	@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent=new Intent();
				intent.setClass(LyoutDemo.this,_Gallery.class);
				startActivity(intent);
        	}
        }); 
        //27.图片转换控件
        is.setOnClickListener(new View.OnClickListener(){
        	@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent=new Intent();
				intent.setClass(LyoutDemo.this,_ImageSwitcher.class);
				startActivity(intent);
        	}
        }); 
        //28.网格控件
        gd.setOnClickListener(new View.OnClickListener(){
        	@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent=new Intent();
				intent.setClass(LyoutDemo.this,_GridView.class);
				startActivity(intent);
        	}
        }); 
      //29.支持展开/收缩功能的列表控件
        edb.setOnClickListener(new View.OnClickListener(){
        	@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent=new Intent();
				intent.setClass(LyoutDemo.this,_Expandable.class);
				startActivity(intent);
        	}
        }); 
    }
}

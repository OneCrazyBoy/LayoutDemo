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
        
        //1�ı���ʾ�Ͱ�ť
        frameLayout.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent intent=new Intent();
				intent.setClass(LyoutDemo.this, TextViewbutton.class);
				startActivity(intent);
			}
		});
        //2ͼƬ��ť
        imagebutton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent intent=new Intent();
				intent.setClass(LyoutDemo.this, _ImageButton.class);
				startActivity(intent);
			}
		});
        //3��ѡ��
        check.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent=new Intent();
				intent.setClass(LyoutDemo.this,_CheckBox.class);
				startActivity(intent);
			}
		});
        //4��ѡ��
        rad.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent=new Intent();
				intent.setClass(LyoutDemo.this,_RadioGroup.class);
				startActivity(intent);
        }
        });
        //5�ӱ�
        ana.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent=new Intent();
				intent.setClass(LyoutDemo.this,_AnalogClock.class);
				startActivity(intent);
        }
        });
        //6���ӱ�
        dig.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent=new Intent();
				intent.setClass(LyoutDemo.this,_DigitalClock.class);
				startActivity(intent);
        }
        });
        //7ͼƬ��ʾ
        Im.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent=new Intent();
				intent.setClass(LyoutDemo.this,_ImageView.class);
				startActivity(intent);
			 }
        });
        //8����ѡ��ؼ�
        date.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent=new Intent();
				intent.setClass(LyoutDemo.this,_DatePicker.class);
				startActivity(intent);
			 }
        });
        //9ʱ��ѡ��ؼ�
        time.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent=new Intent();
				intent.setClass(LyoutDemo.this,_TimePicker.class);
				startActivity(intent);
			}
		});
        //10˫״̬��ť�ؼ�
        togg.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent=new Intent();
				intent.setClass(LyoutDemo.this,_ToggleButton.class);
				startActivity(intent);
			}
		});
        //11�ı���ʾ
        edit.setOnClickListener(new View.OnClickListener() {	
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent=new Intent();
				intent.setClass(LyoutDemo.this,_EditText.class);
				startActivity(intent);
			}
		});
        //12�������ؼ�
        prog.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent=new Intent();
				intent.setClass(LyoutDemo.this,_ProgressBar.class);
				startActivity(intent);
			}
		});
        //13���϶��Ľ������ؼ�
        seek.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent=new Intent();
				intent.setClass(LyoutDemo.this,_SeekBar.class);
				startActivity(intent);
			}
		});
        //14֧���Զ���ɹ��ܵĿɱ༭�ı��ؼ�
        auto.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent=new Intent();
				intent.setClass(LyoutDemo.this,_AutoCompleteTextView.class);
				startActivity(intent);
			}
		});
        //15֧���Զ���ɹ��ܵĿɱ༭�ı��ؼ������������ֵ����ֵ֮����Զ�����ָ���ķָ����ֿ����� �� Demo
        mult.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent=new Intent();
				intent.setClass(LyoutDemo.this,_MultiAutoCompleteTextView.class);
				startActivity(intent);
			}
		});
        //16�Ŵ�/��С�ؼ�
        zoom.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent=new Intent();
				intent.setClass(LyoutDemo.this,_ZoomControls.class);
				startActivity(intent);
			}
		});
        //17���Ͽؼ�
        ind.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent=new Intent();
				intent.setClass(LyoutDemo.this,_Include.class);
				startActivity(intent);
			}
		});
        //18��Ƶ����
        video.setOnClickListener(new View.OnClickListener() {			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent=new Intent();
				intent.setClass(LyoutDemo.this,_VideoView.class);
				startActivity(intent);
			}
		});
        //19������ؼ�
        web.setOnClickListener(new View.OnClickListener() {			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent=new Intent();
				intent.setClass(LyoutDemo.this,_WebView.class);
				startActivity(intent);
			}
		});
        //20���ֿؼ�
        rat.setOnClickListener(new View.OnClickListener() {			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent=new Intent();
				intent.setClass(LyoutDemo.this,_RatingBar.class);
				startActivity(intent);
			}
		});
        //21ѡ��ؼ�
        tab.setOnClickListener(new View.OnClickListener() {			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent=new Intent();
				intent.setClass(LyoutDemo.this,_Tab.class);
				startActivity(intent);
			}
		});
        //22������ؼ�
        spinner.setOnClickListener(new View.OnClickListener() {			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent=new Intent();
				intent.setClass(LyoutDemo.this,_Spinner.class);
				startActivity(intent);
			}
		});
        //23��ʱ�ؼ�
        chronometer.setOnClickListener(new View.OnClickListener() {			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent=new Intent();
				intent.setClass(LyoutDemo.this,_Chronometer.class);
				startActivity(intent);
			}
		});
        //24�������ؼ�
        sv.setOnClickListener(new View.OnClickListener(){
        	@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent=new Intent();
				intent.setClass(LyoutDemo.this,_ScrollView.class);
				startActivity(intent);
        	}
        }); 
        //25.����װ���ؼ�
        TS.setOnClickListener(new View.OnClickListener(){
        	@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent=new Intent();
				intent.setClass(LyoutDemo.this,_TextSwitcher.class);
				startActivity(intent);
        	}
        }); 
        //26.����ͼ������ؼ�
        ga.setOnClickListener(new View.OnClickListener(){
        	@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent=new Intent();
				intent.setClass(LyoutDemo.this,_Gallery.class);
				startActivity(intent);
        	}
        }); 
        //27.ͼƬת���ؼ�
        is.setOnClickListener(new View.OnClickListener(){
        	@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent=new Intent();
				intent.setClass(LyoutDemo.this,_ImageSwitcher.class);
				startActivity(intent);
        	}
        }); 
        //28.����ؼ�
        gd.setOnClickListener(new View.OnClickListener(){
        	@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent=new Intent();
				intent.setClass(LyoutDemo.this,_GridView.class);
				startActivity(intent);
        	}
        }); 
      //29.֧��չ��/�������ܵ��б�ؼ�
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

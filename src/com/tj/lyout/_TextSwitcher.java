package com.tj.lyout;

import java.util.Random;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.ViewSwitcher;

public class _TextSwitcher extends Activity implements ViewSwitcher.ViewFactory {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.textswitcher);

        setTitle("TextSwithcer");

        final TextSwitcher switcher = (TextSwitcher) findViewById(R.id.textSwitcher);
        // ָ��ת������ ViewSwitcher.ViewFactory
        switcher.setFactory(this);
        
        // ���õ���͵����Ķ���Ч��
        Animation in = AnimationUtils.loadAnimation(this, android.R.anim.fade_in);
        Animation out = AnimationUtils.loadAnimation(this, android.R.anim.fade_out);
        switcher.setInAnimation(in);
        switcher.setOutAnimation(out);

        // ����һ�ΰ�ť�ı�һ������
        Button btnChange = (Button) this.findViewById(R.id.btnChange);
        btnChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switcher.setText(String.valueOf(new Random().nextInt()));
            }
        });
    }
    // ��д ViewSwitcher.ViewFactory �� makeView()������һ�� View
    @Override
    public View makeView() {
        TextView textView = new TextView(this);
        textView.setTextSize(36);
        return textView;
    }
}
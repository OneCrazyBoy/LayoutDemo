package com.tj.lyout;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class _VideoView extends Activity{
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.videoview);
        
        setTitle("VideoView");
        VideoView videoView=(VideoView)findViewById(R.id.videoView);
        // ָ����Ҫ���ŵ���Ƶ�ĵ�ַ
        videoView.setVideoURI(Uri.parse("android.resource://com.tj.lyout/"+R.drawable.mv));
        //videoView.setVideoPath();����·��
        
        // ���ò������Ŀ�����
        videoView.setMediaController(new MediaController(this));
        // ��ʼ������Ƶ
        videoView.start();
	}
}
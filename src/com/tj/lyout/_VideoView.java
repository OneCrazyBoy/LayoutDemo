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
        // 指定需要播放的视频的地址
        videoView.setVideoURI(Uri.parse("android.resource://com.tj.lyout/"+R.drawable.mv));
        //videoView.setVideoPath();绝对路径
        
        // 设置播放器的控制条
        videoView.setMediaController(new MediaController(this));
        // 开始播放视频
        videoView.start();
	}
}
package com.example.myapplication;

import android.app.Activity;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.net.Uri;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;
public class video extends Activity {

    private VideoView video;

    /** Called when the activity is firstcreated. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);//Hide title
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);//Set fullscreen
        setContentView(R.layout.video);

        video=findViewById(R.id.video);
        MediaController mc = new MediaController(video.this);       // 创建一个MediaController对象
        video.setMediaController(mc);       // 将VideoView与MediaController关联起来
        mc.setMediaPlayer(video);
        video.setVideoURI(Uri.parse("android.resource://com.example.myapplication/" + R.raw.video1));
        video.requestFocus();       // 设置VideoView获取焦点

        try {
            video.start();      // 播放视频
        }catch(Exception e) {
            e.printStackTrace();
        }
        //记录视频播放进度
        if(savedInstanceState != null){
            int ss = savedInstanceState.getInt("aa");
            video.seekTo(ss);
        }
        // 设置VideoView的Completion事件监听器
        video.setOnCompletionListener(new OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                Toast.makeText(video.this, "视频播放完毕！", Toast.LENGTH_SHORT).show();
                finish();
            }
        });
        }
    //继续播放视频
    @Override
    protected void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
        outState.putInt("aa", video.getCurrentPosition());
    }


}
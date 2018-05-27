package com.example.mitya.akimovlab4mobile;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.MediaController;
import android.widget.RadioButton;
import android.widget.VideoView;

public class VideoActivity extends AppCompatActivity implements View.OnClickListener{
    public VideoView videoPlayer;
    public VideoView videoView1;
    RadioButton first,second;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.video_activity);

    }

    @Override
    public void onClick(View v) {

    }
    public void play(View view){

          videoPlayer =  (VideoView)findViewById(R.id.videoPlayer);
        Uri myVideoUri = Uri.parse( "android.resource://" + getPackageName() + "/" /*+ R.raw.fun*/);

        videoPlayer.setVideoURI(myVideoUri);
        MediaController mediaController = new MediaController(this);
        videoPlayer.setMediaController(mediaController);
        mediaController.setMediaPlayer(videoPlayer);

        videoView1 =  (VideoView)findViewById(R.id.videoView1);
        videoView1.setVideoPath("https://ru.files.fm/u/uajw3tee");
        MediaController mediaController1 = new MediaController(this);
        videoView1.setMediaController(mediaController1);
        mediaController1.setMediaPlayer(videoView1);

        videoPlayer.start();videoView1.start();
    }
    public void pause(View view){
        videoPlayer.pause();     videoView1.pause();
    }
    public void stop(View view){
        videoPlayer.stopPlayback();
        videoPlayer.resume();
        videoView1.stopPlayback();
        videoView1.resume();
    }


}


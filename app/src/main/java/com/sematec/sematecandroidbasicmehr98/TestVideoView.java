package com.sematec.sematecandroidbasicmehr98;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class TestVideoView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_video_view);

        VideoView vv = findViewById(R.id.vv);

        vv.setVideoURI(Uri.parse("https://hw2.cdn.asset.aparat.com/aparat-video/dff34bc0a04018f09f83208b92b7451b17887517-144p__29029.mp4"));
        vv.setMediaController(new MediaController(TestVideoView.this));
        vv.start();
    }
}

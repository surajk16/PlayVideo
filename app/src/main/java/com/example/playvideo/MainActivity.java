package com.example.playvideo;

import android.net.Uri;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    VideoView videoView;
    Uri uri;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        videoView = findViewById(R.id.video_view);
        MediaController mediaController= new MediaController(this);
        mediaController.setAnchorView(videoView);

        uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.video);
        //uri = Uri.parse("https://www.youtube.com/watch?v=HaRQaDjKShA");
        videoView.setMediaController(mediaController);
        videoView.setVideoURI(uri);
        videoView.requestFocus();
        videoView.start();
    }
}

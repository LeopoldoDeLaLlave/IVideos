package com.example.ivideos;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void reproduceVideo (View vista){
        VideoView videoview = (VideoView) findViewById(R.id.videoView);
        int idVideo = this.getResources().getIdentifier(vista.getTag().toString(), "raw", this.getPackageName());
        Uri uri = Uri.parse("android.resource://"+getPackageName()+"/"+idVideo);
        videoview.setVideoURI(uri);
        videoview.start();

    }
}

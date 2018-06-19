package com.jwt.cacaaosovos;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.VideoView;


public class Achar20 extends Activity {

    private VideoView myVideoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_achar20);
        myVideoView = (VideoView) findViewById(R.id.video_view5);

        try {
            //set the media controller in the VideoView


            //set the uri of the video to be played
            myVideoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.quente2));
            myVideoView.start();

            myVideoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                @Override
                public void onPrepared(MediaPlayer mp) {
                    mp.setLooping(true);
                }
            }); // video finish listener


        } catch (Exception e) {

            Log.e("Error", e.getMessage());

            e.printStackTrace();

        }
    }


    @Override
    protected void onStop()
    {
        super.onStop();
        setContentView(new View(this));
        System.gc();

    }

    @Override
    protected void onResume()
    {
        super.onResume();
        setContentView(R.layout.activity_achar20);
        myVideoView = (VideoView) findViewById(R.id.video_view5);

        try {
            //set the media controller in the VideoView


            //set the uri of the video to be played
            myVideoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.quente2));
            myVideoView.start();

            myVideoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                @Override
                public void onPrepared(MediaPlayer mp) {
                    mp.setLooping(true);
                }
            }); // video finish listener


        } catch (Exception e) {

            Log.e("Error", e.getMessage());

            e.printStackTrace();

        }
    }

    @Override
    protected void onStart()
    {
        super.onStart();
        setContentView(R.layout.activity_achar20);
        myVideoView = (VideoView) findViewById(R.id.video_view5);

        try {
            //set the media controller in the VideoView


            //set the uri of the video to be played
            myVideoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.quente2));
            myVideoView.start();

            myVideoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                @Override
                public void onPrepared(MediaPlayer mp) {
                    mp.setLooping(true);
                }
            }); // video finish listener


        } catch (Exception e) {

            Log.e("Error", e.getMessage());

            e.printStackTrace();

        }
    }

    @Override
    protected void onRestart()
    {
        super.onRestart();
        setContentView(R.layout.activity_achar20);
        myVideoView = (VideoView) findViewById(R.id.video_view5);

        try {
            //set the media controller in the VideoView


            //set the uri of the video to be played
            myVideoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.quente2));
            myVideoView.start();

            myVideoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                @Override
                public void onPrepared(MediaPlayer mp) {
                    mp.setLooping(true);
                }
            }); // video finish listener


        } catch (Exception e) {

            Log.e("Error", e.getMessage());

            e.printStackTrace();

        }
    }


    public void achar21(View view)
    {
        Intent intent = new Intent(this,Achar21.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);

    }

}

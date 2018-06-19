package com.jwt.cacaaosovos;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.VideoView;


public class Achar10 extends Activity {

    private VideoView myVideoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_achar10);

        myVideoView = (VideoView) findViewById(R.id.video_view3);

        try {
            //set the media controller in the VideoView


            //set the uri of the video to be played
            myVideoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.morno));
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
        setContentView(R.layout.activity_achar10);

        myVideoView = (VideoView) findViewById(R.id.video_view3);

        try {
            //set the media controller in the VideoView


            //set the uri of the video to be played
            myVideoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.morno));
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
        setContentView(R.layout.activity_achar10);
        myVideoView = (VideoView) findViewById(R.id.video_view3);

        try {
            //set the media controller in the VideoView


            //set the uri of the video to be played
            myVideoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.morno));
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
        setContentView(R.layout.activity_achar10);
        myVideoView = (VideoView) findViewById(R.id.video_view3);

        try {
            //set the media controller in the VideoView


            //set the uri of the video to be played
            myVideoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.morno));
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


    public void achar11(View view)
    {
        Intent intent = new Intent(this,Achar11.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);

    }

    private void unbindDrawables(View view) {
        if (view.getBackground() != null) {
            view.getBackground().setCallback(null);
        }
        if (view instanceof ViewGroup) {
            for (int i = 0; i < ((ViewGroup) view).getChildCount(); i++) {
                unbindDrawables(((ViewGroup) view).getChildAt(i));
            }
            ((ViewGroup) view).removeAllViews();
        }
    }



//call this method from onDestroy()

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unbindDrawables(findViewById(R.id.video_view3));
        System.gc();
    }

}

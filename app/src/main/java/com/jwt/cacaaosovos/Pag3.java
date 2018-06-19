package com.jwt.cacaaosovos;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.VideoView;


public class Pag3 extends Activity {

    private VideoView myVideoView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pag3);

        myVideoView = (VideoView) findViewById(R.id.video_view);

        try {
            //set the media controller in the VideoView


            //set the uri of the video to be played
            myVideoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.loading_1));
            myVideoView.start();

            myVideoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
            {
                @Override
                public void onCompletion(MediaPlayer mp)
                {
                    Intent result = new Intent();
                    setResult(1, result);
                    finish();
                }
            }); // video finish listener


        } catch (Exception e) {

            Log.e("Error", e.getMessage());

            e.printStackTrace();

        }

//        myVideoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
//            @Override
//            public void onPrepared(MediaPlayer mp) {
//                mp.setLooping(true);
//            }
//        });
    }


    @Override
    protected void onResume()
    {
        super.onResume();
        setContentView(R.layout.activity_pag3);

        myVideoView = (VideoView) findViewById(R.id.video_view);

        try {
            //set the media controller in the VideoView


            //set the uri of the video to be played
            myVideoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.loading_1));
            myVideoView.start();

            myVideoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
            {
                @Override
                public void onCompletion(MediaPlayer vmp) {
                    Intent i = new Intent(getBaseContext(),
                            com.jwt.cacaaosovos.Pag4.class);
                    startActivity(i);
                    overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);

                }
            }); // video finish listener


        } catch (Exception e) {

            Log.e("Error", e.getMessage());

            e.printStackTrace();

        }

//        myVideoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
//            @Override
//            public void onPrepared(MediaPlayer mp) {
//                mp.setLooping(true);
//            }
//        });
    }

    @Override
    protected void onStart()
    {
        super.onStart();
        setContentView(R.layout.activity_pag3);

        myVideoView = (VideoView) findViewById(R.id.video_view);

        try {
            //set the media controller in the VideoView


            //set the uri of the video to be played
            myVideoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.loading_1));
            myVideoView.start();

            myVideoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
            {
                @Override
                public void onCompletion(MediaPlayer vmp) {
                    Intent i = new Intent(getBaseContext(),
                            com.jwt.cacaaosovos.Pag4.class);
                    startActivity(i);
                    overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);

                }
            }); // video finish listener


        } catch (Exception e) {

            Log.e("Error", e.getMessage());

            e.printStackTrace();

        }

//        myVideoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
//            @Override
//            public void onPrepared(MediaPlayer mp) {
//                mp.setLooping(true);
//            }
//        });
    }

    @Override
    protected void onRestart()
    {
        super.onRestart();
        setContentView(R.layout.activity_pag3);

        myVideoView = (VideoView) findViewById(R.id.video_view);

        try {
            //set the media controller in the VideoView


            //set the uri of the video to be played
            myVideoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.loading_1));
            myVideoView.start();

            myVideoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
            {
                @Override
                public void onCompletion(MediaPlayer vmp) {
                    Intent i = new Intent(getBaseContext(),
                            com.jwt.cacaaosovos.Pag4.class);
                    startActivity(i);
                    overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);

                }
            }); // video finish listener


        } catch (Exception e) {

            Log.e("Error", e.getMessage());

            e.printStackTrace();

        }

//        myVideoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
//            @Override
//            public void onPrepared(MediaPlayer mp) {
//                mp.setLooping(true);
//            }
//        });
    }

    @Override
    protected void onStop()
    {
        super.onStop();
        setContentView(new View(this));
        System.gc();

    }

    public void pag4(View view)
    {

        Intent intent = new Intent(this,Pag4.class);
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
        unbindDrawables(findViewById(R.id.video_view));
        System.gc();
    }


}

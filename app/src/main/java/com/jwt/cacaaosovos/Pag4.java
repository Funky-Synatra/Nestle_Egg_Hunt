package com.jwt.cacaaosovos;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;


public class Pag4 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pag4);
    }

    public void esconder(View view)
    {
        Intent intent = new Intent(this,Esconder1.class);
        startActivity(intent);
    }

    @Override
    protected void onResume()
    {
        super.onResume();
        setContentView(R.layout.activity_pag4);
    }

    @Override
    protected void onStart()
    {
        super.onStart();
        setContentView(R.layout.activity_pag4);
    }

    @Override
    protected void onRestart()
    {
        super.onRestart();
        setContentView(R.layout.activity_pag4);
    }

    @Override
    protected void onStop()
    {
        super.onStop();
        setContentView(new View(this));
        System.gc();

    }
    
    public void achar(View view)
    {
        Intent intent = new Intent(this,Achar1.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);

    }



}

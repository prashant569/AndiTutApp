package com.example.shukla.tutapp3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

    Thread mythread=  new Thread()
    {
        @Override
        public void run()
        {
            try
            {
                Thread.sleep(2000);
                startActivity(new Intent(Splash.this,MainActivity.class));
                finish();
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    };

    mythread.start();

}
}


package com.example.android.navigationdrawer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.content.Intent;
import android.app.Activity;
import android.os.Bundle;
//import android.support.v7.app.AppCompatActivity;

public class LaunchScreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch_screen);
        Thread myThread = new Thread(){
            @Override
            public void run() {
                try {
                    sleep(3000);
                    Intent intent = new Intent(getBaseContext(),MainActivity.class);
                    startActivity(intent);
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                finally {
                    finish();
                }
            }
        };
        myThread.start();
    }
}
package com.catchingnow.tinyclipboardmanager;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by Harish on 16/10/16.
 */

public class SplashScreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        Thread timerthred=new Thread(){

            public void run()
            {
                try{
                    sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally{
                    Intent intent=new Intent(SplashScreen.this,ActivityMain.class);
                    startActivity(intent);
                }
            }
        };
        timerthred.start();
    }
}

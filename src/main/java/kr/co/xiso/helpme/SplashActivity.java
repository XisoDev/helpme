package kr.co.xiso.helpme;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by overcode on 2016. 6. 28..
 */
public class SplashActivity extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        Thread timerThread = new Thread(){
          public void run(){
              try{
                  sleep(5000);
              }catch (InterruptedException ie){
                  ie.printStackTrace();
              }finally{
                  Intent intent = new Intent(SplashActivity.this, LoginActivity.class);
                  startActivity(intent);
              }
          }
        };
        timerThread.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}

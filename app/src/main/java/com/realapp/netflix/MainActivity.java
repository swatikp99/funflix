package com.realapp.netflix;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public void clickSignUp(View view)
    {
        Intent intent=new Intent(this, Welcome.class);
        Vibrator v = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
// Vibrate for 500 milliseconds
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            long[] mVibratePattern= new long[]{0,100,100,500};
            v.vibrate(VibrationEffect.createWaveform(mVibratePattern,5));
        }
         else {
            //deprecated in API 26
            long[] mVibratePattern= new long[]{0,300,300,600,0,300,300,600,0,300,300,600,0,300,300,600};
            for(int i=0;i<mVibratePattern.length;i++)
            v.vibrate(mVibratePattern[i]);
        }
        startActivity(intent);
    }
    public void clickSignIn(View view)
    {
        Intent intent=new Intent(this, signIn.class);
        startActivity(intent);
        finish();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

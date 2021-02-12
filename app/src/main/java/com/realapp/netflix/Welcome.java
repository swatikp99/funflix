package com.realapp.netflix;

import android.content.Context;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Welcome extends AppCompatActivity {
    MediaPlayer soundfx;
    public void tapGif(View view)
    {
        soundfx=MediaPlayer.create(Welcome.this,R.raw.pranks);
        soundfx.start();
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
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        soundfx=MediaPlayer.create(Welcome.this,R.raw.pranks);
        soundfx.start();
    }
}

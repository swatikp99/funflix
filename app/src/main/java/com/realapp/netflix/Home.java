package com.realapp.netflix;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Home extends AppCompatActivity {
    public void clickSignIn(View view)
    {
        Intent intent=new Intent(this, signIn.class);
        startActivity(intent);

    }
    public void clickSignUp(View view)
    {
        Intent intent=new Intent(this, MainActivity.class);
        startActivity(intent);

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }
}

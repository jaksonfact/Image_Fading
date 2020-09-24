package com.example.imagefading;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
     boolean tomIsShowing = true;
    public void fade(View view){

        Log.i("info","Image clicked");
        ImageView tomImage = (ImageView)findViewById(R.id.tomImageView);
        ImageView jerryImage = (ImageView)findViewById(R.id.jerryImageView);

        if (tomIsShowing){
            tomIsShowing = false;
            tomImage.animate().alpha(0).setDuration(2000);
            jerryImage.animate().alpha(1).setDuration(2000);
        }else{
            tomIsShowing = true;
            tomImage.animate().alpha(1).setDuration(2000);
            jerryImage.animate().alpha(0).setDuration(2000);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import android.content.Intent;
import android.widget.Button;

import org.opencv.android.CameraActivity;
import org.opencv.android.OpenCVLoader;
import org.opencv.osgi.OpenCVInterface;



public class MainActivity extends AppCompatActivity {
    static {
        if(OpenCVLoader.initDebug()){
            Log.d("MainActivity: ","Opencv is loaded");
        }
        else{
            Log.d("MainActivity: ","Opencv failed to load");
        }
    }
    private Button camera_button;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        camera_button=findViewById(R.id.camera_button);
        camera_button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(new Intent(MainActivity.this,CameraActivity2.class).addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK|Intent.FLAG_ACTIVITY_CLEAR_TOP));
            }

        });
    }


}
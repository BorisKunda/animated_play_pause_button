package com.happytrees.buttonbtn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.ohoussein.playpause.PlayPauseView;

public class MainActivity extends AppCompatActivity {
    //step1:
    /*
  ADD THIS IN GRADLE MODULE   compile 'com.github.ohoussein.playpauseview:playpauseview:1.0.2'
     */

    //step2:
    /*
  ADD THIS IN BUILD GRADLE

   allprojects {

		repositories {

			maven { url 'https://jitpack.io' }  --> THIS LINE 
		}
}
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final PlayPauseView view = (PlayPauseView) findViewById(R.id.play_pause_view);
       view.setOnClickListener(new View.OnClickListener() {
            @Override
           public void onClick(View v) {
                view.toggle();//makes button change from play to pause and vie versa
                //WRITE YOUR CODE HERE
            }
        });
    }
}

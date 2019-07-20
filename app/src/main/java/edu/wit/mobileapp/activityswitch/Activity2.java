package edu.wit.mobileapp.activityswitch;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_2);
        Button activity2_btn = findViewById(R.id.activity2_button);
        Bundle bundle = this.getIntent().getExtras();
        String name = bundle.getString("name");
        int age = bundle.getInt("age");
        Log.v("myApp", "name = " + name + "; age = " + age);


        activity2_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v("myApp", "button_2 is clicked");

                Intent intent = new Intent();
                intent.setClass(Activity2.this, Activity1.class);


                startActivity(intent);

            }

        });

    }
}
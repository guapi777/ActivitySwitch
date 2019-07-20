package edu.wit.mobileapp.activityswitch;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Activity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_1);
        Button activity1_btn = findViewById(R.id.activity1_button);

        activity1_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v("myApp", "button_1 is clicked");

                Intent intent = new Intent();
                intent.setClass(Activity1.this, Activity2.class);

                Bundle bundle = new Bundle();
                bundle.putString("name", "zhangYuan");
                bundle.putInt("age", 19);
                intent.putExtras(bundle);


                startActivity(intent);

            }

        });
    }
}

package com.example.atomixsafespend;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button insertMoney = (Button) findViewById(R.id.insertbutton);
        insertMoney.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent switchscreens = new Intent(MainActivity.this, InsertMoney.class);
                startActivity(switchscreens);
            }
        });
      }
    }

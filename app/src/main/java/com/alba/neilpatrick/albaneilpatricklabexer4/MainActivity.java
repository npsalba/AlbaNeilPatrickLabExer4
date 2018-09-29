package com.alba.neilpatrick.albaneilpatricklabexer4;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonToast = (Button) findViewById(R.id.buttonToast);
        Button buttonSnack = (Button) findViewById(R.id.buttonSnack);
        Button buttonSnack2 = (Button) findViewById(R.id.buttonSnack2);

        buttonToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = "TOAST!";
                int duration = Toast.LENGTH_SHORT;
                Toast.makeText(getApplicationContext(), message, duration).show();
            }
        });

        buttonSnack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View view = findViewById(R.id.activity_main);
                String message = "Ang galeng ng snackbar!";
                int duration = Snackbar.LENGTH_SHORT;

                Snackbar.make(view, message, duration).show();
            }
        });

        buttonSnack2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View view =findViewById(R.id.activity_main);
                String message = "Ang galeng ng snackbar with actions!";
                int duration = Snackbar.LENGTH_SHORT;

                showSnackbar2(view, message, duration);
            }
        });
    }
    public void showSnackbar2(View view, String message, int duration){
        final Snackbar snackbar = Snackbar.make(view, message, duration);
        snackbar.setAction("DISMISS", new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                snackbar.dismiss();
            }
        });
        snackbar.show();
    }
}

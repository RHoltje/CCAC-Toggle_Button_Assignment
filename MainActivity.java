package com.cit135.mytogglebuttons;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    private ToggleButton toggleButton;
    private TextView results;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        results = (TextView) findViewById(R.id.textView2);

        toggleButton = (ToggleButton) findViewById(R.id.toggleButtonid);
        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    //toggle is true
                    //change textView2 string value to txtViewWifiOn
                    results.setText(R.string.txtViewWifiOn);
                    results.setVisibility(View.VISIBLE);
                } else{
                    //toggle is false
                    //change textView string value to txtViewWifiOff
                    results.setText(R.string.txtViewWifiOff);
                    results.setVisibility(View.VISIBLE);
                }
            }
        });
    }
}

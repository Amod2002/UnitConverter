package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView textView,resulttext ;
    Button button;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        resulttext = findViewById(R.id.resulttext);
        button = findViewById(R.id.button2);
        editText = findViewById(R.id.editText);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    double kilos_entered = Double.parseDouble(editText.getText().toString());

                    resulttext.setText(""+convertToPound(kilos_entered)+ " lb");
            }
        });
    }

    public double convertToPound(double kilos){

        double pound_result = kilos * 2.20462 ;
        return pound_result ;

    }
}
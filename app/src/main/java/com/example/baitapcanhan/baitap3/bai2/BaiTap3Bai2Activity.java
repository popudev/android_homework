package com.example.baitapcanhan.baitap3.bai2;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.baitapcanhan.R;

public class BaiTap3Bai2Activity extends AppCompatActivity {

    EditText edText;
    Button btnClick;
    CheckBox cbColor, cbBold;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.baitap3_activity_bai2);

        edText = (EditText) findViewById(R.id.textClicked);
        btnClick = (Button) findViewById(R.id.btnClickMe);
        cbColor = (CheckBox) findViewById(R.id.cbColor);
        cbBold = (CheckBox) findViewById(R.id.cbBold);

        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (cbColor.isChecked()) edText.setTextColor(Color.RED);
                else edText.setTextColor(Color.BLACK);

                if (cbBold.isChecked()) edText.setTypeface(Typeface.DEFAULT_BOLD);
                else edText.setTypeface(Typeface.DEFAULT);

                edText.setText("You've clicked " + ++count + " times");
            }
        });

    }

}
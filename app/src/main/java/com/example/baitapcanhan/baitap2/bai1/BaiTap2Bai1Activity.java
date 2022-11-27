package com.example.baitapcanhan.baitap2.bai1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.baitapcanhan.R;

public class BaiTap2Bai1Activity extends AppCompatActivity implements View.OnClickListener {

    Button startGame;
    Button continueGame;
    Button helpGame;
    Button quitGame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.baitap2_activity_bai1);

        startGame = findViewById(R.id.startGame);
        continueGame = findViewById(R.id.continueGame);
        helpGame = findViewById(R.id.helpGame);
        quitGame = findViewById(R.id.quitGame);

        startGame.setOnClickListener(this);
        continueGame.setOnClickListener(this);
        helpGame.setOnClickListener(this);
        quitGame.setOnClickListener(this);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.startGame:
                Toast.makeText(this, startGame.getText(), Toast.LENGTH_SHORT).show();
                break;
            case R.id.helpGame:
                Toast.makeText(this, helpGame.getText(), Toast.LENGTH_SHORT).show();
                break;
            case R.id.continueGame:
                Toast.makeText(this, continueGame.getText(), Toast.LENGTH_SHORT).show();
                break;
            case R.id.quitGame:
                onBackPressed();
                break;
            default:
                break;
        }
    }
}
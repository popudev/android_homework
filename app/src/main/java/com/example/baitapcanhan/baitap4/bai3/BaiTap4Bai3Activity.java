package com.example.baitapcanhan.baitap4.bai3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.baitapcanhan.R;

public class BaiTap4Bai3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.baitap4_activity_bai3);

        Button btnDialCall = (Button) findViewById(R.id.btnDialCall);
        Button btnViewContact = (Button) findViewById(R.id.btnViewContact);
        Button btnSendTo = (Button) findViewById(R.id.btnSendTo);

        btnDialCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:(+84)123456789"));
                startActivity(intent);
            }
        });

        btnViewContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("content://contacts/people/"));
                startActivity(intent);
            }
        });

        btnSendTo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( Intent.ACTION_SENDTO, Uri.parse("sms:5551234"));
                intent.putExtra("sms_body", "Thu bay nay di choi khong?");
                startActivity(intent);
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}
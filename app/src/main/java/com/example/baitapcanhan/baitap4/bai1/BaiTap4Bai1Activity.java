package com.example.baitapcanhan.baitap4.bai1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.baitapcanhan.R;

public class BaiTap4Bai1Activity extends AppCompatActivity {
    EditText edName, edEmail, edProject;
    Button btnContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.baitap4_activity_bai1);

        edName = (EditText) findViewById(R.id.edName);
        edEmail = (EditText) findViewById(R.id.edEmail);
        edProject = (EditText) findViewById(R.id.edProject);
        btnContact = (Button) findViewById(R.id.btnContact);

        btnContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent itentContact = new Intent(getApplicationContext(), BaiTap4Bai1ContactInfoActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("name", edName.getText().toString());
                bundle.putString("email", edEmail.getText().toString());
                bundle.putString("project", edProject.getText().toString());
                itentContact.putExtras(bundle);
                startActivity(itentContact);
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}
package com.example.baitapcanhan.baitap4.bai1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.baitapcanhan.R;

public class BaiTap4Bai1ContactInfoActivity extends AppCompatActivity {

    TextView txtName, txtEmail, txtProject;
    Button btnFinish;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.baitap4_activity_bai1_contact_info);

        txtName = (TextView) findViewById(R.id.textName);
        txtEmail = (TextView) findViewById(R.id.textEmail);
        txtProject = (TextView) findViewById(R.id.textProject);
        btnFinish = (Button) findViewById(R.id.btnFinish);

        Bundle bundle = getIntent().getExtras();
        txtName.setText(bundle.getString("name"));
        txtEmail.setText(bundle.getString("email"));
        txtProject.setText(bundle.getString("project"));

        btnFinish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
package com.example.baitapcanhan.baitap4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.baitapcanhan.R;
import com.example.baitapcanhan.adapters.BaiTapListViewAdapter;
import com.example.baitapcanhan.baitap4.bai1.BaiTap4Bai1Activity;
import com.example.baitapcanhan.baitap4.bai2.BaiTap4Bai2Activity;
import com.example.baitapcanhan.baitap4.bai3.BaiTap4Bai3Activity;
import com.example.baitapcanhan.models.BaiTap;

import java.util.ArrayList;
import java.util.List;

public class BaiTap4MainActivity extends AppCompatActivity {
    List<BaiTap> listBaiTap;
    BaiTapListViewAdapter baitapListViewAdapter;
    ListView listViewBaiTap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView titleBaiTap = findViewById(R.id.titleBaiTap);
        titleBaiTap.setText("Bài Tập 4");

        listBaiTap = new ArrayList<>();
        baitapListViewAdapter = new BaiTapListViewAdapter(listBaiTap);

        int[] c = {1, 2, 3};
        for (int i : c) {
            listBaiTap.add(new BaiTap("Bài " + i));
        }

        listViewBaiTap = findViewById(R.id.listBaiTap);
        listViewBaiTap.setAdapter(baitapListViewAdapter);

        List<Intent> listIntent = new ArrayList<>();
        listIntent.add(new Intent(this, BaiTap4Bai1Activity.class));
        listIntent.add(new Intent(this, BaiTap4Bai2Activity.class));
        listIntent.add(new Intent(this, BaiTap4Bai3Activity.class));

        listViewBaiTap.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                startActivity(listIntent.get(position));
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}
package com.example.baitapcanhan.baitap2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.baitapcanhan.R;
import com.example.baitapcanhan.adapters.BaiTapListViewAdapter;
import com.example.baitapcanhan.baitap2.bai1.BaiTap2Bai1Activity;
import com.example.baitapcanhan.baitap2.bai3.BaiTap2Bai3Activity;
import com.example.baitapcanhan.baitap2.bai5.BaiTap2Bai5Activity;
import com.example.baitapcanhan.models.BaiTap;

import java.util.ArrayList;
import java.util.List;

public class BaiTap2MainActivity extends AppCompatActivity {
    List<BaiTap> listBaiTap;
    BaiTapListViewAdapter baitapListViewAdapter;
    ListView listViewBaiTap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listBaiTap = new ArrayList<>();
        baitapListViewAdapter = new BaiTapListViewAdapter(listBaiTap);

        int[] c = {1, 3, 5};
        for (int i : c) {
            listBaiTap.add(new BaiTap("Bài " + i));
        }

        listViewBaiTap = findViewById(R.id.listBaiTap);
        listViewBaiTap.setAdapter(baitapListViewAdapter);

        List<Intent> listIntent = new ArrayList<>();
        listIntent.add(new Intent(this, BaiTap2Bai1Activity.class));
        listIntent.add(new Intent(this, BaiTap2Bai3Activity.class));
        listIntent.add(new Intent(this, BaiTap2Bai5Activity.class));

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
package com.example.baitapcanhan.baitap3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.baitapcanhan.R;
import com.example.baitapcanhan.adapters.BaiTapListViewAdapter;
import com.example.baitapcanhan.baitap3.bai1.BaiTap3Bai1Activity;
import com.example.baitapcanhan.baitap3.bai2.BaiTap3Bai2Activity;
import com.example.baitapcanhan.models.BaiTap;

import java.util.ArrayList;
import java.util.List;

public class BaiTap3MainActivity extends AppCompatActivity {
    List<BaiTap> listBaiTap;
    BaiTapListViewAdapter baitapListViewAdapter;
    ListView listViewBaiTap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listBaiTap = new ArrayList<>();
        baitapListViewAdapter = new BaiTapListViewAdapter(listBaiTap);

        int[] c = {1, 2};
        for (int i : c) {
            listBaiTap.add(new BaiTap("Bài " + i));
        }

        listViewBaiTap = findViewById(R.id.listBaiTap);
        listViewBaiTap.setAdapter(baitapListViewAdapter);

        List<Intent> listIntent = new ArrayList<>();
        listIntent.add(new Intent(this, BaiTap3Bai1Activity.class));
        listIntent.add(new Intent(this, BaiTap3Bai2Activity.class));

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
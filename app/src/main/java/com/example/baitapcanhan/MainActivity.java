package com.example.baitapcanhan;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.baitapcanhan.baitap1.BaiTap1MainActivity;
import com.example.baitapcanhan.adapters.BaiTapListViewAdapter;
import com.example.baitapcanhan.baitap2.BaiTap2MainActivity;
import com.example.baitapcanhan.baitap3.BaiTap3MainActivity;
import com.example.baitapcanhan.baitap4.BaiTap4MainActivity;
import com.example.baitapcanhan.baitap5.BaiTap5MainActivity;
import com.example.baitapcanhan.baitap5.bai1.BaiTap5Bai1Graphics;
import com.example.baitapcanhan.models.BaiTap;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<BaiTap> listBaiTap;
    BaiTapListViewAdapter baitapListViewAdapter;
    ListView listViewBaiTap;
    TextView titleBaiTap;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listBaiTap = new ArrayList<>();
        baitapListViewAdapter = new BaiTapListViewAdapter(listBaiTap);



        for (int i = 1; i <=5 ; i++) {
            listBaiTap.add(new BaiTap("Bài tập " + i));
        }

        listViewBaiTap = findViewById(R.id.listBaiTap);
        listViewBaiTap.setAdapter(baitapListViewAdapter);


        List<Intent> listIntent = new ArrayList<>();
        listIntent.add(new Intent(this, BaiTap1MainActivity.class));
        listIntent.add(new Intent(this, BaiTap2MainActivity.class));
        listIntent.add(new Intent(this, BaiTap3MainActivity.class));
        listIntent.add(new Intent(this, BaiTap4MainActivity.class));
        listIntent.add(new Intent(this, BaiTap5MainActivity.class));


        listViewBaiTap.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               startActivity(listIntent.get(position));
            }
        });

    }
}
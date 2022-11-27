package com.example.baitapcanhan.adapters;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.baitapcanhan.R;
import com.example.baitapcanhan.models.BaiTap;

import java.util.List;

public class BaiTapListViewAdapter extends BaseAdapter {

    List<BaiTap> listBaiTap;

    public BaiTapListViewAdapter(List<BaiTap> listBaiTap) {
        this.listBaiTap = listBaiTap;
    }

    @Override
    public int getCount() {
        if(listBaiTap != null) {
            return listBaiTap.size();
        }
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return listBaiTap.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup viewGroup) {
        View viewItemBaiTap;
        if (convertView == null) {
            viewItemBaiTap = View.inflate(viewGroup.getContext(), R.layout.item_baitap_view, null);
        } else viewItemBaiTap = convertView;

        BaiTap baitap = (BaiTap) getItem(i);
        ((TextView) viewItemBaiTap.findViewById(R.id.name)).setText(baitap.name);

        return viewItemBaiTap;
    }
}

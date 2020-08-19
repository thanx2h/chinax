package com.an.chinax.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.an.chinax.R;
import com.an.chinax.data.PackageData;

import java.util.ArrayList;

public class PackageListAdapter extends BaseAdapter {

    Context mContext = null;
    LayoutInflater mLayoutInflater = null;
    ArrayList<PackageData> packageDataList;

    public PackageListAdapter(Context context, ArrayList<PackageData> data) {
        mContext = context;
        packageDataList = data;
        mLayoutInflater = LayoutInflater.from(mContext);
    }

    @Override
    public int getCount() {
        return packageDataList.size();
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public PackageData getItem(int position) {
        return packageDataList.get(position);
    }

    @Override
    public View getView(int position, View converView, ViewGroup parent) {
        View view = mLayoutInflater.inflate(R.layout.listview_package, null);

//        ImageView imageView = (ImageView)view.findViewById(R.id.poster);
        TextView tvAppName = (TextView)view.findViewById(R.id.appname);
        TextView tvpackageName = (TextView)view.findViewById(R.id.packagename);

//        imageView.setImageResource(sample.get(position).getPoster());
        tvAppName.setText(packageDataList.get(position).getAppName());
        tvpackageName.setText(packageDataList.get(position).getPackageName());

        return view;
    }
}
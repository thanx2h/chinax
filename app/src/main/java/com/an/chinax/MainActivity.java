package com.an.chinax;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.an.chinax.adapter.PackageListAdapter;
import com.an.chinax.data.PackageData;
import com.an.chinax.ui.ChinaXToast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public PackageListAdapter packageListAdapter;
    public ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        packageListAdapter = new PackageListAdapter(this, initializeMovieData());

        ListView listView = (ListView)findViewById(R.id.listView);
        listView.setAdapter(packageListAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView parent, View v, int position, long id){
                ChinaXToast.showToast(getApplicationContext(), packageListAdapter.getItem(position).getAppName());
            }
        });
    }

    public ArrayList<PackageData> initializeMovieData(){
        ArrayList<PackageData> packageDataList = new ArrayList<PackageData>();

        packageDataList.add(new PackageData("알리바바","com.alibaba"));
        packageDataList.add(new PackageData("틱톡","com.tictok"));
        packageDataList.add(new PackageData("위챗","com.wechat"));

        return packageDataList;
    }
}
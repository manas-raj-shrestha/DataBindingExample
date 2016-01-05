package com.leapfrog.databindingsample;

import android.databinding.BindingAdapter;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;


import com.leapfrog.databindingsample.databinding.ActivityMainBinding;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    ArrayList<User> userArrayList;

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        Tester tester = new Tester(ContextCompat.getDrawable(this,R.mipmap.ic_launcher));
        binding.setTester(tester);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rv_all_package);
        recyclerView.setAdapter(new RecyclerViewAdapter(this, createArrayList()));
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    public ArrayList<User> createArrayList() {
        userArrayList = new ArrayList<>();

        userArrayList.add(new User("Manas", "Shrestha", ContextCompat.getDrawable(this, R.mipmap.ic_launcher)));
        userArrayList.add(new User("Shilu", "Shrestha", ContextCompat.getDrawable(this, R.mipmap.ic_launcher)));
        userArrayList.add(new User("Surhid", "Shrestha", ContextCompat.getDrawable(this, R.mipmap.ic_launcher)));
        userArrayList.add(new User("Kushal", "Shrestha", ContextCompat.getDrawable(this, R.mipmap.ic_launcher)));
        userArrayList.add(new User("Surhid", "Amatya", ContextCompat.getDrawable(this, R.mipmap.ic_launcher)));
        userArrayList.add(new User("Saugat", "Gautam", ContextCompat.getDrawable(this, R.mipmap.ic_launcher)));
        userArrayList.add(new User("Shree Ram", "Neupane", ContextCompat.getDrawable(this, R.mipmap.ic_launcher)));
        userArrayList.add(new User("Rajesh", "Khadka", ContextCompat.getDrawable(this, R.mipmap.ic_launcher)));
        userArrayList.add(new User("Santosh", "Dhakal", ContextCompat.getDrawable(this, R.mipmap.ic_launcher)));
        userArrayList.add(new User("Dipen", "Sunar", ContextCompat.getDrawable(this, R.mipmap.ic_launcher)));
        userArrayList.add(new User("Anuj", "Joshi", ContextCompat.getDrawable(this, R.mipmap.ic_launcher)));

        return userArrayList;
    }

    public void changeData(View view) {
//        tester.drawableSrc = "not working";
//        binding.setTester(tester);
    }

    @BindingAdapter("bind:imgRes")
    public static void loadImage(ImageView iv,Tester tester){
        iv.setImageDrawable(tester.drawableSrc);
    }

}

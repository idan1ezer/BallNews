package com.example.ballnews;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    RecyclerView news_recycler_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViews();
        initRecycle();
    }

    private void initRecycle() {
        news_recycler_view.setLayoutManager(new LinearLayoutManager(this));

        Article a1 = new Article("First", "alsa");
        Article a2 = new Article("Second", "bela");

        NewsAdapter adapter = new NewsAdapter(Arrays.asList(a1, a2));
        news_recycler_view.setAdapter(adapter);
    }

    private void findViews() {
        news_recycler_view = findViewById(R.id.news_recycler_view);
    }

}
package com.example.ballnews;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.NewsViewHolder> {

    private List<Article> articleList;
    private Context context;

    public NewsAdapter(List<Article> articleList, Context context) {
        this.articleList = articleList;
        this.context = context;
    }

    @NonNull
    @Override
    public NewsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.article_row, parent, false);
        return new NewsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NewsViewHolder holder, int position) {
        Article article = articleList.get(position);
        holder.titleTextView.setText(article.getTitle());
        holder.contentTextView.setText(article.getContent());
//        holder.imageView.setText(article.getImageUrl());


        String imageUrl = articleList.get(position).getImageUrl();
        Glide.with(context).load(imageUrl).into(holder.imageView);
    }
    @Override
    public int getItemCount() {
        return articleList.size();
    }
    static class NewsViewHolder extends RecyclerView.ViewHolder{
        TextView titleTextView;
        TextView contentTextView;
        ImageView imageView;
        NewsViewHolder(View view) {
            super(view);
            titleTextView = view.findViewById(R.id.title_TV_article);
            contentTextView  = view.findViewById(R.id.content_TV_article);
            imageView = view.findViewById(R.id.image_IMG_article);
        }
    }
}

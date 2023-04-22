package com.example.ballnews;

public class Article {

    String title;
    String content;
    String imageUrl;

    public Article () {}

    public Article (String title, String content, String image) {
        this.title = title;
        this.content = content;
        this.imageUrl = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

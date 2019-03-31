package com.example.flickr_browser;

import java.io.Serializable;

public class Photo implements Serializable {

    public static final long serialVersionUID = 1L;

    private String mTitle;
    private String mAuthor;
    private String mAuthorId;
    private String mLink;
    private String mTags;
    private String mImage;

    public Photo(String title, String author, String authorId, String link, String tags, String image) {
        mTitle = title;
        mAuthor = author;
        mAuthorId = authorId;
        mLink = link;
        mTags = tags;
        mImage = image;
    }

    String getTitle() {
        return mTitle;
    }

    String getAuthor() {
        return mAuthor;
    }

    String getAuthorId() {
        return mAuthorId;
    }

    String getLink() {
        return mLink;
    }

    String getTags() {
        return mTags;
    }

    String getImage() {
        return mImage;
    }

    @Override
    public String toString() {
        return "\nPhoto{" +
                "mTitle='" + mTitle + '\n' +
                "mAuthor='" + mAuthor + '\n' +
                "mAuthorId='" + mAuthorId + '\n' +
                "mLink='" + mLink + '\n' +
                "mTags='" + mTags + '\n' +
                "mImage='" + mImage + '\n' +
                '}';
    }

}

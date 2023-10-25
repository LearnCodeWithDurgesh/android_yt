package com.learngram.app.data;

public class Post {

    private  int id;
    private  int userImage;
    private  int mainImage;

    private  String caption;

    private  String postUsername;
    private  String subTitle;

    private  String likedText;

    private  String commentText;

    public Post(int id, int userImage, int mainImage, String caption, String subTitle, String likedText, String commentText, String postUsername) {
        this.id = id;
        this.userImage = userImage;
        this.mainImage = mainImage;
        this.caption = caption;
        this.subTitle = subTitle;
        this.likedText = likedText;
        this.commentText = commentText;
        this.postUsername=postUsername;
    }

    public String getPostUsername() {
        return postUsername;
    }

    public void setPostUsername(String postUsername) {
        this.postUsername = postUsername;
    }

    public Post() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserImage() {
        return userImage;
    }

    public void setUserImage(int userImage) {
        this.userImage = userImage;
    }

    public int getMainImage() {
        return mainImage;
    }

    public void setMainImage(int mainImage) {
        this.mainImage = mainImage;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public String getLikedText() {
        return likedText;
    }

    public void setLikedText(String likedText) {
        this.likedText = likedText;
    }

    public String getCommentText() {
        return commentText;
    }

    public void setCommentText(String commentText) {
        this.commentText = commentText;
    }
}

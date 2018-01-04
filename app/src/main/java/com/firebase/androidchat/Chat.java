package com.firebase.androidchat;

/**
 * @author greg
 * @since 6/21/13
 */
public class Chat {

    private String message;
    private String author;
    private String id;


    private Chat() {
    }

    Chat(String message, String author,String id) {
        this.message = message;
        this.author = author;
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public String getAuthor() {
        return author;
    }

    public String getId() {
        return id;
    }
}
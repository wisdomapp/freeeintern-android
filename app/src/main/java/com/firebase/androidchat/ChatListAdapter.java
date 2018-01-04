package com.firebase.androidchat;

import android.app.Activity;
import android.graphics.Color;
import android.view.View;
import android.widget.TextView;

import com.firebase.client.Query;


public class ChatListAdapter extends FirebaseListAdapter<Chat> {

    private String mUsername;
    private String uid;



    public ChatListAdapter(Query ref, Activity activity, int layout, String mUsername,String uid) {
        super(ref, Chat.class, layout, activity);
        this.mUsername = mUsername;
        this.uid=uid;
    }

    @Override
    protected void populateView(View view, Chat chat) {

        String author = chat.getAuthor();
        String id = chat.getId();
        TextView authorText = (TextView) view.findViewById(R.id.author);
        authorText.setText(author + ": ");

        if (id != null && id.equals(uid)) {
            authorText.setTextColor(Color.RED);
        } else {
            authorText.setTextColor(Color.BLUE);
        }
        ((TextView) view.findViewById(R.id.message)).setText(chat.getMessage());
    }
}

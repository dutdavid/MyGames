package com.moringa.mygames;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class GamesArrayAdapter extends ArrayAdapter {
    private Context mContext;
    private String[] mGames;
    private String[] mDevelopers;

    public GamesArrayAdapter(Context mContext, int resource, String[] mGames, String[] mDevelopers) {
        super(mContext, resource);
        this.mContext = mContext;
        this.mGames = mGames;
        this.mDevelopers = mDevelopers;
    }
    @Override
    public Object getItem(int position) {
        String games = mGames[position];
        String developers = mDevelopers[position];
        return String.format("%s \nDeveloped By: %s", games, developers);
    }

    @Override
    public int getCount() {
        return mGames.length;
    }
}
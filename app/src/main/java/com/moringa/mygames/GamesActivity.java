package com.moringa.mygames;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class GamesActivity extends AppCompatActivity {
    private TextView mLocationTextView;
    private ListView mListView;
    private String[] games = new String[] {"Mortal kombat 11", "FIFA 19",
            "Far Cry New ", "Screen Door", "Luc Lac", "Sweet Basil",
            "Far Cry New Dawn", "Ghost Recon", "NBA 2k19", "Just Cause $",
            "Jump Force", "Battle Field 5", "Yakuza 0", "Initial Stage 2",
            "Lords of The Fallen", "Project Cars 2", "Devil May Cry 5",
            "Call of Duty world war 2", "Sniper elite 4"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_games);

        mListView = (ListView) findViewById(R.id.listView);
        mLocationTextView = (TextView) findViewById(R.id.locationTextView);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, games);
        mListView.setAdapter(adapter);


        Intent intent = getIntent();
        String location = intent.getStringExtra("location");
        mLocationTextView.setText("This are all the games in: " + location);
    }
}
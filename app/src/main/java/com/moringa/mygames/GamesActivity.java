package com.moringa.mygames;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import butterknife.BindView;
import butterknife.ButterKnife;

public class GamesActivity extends AppCompatActivity {
    @BindView(R.id.locationTextView) TextView mLocationTextView;
    @BindView(R.id.listView) ListView mListView;

    private String[] games = new String[] {"Mortal kombat 11", "FIFA 19",
            "Far Cry 5 ", "Boarderlands", "Apex Legends", "PUBG",
            "Far Cry New Dawn", "Ghost Recon", "NBA 2k19", "Just Cause 4",
            "Jump Force", "Battle Field 5", "Yakuza 0", "Initial Stage 2",
            "Lords of The Fallen", "Project Cars 2", "Devil May Cry 5",
            "Call of Duty world war 2", "Sniper elite 4"};
    private String[] developers = new String[] {"NetherRealm Studios", "EA sports", "Ubisoft",
            "Gearbox", "Origin", "Bluehole", "Ubisoft", "Ubisoft", "2ksports", "Avalanche studios",
            "SPIKE CHUNSOFT", "EA DICE", "SEGA", "Steam", "CI Games", "Code masters",
            "Capcom", "sledgehammer games", "Rebellion Developments" };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_games);
        ButterKnife.bind(this);

        Intent intent = getIntent();
        String location = intent.getStringExtra("location");
        GamesArrayAdapter adapter = new GamesArrayAdapter(this, android.R.layout.simple_list_item_1, games, developers);
        mListView.setAdapter(adapter);
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l){
                String restaurant = ((TextView)view).getText().toString();
                Toast.makeText(GamesActivity.this, restaurant, Toast.LENGTH_LONG).show();
            }
        });
        mLocationTextView.setText("This are all the genres under: " + location);
    }


}

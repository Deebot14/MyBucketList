 package com.graissy.mybucketlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class ThingsToDoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_things_to_do);

        setupList();

    }

    private void setupList() {
        BucketListEntry[] thingsToDo = {
                new BucketListEntry("Climb Mt Kilimanjaro", "Do it the difficult way!", R.drawable.kilimanjaro, 5),
                new BucketListEntry("Experience the Northern Lights", "Somewhere in the arctic circle, maybe Norway", R.drawable.northern_lights, 5),
                new BucketListEntry("Road Trip Across USA", "Rent a car in the west coast, and travel to the east coast", R.drawable.road_trip, 4.5f),
                new BucketListEntry("Scuba Dive", "In Koh Tao, Thailand", R.drawable.scubadive, 4),
                new BucketListEntry("Skydive", "Preferably over somewhere with an amazing view", R.drawable.skydive, 3.5f)
        };

        RecyclerView recyclerView = findViewById(R.id.recycler_view_things_to_do);
        BucketListEntryAdapter adapter = new BucketListEntryAdapter(thingsToDo);
        recyclerView.setAdapter(adapter);
    }
}
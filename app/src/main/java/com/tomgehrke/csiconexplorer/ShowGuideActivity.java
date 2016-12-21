package com.tomgehrke.csiconexplorer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class ShowGuideActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_guide);

        // TODO: Pull show list from web source to build out the guide
        //
        // This activity should load a list of the network's podcasts by either
        // pulling from an RSS feed or scraping the page at csicon.fm/our-shows.
        //
        // By iterating through each "headcontent" div, we can pull the album art,
        // the podcast name and the byline to be used in the guide.


    }
}

package com.tomgehrke.csiconexplorer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;

public class EpisodeListingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_episode_listing);

        // TODO: Pull show list from web source to build out the listing
        //
        // Reading from RSS feed possibly using XmlPullParserFactory and XmlPullParser.
        // https://www.tutorialspoint.com/android/android_rss_reader.htm

        // TODO: Create application function to programmatically create "Episode Cards"
        //
        // Programmatically add LinearLayouts to represent each episode available for the show.

        // TODO: Pass show and episode identifier to the target Activity so it knows which one to play
        //
        // Right now selecting any episode's "card" will load up the Episode Activity with the most recent
        // Geekdays episode displayed.
        //
        // http://stackoverflow.com/questions/19286970/using-intents-to-pass-data-between-activities-in-android

        // Handling the "Show 03 Episode 01" tile =====================================
        LinearLayout show03episode01Card = (LinearLayout) findViewById(R.id.show03_episode01_card);

        // Set onClick listener
        if (show03episode01Card != null) {
            show03episode01Card.setOnClickListener(new View.OnClickListener() {
                // The code in this method will be executed when the numbers View is clicked on.
                @Override
                public void onClick(View view) {
                    Intent showGuideIntent = new Intent(EpisodeListingActivity.this, EpisodeActivity.class);
                    startActivity(showGuideIntent);
                }
            });
        }

        // Handling the "Show 03 Episode 02" tile =====================================
        LinearLayout show03episode02Card = (LinearLayout) findViewById(R.id.show03_episode02_card);

        // Set onClick listener
        if (show03episode02Card != null) {
            show03episode02Card.setOnClickListener(new View.OnClickListener() {
                // The code in this method will be executed when the numbers View is clicked on.
                @Override
                public void onClick(View view) {
                    Intent showGuideIntent = new Intent(EpisodeListingActivity.this, EpisodeActivity.class);
                    startActivity(showGuideIntent);
                }
            });
        }

        // Handling the "Show 03 Episode 03" tile =====================================
        LinearLayout show03episode03Card = (LinearLayout) findViewById(R.id.show03_episode03_card);

        // Set onClick listener
        if (show03episode03Card != null) {
            show03episode03Card.setOnClickListener(new View.OnClickListener() {
                // The code in this method will be executed when the numbers View is clicked on.
                @Override
                public void onClick(View view) {
                    Intent showGuideIntent = new Intent(EpisodeListingActivity.this, EpisodeActivity.class);
                    startActivity(showGuideIntent);
                }
            });
        }

    }
}

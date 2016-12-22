package com.tomgehrke.csiconexplorer;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.graphics.Palette;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

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

        // TODO: Create application function to programmatically create "Activity Tiles"
        //
        // By passing the (downloaded) album art, podcast name and byline to this function, we
        // can build out the Activity without hardcoding shows.

        // Handling the "Show 01" tile =====================================
        LinearLayout show01Tile = (LinearLayout) findViewById(R.id.show01_tile);

        // Set onClick listener
        if (show01Tile != null) {
            show01Tile.setOnClickListener(new View.OnClickListener() {
                // The code in this method will be executed when the numbers View is clicked on.
                @Override
                public void onClick(View view) {
                    Intent showListingIntent = new Intent(ShowGuideActivity.this, EpisodeListingActivity.class);
                    startActivity(showListingIntent);
                }
            });
        }

        // Set tile color based on thumbnail
        Bitmap show01Bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.show01_logo);
        if (show01Bitmap != null && !show01Bitmap.isRecycled()) {
            Palette thumbnailPalette = Palette.from(show01Bitmap).generate();

            show01Tile.setBackgroundColor(thumbnailPalette.getDarkVibrantColor(0));

            TextView activityTitle = (TextView) findViewById(R.id.show01ActivityTitle);
            activityTitle.setTextColor(Color.WHITE);
        }

        // Handling the "Show 02" tile =====================================
        LinearLayout show02Tile = (LinearLayout) findViewById(R.id.show02_tile);

        // Set onClick listener
        if (show02Tile != null) {
            show02Tile.setOnClickListener(new View.OnClickListener() {
                // The code in this method will be executed when the numbers View is clicked on.
                @Override
                public void onClick(View view) {
                    Intent showListingIntent = new Intent(ShowGuideActivity.this, EpisodeListingActivity.class);
                    startActivity(showListingIntent);
                }
            });
        }

        // Set tile color based on thumbnail
        Bitmap show02Bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.show02_logo);
        if (show02Bitmap != null && !show02Bitmap.isRecycled()) {
            Palette thumbnailPalette = Palette.from(show02Bitmap).generate();

            show02Tile.setBackgroundColor(thumbnailPalette.getDarkVibrantColor(0));

            TextView activityTitle = (TextView) findViewById(R.id.show02ActivityTitle);
            activityTitle.setTextColor(Color.WHITE);
        }

        // Handling the "Show 03" tile =====================================
        LinearLayout show03Tile = (LinearLayout) findViewById(R.id.show03_tile);

        // Set onClick listener
        if (show03Tile != null) {
            show03Tile.setOnClickListener(new View.OnClickListener() {
                // The code in this method will be executed when the numbers View is clicked on.
                @Override
                public void onClick(View view) {
                    Intent showListingIntent = new Intent(ShowGuideActivity.this, EpisodeListingActivity.class);
                    startActivity(showListingIntent);
                }
            });
        }

        // Set tile color based on thumbnail
        Bitmap show03Bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.show03_logo);
        if (show03Bitmap != null && !show03Bitmap.isRecycled()) {
            Palette thumbnailPalette = Palette.from(show03Bitmap).generate();

            show03Tile.setBackgroundColor(thumbnailPalette.getDarkVibrantColor(0));

            TextView activityTitle = (TextView) findViewById(R.id.show03ActivityTitle);
            activityTitle.setTextColor(Color.WHITE);
        }

    }


}

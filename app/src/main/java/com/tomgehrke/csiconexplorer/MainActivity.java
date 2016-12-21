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

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Handling the "Show Guide" tile =====================================
        LinearLayout showGuideTile = (LinearLayout) findViewById(R.id.showGuideView);

        // Set onClick listener
        if (showGuideTile != null) {
            showGuideTile.setOnClickListener(new View.OnClickListener() {
                // The code in this method will be executed when the numbers View is clicked on.
                @Override
                public void onClick(View view) {
                    Intent showListingIntent = new Intent(MainActivity.this, ShowGuideActivity.class);
                    startActivity(showListingIntent);
                }
            });
        }

        // Set tile color based on thumbnail
        Bitmap showListingBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.csicon_logo);
        if (showListingBitmap != null && !showListingBitmap.isRecycled()) {
            Palette thumbnailPalette = Palette.from(showListingBitmap).generate();

            showGuideTile.setBackgroundColor(thumbnailPalette.getDarkVibrantColor(0));

            TextView activityTitle = (TextView) findViewById(R.id.showListActivityTitle);
            activityTitle.setTextColor(Color.WHITE);
        }

        // Handling the "About CSICON" tile ===================================
        LinearLayout aboutCsiconTile = (LinearLayout) findViewById(R.id.aboutCsiconView);

        // Set onClick listener
        if (aboutCsiconTile != null) {
            aboutCsiconTile.setOnClickListener(new View.OnClickListener() {
                // The code in this method will be executed when the numbers View is clicked on.
                @Override
                public void onClick(View view) {
                    Intent showListingIntent = new Intent(MainActivity.this, AboutCsiconActivity.class);
                    startActivity(showListingIntent);
                }
            });
        }

        // Set tile color based on thumbnail
        Bitmap aboutCsiconBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.csicon_tower);
        if (aboutCsiconBitmap != null && !aboutCsiconBitmap.isRecycled()) {
            Palette thumbnailPalette = Palette.from(aboutCsiconBitmap).generate();

            aboutCsiconTile.setBackgroundColor(thumbnailPalette.getDarkVibrantColor(0));

            TextView activityTitle = (TextView) findViewById(R.id.aboutCsiconActivityTitle);
            activityTitle.setTextColor(Color.WHITE);
        }
    }
}

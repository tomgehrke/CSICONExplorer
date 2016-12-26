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
        //
        // "Scraping" could utilize DocumentBuilderFactory and XPathExpression.
        // http://stackoverflow.com/questions/2971155/what-is-the-fastest-way-to-scrape-html-webpage-in-android
        //
        // ...or JSOUP.
        // http://www.androidbegin.com/tutorial/android-basic-jsoup-tutorial/
        //
        // Reading an RSS feed could utilize XmlPullParserFactory and XmlPullParser.
        // https://www.tutorialspoint.com/android/android_rss_reader.htm

        // TODO: Create application function to programmatically create "Show Cards"
        //
        // By passing the (downloaded) album art, podcast name and byline to this function, we
        // can build out the Activity without hardcoding individual shows.

        // TODO: Pass show identifier to the target Activity so it knows which show to list episodes for
        // 
        // Right now selecting any show's "card" will load up the Episode Listing Activity with Geekdays
        // episodes listed.
        //
        // http://stackoverflow.com/questions/19286970/using-intents-to-pass-data-between-activities-in-android

        // Handling the "Show 01" tile =====================================
        LinearLayout show01Card = (LinearLayout) findViewById(R.id.show01_card);

        // Set onClick listener
        if (show01Card != null) {
            show01Card.setOnClickListener(new View.OnClickListener() {
                // The code in this method will be executed when the numbers View is clicked on.
                @Override
                public void onClick(View view) {
                    Intent showGuideIntent = new Intent(ShowGuideActivity.this, EpisodeListingActivity.class);
                    startActivity(showGuideIntent);
                }
            });
        }

        // Set tile color based on thumbnail
        Bitmap show01Bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.show01_logo);
        if (show01Bitmap != null && !show01Bitmap.isRecycled()) {
            Palette thumbnailPalette = Palette.from(show01Bitmap).generate();

            show01Card.setBackgroundColor(thumbnailPalette.getDarkMutedColor(0));

            TextView activityTitle = (TextView) findViewById(R.id.show01TitleTextView);
            activityTitle.setTextColor(Color.WHITE);
        }

        // Handling the "Show 02" tile =====================================
        LinearLayout show02Card = (LinearLayout) findViewById(R.id.show02_card);

        // Set onClick listener
        if (show02Card != null) {
            show02Card.setOnClickListener(new View.OnClickListener() {
                // The code in this method will be executed when the numbers View is clicked on.
                @Override
                public void onClick(View view) {
                    Intent showGuideIntent = new Intent(ShowGuideActivity.this, EpisodeListingActivity.class);
                    startActivity(showGuideIntent);
                }
            });
        }

        // Set tile color based on thumbnail
        Bitmap show02Bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.show02_logo);
        if (show02Bitmap != null && !show02Bitmap.isRecycled()) {
            Palette thumbnailPalette = Palette.from(show02Bitmap).generate();

            show02Card.setBackgroundColor(thumbnailPalette.getDarkMutedColor(0));

            TextView activityTitle = (TextView) findViewById(R.id.show02TitleTextView);
            activityTitle.setTextColor(Color.WHITE);
        }

        // Handling the "Show 03" tile =====================================
        LinearLayout show03Card = (LinearLayout) findViewById(R.id.show03_card);

        // Set onClick listener
        if (show03Card != null) {
            show03Card.setOnClickListener(new View.OnClickListener() {
                // The code in this method will be executed when the numbers View is clicked on.
                @Override
                public void onClick(View view) {
                    Intent showGuideIntent = new Intent(ShowGuideActivity.this, EpisodeListingActivity.class);
                    startActivity(showGuideIntent);
                }
            });
        }

        // Set tile color based on thumbnail
        Bitmap show03Bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.show03_logo);
        if (show03Bitmap != null && !show03Bitmap.isRecycled()) {
            Palette thumbnailPalette = Palette.from(show03Bitmap).generate();

            show03Card.setBackgroundColor(thumbnailPalette.getDarkMutedColor(0));

            TextView activityTitle = (TextView) findViewById(R.id.show03TitleTextView);
            activityTitle.setTextColor(Color.WHITE);
        }

    }


}

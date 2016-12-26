package com.tomgehrke.csiconexplorer;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.io.IOException;


// TODO: Figure out what to do with the MediaPlayer once it's been started and someone leaves the activity
//       Currently if someone leaves and comes back, it's possible to start addition audio streams. FAIL.

public class EpisodeActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer;
    Button playToggleButton;

    // This would be pulled from the RSS feed
    String streamUrl = "http://dts.podtrac.com/redirect.mp3/cdn.csicon.fm/g/g533.mp3";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_episode);

        playToggleButton = (Button) findViewById(R.id.playToggleButton);

        mediaPlayer = new MediaPlayer();
        mediaPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);

        try {
            mediaPlayer.setDataSource(streamUrl);
        } catch (IOException error) {
            Log.e("Error!", error.getMessage());
        }

        if (playToggleButton != null) {
            playToggleButton.setOnClickListener(new View.OnClickListener() {
                // The code in this method will be executed when the numbers View is clicked on.
                @Override
                public void onClick(View view) {
                    togglePlay();
                }
            });
        }
    }

    private void togglePlay() {
        if (mediaPlayer.isPlaying()) {
            // Currently playing so stop it
            mediaPlayer.stop();
            if (!mediaPlayer.isPlaying()) {
                playToggleButton.setText(R.string.play_button);
            }
        } else {
            // Not playing so start it
            try {
                // TODO: Look more deeply at prepareAsync as alternative
                mediaPlayer.prepare();
            } catch (IOException error) {
                Log.e("Error!", error.getMessage());
            }
            mediaPlayer.start();
            if (mediaPlayer.isPlaying()) {
                playToggleButton.setText(R.string.stop_button);
            }
        }
    }
}

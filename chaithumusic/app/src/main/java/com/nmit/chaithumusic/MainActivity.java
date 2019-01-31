package com.nmit.chaithumusic;

        import android.media.MediaPlayer;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;

        import android.view.View;


public class MainActivity extends AppCompatActivity {
    MediaPlayer mediaPlayer;
    int pauseposition;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void play(View view){
        if(mediaPlayer == null) {
            mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.ricky);
            mediaPlayer.start();
        }else
        {
            mediaPlayer.seekTo(pauseposition);
            mediaPlayer.start();
        }


    }
    public void pause(View view){
        mediaPlayer.pause();
        pauseposition=mediaPlayer.getCurrentPosition();
    }
    public void stop(View view){
        if(mediaPlayer != null){
            mediaPlayer.stop();
            mediaPlayer = null;

        }

    }

}

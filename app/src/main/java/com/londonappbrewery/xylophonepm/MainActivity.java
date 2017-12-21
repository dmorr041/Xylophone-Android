package com.londonappbrewery.xylophonepm;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    // Helpful Constants
    private final int NR_OF_SIMULTANEOUS_SOUNDS = 7;
    private final float LEFT_VOLUME = 1.0f;
    private final float RIGHT_VOLUME = 1.0f;
    private final int NO_LOOP = 0;
    private final int PRIORITY = 0;
    private final float NORMAL_PLAY_RATE = 1.0f;

    // TODO: Add member variables here
    private SoundPool mSoundPool;
    private int mCSoundId;
    private int mDSoundId;
    private int mESoundId;
    private int mFSoundId;
    private int mGSoundId;
    private int mASoundId;
    private int mBSoundId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO: Create a new SoundPool
        /*
        * Assign the global Sound Pool variable a value using it's deprecated constructor.
        *
        * First parameter is the maxStreams, or the maximum number of sounds, which
        * in our case is 7, which we stored as a constant.
        *
        * Second parameter is the streamType, which is usually STREAM_MUSIC, which is part of
        * AudioManager.
        *
        * Third parameter is srcQuality, which is 0 by default.
        * */
        mSoundPool = new SoundPool(NR_OF_SIMULTANEOUS_SOUNDS, AudioManager.STREAM_MUSIC, 0);

        // TODO: Load and get the IDs to identify the sounds
        /*
        * The first parameter is the application context, which we can get using the
        * getApplicationContext() method built into Android Studio.
        *
        * The second parameter is the resource ID, which is the resource itself, or the sound file
        * we'll be using. To access it, we simply use R.raw.<sound file name>.
        *
        * The third parameter is set to 1 by default for our purposes.
        * */
        mCSoundId = mSoundPool.load(getApplicationContext(), R.raw.note1_c, 1);
        mDSoundId = mSoundPool.load(getApplicationContext(), R.raw.note2_d, 1);
        mESoundId = mSoundPool.load(getApplicationContext(), R.raw.note3_e, 1);
        mFSoundId = mSoundPool.load(getApplicationContext(), R.raw.note4_f, 1);
        mGSoundId = mSoundPool.load(getApplicationContext(), R.raw.note5_g, 1);
        mASoundId = mSoundPool.load(getApplicationContext(), R.raw.note6_a, 1);
        mBSoundId = mSoundPool.load(getApplicationContext(), R.raw.note7_b, 1);


    }

    // TODO: Add the play methods triggered by the buttons
    /*
    * This is where we want to actually play the sounds from our R.raw folder. To do so, we simply
    * use the Sound Pool object's play method.
    *
    * First parameter = Sound ID (We created them above)
    * Second parameter = Left Volume, which is 1.0f for maximum volume (refer to documentation)
    * Third parameter = Right Volume, which is 1.0f for maximum volume (refer to documentation)
    * Fourth parameter = Priority, which is 0 by default (refer to documentation)
    * Fifth parameter = Loop, aka how many times we want to play the sound (refer to documentation)
    * Sixth parameter = Playback rate, which is 1.0f by default (refer to documentation)
    * */
    public void playC(View v){
        mSoundPool.play(mCSoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }

    public void playD(View v){
        mSoundPool.play(mDSoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }

    public void playE(View v){
        mSoundPool.play(mESoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }

    public void playF(View v){
        mSoundPool.play(mFSoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }

    public void playG(View v){
        mSoundPool.play(mGSoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }

    public void playA(View v){
        mSoundPool.play(mASoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }

    public void playB(View v){
        mSoundPool.play(mBSoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }
}

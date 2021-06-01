package com.nadhil.wotvchara;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerSupportFragment;
import com.google.android.youtube.player.YouTubePlayerView;

public class Main2Activity extends YouTubeBaseActivity  {

    private ImageView mPhoto, mTabel,mSDraw, mRare, mEle;
    private TextView mNama, mDetail, mSeries, limitN, mSDes;
    YouTubePlayerView mVid;


    private final String API_KEY = "";

    @Override
    public void onCreate(Bundle savedInstanceState) {

        //untuk toolbar pada halaman detail, tidak bisa menampilkan button back dikarenakan class
        //menggunakan YouTubeBaseActivity, yang mana tidak dapat men-support setSupportActionBar dan semacamnya
        //saya sudah mencoba menggunakan YoutubePlayerSupportFragment, tetapi buruknya andoid yang saya gunakan
        //versi 3.5.1, yang mana sejak android 3.2+ sudah tidak mendukung YoutubePlayer T_T
        //akhirnya, saya menggunakan button ala kadarnya, tetapi bukan best practice karna activity ini tidak sepenuhnya berhenti.

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        mVid = (YouTubePlayerView)findViewById(R.id.youtube_pl);



        mPhoto = (ImageView) findViewById(R.id.m2_photo);
        mNama = (TextView) findViewById(R.id.m2_nama);
        mDetail = (TextView) findViewById(R.id.m2_des);
        mSeries = (TextView) findViewById(R.id.m2_series);
        mTabel = (ImageView) findViewById(R.id.m2_tabel);
        mSDraw = (ImageView) findViewById(R.id.skill_draw);
        mSDes = (TextView) findViewById(R.id.skill_des);
        mRare = (ImageView)findViewById(R.id.rarity);
        mEle = (ImageView)findViewById(R.id.element);


        limitN = (TextView) findViewById(R.id.limit_name);

        Button button = (Button) findViewById(R.id.btn_ac2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Main2Activity.this, MainActivity.class));
                finish();
            }
        });



        Intent intent = getIntent();
        String Nama = intent.getExtras().getString("nama");
        String Detail = intent.getExtras().getString("detail");
        String Series = intent.getExtras().getString("seri");
        String namaLimit = intent.getExtras().getString("namaLimit");
        final String VideoLim = intent.getExtras().getString("videoLimit");
        int image = intent.getExtras().getInt("gambar");
        int Tabel = intent.getExtras().getInt("tabel");
        int RareI = intent.getExtras().getInt("rare");
        int EleI = intent.getExtras().getInt("element");
        int SkillDr = intent.getExtras().getInt("skillImage");
        String SkillDs = intent.getExtras().getString("skillDeskripsi");

        mNama.setText(Nama);
        mDetail.setText(Detail);
        mPhoto.setImageResource(image);
        mSeries.setText(Series);
        mTabel.setImageResource(Tabel);
        limitN.setText(namaLimit);
        mSDraw.setImageResource(SkillDr);
        mSDes.setText(SkillDs);
        mRare.setImageResource(RareI);
        mEle.setImageResource(EleI);

        Toolbar toolbar = (Toolbar) findViewById(R.id.tb2);



        mVid.initialize(API_KEY, new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                if (!b){
                    if (VideoLim != null){
                        youTubePlayer.loadVideo(VideoLim);
                        youTubePlayer.setPlayerStyle(YouTubePlayer.PlayerStyle.MINIMAL);
                    }
                    else {
                        mVid.setVisibility(View.INVISIBLE);
                    }
                }
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

                Toast.makeText(Main2Activity.this, youTubeInitializationResult.toString(), Toast.LENGTH_LONG).show();
            }
        });
    }







}

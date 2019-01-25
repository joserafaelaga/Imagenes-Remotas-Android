package com.example.eag.imagenesremotas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {
    ImageView imagenremota;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imagenremota = (ImageView) findViewById(R.id.imagenremota);


    }

    public void traerImagen(View view){
        Glide.with(this)
                .load("https://supermariorun.com/assets/img/hero/hero_chara_mario_update_pc.png")
                //.thumbnail(0.5f)
                .into(imagenremota);
    }
}

package com.example.ejemplo_recycler;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ejemplo_recycler.Models.ItemList;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener{

    ImageView img;
    TextView ar, desc;

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        img = findViewById(R.id.imgv);
        ar  = findViewById(R.id.ar);
        desc  = findViewById(R.id.desc);
        btn = findViewById(R.id.btn);
        btn.setOnClickListener(this);

        Bundle bun = getIntent().getExtras();
        if (bun != null) {
            String artist = bun.getString("Art");
            ItemList selectedItem = (ItemList) bun.getSerializable("ItemList");

            if (artist != null && selectedItem != null) {
                img.setImageResource(selectedItem.getImgResource());
                ar.setText(artist);

                if ("Junior H".equals(ar.getText().toString())) {
                    String description = "Junior H is one of the leaders from the 21st century corridos tumbados (aka \"trap corridos\")\n" +
                            "movement movement and he is regularly featured on the biggest playlists from the genre United States Viral 50, Exitos USA, Mexico Viral 50, Corridos Perrones and many more.\n" +
                            "He is a distinguished singer-songwriter with a unique hypnotic flow to his vocals and an excellent sense of musical timing. Junior H is known for hit songs like Mente Positiva, Disfruto Lo Malo, Ella, and No Eh Cambiado.\n" +
                            "His newest album release from 2020 Atrapado en un Sueño is on the top of the general Latin charts across all genres. He is constantly writing new material and working diligently crafting his music in the studio. Stay tuned for a lot more to come from Junior H.";
                    desc.setText(description);
                }

                if ("Natanael Cano".equals(ar.getText().toString())) {
                    String description = "Charting singer and songwriter Natanael Cano is at the forefront of the 21st century corridos tumbados (aka \"trap corridos\") movement whose artists add hip-hop beats, production traits, rapping, chanting, and other urbano trappings to Mexico's 150-year-old folk song tradition. Cano joins a handful of like-minded artists in stretching the corrido form, like Arsenal Efectivo, Piso 21, and Fuerza Regida.\n" +
                            "Best known for his 2019 hit collaboration with Bad Bunny on the remix single \"Soy el Diablo,\"\n" +
                            "Cano had been working on the style since his mid-teens, as evidenced by smash YouTube singles such as \"El F1\" and \"El Drip.\" Those tracks rang up tens of millions of views and paved the way for 2019's Corridos Tumbados, which hit number four on Billboard's Top Latin Albums chart. Also that year, his song \"El de la Codeína\" topped Apple Music's Latino chart.\n" +
                            "Along with 2020's Soy El Nata and Las 3 Torres (a collaboration with Ovi and Junior H), he has remained a Billboard Latin chart favorite, hitting number 15 with 2020's Trap Tumbado, number nine with 2021's A Mis 20, and number 12 with 2022's NataKong.";
                    desc.setText(description);
                }
            }
        }


    }
    @Override
    public void onClick(View v) {
       Intent i= new Intent(v.getContext(), MainActivity.class);
       startActivity(i);

    }
}
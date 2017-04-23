package com.example.davet.beach1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.davet.beach1.CSU_List.CSU_Bakersfield;
import com.example.davet.beach1.CSU_List.CSU_Cal_Maritime;
import com.example.davet.beach1.CSU_List.CSU_ChannelIslands;
import com.example.davet.beach1.CSU_List.CSU_Chico;
import com.example.davet.beach1.CSU_List.CSU_DominguezHills;
import com.example.davet.beach1.CSU_List.CSU_EastBay;
import com.example.davet.beach1.CSU_List.CSU_Fresno;
import com.example.davet.beach1.CSU_List.CSU_Fullerton;
import com.example.davet.beach1.CSU_List.CSU_Humboldt;
import com.example.davet.beach1.CSU_List.CSU_LongBeach;
import com.example.davet.beach1.CSU_List.CSU_LosAngeles;
import com.example.davet.beach1.CSU_List.CSU_MontereyBay;
import com.example.davet.beach1.CSU_List.CSU_Northridge;
import com.example.davet.beach1.CSU_List.CSU_Pomona;
import com.example.davet.beach1.CSU_List.CSU_Sacramento;
import com.example.davet.beach1.CSU_List.CSU_SanBernardino;
import com.example.davet.beach1.CSU_List.CSU_SanDiego;
import com.example.davet.beach1.CSU_List.CSU_SanFrancisco;
import com.example.davet.beach1.CSU_List.CSU_SanJose;
import com.example.davet.beach1.CSU_List.CSU_SanLuisObispo;
import com.example.davet.beach1.CSU_List.CSU_SanMarcos;
import com.example.davet.beach1.CSU_List.CSU_Sonoma;
import com.example.davet.beach1.CSU_List.CSU_Stanislaus;

public class MainActivity extends AppCompatActivity {
    Button Stanislaus, Sonoma, SanMarcos, SanLuisObispo, SanJose, SanFrancisco, SanDiego, SanBernardino, Sacramento, Pomona;
    Button Northridge, MontereyBay, LosAngeles, LongBeach, Humboldt, Fullerton, Fresno, EastBay;
    Button DominguezHills, Chico, ChannelIslands, CalMaritime, Bakersfield;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Stanislaus=(Button)findViewById(R.id.Stanislaus);
        Stanislaus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this, CSU_Stanislaus.class);
                startActivity(i);
            }
        });

        Sonoma=(Button)findViewById(R.id.Sonoma);
        Sonoma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this, CSU_Sonoma.class);
                startActivity(i);
            }
        });

        SanMarcos=(Button)findViewById(R.id.SanMarcos);
        SanMarcos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this, CSU_SanMarcos.class);
                startActivity(i);
            }
        });

        SanLuisObispo=(Button)findViewById(R.id.SanLuisObispo);
        SanLuisObispo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this, CSU_SanLuisObispo.class);
                startActivity(i);
            }
        });

        SanJose=(Button)findViewById(R.id.SanJose);
        SanJose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this, CSU_SanJose.class);
                startActivity(i);
            }
        });

        SanFrancisco=(Button)findViewById(R.id.SanFrancisco);
        SanFrancisco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this, CSU_SanFrancisco.class);
                startActivity(i);
            }
        });

        SanDiego=(Button)findViewById(R.id.SanDiego);
        SanDiego.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this, CSU_SanDiego.class);
                startActivity(i);
            }
        });

        SanBernardino=(Button)findViewById(R.id.SanBernardino);
        SanBernardino.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this, CSU_SanBernardino.class);
                startActivity(i);
            }
        });

        Sacramento=(Button)findViewById(R.id.Sacramento);
        Sacramento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this, CSU_Sacramento.class);
                startActivity(i);
            }
        });


        Pomona=(Button)findViewById(R.id.Pomona);
        Pomona.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this, CSU_Pomona.class);
                startActivity(i);
            }
        });


        Northridge=(Button)findViewById(R.id.Northridge);
        Northridge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this, CSU_Northridge.class);
                startActivity(i);
            }
        });

        MontereyBay=(Button)findViewById(R.id.MontereyBay);
        MontereyBay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this, CSU_MontereyBay.class);
                startActivity(i);
            }
        });

        LosAngeles=(Button)findViewById(R.id.LosAngeles);
        LosAngeles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this, CSU_LosAngeles.class);
                startActivity(i);
            }
        });

        LongBeach=(Button)findViewById(R.id.LongBeach);
        LongBeach.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this, CSU_LongBeach.class);
                startActivity(i);
            }
        });

        Humboldt=(Button)findViewById(R.id.Humboldt);
        Humboldt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this, CSU_Humboldt.class);
                startActivity(i);
            }
        });

        Fullerton=(Button)findViewById(R.id.Fullerton);
        Fullerton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this, CSU_Fullerton.class);
                startActivity(i);
            }
        });

        Fresno=(Button)findViewById(R.id.Fresno);
        Fresno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this, CSU_Fresno.class);
                startActivity(i);
            }
        });

        EastBay=(Button)findViewById(R.id.EastBay);
        EastBay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this, CSU_EastBay.class);
                startActivity(i);
            }
        });

        DominguezHills=(Button)findViewById(R.id.DominguezHills);
        DominguezHills.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this, CSU_DominguezHills.class);
                startActivity(i);
            }
        });

        Chico=(Button)findViewById(R.id.Chico);
        Chico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this, CSU_Chico.class);
                startActivity(i);
            }
        });

        ChannelIslands=(Button)findViewById(R.id.ChannelIslands);
        ChannelIslands.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this, CSU_ChannelIslands.class);
                startActivity(i);
            }
        });

        CalMaritime=(Button)findViewById(R.id.CalMaritime);
        CalMaritime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this, CSU_Cal_Maritime.class);
                startActivity(i);
            }
        });

        Bakersfield=(Button)findViewById(R.id.Bakersfield);
        Bakersfield.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this, CSU_Bakersfield.class);
                startActivity(i);
            }
        });
    }

}

package com.saxena.cred_it;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.saxena.cred_it.adapter.RecyclerViewMenu1;

public class Landing_Page extends AppCompatActivity {

    ImageView imv , imv1 , imv2, imv3 , imv4;
    TextView txt , txt1 , txt2 , txt3 ,txt4;
    RecyclerView rv_menu1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing_page);
        //define

        imv = findViewById(R.id.imv);
        imv1 = findViewById(R.id.imv1);
        imv2 = findViewById(R.id.imv2);
        imv3 = findViewById(R.id.imv3);
        imv4 = findViewById(R.id.imv4);
        txt = findViewById(R.id.txt);
        txt1 = findViewById(R.id.txt1);
        txt2 = findViewById(R.id.txt2);
        txt3 = findViewById(R.id.txt3);
        txt4 = findViewById(R.id.txt4);

        rv_menu1 = findViewById(R.id.rv_menu1);

    }
}
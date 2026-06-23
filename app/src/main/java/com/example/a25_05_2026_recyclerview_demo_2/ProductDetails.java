package com.example.a25_05_2026_recyclerview_demo_2;

import android.app.AppComponentFactory;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ProductDetails extends AppCompatActivity {
    ImageView imgView1;
    TextView txtViewForProductName,txtViewForProductPrice;
    String prName;
    int prPrice;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.product_details);
        imgView1 = findViewById(R.id.imgView1);
        txtViewForProductName = findViewById(R.id.txtViewForProductName);
        txtViewForProductPrice = findViewById(R.id.txtViewForProductPrice);
        extractDataAndBind();
    }

    public void extractDataAndBind(){
        Intent i = getIntent();
        prName = i.getStringExtra("product_name");
        prPrice = i.getIntExtra("product_price",-1000);
        imgView1.setImageResource(R.drawable.ic_launcher_background);
        txtViewForProductName.setText(prName);
        txtViewForProductPrice.setText(prPrice + "");
    }
}

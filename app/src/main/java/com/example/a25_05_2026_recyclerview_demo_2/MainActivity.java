package com.example.a25_05_2026_recyclerview_demo_2;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerViewForProducts;
    ArrayList<Product> products;
    ProductsAdapter productsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initProducts();
        initViews();
    }

    public void initViews() {
        recyclerViewForProducts = findViewById(R.id.recyclerViewForProducts);
        productsAdapter = new ProductsAdapter(products);
        recyclerViewForProducts.setAdapter(productsAdapter);
        recyclerViewForProducts.setLayoutManager(new LinearLayoutManager(
                this,
                LinearLayoutManager.VERTICAL,
                true
        ));
    }

    private void initProducts() {
        products = new ArrayList<Product>();
        for (int i = 0; i < 20; i++) {
            products.add(new Product(i + 100,
                    "Product " + i,
                    i * 1000 + 500,
                    R.drawable.ic_launcher_background + ""));
        }
    }
}
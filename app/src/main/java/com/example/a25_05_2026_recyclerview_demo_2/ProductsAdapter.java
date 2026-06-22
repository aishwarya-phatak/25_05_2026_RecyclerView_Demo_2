package com.example.a25_05_2026_recyclerview_demo_2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ProductsAdapter extends
        RecyclerView.Adapter<ProductsAdapter.ProductViewHolder> {

    ArrayList<Product> products;
    View productView;
    ImageView imgView;
    TextView txtViewProductName,txtViewForProductPrice;

    public ProductsAdapter(ArrayList<Product> products){
        this.products = products;
    }

    class ProductViewHolder extends RecyclerView.ViewHolder{

        public ProductViewHolder(@NonNull View itemView) {
            super(itemView);
            imgView = itemView.findViewById(R.id.productImageView);
            txtViewProductName = itemView.findViewById(R.id.txtViewProductName);
            txtViewForProductPrice = itemView.findViewById(R.id.txtViewProductPrice);
        }
    }

    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        productView = layoutInflater.inflate(R.layout.product_view,null);
        return new ProductViewHolder(productView);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {
        imgView = holder.itemView.findViewById(R.id.productImageView);
        txtViewProductName = holder.itemView.findViewById(R.id.txtViewProductName);
        txtViewForProductPrice = holder.itemView.findViewById(R.id.txtViewProductPrice);

        imgView.setImageResource(R.drawable.ic_launcher_background);
        txtViewProductName.setText(products.get(position).getProductName());
        txtViewForProductPrice.setText(products.get(position).getProductPrice() + "");
    }

    @Override
    public int getItemCount() {
        return products.size();
    }
}



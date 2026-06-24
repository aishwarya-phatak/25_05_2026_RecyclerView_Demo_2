package com.example.a25_05_2026_recyclerview_demo_2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ProductsAdapter extends
        RecyclerView.Adapter<ProductsAdapter.ProductViewHolder> {

    ArrayList<Product> products;
    View productView;
    ImageView imgView;
    TextView txtViewProductName,txtViewForProductPrice;
    Intent intent;

    public ProductsAdapter(ArrayList<Product> products){
        this.products = products;
    }

    class ProductViewHolder extends RecyclerView.ViewHolder{

        public ProductViewHolder(@NonNull View itemView) {
            super(itemView);
            imgView = itemView.findViewById(R.id.productImageView);
            txtViewProductName = itemView.findViewById(R.id.txtViewProductName);
            txtViewForProductPrice = itemView.findViewById(R.id.txtViewProductPrice);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    intent = new Intent(itemView.getContext(), ProductDetails.class);
                    intent.putExtra("product",products.get(getAdapterPosition()));  //imp
                    itemView.getContext().startActivity(intent);
                }
            });
        }
    }

    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        productView = layoutInflater.inflate(R.layout.product_view,null);

        //way 1- in onCreateViewHolder method we cannot attach listeners as we do not get position specific data

//        productView.findViewById(R.id.productImageView).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(view.getContext(), "onCreateViewHolder", Toast.LENGTH_LONG)
//                        .show();
//                intent = new Intent(view.getContext(), ProductDetails.class);
//                view.getContext().startActivity(intent);
//            }
//        });
        return new ProductViewHolder(productView);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, @SuppressLint("RecyclerView") int position) {
        imgView = holder.itemView.findViewById(R.id.productImageView);
        txtViewProductName = holder.itemView.findViewById(R.id.txtViewProductName);
        txtViewForProductPrice = holder.itemView.findViewById(R.id.txtViewProductPrice);

        imgView.setImageResource(R.drawable.ic_launcher_background);
        txtViewProductName.setText(products.get(position).getProductName());
        txtViewForProductPrice.setText(products.get(position).getProductPrice() + "");

        //way 2 -- attaching listeners in onBind method so we get position specific data

//        imgView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                intent = new Intent(view.getContext(), ProductDetails.class);
//                intent.putExtra("product_name",products.get(position).getProductName());
//                intent.putExtra("product_price",products.get(position).getProductPrice());
//                view.getContext().startActivity(intent);
//            }
//        });
    }

    @Override
    public int getItemCount() {
        return products.size();
    }
}



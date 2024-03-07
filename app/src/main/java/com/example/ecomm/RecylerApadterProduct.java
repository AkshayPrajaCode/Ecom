package com.example.ecomm;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.ecomm.Model.Products_Model;

import java.util.List;

public class RecylerApadterProduct extends RecyclerView.Adapter<RecylerApadterProduct.viewHolder> {
    Context context;
    List<Products_Model.Product> slist;
    public  RecylerApadterProduct(Context context,List<Products_Model.Product> mlist){
        this.context= context;
        this.slist = mlist;
    }

    @NonNull
    @Override
    public RecylerApadterProduct.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view  =  LayoutInflater.from(context).inflate(R.layout.product_row,parent,false);
        viewHolder viewHolder= new viewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecylerApadterProduct.viewHolder holder, int position) {
        holder.Product_imag.setImageResource(R.drawable.jehruiew);
        holder.product_stack.setText("564");
        holder.Product_Price.setText("Rs,4541");
        holder.product_name_mobile.setText("Rs,Iphone");
        holder.discount.setText("16%");

        Glide.with(context).load(slist.get(holder.getAdapterPosition()).getThumbnail()).into(holder.Product_imag);
        Glide.with(context).load(slist.get(holder.getAdapterPosition()).getPrice()).into(holder.Product_Price);
    }

    @Override
    public int getItemCount() {
        return slist.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {

        ImageView Product_imag;
        TextView product_stack, Product_Price,product_name_mobile,discount;


        public viewHolder(@NonNull View itemView) {
            super(itemView);

            Product_imag= itemView.findViewById(R.id.product_imag);

            product_stack=itemView.findViewById(R.id.product_stack);
            Product_Price=itemView.findViewById(R.id.product_price);
            product_name_mobile=itemView.findViewById(R.id.product_name_mobile);
            discount=itemView.findViewById(R.id.product_discount);


        }
    }
}

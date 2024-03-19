package com.example.ecomm.SliderImage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ecomm.R;

public class RecylerAdapterImage extends RecyclerView.Adapter<RecylerAdapterImage.ViewHolder> {


    Context context;
    public RecylerAdapterImage( Context context){
        this.context= context;
    }


    @NonNull
    @Override
    public RecylerAdapterImage.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view  =  LayoutInflater.from(context).inflate(R.layout.imagesilder,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecylerAdapterImage.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 5;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView ImageLoder;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            ImageLoder=itemView.findViewById(R.id.simageRes);
        }
    }
}

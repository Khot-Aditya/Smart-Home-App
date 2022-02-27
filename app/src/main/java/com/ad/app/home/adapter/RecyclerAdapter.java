package com.ad.app.home.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ad.app.home.R;
import com.ad.app.home.model.DeviceModel;
import com.google.android.material.button.MaterialButton;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ListBasicViewHolder> {

    private final List<DeviceModel> objectList;
    private final Context context;

    public RecyclerAdapter(List<DeviceModel> objectList, Context context) {
        this.objectList = objectList;
        this.context = context;

    }

    @NonNull
    @Override
    public RecyclerAdapter.ListBasicViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.itemview_cardview, parent, false);
        return new RecyclerAdapter.ListBasicViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerAdapter.ListBasicViewHolder holder, int position) {
        final DeviceModel object = objectList.get(position);

//        String plantName = object.getName();
//        String description = object.getDescription();
//        int price = object.getPrice();
//        String imageUrl = object.getImageUrl();


//        holder.txt_plant_name.setText(plantName);
//        holder.txt_description.setText(description);
//        holder.txt_price.setText("$" + price);
    }


    @Override
    public int getItemCount() {
        return objectList.size();
    }

    public static class ListBasicViewHolder extends RecyclerView.ViewHolder {

//        private final ImageView img_plant_image;
//        private final TextView txt_plant_name;
//        private final TextView txt_description;
//        private final TextView txt_price;
//        private final MaterialButton btn_add_to_cart;

        public ListBasicViewHolder(@NonNull View itemView) {
            super(itemView);

//            img_plant_image = itemView.findViewById(R.id.img_plant_image);
//            txt_plant_name = itemView.findViewById(R.id.txt_plant_name);
//            txt_description = itemView.findViewById(R.id.txt_description);
//            txt_price = itemView.findViewById(R.id.txt_price);
//            btn_add_to_cart = itemView.findViewById(R.id.btn_add_to_cart);
        }
    }
}

package com.ad.app.home.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.SwitchCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.ad.app.home.R;
import com.ad.app.home.model.DeviceModel;
import com.ad.app.home.utils.UtilClass;
import com.google.android.material.card.MaterialCardView;

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

        holder.txt_name.setText(object.getName());

        holder.switch_power.setChecked(object.isActive());

        switch(object.getName()){
            case UtilClass.DEVICE_1:
            case UtilClass.DEVICE_2:
                holder.img_icon.setImageResource(R.drawable.ic_light);
                break;
            case UtilClass.DEVICE_3:
            case UtilClass.DEVICE_4:
                holder.img_icon.setImageResource(R.drawable.ic_lightbulb);
                break;
            case UtilClass.DEVICE_5:
                holder.img_icon.setImageResource(R.drawable.ic_porch_light);
                break;
            case UtilClass.DEVICE_6:
                holder.img_icon.setImageResource(R.drawable.ic_ceiling_fan);
                break;

        }


        String description = holder.switch_power.isChecked() ? "on • " : "off • ";
        description += object.isAutomatic() ? "automatic • " : "manual • ";
        description += "turn off in " + object.getTurnOffAfter() + "m • ";
//        description += ""

        holder.txt_description.setText(description);


        holder.switch_power.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    Toast.makeText(context, "ON", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(context, "OFF", Toast.LENGTH_SHORT).show();
                }


            }
        });

        holder.cardview_timer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "Timer", Toast.LENGTH_SHORT).show();
            }
        });

        holder.cardview_clock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "Timer", Toast.LENGTH_SHORT).show();
            }
        });

        holder.cardview_usage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "Timer", Toast.LENGTH_SHORT).show();
            }
        });
    }


    @Override
    public int getItemCount() {
        return objectList.size();
    }

    public static class ListBasicViewHolder extends RecyclerView.ViewHolder {

        private final ImageView img_icon;
        private final TextView txt_name;
        private final TextView txt_description;
        private final SwitchCompat switch_power;
        private final MaterialCardView cardview_timer;
        private final MaterialCardView cardview_clock;
        private final MaterialCardView cardview_usage;

        public ListBasicViewHolder(@NonNull View itemView) {
            super(itemView);

            img_icon = itemView.findViewById(R.id.img_icon);
            txt_name = itemView.findViewById(R.id.txt_name);
            txt_description = itemView.findViewById(R.id.txt_description);
            switch_power = itemView.findViewById(R.id.switch_power);
            cardview_timer = itemView.findViewById(R.id.cardview_timer);
            cardview_clock = itemView.findViewById(R.id.cardview_clock);
            cardview_usage = itemView.findViewById(R.id.cardview_usage);

        }
    }
}

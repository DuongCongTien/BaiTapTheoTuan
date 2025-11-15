package com.example.recyclerview;

import android.graphics.PorterDuff;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Collections;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {

    public interface OnItemClick { void onClick(DataModel item, int position, View itemView); }

    private final ArrayList<DataModel> dataSet;
    private OnItemClick onItemClick;

    public CustomAdapter(ArrayList<DataModel> data) {
        this.dataSet = data;
        setHasStableIds(true);
    }

    public void setOnItemClick(OnItemClick listener) { this.onItemClick = listener; }

    @Override public long getItemId(int position) { return dataSet.get(position).getId(); }

    static class MyViewHolder extends RecyclerView.ViewHolder {
        TextView textName, textVersion;
        ImageView imageView, chevron;
        CardView card;
        MyViewHolder(View itemView) {
            super(itemView);
            textName = itemView.findViewById(R.id.textViewName);
            textVersion = itemView.findViewById(R.id.textViewVersion);
            imageView = itemView.findViewById(R.id.imageView);
            chevron = itemView.findViewById(R.id.chevron);
            card = itemView.findViewById(R.id.card_view);
        }
    }

    @NonNull @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_android, parent, false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder h, int pos) {
        DataModel item = dataSet.get(pos);
        h.textName.setText(item.getName());
        h.textVersion.setText(item.getVersion());
        h.imageView.setImageResource(item.getImage());

        // Tint icon xanh ngọc cho đồng bộ (áp dụng được với cả drawable hệ thống)
        int teal = h.itemView.getContext().getColor(R.color.teal_600);
        h.imageView.setColorFilter(teal, PorterDuff.Mode.SRC_IN);

        h.itemView.setOnClickListener(v -> {
            if (onItemClick != null) onItemClick.onClick(item, h.getBindingAdapterPosition(), v);
        });
    }

    @Override public int getItemCount() { return dataSet.size(); }

    public DataModel removeAt(int position) {
        DataModel removed = dataSet.remove(position);
        notifyItemRemoved(position);
        return removed;
    }

    public void insertAt(DataModel model, int position) {
        int p = Math.max(0, Math.min(position, dataSet.size()));
        dataSet.add(p, model);
        notifyItemInserted(p);
    }

    public void shuffle() {
        Collections.shuffle(dataSet);
        notifyDataSetChanged();
    }
}

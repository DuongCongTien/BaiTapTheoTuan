package com.example.viewpages.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.app.ActivityOptionsCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.example.viewpages.DetailActivity;
import com.example.viewpages.R;
import com.example.viewpages.model.FeatureItem;

import java.util.List;

public class FeatureAdapter extends RecyclerView.Adapter<FeatureAdapter.FeatureViewHolder> {

    private Context context;
    private List<FeatureItem> items;

    public FeatureAdapter(Context context, List<FeatureItem> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public FeatureViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context)
                .inflate(R.layout.item_feature, parent, false);
        return new FeatureViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FeatureViewHolder holder, int position) {
        FeatureItem item = items.get(position);
        holder.tvTitle.setText(item.getTitle());
        holder.tvSubtitle.setText(item.getSubtitle());
        holder.imgIcon.setImageResource(item.getIconResId());

        holder.itemView.setOnClickListener(v -> {
            // Shared element + mở DetailActivity
            Intent intent = new Intent(context, DetailActivity.class);
            intent.putExtra("title", item.getTitle());
            intent.putExtra("subtitle", item.getSubtitle());
            intent.putExtra("iconResId", item.getIconResId());

            ActivityOptionsCompat options = ActivityOptionsCompat
                    .makeSceneTransitionAnimation(
                            (Activity) context,
                            holder.imgIcon,
                            "iconTransition"
                    );

            context.startActivity(intent, options.toBundle());
        });
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    static class FeatureViewHolder extends RecyclerView.ViewHolder {
        ImageView imgIcon;
        TextView tvTitle, tvSubtitle;

        public FeatureViewHolder(@NonNull View itemView) {
            super(itemView);
            imgIcon = itemView.findViewById(R.id.imgIcon);
            tvTitle = itemView.findViewById(R.id.tvTitle);
            tvSubtitle = itemView.findViewById(R.id.tvSubtitle);
        }
    }
}


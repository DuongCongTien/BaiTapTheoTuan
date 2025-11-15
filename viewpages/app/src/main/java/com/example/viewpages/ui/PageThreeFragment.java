package com.example.viewpages.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.viewpages.R;
import com.example.viewpages.model.FeatureItem;

import java.util.ArrayList;
import java.util.List;

public class PageThreeFragment extends Fragment {

    public static PageThreeFragment newInstance() {
        return new PageThreeFragment();
    }

    private RecyclerView rvList, rvGrid;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_page, container, false);

        rvList = view.findViewById(R.id.rvList);
        rvGrid = view.findViewById(R.id.rvGrid);

        view.<android.widget.TextView>findViewById(R.id.tvTitle)
                .setText("Trang 3 - Demo dữ liệu");

        setupListRecycler();
        setupGridRecycler();

        return view;
    }

    private void setupListRecycler() {
        List<FeatureItem> items = new ArrayList<>();
        items.add(new FeatureItem("Item A", "Mô tả A", R.drawable.ic_home));
        items.add(new FeatureItem("Item B", "Mô tả B", R.drawable.ic_music));
        items.add(new FeatureItem("Item C", "Mô tả C", R.drawable.ic_game));

        rvList.setLayoutManager(new LinearLayoutManager(requireContext()));
        rvList.setAdapter(new FeatureAdapter(requireContext(), items));
    }

    private void setupGridRecycler() {
        List<FeatureItem> items = new ArrayList<>();
        items.add(new FeatureItem("Teal", "Xanh ngọc", R.drawable.ic_teal));
        items.add(new FeatureItem("Blue", "Xanh dương", R.drawable.ic_blue));
        items.add(new FeatureItem("Green", "Xanh lá", R.drawable.ic_study));

        GridLayoutManager gridLayoutManager = new GridLayoutManager(requireContext(), 3);
        rvGrid.setLayoutManager(gridLayoutManager);
        rvGrid.setAdapter(new FeatureAdapter(requireContext(), items));
    }
}

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

public class PageOneFragment extends Fragment {

    public static PageOneFragment newInstance() {
        return new PageOneFragment();
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
                .setText("Trang 1 - Nhiệm vụ & Shortcut");

        setupListRecycler();
        setupGridRecycler();

        return view;
    }

    private void setupListRecycler() {
        List<FeatureItem> tasks = new ArrayList<>();
        tasks.add(new FeatureItem("Học Android", "Nắm cơ bản ViewPager2", R.drawable.ic_study));
        tasks.add(new FeatureItem("Thiết kế UI", "Màu xanh ngọc chủ đạo", R.drawable.ic_home));
        tasks.add(new FeatureItem("Animation", "Thêm hiệu ứng mượt", R.drawable.ic_game));

        rvList.setLayoutManager(new LinearLayoutManager(requireContext()));
        rvList.setAdapter(new FeatureAdapter(requireContext(), tasks));
    }

    private void setupGridRecycler() {
        List<FeatureItem> shortcuts = new ArrayList<>();
        shortcuts.add(new FeatureItem("Home", "Màn hình chính", R.drawable.ic_home));
        shortcuts.add(new FeatureItem("Music", "Thư viện nhạc", R.drawable.ic_music));
        shortcuts.add(new FeatureItem("Game", "Giải trí", R.drawable.ic_game));
        shortcuts.add(new FeatureItem("Study", "Bài học", R.drawable.ic_study));
        shortcuts.add(new FeatureItem("Travel", "Lịch trình", R.drawable.ic_travel));
        shortcuts.add(new FeatureItem("Coffee", "Giải lao", R.drawable.ic_coffee));

        GridLayoutManager gridLayoutManager = new GridLayoutManager(requireContext(), 3);
        rvGrid.setLayoutManager(gridLayoutManager);
        rvGrid.setAdapter(new FeatureAdapter(requireContext(), shortcuts));
    }
}


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

public class PageTwoFragment extends Fragment {

    public static PageTwoFragment newInstance() {
        return new PageTwoFragment();
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
                .setText("Trang 2 - Gợi ý nâng cấp");

        setupListRecycler();
        setupGridRecycler();

        return view;
    }

    private void setupListRecycler() {
        List<FeatureItem> items = new ArrayList<>();
        items.add(new FeatureItem("Dark Mode", "Chuyển giao diện tối", R.drawable.ic_settings));
        items.add(new FeatureItem("API Data", "Lấy dữ liệu từ server", R.drawable.ic_cloud));
        items.add(new FeatureItem("Room DB", "Lưu offline", R.drawable.ic_db));

        rvList.setLayoutManager(new LinearLayoutManager(requireContext()));
        rvList.setAdapter(new FeatureAdapter(requireContext(), items));
    }

    private void setupGridRecycler() {
        List<FeatureItem> items = new ArrayList<>();
        items.add(new FeatureItem("Profile", "Thông tin cá nhân", R.drawable.ic_profile));
        items.add(new FeatureItem("Settings", "Cài đặt", R.drawable.ic_settings));
        items.add(new FeatureItem("Stats", "Thống kê", R.drawable.ic_stats));

        GridLayoutManager gridLayoutManager = new GridLayoutManager(requireContext(), 3);
        rvGrid.setLayoutManager(gridLayoutManager);
        rvGrid.setAdapter(new FeatureAdapter(requireContext(), items));
    }
}

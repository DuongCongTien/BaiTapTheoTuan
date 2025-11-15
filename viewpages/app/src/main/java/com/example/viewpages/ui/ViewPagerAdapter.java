package com.example.viewpages.ui;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class ViewPagerAdapter extends FragmentStateAdapter {

    public ViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return PageOneFragment.newInstance();
            case 1:
                return PageTwoFragment.newInstance();
            case 2:
            default:
                return PageThreeFragment.newInstance();
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}

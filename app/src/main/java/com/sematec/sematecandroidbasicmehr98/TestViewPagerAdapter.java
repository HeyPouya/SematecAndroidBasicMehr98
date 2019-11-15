package com.sematec.sematecandroidbasicmehr98;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class TestViewPagerAdapter extends FragmentPagerAdapter {


    public TestViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                TestFragment fragment = new TestFragment();
                return fragment;
            case 1:
                TestFragment fragment2 = new TestFragment();
                return fragment2;
            case 2:
                TestFragment fragment3 = new TestFragment();
                return fragment3;
            default:
                TestFragment fragment4 = new TestFragment();
                return fragment4;

        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "First Page";
            case 1:
                return "Second Page";
            case 2:
                return "Third Page";
            default:
                return "Unknown Page";
        }
    }
}

package com.example.viewpages;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.GridView;

public class FragmentPage2 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_page2, container, false);

        GridView gridView = v.findViewById(R.id.gridViewPage2);

        String[] categories = {
                "Điện thoại",
                "Laptop",
                "Máy tính bảng",
                "Phụ kiện",
                "Tai nghe",
                "Đồng hồ",
                "Loa",
                "Máy ảnh",
                "TV"
        };

        ArrayAdapter<String> gridAdapter = new ArrayAdapter<>(
                getActivity(),
                android.R.layout.simple_list_item_1,
                categories
        );

        gridView.setAdapter(gridAdapter);


        return v;
    }
}

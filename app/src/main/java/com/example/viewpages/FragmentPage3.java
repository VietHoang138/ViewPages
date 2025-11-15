package com.example.viewpages;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;

public class FragmentPage3 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_page3, container, false);

        ListView listView = v.findViewById(R.id.listViewPage3);
        GridView gridView = v.findViewById(R.id.gridViewPage3);

        String[] cities = {
                "Hà Nội",
                "Hồ Chí Minh",
                "Đà Nẵng",
                "Huế",
                "Cần Thơ",
                "Nha Trang"
        };

        String[] colors = {
                "🟥", "🟧", "🟨", "🟩",
                "🟦", "🟪", "⬛", "⬜"
        };

        ArrayAdapter<String> listAdapter = new ArrayAdapter<>(
                getActivity(),
                android.R.layout.simple_list_item_1,
                cities
        );

        ArrayAdapter<String> gridAdapter = new ArrayAdapter<>(
                getActivity(),
                android.R.layout.simple_list_item_1,
                colors
        );

        listView.setAdapter(listAdapter);
        gridView.setAdapter(gridAdapter);


        return v;
    }
}


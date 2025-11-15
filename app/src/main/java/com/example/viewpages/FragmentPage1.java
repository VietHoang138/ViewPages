package com.example.viewpages;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class FragmentPage1 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_page1, container, false);

        ListView listView = v.findViewById(R.id.listViewPage1);

        String[] foods = {
                "Phở Bò",
                "Bún Chả",
                "Bánh Mì",
                "Cơm Tấm",
                "Gỏi Cuốn",
                "Bánh Xèo",
                "Bún Bò Huế"
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                getActivity(),
                android.R.layout.simple_list_item_1,
                foods
        );
        listView.setAdapter(adapter);

        return v;
    }
}


package com.example.ekasilabalexcdtb.alextourguide;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lara on 03/09/2016.
 */
public class ShopsFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        List<com.example.ekasilabalexcdtb.alextourguide.Location> list = new ArrayList<>();
        com.example.ekasilabalexcdtb.alextourguide.Shops.initShopsList(list, getContext());

        com.example.ekasilabalexcdtb.alextourguide.LocationAdapter adapter = new com.example.ekasilabalexcdtb.alextourguide.LocationAdapter(getActivity(), -1, list);
        View view = inflater.inflate(R.layout.location_item, container, false);
        ListView listView = (ListView) view.findViewById(R.id.listView);

        listView.setAdapter(adapter);

        return view;
    }
}

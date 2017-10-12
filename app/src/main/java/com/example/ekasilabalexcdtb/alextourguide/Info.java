package com.example.ekasilabalexcdtb.alextourguide;

import android.content.Context;

import java.util.List;

/**
 * Created by Lara on 03/09/2016.
 */
public class Info {

    public static void initInfoList(List<com.example.ekasilabalexcdtb.alextourguide.Location> list, Context context) {

        list.add(new com.example.ekasilabalexcdtb.alextourguide.Location(
                context.getString(R.string.info_internet_name),
                context.getString(R.string.info_internet_description),
                null,
                null,
                null,
                null,
                -1
        ));

        list.add(new com.example.ekasilabalexcdtb.alextourguide.Location(
                context.getString(R.string.info_konbini_name),
                context.getString(R.string.info_konbini_description),
                null,
                null,
                null,
                null,
                -1
        ));

        list.add(new com.example.ekasilabalexcdtb.alextourguide.Location(
                context.getString(R.string.info_transport_name),
                context.getString(R.string.info_transport_description),
                null,
                null,
                null,
                null,
                -1
        ));
    }
}

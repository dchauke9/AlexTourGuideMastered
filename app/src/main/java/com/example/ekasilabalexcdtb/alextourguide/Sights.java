package com.example.ekasilabalexcdtb.alextourguide;

import android.content.Context;

import java.util.List;

/**
 * Created by lara on 28/8/16.
 */
public class Sights {

    public static void initSightsList(List<com.example.ekasilabalexcdtb.alextourguide.Location> list, Context context) {

        list.add(new com.example.ekasilabalexcdtb.alextourguide.Location(
                context.getString(R.string.alex_heri_name),
                context.getString(R.string.alex_heri_description),
                context.getString(R.string.alex_heri_address),
                context.getString(R.string.alex_heri_phone),
                context.getString(R.string.alex_heri_schedule),
                context.getString(R.string.alex_heri_price),
                R.drawable.alex_heri
        ));

    }
}

package com.example.ekasilabalexcdtb.alextourguide;

import android.content.Context;

import java.util.List;

/**
 * Created by Lara on 03/09/2016.
 */
public class Shops {

    public static void initShopsList(List<com.example.ekasilabalexcdtb.alextourguide.Location> list, Context context) {

        list.add(new com.example.ekasilabalexcdtb.alextourguide.Location(
                context.getString(R.string.shop_potato_name),
                context.getString(R.string.shop_potato_description),
                context.getString(R.string.shop_potato_address),
                context.getString(R.string.shop_potato_phone),
                context.getString(R.string.shop_potato_schedule),
                null,
                R.drawable.alex_food_pic_1
        ));

        list.add(new com.example.ekasilabalexcdtb.alextourguide.Location(
                context.getString(R.string.shop_amiami_name),
                context.getString(R.string.shop_amiami_description),
                context.getString(R.string.shop_amiami_address),
                context.getString(R.string.shop_amiami_phone),
                context.getString(R.string.shop_amiami_schedule),
                null,
                R.drawable.ferris
        ));

        list.add(new com.example.ekasilabalexcdtb.alextourguide.Location(
                context.getString(R.string.shop_nakano_name),
                context.getString(R.string.shop_nakano_description),
                context.getString(R.string.shop_nakano_address),
                context.getString(R.string.shop_nakano_phone),
                context.getString(R.string.shop_nakano_schedule),
                null,
                R.drawable.alex_mall
        ));

        list.add(new com.example.ekasilabalexcdtb.alextourguide.Location(
                context.getString(R.string.shop_kiddy_name),
                context.getString(R.string.shop_kiddy_description),
                context.getString(R.string.shop_kiddy_address),
                context.getString(R.string.shop_kiddy_phone),
                context.getString(R.string.shop_kiddy_schedule),
                null,
                R.drawable.panafrica
        ));


    }
}

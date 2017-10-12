package com.example.ekasilabalexcdtb.alextourguide;

import android.content.Context;

import java.util.List;

/**
 * Created by Lara on 03/09/2016.
 */
public class Food {

    public static void initFoodsList(List<com.example.ekasilabalexcdtb.alextourguide.Location> list, Context context) {

        list.add(new com.example.ekasilabalexcdtb.alextourguide.Location(
                context.getString(R.string.alex_food_name),
                context.getString(R.string.alex_food_description),
                context.getString(R.string.alex_food_address),
                context.getString(R.string.alex_food_phone),
                context.getString(R.string.alex_food_schedule),
                context.getString(R.string.alex_food_two),
                R.drawable.alex_food_pic_1
        ));

        list.add(new com.example.ekasilabalexcdtb.alextourguide.Location(
                context.getString(R.string.food_wako_name),
                context.getString(R.string.food_wako_description),
                context.getString(R.string.food_wako_address),
                context.getString(R.string.food_wako_schedule),
                context.getString(R.string.food_wako_phone),
                context.getString(R.string.price),
                R.drawable.alex_food_pic_3
        ));

        list.add(new com.example.ekasilabalexcdtb.alextourguide.Location(
                context.getString(R.string.food_rokumonya_name),
                context.getString(R.string.food_rokumonya_description),
                context.getString(R.string.food_rokumonya_address),
                context.getString(R.string.food_rokumonya_phone),
                context.getString(R.string.food_rokumonya_schedule),
                context.getString(R.string.food_price_four),
                R.drawable.alex_food_pic_2
        ));


    }
}

package com.example.ekasilabalexcdtb.gomoratourguide;

import android.content.Context;

import java.util.List;

/**
 * Created by Lara on 03/09/2016.
 */
public class Food {

    public static void initFoodsList(List<com.example.ekasilabalexcdtb.gomoratourguide.Location> list, Context context) {

        list.add(new com.example.ekasilabalexcdtb.gomoratourguide.Location(
                context.getString(R.string.alex_food_name),
                context.getString(R.string.alex_food_description),
                context.getString(R.string.alex_food_address),
                context.getString(R.string.alex_food_phone),
                context.getString(R.string.alex_food_schedule),
                context.getString(R.string.alex_food_two),
                R.drawable.alex_food_pic_1
        ));

        list.add(new com.example.ekasilabalexcdtb.gomoratourguide.Location(
                context.getString(R.string.alex_food_name),
                context.getString(R.string.alex_food_description),
                context.getString(R.string.alex_food_address),
                context.getString(R.string.alex_food_phone),
                context.getString(R.string.alex_food_schedule),
                context.getString(R.string.alex_food_two),
                R.drawable.alex_food_pic_3
        ));

        list.add(new com.example.ekasilabalexcdtb.gomoratourguide.Location(
                context.getString(R.string.alex_food_name),
                context.getString(R.string.alex_food_description),
                context.getString(R.string.alex_food_address),
                context.getString(R.string.alex_food_phone),
                context.getString(R.string.alex_food_schedule),
                context.getString(R.string.alex_food_two),
                R.drawable.alex_food_pic_2
        ));


    }
}

package com.an.chinax.ui;

import android.content.Context;
import android.widget.Toast;

public class ChinaXToast {
    public static void showToast(Context context, String message){
        Toast.makeText(context, message, Toast.LENGTH_LONG).show();
    }
}

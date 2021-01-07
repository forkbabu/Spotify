package com.spotify.music.features.premiumdestination.view;

import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.ViewGroup;

public class h {
    private static int a(DisplayMetrics displayMetrics, int i) {
        return (int) TypedValue.applyDimension(1, (float) i, displayMetrics);
    }

    public void b(s81 s81, ViewGroup viewGroup, DisplayMetrics displayMetrics) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams();
        p81 bundle = s81.custom().bundle("margin");
        if (bundle != null) {
            marginLayoutParams.setMargins(a(displayMetrics, bundle.intValue("leading", 0)), a(displayMetrics, bundle.intValue("top", 0)), a(displayMetrics, bundle.intValue("trailing", 0)), a(displayMetrics, bundle.intValue("bottom", 0)));
            viewGroup.setLayoutParams(marginLayoutParams);
        }
    }
}

package com.google.android.gms.cast.framework.media.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.a;

public final class b {
    static {
        new com.google.android.gms.cast.internal.b("WidgetUtil");
    }

    public static Drawable a(Context context, int i, int i2) {
        ColorStateList colorStateList;
        Drawable l = a.l(context.getResources().getDrawable(i2).mutate());
        a.j(l, PorterDuff.Mode.SRC_IN);
        if (i != 0) {
            colorStateList = androidx.core.content.a.c(context, i);
        } else {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{16842800});
            int color = obtainStyledAttributes.getColor(0, 0);
            obtainStyledAttributes.recycle();
            colorStateList = new ColorStateList(new int[][]{new int[]{16842910}, new int[]{-16842910}}, new int[]{color, s2.h(color, 128)});
        }
        a.i(l, colorStateList);
        return l;
    }
}

package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import com.spotify.music.C0707R;

/* access modifiers changed from: package-private */
public final class c {
    final b a;
    final b b;
    final b c;
    final b d;
    final b e;
    final b f;
    final b g;
    final Paint h;

    c(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(rw.t(context, C0707R.attr.materialCalendarStyle, MaterialCalendar.class.getCanonicalName()), pw.v);
        this.a = b.a(context, obtainStyledAttributes.getResourceId(3, 0));
        this.g = b.a(context, obtainStyledAttributes.getResourceId(1, 0));
        this.b = b.a(context, obtainStyledAttributes.getResourceId(2, 0));
        this.c = b.a(context, obtainStyledAttributes.getResourceId(4, 0));
        ColorStateList a2 = jx.a(context, obtainStyledAttributes, 5);
        this.d = b.a(context, obtainStyledAttributes.getResourceId(7, 0));
        this.e = b.a(context, obtainStyledAttributes.getResourceId(6, 0));
        this.f = b.a(context, obtainStyledAttributes.getResourceId(8, 0));
        Paint paint = new Paint();
        this.h = paint;
        paint.setColor(a2.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}

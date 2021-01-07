package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.widget.TextView;

/* access modifiers changed from: package-private */
public final class b {
    private final Rect a;
    private final ColorStateList b;
    private final ColorStateList c;
    private final ColorStateList d;
    private final int e;
    private final dy f;

    private b(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i, dy dyVar, Rect rect) {
        e2.b(rect.left);
        e2.b(rect.top);
        e2.b(rect.right);
        e2.b(rect.bottom);
        this.a = rect;
        this.b = colorStateList2;
        this.c = colorStateList;
        this.d = colorStateList3;
        this.e = i;
        this.f = dyVar;
    }

    static b a(Context context, int i) {
        if (i != 0) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, pw.w);
            Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(0, 0), obtainStyledAttributes.getDimensionPixelOffset(2, 0), obtainStyledAttributes.getDimensionPixelOffset(1, 0), obtainStyledAttributes.getDimensionPixelOffset(3, 0));
            ColorStateList a2 = jx.a(context, obtainStyledAttributes, 4);
            ColorStateList a3 = jx.a(context, obtainStyledAttributes, 9);
            ColorStateList a4 = jx.a(context, obtainStyledAttributes, 7);
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
            dy m = dy.a(context, obtainStyledAttributes.getResourceId(5, 0), obtainStyledAttributes.getResourceId(6, 0)).m();
            obtainStyledAttributes.recycle();
            return new b(a2, a3, a4, dimensionPixelSize, m, rect);
        }
        throw new IllegalArgumentException("Cannot create a CalendarItemStyle with a styleResId of 0");
    }

    /* access modifiers changed from: package-private */
    public int b() {
        return this.a.bottom;
    }

    /* access modifiers changed from: package-private */
    public int c() {
        return this.a.top;
    }

    /* access modifiers changed from: package-private */
    public void d(TextView textView) {
        yx yxVar = new yx();
        yx yxVar2 = new yx();
        yxVar.setShapeAppearanceModel(this.f);
        yxVar2.setShapeAppearanceModel(this.f);
        yxVar.H(this.c);
        yxVar.R((float) this.e, this.d);
        textView.setTextColor(this.b);
        Drawable rippleDrawable = Build.VERSION.SDK_INT >= 21 ? new RippleDrawable(this.b.withAlpha(30), yxVar, yxVar2) : yxVar;
        Rect rect = this.a;
        InsetDrawable insetDrawable = new InsetDrawable(rippleDrawable, rect.left, rect.top, rect.right, rect.bottom);
        int i = q4.g;
        textView.setBackground(insetDrawable);
    }
}

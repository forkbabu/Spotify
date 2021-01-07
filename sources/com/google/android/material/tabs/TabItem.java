package com.google.android.material.tabs;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.h0;

public class TabItem extends View {
    public final CharSequence a;
    public final Drawable b;
    public final int c;

    public TabItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        h0 u = h0.u(context, attributeSet, pw.L);
        this.a = u.p(2);
        this.b = u.g(0);
        this.c = u.n(1, 0);
        u.w();
    }
}

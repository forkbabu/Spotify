package com.spotify.paste.widgets.layouts;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.paste.widgets.c;

public class AspectRatioView extends ViewGroup {
    private float a = 1.0f;
    private boolean b;
    private boolean c;
    private boolean f;
    private int n;
    private int o;

    public AspectRatioView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setWillNotDraw(true);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.a);
        this.a = obtainStyledAttributes.getFraction(2, 1, 1, this.a);
        this.b = obtainStyledAttributes.getBoolean(1, this.b);
        this.c = obtainStyledAttributes.getBoolean(0, this.c);
        this.f = obtainStyledAttributes.getBoolean(5, this.f);
        this.n = obtainStyledAttributes.getDimensionPixelSize(4, this.n);
        this.o = obtainStyledAttributes.getDimensionPixelSize(3, this.o);
        obtainStyledAttributes.recycle();
    }

    private static boolean a(int i) {
        return i >= 0;
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("AspectRatioView can host only one direct child.");
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingTop = getPaddingTop();
        int paddingLeft = getPaddingLeft();
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            childAt.layout(paddingLeft, paddingTop, childAt.getMeasuredWidth() + paddingLeft, childAt.getMeasuredHeight() + paddingTop);
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0115  */
    @Override // android.view.View
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r10, int r11) {
        /*
        // Method dump skipped, instructions count: 310
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.paste.widgets.layouts.AspectRatioView.onMeasure(int, int):void");
    }

    public void setAllowTaller(boolean z) {
        this.c = z;
    }

    public void setAllowWider(boolean z) {
        this.b = z;
    }

    public void setAspectRatio(float f2) {
        this.a = f2;
    }

    public void setExtraHeight(int i) {
        this.o = i;
    }

    public void setExtraWidth(int i) {
        this.n = i;
    }

    public void setRespectExactMeasures(boolean z) {
        this.f = z;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i) {
        if (getChildCount() <= 0) {
            super.addView(view, i);
            return;
        }
        throw new IllegalStateException("AspectRatioView can host only one direct child.");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("AspectRatioView can host only one direct child.");
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("AspectRatioView can host only one direct child.");
    }
}

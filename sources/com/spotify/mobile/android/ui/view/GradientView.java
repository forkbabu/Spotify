package com.spotify.mobile.android.ui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;

public class GradientView extends View {
    private GradientDrawable a;
    private final int[] b;
    private GradientDrawable.Orientation c;

    public GradientView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i = 0;
        if (!isInEditMode()) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a52.e);
            this.b = new int[]{obtainStyledAttributes.getColor(0, -16777216), obtainStyledAttributes.getColor(1, -1)};
            i = (int) obtainStyledAttributes.getFloat(2, 0.0f);
            obtainStyledAttributes.recycle();
        } else {
            this.b = new int[]{-16777216, -1};
        }
        setAngle(i);
        int i2 = q4.g;
        int i3 = Build.VERSION.SDK_INT;
        setBackground(null);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.a == null) {
            this.a = new GradientDrawable(this.c, this.b);
        }
        this.a.draw(canvas);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.a == null) {
            this.a = new GradientDrawable(this.c, this.b);
        }
        this.a.setBounds(0, 0, i3 - i, i4 - i2);
        super.onLayout(z, i, i2, i3, i4);
    }

    public void setAngle(int i) {
        int i2 = i / 90;
        if (i2 == 0) {
            this.c = GradientDrawable.Orientation.LEFT_RIGHT;
        } else if (i2 == 1) {
            this.c = GradientDrawable.Orientation.BOTTOM_TOP;
        } else if (i2 == 2) {
            this.c = GradientDrawable.Orientation.RIGHT_LEFT;
        } else if (i2 != 3) {
            this.c = GradientDrawable.Orientation.LEFT_RIGHT;
        } else {
            this.c = GradientDrawable.Orientation.TOP_BOTTOM;
        }
        this.a = null;
    }

    public void setEndColor(int i) {
        this.b[1] = i;
        this.a = null;
    }

    public void setStartColor(int i) {
        this.b[0] = i;
        this.a = null;
    }
}

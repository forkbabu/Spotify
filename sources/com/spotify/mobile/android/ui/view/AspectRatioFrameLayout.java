package com.spotify.mobile.android.ui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.spotify.base.java.logging.Logger;

public class AspectRatioFrameLayout extends FrameLayout {
    private float a = 1.0f;
    private boolean b;
    private boolean c;
    private boolean f;
    private int n;
    private int o;

    public AspectRatioFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a52.a);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 2) {
                this.a = obtainStyledAttributes.getFloat(index, this.a);
            } else if (index == 1) {
                this.b = obtainStyledAttributes.getBoolean(index, this.b);
            } else if (index == 0) {
                this.c = obtainStyledAttributes.getBoolean(index, this.c);
            } else if (index == 5) {
                this.f = obtainStyledAttributes.getBoolean(index, this.f);
            } else if (index == 4) {
                this.n = obtainStyledAttributes.getDimensionPixelSize(index, this.n);
            } else if (index == 3) {
                this.o = obtainStyledAttributes.getDimensionPixelSize(index, this.o);
            }
        }
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: protected */
    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int defaultSize = FrameLayout.getDefaultSize(getSuggestedMinimumWidth(), i);
        int defaultSize2 = FrameLayout.getDefaultSize(getSuggestedMinimumHeight(), i2);
        if (defaultSize == 0 && defaultSize2 == 0) {
            Logger.n("With both width and height set to zero, it is impossible to calculate and enforce aspect ratio.", new Object[0]);
            super.onMeasure(i, i2);
            return;
        }
        if (defaultSize == 0) {
            defaultSize = Math.round(((float) defaultSize2) * this.a) + this.n;
        } else if (defaultSize2 == 0) {
            defaultSize2 = Math.round(((float) defaultSize) / this.a) + this.o;
        } else if (this.a > ((float) defaultSize) / ((float) defaultSize2)) {
            if (!this.f || View.MeasureSpec.getMode(i2) != 1073741824 || !this.c) {
                defaultSize2 = Math.round(((float) (defaultSize - this.n)) / this.a);
            }
        } else if (!this.f || View.MeasureSpec.getMode(i) != 1073741824 || !this.b) {
            defaultSize = Math.round(((float) (defaultSize2 - this.o)) * this.a);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(defaultSize, 1073741824), View.MeasureSpec.makeMeasureSpec(defaultSize2, 1073741824));
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
}

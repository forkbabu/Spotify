package com.spotify.music.features.languagepicker.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import java.util.Arrays;

public class RoundedRelativeLayout extends RelativeLayout {
    private int a;
    private int b;
    private int c;
    private int f;
    private final float[] n;
    private final RectF o;
    private final Path p;

    public RoundedRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.n = new float[8];
        this.o = new RectF();
        this.p = new Path();
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View, android.view.ViewGroup
    public void dispatchDraw(Canvas canvas) {
        if (this.p.isEmpty()) {
            super.dispatchDraw(canvas);
            return;
        }
        int save = canvas.save();
        canvas.clipPath(this.p);
        super.dispatchDraw(canvas);
        canvas.restoreToCount(save);
    }

    /* access modifiers changed from: protected */
    @Override // android.widget.RelativeLayout, android.view.View, android.view.ViewGroup
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.p.reset();
        this.o.set((float) this.a, (float) this.b, (float) ((i3 - i) - this.c), (float) ((i4 - i2) - this.f));
        this.p.addRoundRect(this.o, this.n, Path.Direction.CW);
    }

    public void setClipOffset(int i) {
        this.a = i;
        this.b = i;
        this.c = i;
        this.f = i;
    }

    public void setCornerRadius(float f2) {
        Arrays.fill(this.n, 0, 8, f2);
    }

    public RoundedRelativeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.n = new float[8];
        this.o = new RectF();
        this.p = new Path();
    }
}

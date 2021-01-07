package com.spotify.music.libs.freetiertrackpreview;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import java.util.Arrays;
import kotlin.jvm.internal.h;

public final class RoundedLinearLayout extends LinearLayout {
    private int a;
    private int b;
    private int c;
    private int f;
    private final RectF n;
    private final Path o;
    private final float[] p;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RoundedLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        h.e(context, "context");
        h.e(attributeSet, "attrs");
        this.n = new RectF();
        this.o = new Path();
        this.p = new float[8];
        Context context2 = getContext();
        h.d(context2, "context");
        Resources resources = context2.getResources();
        this.a = nud.g(16.0f, resources);
        this.c = nud.g(16.0f, resources);
        this.b = nud.g(6.0f, resources);
        this.f = nud.g(6.0f, resources);
        setCornerRadius((float) nud.g(8.0f, resources));
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View, android.view.ViewGroup
    public void dispatchDraw(Canvas canvas) {
        h.e(canvas, "canvas");
        int save = canvas.save();
        if (!this.o.isEmpty()) {
            try {
                canvas.clipPath(this.o);
            } catch (UnsupportedOperationException unused) {
            }
        }
        super.dispatchDraw(canvas);
        canvas.restoreToCount(save);
    }

    /* access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.view.View, android.view.ViewGroup
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.o.reset();
        this.n.set((float) this.a, (float) this.b, (float) ((i3 - i) - this.c), (float) ((i4 - i2) - this.f));
        this.o.addRoundRect(this.n, this.p, Path.Direction.CW);
    }

    public final void setCornerRadius(float f2) {
        float[] fArr = this.p;
        Arrays.fill(fArr, 0, fArr.length, f2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RoundedLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        h.e(context, "context");
        h.e(attributeSet, "attrs");
        this.n = new RectF();
        this.o = new Path();
        this.p = new float[8];
        Context context2 = getContext();
        h.d(context2, "context");
        Resources resources = context2.getResources();
        this.a = nud.g(16.0f, resources);
        this.c = nud.g(16.0f, resources);
        this.b = nud.g(6.0f, resources);
        this.f = nud.g(6.0f, resources);
        setCornerRadius((float) nud.g(8.0f, resources));
    }
}

package com.spotify.music.features.wrapped2020.stories.views.diamond;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import kotlin.jvm.internal.h;

public final class DiamondView extends View {
    private final RectF a = new RectF();
    private final Paint b;
    private float c;
    private int f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DiamondView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        h.e(context, "context");
        Paint paint = new Paint();
        this.b = paint;
        if (isInEditMode()) {
            setDiamondProgress(0.2f);
            paint.setColor(-65281);
        }
        this.f = -65281;
    }

    private final void a(float f2, float f3) {
        double d = (double) 2;
        float sqrt = (((float) Math.sqrt((double) (((float) Math.pow((double) f2, d)) + ((float) Math.pow((double) f3, d))))) * this.c) / 2.0f;
        float f4 = -sqrt;
        this.a.set(f4, f4, sqrt, sqrt);
    }

    public final int getDiamondColor() {
        return this.f;
    }

    public final float getDiamondProgress() {
        return this.c;
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        h.e(canvas, "canvas");
        super.onDraw(canvas);
        canvas.save();
        canvas.translate(((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f);
        canvas.rotate(45.0f);
        canvas.drawRect(this.a, this.b);
        canvas.restore();
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        a((float) i, (float) i2);
    }

    public final void setDiamondColor(int i) {
        this.f = i;
        this.b.setColor(i);
        invalidate();
    }

    public final void setDiamondProgress(float f2) {
        this.c = knf.b(f2, 0.0f, 1.0f);
        a((float) getWidth(), (float) getHeight());
        invalidate();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DiamondView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        h.e(context, "context");
        Paint paint = new Paint();
        this.b = paint;
        if (isInEditMode()) {
            setDiamondProgress(0.2f);
            paint.setColor(-65281);
        }
        this.f = -65281;
    }
}

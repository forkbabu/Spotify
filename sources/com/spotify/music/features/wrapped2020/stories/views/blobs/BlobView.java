package com.spotify.music.features.wrapped2020.stories.views.blobs;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import kotlin.jvm.internal.h;

public final class BlobView extends View {
    private final Paint a;
    private final RectF b = new RectF();
    private final RectF c = new RectF();
    private final RectF f = new RectF();
    private float n;
    private int o;
    private float p;
    private int q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BlobView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        h.e(context, "context");
        Paint paint = new Paint(1);
        this.a = paint;
        if (isInEditMode()) {
            paint.setColor(-256);
            setGrow(0.5f);
            setOffset(-0.25f);
        }
    }

    private final void a(RectF rectF, Canvas canvas) {
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.a);
    }

    private final void b(float f2, float f3) {
        float f4 = f2 / 2.0f;
        float min = Math.min(f2, f3) / 2.0f;
        float a2 = knf.a((f2 * this.n) - (min * 2.0f), 0.0f) / 2.0f;
        float f5 = (this.p * f4) + f4;
        float f6 = f3 / 2.0f;
        float f7 = f6 - min;
        float f8 = f6 + min;
        this.f.set(f5 - a2, f7, f5 + a2, f8);
        RectF rectF = this.b;
        float f9 = this.f.left;
        rectF.set(f9 - min, f7, f9 + min, f8);
        RectF rectF2 = this.c;
        float f10 = this.f.right;
        rectF2.set(f10 - min, f7, f10 + min, f8);
    }

    private final void setOffset(float f2) {
        this.p = f2;
        b((float) getWidth(), (float) getHeight());
        invalidate();
    }

    public final int getBlobColor() {
        return this.a.getColor();
    }

    public final float getGrow() {
        return this.n;
    }

    public final int getGrowSpec() {
        return this.o;
    }

    public final float getLabelMarginStart() {
        float f2;
        float f3;
        Resources resources = getResources();
        h.d(resources, "resources");
        boolean z = true;
        if (z42.q(resources.getConfiguration()) != 1) {
            z = false;
        }
        if (z) {
            f2 = ((float) getWidth()) - this.b.left;
            Resources resources2 = getResources();
            h.d(resources2, "resources");
            f3 = wz8.c(16.0f, resources2);
        } else {
            f2 = this.c.right;
            Resources resources3 = getResources();
            h.d(resources3, "resources");
            f3 = wz8.c(16.0f, resources3);
        }
        return f3 + f2;
    }

    public final int getOffsetSpec() {
        return this.q;
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        h.e(canvas, "canvas");
        super.onDraw(canvas);
        a(this.b, canvas);
        canvas.drawRect(this.f, this.a);
        a(this.c, canvas);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        b((float) i, (float) i2);
    }

    public final void setBlobColor(int i) {
        this.a.setColor(i);
    }

    public final void setGrow(float f2) {
        this.n = knf.b(f2, 0.0f, 1.0f);
        b((float) getWidth(), (float) getHeight());
        invalidate();
    }

    public final void setGrowSpec(int i) {
        int c2 = knf.c(i, 0, 360);
        this.o = c2;
        setGrow(((float) c2) / 360.0f);
    }

    public final void setOffsetSpec(int i) {
        int c2 = knf.c(i, -360, 360);
        this.q = c2;
        setOffset(((float) c2) / 180.0f);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BlobView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        h.e(context, "context");
        Paint paint = new Paint(1);
        this.a = paint;
        if (isInEditMode()) {
            paint.setColor(-256);
            setGrow(0.5f);
            setOffset(-0.25f);
        }
    }
}

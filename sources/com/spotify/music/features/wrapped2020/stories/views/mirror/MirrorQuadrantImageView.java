package com.spotify.music.features.wrapped2020.stories.views.mirror;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.util.AttributeSet;
import kotlin.jvm.internal.h;

public final class MirrorQuadrantImageView extends MirrorImageView {
    private final RectF c = new RectF();
    private final RectF f = new RectF();
    private final RectF n = new RectF();
    private final RectF o = new RectF();
    private final Matrix p = new Matrix();
    private final Matrix q = new Matrix();
    private final Matrix r = new Matrix();
    private final Matrix s = new Matrix();
    private float t = 1.0f;
    private float u;
    private float v = 1.0f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MirrorQuadrantImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        h.e(context, "context");
    }

    @Override // com.spotify.music.features.wrapped2020.stories.views.mirror.MirrorImageView
    public void b(Canvas canvas, Bitmap bitmap) {
        h.e(canvas, "canvas");
        h.e(bitmap, "image");
        a(canvas, this.c, this.p, bitmap);
        a(canvas, this.f, this.q, bitmap);
        a(canvas, this.n, this.r, bitmap);
        a(canvas, this.o, this.s, bitmap);
    }

    @Override // com.spotify.music.features.wrapped2020.stories.views.mirror.MirrorImageView
    public void d(float f2, float f3, Bitmap bitmap) {
        h.e(bitmap, "image");
        int min = Math.min(bitmap.getWidth(), bitmap.getHeight());
        float width = ((float) bitmap.getWidth()) / 2.0f;
        float height = ((float) bitmap.getHeight()) / 2.0f;
        float f4 = f2 / 2.0f;
        float f5 = f3 / 2.0f;
        float max = (Math.max(f4, f5) * this.t) / ((float) min);
        float width2 = (f4 - (((float) bitmap.getWidth()) * max)) / 2.0f;
        float height2 = (f5 - (((float) bitmap.getHeight()) * max)) / 2.0f;
        float min2 = (((float) 1) - (((float) 2) * this.u)) * Math.min(Math.abs(width2), Math.abs(height2));
        float f6 = this.v;
        float f7 = f5 * f6;
        float f8 = f6 * f4;
        float f9 = f4 - f8;
        float f10 = f5 - f7;
        this.c.set(f9, f10, f4, f5);
        this.p.reset();
        this.p.postScale(max, max);
        this.p.postTranslate(width2, height2);
        this.p.postTranslate(min2, min2);
        float f11 = f8 + f4;
        this.f.set(f4, f10, f11, f5);
        this.q.reset();
        this.q.postScale(-1.0f, 1.0f, width, height);
        this.q.postScale(max, max);
        this.q.postTranslate(f4, 0.0f);
        this.q.postTranslate(width2, height2);
        float f12 = -min2;
        this.q.postTranslate(f12, min2);
        float f13 = f7 + f5;
        this.n.set(f9, f5, f4, f13);
        this.r.reset();
        this.r.postScale(1.0f, -1.0f, width, height);
        this.r.postScale(max, max);
        this.r.postTranslate(0.0f, f5);
        this.r.postTranslate(width2, height2);
        this.r.postTranslate(min2, f12);
        this.o.set(f4, f5, f11, f13);
        this.s.reset();
        this.s.postScale(-1.0f, -1.0f, width, height);
        this.s.postScale(max, max);
        this.s.postTranslate(f4, f5);
        this.s.postTranslate(width2, height2);
        this.s.postTranslate(f12, f12);
    }

    public final float getImageSizeMultiplier() {
        return this.t;
    }

    public final float getPositionOffset() {
        return this.u;
    }

    public final float getSizeOffset() {
        return this.v;
    }

    public final void setImageSizeMultiplier(float f2) {
        this.t = knf.a(f2, 0.0f);
        c();
        invalidate();
    }

    public final void setPositionOffset(float f2) {
        this.u = f2;
        c();
        invalidate();
    }

    public final void setSizeOffset(float f2) {
        this.v = f2;
        c();
        invalidate();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MirrorQuadrantImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        h.e(context, "context");
    }
}

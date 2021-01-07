package com.spotify.music.features.wrapped2020.stories.views.mirror;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.util.AttributeSet;
import kotlin.jvm.internal.h;

public final class MirrorVerticalImageView extends MirrorImageView {
    private final RectF c = new RectF();
    private final RectF f = new RectF();
    private final Matrix n = new Matrix();
    private final Matrix o = new Matrix();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MirrorVerticalImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        h.e(context, "context");
    }

    @Override // com.spotify.music.features.wrapped2020.stories.views.mirror.MirrorImageView
    public void b(Canvas canvas, Bitmap bitmap) {
        h.e(canvas, "canvas");
        h.e(bitmap, "image");
        a(canvas, this.c, this.n, bitmap);
        a(canvas, this.f, this.o, bitmap);
    }

    @Override // com.spotify.music.features.wrapped2020.stories.views.mirror.MirrorImageView
    public void d(float f2, float f3, Bitmap bitmap) {
        h.e(bitmap, "image");
        float f4 = f3 / 2.0f;
        float max = Math.max(f2, f4) / ((float) Math.min(bitmap.getWidth(), bitmap.getHeight()));
        float width = (f2 - (((float) bitmap.getWidth()) * max)) / 2.0f;
        float height = (f4 - (((float) bitmap.getHeight()) * max)) / 2.0f;
        this.c.set(0.0f, 0.0f, f2, f4);
        this.n.reset();
        this.n.postScale(max, max);
        this.n.postTranslate(width, height);
        this.f.set(0.0f, f4, f2, f3);
        this.o.reset();
        this.o.postScale(1.0f, -1.0f, ((float) bitmap.getWidth()) / 2.0f, ((float) bitmap.getHeight()) / 2.0f);
        this.o.postScale(max, max);
        this.o.postTranslate(0.0f, f4);
        this.o.postTranslate(width, height);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MirrorVerticalImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        h.e(context, "context");
    }
}

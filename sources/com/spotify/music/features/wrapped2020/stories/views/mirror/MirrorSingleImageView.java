package com.spotify.music.features.wrapped2020.stories.views.mirror;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.util.AttributeSet;
import kotlin.jvm.internal.h;

public final class MirrorSingleImageView extends MirrorImageView {
    private final RectF c = new RectF();
    private final Matrix f = new Matrix();
    private MirrorSide n = MirrorSide.NO_MIRROR;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MirrorSingleImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        h.e(context, "context");
    }

    @Override // com.spotify.music.features.wrapped2020.stories.views.mirror.MirrorImageView
    public void b(Canvas canvas, Bitmap bitmap) {
        h.e(canvas, "canvas");
        h.e(bitmap, "image");
        a(canvas, this.c, this.f, bitmap);
    }

    @Override // com.spotify.music.features.wrapped2020.stories.views.mirror.MirrorImageView
    public void d(float f2, float f3, Bitmap bitmap) {
        h.e(bitmap, "image");
        int min = Math.min(bitmap.getWidth(), bitmap.getHeight());
        float width = ((float) bitmap.getWidth()) / 2.0f;
        float height = ((float) bitmap.getHeight()) / 2.0f;
        float max = Math.max(f2, f3) / ((float) min);
        float width2 = (f2 - (((float) bitmap.getWidth()) * max)) / 2.0f;
        float height2 = (f3 - (((float) bitmap.getHeight()) * max)) / 2.0f;
        this.c.set(0.0f, 0.0f, f2, f3);
        this.f.reset();
        Matrix matrix = this.f;
        int ordinal = this.n.ordinal();
        float f4 = -1.0f;
        float f5 = (ordinal == 2 || ordinal == 3) ? -1.0f : 1.0f;
        int ordinal2 = this.n.ordinal();
        if (!(ordinal2 == 1 || ordinal2 == 3)) {
            f4 = 1.0f;
        }
        matrix.postScale(f5, f4, width, height);
        this.f.postScale(max, max);
        this.f.postTranslate(width2, height2);
    }

    public final MirrorSide getMirrorSide() {
        return this.n;
    }

    public final void setMirrorSide(MirrorSide mirrorSide) {
        h.e(mirrorSide, "value");
        this.n = mirrorSide;
        c();
        invalidate();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MirrorSingleImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        h.e(context, "context");
    }
}

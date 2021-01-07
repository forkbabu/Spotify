package com.spotify.music.features.wrapped2020.stories.views.mirror;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import kotlin.jvm.internal.h;

public abstract class MirrorImageView extends View {
    private final Paint a = new Paint();
    private Bitmap b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MirrorImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        h.e(context, "context");
    }

    public final void a(Canvas canvas, RectF rectF, Matrix matrix, Bitmap bitmap) {
        h.e(canvas, "canvas");
        h.e(rectF, "clipRect");
        h.e(matrix, "matrix");
        h.e(bitmap, "image");
        canvas.save();
        canvas.clipRect(rectF);
        canvas.drawBitmap(bitmap, matrix, this.a);
        canvas.restore();
    }

    public abstract void b(Canvas canvas, Bitmap bitmap);

    public final void c() {
        Bitmap bitmap = this.b;
        if (bitmap != null) {
            d((float) getWidth(), (float) getHeight(), bitmap);
        }
    }

    public abstract void d(float f, float f2, Bitmap bitmap);

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        h.e(canvas, "canvas");
        super.onDraw(canvas);
        Bitmap bitmap = this.b;
        if (bitmap != null) {
            b(canvas, bitmap);
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        Bitmap bitmap = this.b;
        if (bitmap != null) {
            d((float) i, (float) i2, bitmap);
        }
    }

    public final void setImage(Bitmap bitmap) {
        this.b = bitmap;
        c();
        invalidate();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MirrorImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        h.e(context, "context");
    }
}

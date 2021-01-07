package com.airbnb.lottie.model.layer;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.airbnb.lottie.f;
import com.airbnb.lottie.k;

public class d extends b {
    private jb<ColorFilter, ColorFilter> A;
    private final Paint x = new pa(3);
    private final Rect y = new Rect();
    private final Rect z = new Rect();

    d(f fVar, Layer layer) {
        super(fVar, layer);
    }

    @Override // com.airbnb.lottie.model.layer.b, com.airbnb.lottie.model.e
    public <T> void c(T t, he<T> heVar) {
        this.v.c(t, heVar);
        if (t != k.C) {
            return;
        }
        if (heVar == null) {
            this.A = null;
        } else {
            this.A = new yb(heVar, null);
        }
    }

    @Override // com.airbnb.lottie.model.layer.b, defpackage.ua
    public void e(RectF rectF, Matrix matrix, boolean z2) {
        super.e(rectF, matrix, z2);
        Bitmap n = this.n.n(this.o.k());
        if (n != null) {
            rectF.set(0.0f, 0.0f, ee.c() * ((float) n.getWidth()), ee.c() * ((float) n.getHeight()));
            this.m.mapRect(rectF);
        }
    }

    @Override // com.airbnb.lottie.model.layer.b
    public void l(Canvas canvas, Matrix matrix, int i) {
        Bitmap n = this.n.n(this.o.k());
        if (n != null && !n.isRecycled()) {
            float c = ee.c();
            this.x.setAlpha(i);
            jb<ColorFilter, ColorFilter> jbVar = this.A;
            if (jbVar != null) {
                this.x.setColorFilter(jbVar.g());
            }
            canvas.save();
            canvas.concat(matrix);
            this.y.set(0, 0, n.getWidth(), n.getHeight());
            this.z.set(0, 0, (int) (((float) n.getWidth()) * c), (int) (((float) n.getHeight()) * c));
            canvas.drawBitmap(n, this.y, this.z, this.x);
            canvas.restore();
        }
    }
}

package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.f;
import com.airbnb.lottie.k;

public class g extends b {
    private final Path A;
    private final Layer B;
    private jb<ColorFilter, ColorFilter> C;
    private final RectF x = new RectF();
    private final Paint y;
    private final float[] z;

    g(f fVar, Layer layer) {
        super(fVar, layer);
        pa paVar = new pa();
        this.y = paVar;
        this.z = new float[8];
        this.A = new Path();
        this.B = layer;
        paVar.setAlpha(0);
        paVar.setStyle(Paint.Style.FILL);
        paVar.setColor(layer.m());
    }

    @Override // com.airbnb.lottie.model.layer.b, com.airbnb.lottie.model.e
    public <T> void c(T t, he<T> heVar) {
        this.v.c(t, heVar);
        if (t != k.C) {
            return;
        }
        if (heVar == null) {
            this.C = null;
        } else {
            this.C = new yb(heVar, null);
        }
    }

    @Override // com.airbnb.lottie.model.layer.b, defpackage.ua
    public void e(RectF rectF, Matrix matrix, boolean z2) {
        super.e(rectF, matrix, z2);
        this.x.set(0.0f, 0.0f, (float) this.B.o(), (float) this.B.n());
        this.m.mapRect(this.x);
        rectF.set(this.x);
    }

    @Override // com.airbnb.lottie.model.layer.b
    public void l(Canvas canvas, Matrix matrix, int i) {
        int alpha = Color.alpha(this.B.m());
        if (alpha != 0) {
            int intValue = (int) ((((((float) alpha) / 255.0f) * ((float) (this.v.h() == null ? 100 : this.v.h().g().intValue()))) / 100.0f) * (((float) i) / 255.0f) * 255.0f);
            this.y.setAlpha(intValue);
            jb<ColorFilter, ColorFilter> jbVar = this.C;
            if (jbVar != null) {
                this.y.setColorFilter(jbVar.g());
            }
            if (intValue > 0) {
                float[] fArr = this.z;
                fArr[0] = 0.0f;
                fArr[1] = 0.0f;
                fArr[2] = (float) this.B.o();
                float[] fArr2 = this.z;
                fArr2[3] = 0.0f;
                fArr2[4] = (float) this.B.o();
                this.z[5] = (float) this.B.n();
                float[] fArr3 = this.z;
                fArr3[6] = 0.0f;
                fArr3[7] = (float) this.B.n();
                matrix.mapPoints(this.z);
                this.A.reset();
                Path path = this.A;
                float[] fArr4 = this.z;
                path.moveTo(fArr4[0], fArr4[1]);
                Path path2 = this.A;
                float[] fArr5 = this.z;
                path2.lineTo(fArr5[2], fArr5[3]);
                Path path3 = this.A;
                float[] fArr6 = this.z;
                path3.lineTo(fArr6[4], fArr6[5]);
                Path path4 = this.A;
                float[] fArr7 = this.z;
                path4.lineTo(fArr7[6], fArr7[7]);
                Path path5 = this.A;
                float[] fArr8 = this.z;
                path5.lineTo(fArr8[0], fArr8[1]);
                this.A.close();
                canvas.drawPath(this.A, this.y);
            }
        }
    }
}

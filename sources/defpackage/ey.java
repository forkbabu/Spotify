package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Build;
import defpackage.yx;
import java.util.BitSet;

/* renamed from: ey  reason: default package */
public class ey {
    private final fy[] a = new fy[4];
    private final Matrix[] b = new Matrix[4];
    private final Matrix[] c = new Matrix[4];
    private final PointF d = new PointF();
    private final Path e = new Path();
    private final Path f = new Path();
    private final fy g = new fy();
    private final float[] h = new float[2];
    private final float[] i = new float[2];
    private boolean j = true;

    /* renamed from: ey$a */
    public interface a {
    }

    public ey() {
        for (int i2 = 0; i2 < 4; i2++) {
            this.a[i2] = new fy();
            this.b[i2] = new Matrix();
            this.c[i2] = new Matrix();
        }
    }

    private boolean c(Path path, int i2) {
        Path path2 = new Path();
        this.a[i2].c(this.b[i2], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (!rectF.isEmpty()) {
            return true;
        }
        if (rectF.width() <= 1.0f || rectF.height() <= 1.0f) {
            return false;
        }
        return true;
    }

    public void a(dy dyVar, float f2, RectF rectF, Path path) {
        b(dyVar, f2, rectF, null, path);
    }

    public void b(dy dyVar, float f2, RectF rectF, a aVar, Path path) {
        int i2;
        float f3;
        wx wxVar;
        tx txVar;
        ux uxVar;
        path.rewind();
        this.e.rewind();
        this.f.rewind();
        this.f.addRect(rectF, Path.Direction.CW);
        int i3 = 0;
        while (true) {
            if (i3 >= 4) {
                break;
            }
            if (i3 == 1) {
                txVar = dyVar.g;
            } else if (i3 == 2) {
                txVar = dyVar.h;
            } else if (i3 != 3) {
                txVar = dyVar.f;
            } else {
                txVar = dyVar.e;
            }
            if (i3 == 1) {
                uxVar = dyVar.c;
            } else if (i3 == 2) {
                uxVar = dyVar.d;
            } else if (i3 != 3) {
                uxVar = dyVar.b;
            } else {
                uxVar = dyVar.a;
            }
            fy fyVar = this.a[i3];
            uxVar.getClass();
            uxVar.a(fyVar, 90.0f, f2, txVar.a(rectF));
            int i4 = i3 + 1;
            float f4 = (float) (i4 * 90);
            this.b[i3].reset();
            PointF pointF = this.d;
            if (i3 == 1) {
                pointF.set(rectF.right, rectF.bottom);
            } else if (i3 == 2) {
                pointF.set(rectF.left, rectF.bottom);
            } else if (i3 != 3) {
                pointF.set(rectF.right, rectF.top);
            } else {
                pointF.set(rectF.left, rectF.top);
            }
            Matrix matrix = this.b[i3];
            PointF pointF2 = this.d;
            matrix.setTranslate(pointF2.x, pointF2.y);
            this.b[i3].preRotate(f4);
            float[] fArr = this.h;
            fy[] fyVarArr = this.a;
            fArr[0] = fyVarArr[i3].c;
            fArr[1] = fyVarArr[i3].d;
            this.b[i3].mapPoints(fArr);
            this.c[i3].reset();
            Matrix matrix2 = this.c[i3];
            float[] fArr2 = this.h;
            matrix2.setTranslate(fArr2[0], fArr2[1]);
            this.c[i3].preRotate(f4);
            i3 = i4;
        }
        int i5 = 0;
        for (i2 = 4; i5 < i2; i2 = 4) {
            float[] fArr3 = this.h;
            fy[] fyVarArr2 = this.a;
            fArr3[0] = fyVarArr2[i5].a;
            fArr3[1] = fyVarArr2[i5].b;
            this.b[i5].mapPoints(fArr3);
            if (i5 == 0) {
                float[] fArr4 = this.h;
                path.moveTo(fArr4[0], fArr4[1]);
            } else {
                float[] fArr5 = this.h;
                path.lineTo(fArr5[0], fArr5[1]);
            }
            this.a[i5].c(this.b[i5], path);
            if (aVar != null) {
                fy fyVar2 = this.a[i5];
                Matrix matrix3 = this.b[i5];
                yx.a aVar2 = (yx.a) aVar;
                BitSet bitSet = yx.this.f;
                fyVar2.getClass();
                bitSet.set(i5, false);
                yx.this.b[i5] = fyVar2.d(matrix3);
            }
            int i6 = i5 + 1;
            int i7 = i6 % 4;
            float[] fArr6 = this.h;
            fy[] fyVarArr3 = this.a;
            fArr6[0] = fyVarArr3[i5].c;
            fArr6[1] = fyVarArr3[i5].d;
            this.b[i5].mapPoints(fArr6);
            float[] fArr7 = this.i;
            fy[] fyVarArr4 = this.a;
            fArr7[0] = fyVarArr4[i7].a;
            fArr7[1] = fyVarArr4[i7].b;
            this.b[i7].mapPoints(fArr7);
            float[] fArr8 = this.h;
            float f5 = fArr8[0];
            float[] fArr9 = this.i;
            float max = Math.max(((float) Math.hypot((double) (f5 - fArr9[0]), (double) (fArr8[1] - fArr9[1]))) - 0.001f, 0.0f);
            float[] fArr10 = this.h;
            fy[] fyVarArr5 = this.a;
            fArr10[0] = fyVarArr5[i5].c;
            fArr10[1] = fyVarArr5[i5].d;
            this.b[i5].mapPoints(fArr10);
            if (i5 == 1 || i5 == 3) {
                f3 = Math.abs(rectF.centerX() - this.h[0]);
            } else {
                f3 = Math.abs(rectF.centerY() - this.h[1]);
            }
            this.g.f(0.0f, 0.0f);
            if (i5 == 1) {
                wxVar = dyVar.k;
            } else if (i5 == 2) {
                wxVar = dyVar.l;
            } else if (i5 != 3) {
                wxVar = dyVar.j;
            } else {
                wxVar = dyVar.i;
            }
            wxVar.c(max, f3, f2, this.g);
            Path path2 = new Path();
            this.g.c(this.c[i5], path2);
            if (!this.j || Build.VERSION.SDK_INT < 19 || (!wxVar.b() && !c(path2, i5) && !c(path2, i7))) {
                this.g.c(this.c[i5], path);
            } else {
                path2.op(path2, this.f, Path.Op.DIFFERENCE);
                float[] fArr11 = this.h;
                fy fyVar3 = this.g;
                fArr11[0] = fyVar3.a;
                fArr11[1] = fyVar3.b;
                this.c[i5].mapPoints(fArr11);
                Path path3 = this.e;
                float[] fArr12 = this.h;
                path3.moveTo(fArr12[0], fArr12[1]);
                this.g.c(this.c[i5], this.e);
            }
            if (aVar != null) {
                fy fyVar4 = this.g;
                Matrix matrix4 = this.c[i5];
                yx.a aVar3 = (yx.a) aVar;
                fyVar4.getClass();
                yx.this.f.set(i5 + 4, false);
                yx.this.c[i5] = fyVar4.d(matrix4);
            }
            i5 = i6;
        }
        path.close();
        this.e.close();
        if (Build.VERSION.SDK_INT >= 19 && !this.e.isEmpty()) {
            path.op(this.e, Path.Op.UNION);
        }
    }
}

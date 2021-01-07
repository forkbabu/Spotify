package androidx.constraintlayout.motion.widget;

import android.os.Build;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.HashMap;

public abstract class r {
    protected w1 a;
    protected int b = 0;
    protected int[] c = new int[10];
    protected float[][] d = ((float[][]) Array.newInstance(float.class, 10, 3));
    private int e;
    private String f;
    private float[] g = new float[3];
    protected boolean h = false;
    long i;
    float j = Float.NaN;

    /* access modifiers changed from: package-private */
    public static class a extends r {
        a() {
        }

        @Override // androidx.constraintlayout.motion.widget.r
        public boolean d(View view, float f, long j, d dVar) {
            view.setAlpha(b(f, j, view, dVar));
            return this.h;
        }
    }

    /* access modifiers changed from: package-private */
    public static class b extends r {
        String k;
        SparseArray<ConstraintAttribute> l;
        SparseArray<float[]> m = new SparseArray<>();
        float[] n;
        float[] o;

        public b(String str, SparseArray<ConstraintAttribute> sparseArray) {
            this.k = str.split(",")[1];
            this.l = sparseArray;
        }

        @Override // androidx.constraintlayout.motion.widget.r
        public void c(int i, float f, float f2, int i2, float f3) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute,...)");
        }

        @Override // androidx.constraintlayout.motion.widget.r
        public boolean d(View view, float f, long j, d dVar) {
            this.a.e((double) f, this.n);
            float[] fArr = this.n;
            float f2 = fArr[fArr.length - 2];
            float f3 = fArr[fArr.length - 1];
            long j2 = j - this.i;
            if (Float.isNaN(this.j)) {
                float a = dVar.a(view, this.k, 0);
                this.j = a;
                if (Float.isNaN(a)) {
                    this.j = 0.0f;
                }
            }
            double d = (double) this.j;
            double d2 = (double) j2;
            Double.isNaN(d2);
            double d3 = (double) f2;
            Double.isNaN(d3);
            Double.isNaN(d);
            float f4 = (float) ((((d2 * 1.0E-9d) * d3) + d) % 1.0d);
            this.j = f4;
            this.i = j;
            float a2 = a(f4);
            this.h = false;
            int i = 0;
            while (true) {
                float[] fArr2 = this.o;
                if (i >= fArr2.length) {
                    break;
                }
                boolean z = this.h;
                float[] fArr3 = this.n;
                this.h = z | (((double) fArr3[i]) != 0.0d);
                fArr2[i] = (fArr3[i] * a2) + f3;
                i++;
            }
            this.l.valueAt(0).h(view, this.o);
            if (f2 != 0.0f) {
                this.h = true;
            }
            return this.h;
        }

        @Override // androidx.constraintlayout.motion.widget.r
        public void f(int i) {
            int size = this.l.size();
            int e = this.l.valueAt(0).e();
            double[] dArr = new double[size];
            int i2 = e + 2;
            this.n = new float[i2];
            this.o = new float[e];
            int[] iArr = new int[2];
            iArr[1] = i2;
            iArr[0] = size;
            double[][] dArr2 = (double[][]) Array.newInstance(double.class, iArr);
            for (int i3 = 0; i3 < size; i3++) {
                int keyAt = this.l.keyAt(i3);
                float[] valueAt = this.m.valueAt(i3);
                double d = (double) keyAt;
                Double.isNaN(d);
                dArr[i3] = d * 0.01d;
                this.l.valueAt(i3).d(this.n);
                int i4 = 0;
                while (true) {
                    float[] fArr = this.n;
                    if (i4 >= fArr.length) {
                        break;
                    }
                    dArr2[i3][i4] = (double) fArr[i4];
                    i4++;
                }
                dArr2[i3][e] = (double) valueAt[0];
                dArr2[i3][e + 1] = (double) valueAt[1];
            }
            this.a = w1.a(i, dArr, dArr2);
        }
    }

    /* access modifiers changed from: package-private */
    public static class c extends r {
        c() {
        }

        @Override // androidx.constraintlayout.motion.widget.r
        public boolean d(View view, float f, long j, d dVar) {
            if (Build.VERSION.SDK_INT >= 21) {
                view.setElevation(b(f, j, view, dVar));
            }
            return this.h;
        }
    }

    /* access modifiers changed from: package-private */
    public static class d extends r {
        d() {
        }

        @Override // androidx.constraintlayout.motion.widget.r
        public boolean d(View view, float f, long j, d dVar) {
            return this.h;
        }
    }

    /* access modifiers changed from: package-private */
    public static class e extends r {
        boolean k = false;

        e() {
        }

        @Override // androidx.constraintlayout.motion.widget.r
        public boolean d(View view, float f, long j, d dVar) {
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(b(f, j, view, dVar));
            } else if (this.k) {
                return false;
            } else {
                Method method = null;
                try {
                    method = view.getClass().getMethod("setProgress", Float.TYPE);
                } catch (NoSuchMethodException unused) {
                    this.k = true;
                }
                if (method != null) {
                    try {
                        method.invoke(view, Float.valueOf(b(f, j, view, dVar)));
                    } catch (IllegalAccessException e) {
                        Log.e("SplineSet", "unable to setProgress", e);
                    } catch (InvocationTargetException e2) {
                        Log.e("SplineSet", "unable to setProgress", e2);
                    }
                }
            }
            return this.h;
        }
    }

    /* access modifiers changed from: package-private */
    public static class f extends r {
        f() {
        }

        @Override // androidx.constraintlayout.motion.widget.r
        public boolean d(View view, float f, long j, d dVar) {
            view.setRotation(b(f, j, view, dVar));
            return this.h;
        }
    }

    /* access modifiers changed from: package-private */
    public static class g extends r {
        g() {
        }

        @Override // androidx.constraintlayout.motion.widget.r
        public boolean d(View view, float f, long j, d dVar) {
            view.setRotationX(b(f, j, view, dVar));
            return this.h;
        }
    }

    /* access modifiers changed from: package-private */
    public static class h extends r {
        h() {
        }

        @Override // androidx.constraintlayout.motion.widget.r
        public boolean d(View view, float f, long j, d dVar) {
            view.setRotationY(b(f, j, view, dVar));
            return this.h;
        }
    }

    /* access modifiers changed from: package-private */
    public static class i extends r {
        i() {
        }

        @Override // androidx.constraintlayout.motion.widget.r
        public boolean d(View view, float f, long j, d dVar) {
            view.setScaleX(b(f, j, view, dVar));
            return this.h;
        }
    }

    /* access modifiers changed from: package-private */
    public static class j extends r {
        j() {
        }

        @Override // androidx.constraintlayout.motion.widget.r
        public boolean d(View view, float f, long j, d dVar) {
            view.setScaleY(b(f, j, view, dVar));
            return this.h;
        }
    }

    /* access modifiers changed from: package-private */
    public static class k extends r {
        k() {
        }

        @Override // androidx.constraintlayout.motion.widget.r
        public boolean d(View view, float f, long j, d dVar) {
            view.setTranslationX(b(f, j, view, dVar));
            return this.h;
        }
    }

    /* access modifiers changed from: package-private */
    public static class l extends r {
        l() {
        }

        @Override // androidx.constraintlayout.motion.widget.r
        public boolean d(View view, float f, long j, d dVar) {
            view.setTranslationY(b(f, j, view, dVar));
            return this.h;
        }
    }

    /* access modifiers changed from: package-private */
    public static class m extends r {
        m() {
        }

        @Override // androidx.constraintlayout.motion.widget.r
        public boolean d(View view, float f, long j, d dVar) {
            if (Build.VERSION.SDK_INT >= 21) {
                view.setTranslationZ(b(f, j, view, dVar));
            }
            return this.h;
        }
    }

    /* access modifiers changed from: protected */
    public float a(float f2) {
        float abs;
        switch (this.b) {
            case 1:
                return Math.signum(f2 * 6.2831855f);
            case 2:
                abs = Math.abs(f2);
                break;
            case 3:
                return (((f2 * 2.0f) + 1.0f) % 2.0f) - 1.0f;
            case 4:
                abs = ((f2 * 2.0f) + 1.0f) % 2.0f;
                break;
            case 5:
                return (float) Math.cos((double) (f2 * 6.2831855f));
            case 6:
                float abs2 = 1.0f - Math.abs(((f2 * 4.0f) % 4.0f) - 2.0f);
                abs = abs2 * abs2;
                break;
            default:
                return (float) Math.sin((double) (f2 * 6.2831855f));
        }
        return 1.0f - abs;
    }

    public float b(float f2, long j2, View view, d dVar) {
        this.a.e((double) f2, this.g);
        float[] fArr = this.g;
        boolean z = true;
        float f3 = fArr[1];
        if (f3 == 0.0f) {
            this.h = false;
            return fArr[2];
        }
        if (Float.isNaN(this.j)) {
            float a2 = dVar.a(view, this.f, 0);
            this.j = a2;
            if (Float.isNaN(a2)) {
                this.j = 0.0f;
            }
        }
        double d2 = (double) this.j;
        double d3 = (double) (j2 - this.i);
        Double.isNaN(d3);
        double d4 = (double) f3;
        Double.isNaN(d4);
        Double.isNaN(d2);
        float f4 = (float) ((((d3 * 1.0E-9d) * d4) + d2) % 1.0d);
        this.j = f4;
        String str = this.f;
        if (!dVar.a.containsKey(view)) {
            HashMap<String, float[]> hashMap = new HashMap<>();
            hashMap.put(str, new float[]{f4});
            dVar.a.put(view, hashMap);
        } else {
            HashMap<String, float[]> hashMap2 = dVar.a.get(view);
            if (!hashMap2.containsKey(str)) {
                hashMap2.put(str, new float[]{f4});
                dVar.a.put(view, hashMap2);
            } else {
                float[] fArr2 = hashMap2.get(str);
                if (fArr2.length <= 0) {
                    fArr2 = Arrays.copyOf(fArr2, 1);
                }
                fArr2[0] = f4;
                hashMap2.put(str, fArr2);
            }
        }
        this.i = j2;
        float f5 = this.g[0];
        float a3 = (a(this.j) * f5) + this.g[2];
        if (f5 == 0.0f && f3 == 0.0f) {
            z = false;
        }
        this.h = z;
        return a3;
    }

    public void c(int i2, float f2, float f3, int i3, float f4) {
        int[] iArr = this.c;
        int i4 = this.e;
        iArr[i4] = i2;
        float[][] fArr = this.d;
        fArr[i4][0] = f2;
        fArr[i4][1] = f3;
        fArr[i4][2] = f4;
        this.b = Math.max(this.b, i3);
        this.e++;
    }

    public abstract boolean d(View view, float f2, long j2, d dVar);

    public void e(String str) {
        this.f = str;
    }

    public void f(int i2) {
        int i3 = this.e;
        if (i3 == 0) {
            StringBuilder V0 = je.V0("Error no points added to ");
            V0.append(this.f);
            Log.e("SplineSet", V0.toString());
            return;
        }
        int[] iArr = this.c;
        float[][] fArr = this.d;
        int[] iArr2 = new int[(iArr.length + 10)];
        iArr2[0] = i3 - 1;
        iArr2[1] = 0;
        int i4 = 2;
        while (i4 > 0) {
            int i5 = i4 - 1;
            int i6 = iArr2[i5];
            i4 = i5 - 1;
            int i7 = iArr2[i4];
            if (i6 < i7) {
                int i8 = iArr[i7];
                int i9 = i6;
                int i10 = i9;
                while (i9 < i7) {
                    if (iArr[i9] <= i8) {
                        int i11 = iArr[i10];
                        iArr[i10] = iArr[i9];
                        iArr[i9] = i11;
                        float[] fArr2 = fArr[i10];
                        fArr[i10] = fArr[i9];
                        fArr[i9] = fArr2;
                        i10++;
                    }
                    i9++;
                }
                int i12 = iArr[i10];
                iArr[i10] = iArr[i7];
                iArr[i7] = i12;
                float[] fArr3 = fArr[i10];
                fArr[i10] = fArr[i7];
                fArr[i7] = fArr3;
                int i13 = i4 + 1;
                iArr2[i4] = i10 - 1;
                int i14 = i13 + 1;
                iArr2[i13] = i6;
                int i15 = i14 + 1;
                iArr2[i14] = i7;
                i4 = i15 + 1;
                iArr2[i15] = i10 + 1;
            }
        }
        int i16 = 1;
        int i17 = 0;
        while (true) {
            int[] iArr3 = this.c;
            if (i16 >= iArr3.length) {
                break;
            }
            if (iArr3[i16] != iArr3[i16 - 1]) {
                i17++;
            }
            i16++;
        }
        if (i17 == 0) {
            i17 = 1;
        }
        double[] dArr = new double[i17];
        int[] iArr4 = new int[2];
        iArr4[1] = 3;
        iArr4[0] = i17;
        double[][] dArr2 = (double[][]) Array.newInstance(double.class, iArr4);
        int i18 = 0;
        for (int i19 = 0; i19 < this.e; i19++) {
            if (i19 > 0) {
                int[] iArr5 = this.c;
                if (iArr5[i19] == iArr5[i19 - 1]) {
                }
            }
            double d2 = (double) this.c[i19];
            Double.isNaN(d2);
            dArr[i18] = d2 * 0.01d;
            double[] dArr3 = dArr2[i18];
            float[][] fArr4 = this.d;
            dArr3[0] = (double) fArr4[i19][0];
            dArr2[i18][1] = (double) fArr4[i19][1];
            dArr2[i18][2] = (double) fArr4[i19][2];
            i18++;
        }
        this.a = w1.a(i2, dArr, dArr2);
    }

    public String toString() {
        String str = this.f;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i2 = 0; i2 < this.e; i2++) {
            StringBuilder Z0 = je.Z0(str, "[");
            Z0.append(this.c[i2]);
            Z0.append(" , ");
            Z0.append(decimalFormat.format(this.d[i2]));
            Z0.append("] ");
            str = Z0.toString();
        }
        return str;
    }
}

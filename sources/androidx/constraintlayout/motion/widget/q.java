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

public abstract class q {
    protected w1 a;
    protected int[] b = new int[10];
    protected float[] c = new float[10];
    private int d;
    private String e;

    /* access modifiers changed from: package-private */
    public static class a extends q {
        a() {
        }

        @Override // androidx.constraintlayout.motion.widget.q
        public void d(View view, float f) {
            view.setAlpha((float) this.a.c((double) f, 0));
        }
    }

    /* access modifiers changed from: package-private */
    public static class b extends q {
        SparseArray<ConstraintAttribute> f;
        float[] g;

        public b(String str, SparseArray<ConstraintAttribute> sparseArray) {
            String str2 = str.split(",")[1];
            this.f = sparseArray;
        }

        @Override // androidx.constraintlayout.motion.widget.q
        public void c(int i, float f2) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute)");
        }

        @Override // androidx.constraintlayout.motion.widget.q
        public void d(View view, float f2) {
            this.a.e((double) f2, this.g);
            this.f.valueAt(0).h(view, this.g);
        }

        @Override // androidx.constraintlayout.motion.widget.q
        public void f(int i) {
            int size = this.f.size();
            int e = this.f.valueAt(0).e();
            double[] dArr = new double[size];
            this.g = new float[e];
            int[] iArr = new int[2];
            iArr[1] = e;
            iArr[0] = size;
            double[][] dArr2 = (double[][]) Array.newInstance(double.class, iArr);
            for (int i2 = 0; i2 < size; i2++) {
                double keyAt = (double) this.f.keyAt(i2);
                Double.isNaN(keyAt);
                dArr[i2] = keyAt * 0.01d;
                this.f.valueAt(i2).d(this.g);
                int i3 = 0;
                while (true) {
                    float[] fArr = this.g;
                    if (i3 >= fArr.length) {
                        break;
                    }
                    dArr2[i2][i3] = (double) fArr[i3];
                    i3++;
                }
            }
            this.a = w1.a(i, dArr, dArr2);
        }
    }

    /* access modifiers changed from: package-private */
    public static class c extends q {
        c() {
        }

        @Override // androidx.constraintlayout.motion.widget.q
        public void d(View view, float f) {
            if (Build.VERSION.SDK_INT >= 21) {
                view.setElevation((float) this.a.c((double) f, 0));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static class d extends q {
        d() {
        }

        @Override // androidx.constraintlayout.motion.widget.q
        public void d(View view, float f) {
        }
    }

    /* access modifiers changed from: package-private */
    public static class e extends q {
        e() {
        }

        @Override // androidx.constraintlayout.motion.widget.q
        public void d(View view, float f) {
            view.setPivotX((float) this.a.c((double) f, 0));
        }
    }

    /* access modifiers changed from: package-private */
    public static class f extends q {
        f() {
        }

        @Override // androidx.constraintlayout.motion.widget.q
        public void d(View view, float f) {
            view.setPivotY((float) this.a.c((double) f, 0));
        }
    }

    /* access modifiers changed from: package-private */
    public static class g extends q {
        boolean f = false;

        g() {
        }

        @Override // androidx.constraintlayout.motion.widget.q
        public void d(View view, float f2) {
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress((float) this.a.c((double) f2, 0));
            } else if (!this.f) {
                Method method = null;
                try {
                    method = view.getClass().getMethod("setProgress", Float.TYPE);
                } catch (NoSuchMethodException unused) {
                    this.f = true;
                }
                if (method != null) {
                    try {
                        method.invoke(view, Float.valueOf((float) this.a.c((double) f2, 0)));
                    } catch (IllegalAccessException e) {
                        Log.e("SplineSet", "unable to setProgress", e);
                    } catch (InvocationTargetException e2) {
                        Log.e("SplineSet", "unable to setProgress", e2);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static class h extends q {
        h() {
        }

        @Override // androidx.constraintlayout.motion.widget.q
        public void d(View view, float f) {
            view.setRotation((float) this.a.c((double) f, 0));
        }
    }

    /* access modifiers changed from: package-private */
    public static class i extends q {
        i() {
        }

        @Override // androidx.constraintlayout.motion.widget.q
        public void d(View view, float f) {
            view.setRotationX((float) this.a.c((double) f, 0));
        }
    }

    /* access modifiers changed from: package-private */
    public static class j extends q {
        j() {
        }

        @Override // androidx.constraintlayout.motion.widget.q
        public void d(View view, float f) {
            view.setRotationY((float) this.a.c((double) f, 0));
        }
    }

    /* access modifiers changed from: package-private */
    public static class k extends q {
        k() {
        }

        @Override // androidx.constraintlayout.motion.widget.q
        public void d(View view, float f) {
            view.setScaleX((float) this.a.c((double) f, 0));
        }
    }

    /* access modifiers changed from: package-private */
    public static class l extends q {
        l() {
        }

        @Override // androidx.constraintlayout.motion.widget.q
        public void d(View view, float f) {
            view.setScaleY((float) this.a.c((double) f, 0));
        }
    }

    /* access modifiers changed from: package-private */
    public static class m extends q {
        m() {
        }

        @Override // androidx.constraintlayout.motion.widget.q
        public void d(View view, float f) {
            view.setTranslationX((float) this.a.c((double) f, 0));
        }
    }

    /* access modifiers changed from: package-private */
    public static class n extends q {
        n() {
        }

        @Override // androidx.constraintlayout.motion.widget.q
        public void d(View view, float f) {
            view.setTranslationY((float) this.a.c((double) f, 0));
        }
    }

    /* access modifiers changed from: package-private */
    public static class o extends q {
        o() {
        }

        @Override // androidx.constraintlayout.motion.widget.q
        public void d(View view, float f) {
            if (Build.VERSION.SDK_INT >= 21) {
                view.setTranslationZ((float) this.a.c((double) f, 0));
            }
        }
    }

    public float a(float f2) {
        return (float) this.a.c((double) f2, 0);
    }

    public float b(float f2) {
        return (float) this.a.f((double) f2, 0);
    }

    public void c(int i2, float f2) {
        int[] iArr = this.b;
        if (iArr.length < this.d + 1) {
            this.b = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.c;
            this.c = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.b;
        int i3 = this.d;
        iArr2[i3] = i2;
        this.c[i3] = f2;
        this.d = i3 + 1;
    }

    public abstract void d(View view, float f2);

    public void e(String str) {
        this.e = str;
    }

    public void f(int i2) {
        int i3 = this.d;
        if (i3 != 0) {
            int[] iArr = this.b;
            float[] fArr = this.c;
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
                            float f2 = fArr[i10];
                            fArr[i10] = fArr[i9];
                            fArr[i9] = f2;
                            i10++;
                        }
                        i9++;
                    }
                    int i12 = iArr[i10];
                    iArr[i10] = iArr[i7];
                    iArr[i7] = i12;
                    float f3 = fArr[i10];
                    fArr[i10] = fArr[i7];
                    fArr[i7] = f3;
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
            for (int i17 = 1; i17 < this.d; i17++) {
                int[] iArr3 = this.b;
                if (iArr3[i17 - 1] != iArr3[i17]) {
                    i16++;
                }
            }
            double[] dArr = new double[i16];
            int[] iArr4 = new int[2];
            iArr4[1] = 1;
            iArr4[0] = i16;
            double[][] dArr2 = (double[][]) Array.newInstance(double.class, iArr4);
            int i18 = 0;
            for (int i19 = 0; i19 < this.d; i19++) {
                if (i19 > 0) {
                    int[] iArr5 = this.b;
                    if (iArr5[i19] == iArr5[i19 - 1]) {
                    }
                }
                double d2 = (double) this.b[i19];
                Double.isNaN(d2);
                dArr[i18] = d2 * 0.01d;
                dArr2[i18][0] = (double) this.c[i19];
                i18++;
            }
            this.a = w1.a(i2, dArr, dArr2);
        }
    }

    public String toString() {
        String str = this.e;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i2 = 0; i2 < this.d; i2++) {
            StringBuilder Z0 = je.Z0(str, "[");
            Z0.append(this.b[i2]);
            Z0.append(" , ");
            Z0.append(decimalFormat.format((double) this.c[i2]));
            Z0.append("] ");
            str = Z0.toString();
        }
        return str;
    }
}

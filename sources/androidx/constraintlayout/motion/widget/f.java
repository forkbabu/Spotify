package androidx.constraintlayout.motion.widget;

import android.os.Build;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;

public abstract class f {
    private d a;
    protected ConstraintAttribute b;
    private String c;
    private int d = 0;
    public int e = 0;
    ArrayList<p> f = new ArrayList<>();

    /* access modifiers changed from: package-private */
    public class a implements Comparator<p> {
        a(f fVar) {
        }

        /* renamed from: a */
        public int compare(p pVar, p pVar2) {
            return defpackage.d.a(pVar.a, pVar2.a);
        }
    }

    /* access modifiers changed from: package-private */
    public static class b extends f {
        b() {
        }

        @Override // androidx.constraintlayout.motion.widget.f
        public void e(View view, float f) {
            view.setAlpha(a(f));
        }
    }

    /* access modifiers changed from: package-private */
    public static class c extends f {
        float[] g = new float[1];

        c() {
        }

        @Override // androidx.constraintlayout.motion.widget.f
        public void e(View view, float f) {
            this.g[0] = a(f);
            this.b.h(view, this.g);
        }
    }

    /* access modifiers changed from: package-private */
    public static class d {
        a2 a = new a2();
        float[] b;
        double[] c;
        float[] d;
        float[] e;
        w1 f;
        double[] g;
        double[] h;

        d(int i, int i2, int i3) {
            new HashMap();
            this.a.g(i);
            this.b = new float[i3];
            this.c = new double[i3];
            this.d = new float[i3];
            this.e = new float[i3];
            float[] fArr = new float[i3];
        }
    }

    /* access modifiers changed from: package-private */
    public static class e extends f {
        e() {
        }

        @Override // androidx.constraintlayout.motion.widget.f
        public void e(View view, float f) {
            if (Build.VERSION.SDK_INT >= 21) {
                view.setElevation(a(f));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.constraintlayout.motion.widget.f$f  reason: collision with other inner class name */
    public static class C0021f extends f {
        C0021f() {
        }

        @Override // androidx.constraintlayout.motion.widget.f
        public void e(View view, float f) {
        }
    }

    /* access modifiers changed from: package-private */
    public static class g extends f {
        boolean g = false;

        g() {
        }

        @Override // androidx.constraintlayout.motion.widget.f
        public void e(View view, float f) {
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(a(f));
            } else if (!this.g) {
                Method method = null;
                try {
                    method = view.getClass().getMethod("setProgress", Float.TYPE);
                } catch (NoSuchMethodException unused) {
                    this.g = true;
                }
                if (method != null) {
                    try {
                        method.invoke(view, Float.valueOf(a(f)));
                    } catch (IllegalAccessException e) {
                        Log.e("KeyCycleOscillator", "unable to setProgress", e);
                    } catch (InvocationTargetException e2) {
                        Log.e("KeyCycleOscillator", "unable to setProgress", e2);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static class h extends f {
        h() {
        }

        @Override // androidx.constraintlayout.motion.widget.f
        public void e(View view, float f) {
            view.setRotation(a(f));
        }
    }

    /* access modifiers changed from: package-private */
    public static class i extends f {
        i() {
        }

        @Override // androidx.constraintlayout.motion.widget.f
        public void e(View view, float f) {
            view.setRotationX(a(f));
        }
    }

    /* access modifiers changed from: package-private */
    public static class j extends f {
        j() {
        }

        @Override // androidx.constraintlayout.motion.widget.f
        public void e(View view, float f) {
            view.setRotationY(a(f));
        }
    }

    /* access modifiers changed from: package-private */
    public static class k extends f {
        k() {
        }

        @Override // androidx.constraintlayout.motion.widget.f
        public void e(View view, float f) {
            view.setScaleX(a(f));
        }
    }

    /* access modifiers changed from: package-private */
    public static class l extends f {
        l() {
        }

        @Override // androidx.constraintlayout.motion.widget.f
        public void e(View view, float f) {
            view.setScaleY(a(f));
        }
    }

    /* access modifiers changed from: package-private */
    public static class m extends f {
        m() {
        }

        @Override // androidx.constraintlayout.motion.widget.f
        public void e(View view, float f) {
            view.setTranslationX(a(f));
        }
    }

    /* access modifiers changed from: package-private */
    public static class n extends f {
        n() {
        }

        @Override // androidx.constraintlayout.motion.widget.f
        public void e(View view, float f) {
            view.setTranslationY(a(f));
        }
    }

    /* access modifiers changed from: package-private */
    public static class o extends f {
        o() {
        }

        @Override // androidx.constraintlayout.motion.widget.f
        public void e(View view, float f) {
            if (Build.VERSION.SDK_INT >= 21) {
                view.setTranslationZ(a(f));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static class p {
        int a;
        float b;
        float c;
        float d;

        public p(int i, float f, float f2, float f3) {
            this.a = i;
            this.b = f3;
            this.c = f2;
            this.d = f;
        }
    }

    public float a(float f2) {
        d dVar = this.a;
        w1 w1Var = dVar.f;
        if (w1Var != null) {
            w1Var.d((double) f2, dVar.g);
        } else {
            double[] dArr = dVar.g;
            dArr[0] = (double) dVar.e[0];
            dArr[1] = (double) dVar.b[0];
        }
        return (float) ((dVar.a.e((double) f2) * dVar.g[1]) + dVar.g[0]);
    }

    public float b(float f2) {
        d dVar = this.a;
        w1 w1Var = dVar.f;
        if (w1Var != null) {
            double d2 = (double) f2;
            w1Var.g(d2, dVar.h);
            dVar.f.d(d2, dVar.g);
        } else {
            double[] dArr = dVar.h;
            dArr[0] = 0.0d;
            dArr[1] = 0.0d;
        }
        double d3 = (double) f2;
        double e2 = dVar.a.e(d3);
        double d4 = dVar.a.d(d3);
        double[] dArr2 = dVar.h;
        double d5 = dArr2[0];
        return (float) ((d4 * dVar.g[1]) + (e2 * dArr2[1]) + d5);
    }

    public void c(int i2, int i3, int i4, float f2, float f3, float f4) {
        this.f.add(new p(i2, f2, f3, f4));
        if (i4 != -1) {
            this.e = i4;
        }
        this.d = i3;
    }

    public void d(int i2, int i3, int i4, float f2, float f3, float f4, ConstraintAttribute constraintAttribute) {
        this.f.add(new p(i2, f2, f3, f4));
        if (i4 != -1) {
            this.e = i4;
        }
        this.d = i3;
        this.b = constraintAttribute;
    }

    public abstract void e(View view, float f2);

    public void f(String str) {
        this.c = str;
    }

    public void g(float f2) {
        int i2;
        int size = this.f.size();
        if (size != 0) {
            Collections.sort(this.f, new a(this));
            double[] dArr = new double[size];
            int[] iArr = new int[2];
            char c2 = 1;
            iArr[1] = 2;
            char c3 = 0;
            iArr[0] = size;
            double[][] dArr2 = (double[][]) Array.newInstance(double.class, iArr);
            this.a = new d(this.d, this.e, size);
            Iterator<p> it = this.f.iterator();
            int i3 = 0;
            while (it.hasNext()) {
                p next = it.next();
                float f3 = next.d;
                double d2 = (double) f3;
                Double.isNaN(d2);
                dArr[i3] = d2 * 0.01d;
                double[] dArr3 = dArr2[i3];
                float f4 = next.b;
                dArr3[c3] = (double) f4;
                double[] dArr4 = dArr2[i3];
                float f5 = next.c;
                dArr4[c2] = (double) f5;
                d dVar = this.a;
                int i4 = next.a;
                double[] dArr5 = dVar.c;
                double d3 = (double) i4;
                Double.isNaN(d3);
                Double.isNaN(d3);
                dArr5[i3] = d3 / 100.0d;
                dVar.d[i3] = f3;
                dVar.e[i3] = f5;
                dVar.b[i3] = f4;
                i3++;
                c2 = 1;
                c3 = 0;
            }
            d dVar2 = this.a;
            int length = dVar2.c.length;
            int[] iArr2 = new int[2];
            iArr2[1] = 2;
            iArr2[0] = length;
            double[][] dArr6 = (double[][]) Array.newInstance(double.class, iArr2);
            float[] fArr = dVar2.b;
            dVar2.g = new double[(fArr.length + 1)];
            dVar2.h = new double[(fArr.length + 1)];
            if (dVar2.c[0] > 0.0d) {
                dVar2.a.a(0.0d, dVar2.d[0]);
            }
            double[] dArr7 = dVar2.c;
            int length2 = dArr7.length - 1;
            if (dArr7[length2] < 1.0d) {
                dVar2.a.a(1.0d, dVar2.d[length2]);
            }
            for (int i5 = 0; i5 < dArr6.length; i5++) {
                dArr6[i5][0] = (double) dVar2.e[i5];
                int i6 = 0;
                while (true) {
                    float[] fArr2 = dVar2.b;
                    if (i6 >= fArr2.length) {
                        break;
                    }
                    dArr6[i6][1] = (double) fArr2[i6];
                    i6++;
                }
                dVar2.a.a(dVar2.c[i5], dVar2.d[i5]);
            }
            dVar2.a.f();
            double[] dArr8 = dVar2.c;
            if (dArr8.length > 1) {
                i2 = 0;
                dVar2.f = w1.a(0, dArr8, dArr6);
            } else {
                i2 = 0;
                dVar2.f = null;
            }
            w1.a(i2, dArr, dArr2);
        }
    }

    public String toString() {
        String str = this.c;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        Iterator<p> it = this.f.iterator();
        while (it.hasNext()) {
            p next = it.next();
            StringBuilder Z0 = je.Z0(str, "[");
            Z0.append(next.a);
            Z0.append(" , ");
            Z0.append(decimalFormat.format((double) next.b));
            Z0.append("] ");
            str = Z0.toString();
        }
        return str;
    }
}

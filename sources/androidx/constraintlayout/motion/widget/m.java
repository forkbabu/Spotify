package androidx.constraintlayout.motion.widget;

import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.f;
import androidx.constraintlayout.motion.widget.q;
import androidx.constraintlayout.motion.widget.r;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.b;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class m {
    private int A = -1;
    View a;
    int b;
    private int c = -1;
    private o d = new o();
    private o e = new o();
    private l f = new l();
    private l g = new l();
    private w1[] h;
    private w1 i;
    float j = Float.NaN;
    float k = 0.0f;
    float l = 1.0f;
    private int[] m;
    private double[] n;
    private double[] o;
    private String[] p;
    private int[] q;
    private int r = 4;
    private float[] s = new float[4];
    private ArrayList<o> t = new ArrayList<>();
    private float[] u = new float[1];
    private ArrayList<b> v = new ArrayList<>();
    private HashMap<String, r> w;
    private HashMap<String, q> x;
    private HashMap<String, f> y;
    private k[] z;

    m(View view) {
        this.a = view;
        this.b = view.getId();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.LayoutParams) {
            String str = ((ConstraintLayout.LayoutParams) layoutParams).U;
        }
    }

    private float f(float f2, float[] fArr) {
        float f3 = 0.0f;
        float f4 = 1.0f;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f5 = this.l;
            if (((double) f5) != 1.0d) {
                float f6 = this.k;
                if (f2 < f6) {
                    f2 = 0.0f;
                }
                if (f2 > f6 && ((double) f2) < 1.0d) {
                    f2 = (f2 - f6) * f5;
                }
            }
        }
        x1 x1Var = this.d.a;
        float f7 = Float.NaN;
        Iterator<o> it = this.t.iterator();
        while (it.hasNext()) {
            o next = it.next();
            x1 x1Var2 = next.a;
            if (x1Var2 != null) {
                float f8 = next.c;
                if (f8 < f2) {
                    x1Var = x1Var2;
                    f3 = f8;
                } else if (Float.isNaN(f7)) {
                    f7 = next.c;
                }
            }
        }
        if (x1Var != null) {
            if (!Float.isNaN(f7)) {
                f4 = f7;
            }
            float f9 = f4 - f3;
            double d2 = (double) ((f2 - f3) / f9);
            f2 = (((float) x1Var.a(d2)) * f9) + f3;
            if (fArr != null) {
                fArr[0] = (float) x1Var.b(d2);
            }
        }
        return f2;
    }

    private void n(o oVar) {
        oVar.k((float) ((int) this.a.getX()), (float) ((int) this.a.getY()), (float) this.a.getWidth(), (float) this.a.getHeight());
    }

    /* access modifiers changed from: package-private */
    public void a(b bVar) {
        this.v.add(bVar);
    }

    /* access modifiers changed from: package-private */
    public void b(ArrayList<b> arrayList) {
        this.v.addAll(arrayList);
    }

    /* access modifiers changed from: package-private */
    public int c(float[] fArr, int[] iArr) {
        if (fArr == null) {
            return 0;
        }
        double[] h2 = this.h[0].h();
        if (iArr != null) {
            Iterator<o> it = this.t.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                iArr[i2] = it.next().u;
                i2++;
            }
        }
        int i3 = 0;
        for (double d2 : h2) {
            this.h[0].d(d2, this.n);
            this.d.i(this.m, this.n, fArr, i3);
            i3 += 2;
        }
        return i3 / 2;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0103  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void d(float[] r22, int r23) {
        /*
        // Method dump skipped, instructions count: 281
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.m.d(float[], int):void");
    }

    /* access modifiers changed from: package-private */
    public void e(float f2, float[] fArr, int i2) {
        this.h[0].d((double) f(f2, null), this.n);
        o oVar = this.d;
        int[] iArr = this.m;
        double[] dArr = this.n;
        float f3 = oVar.n;
        float f4 = oVar.o;
        float f5 = oVar.p;
        float f6 = oVar.q;
        for (int i3 = 0; i3 < iArr.length; i3++) {
            float f7 = (float) dArr[i3];
            int i4 = iArr[i3];
            if (i4 == 1) {
                f3 = f7;
            } else if (i4 == 2) {
                f4 = f7;
            } else if (i4 == 3) {
                f5 = f7;
            } else if (i4 == 4) {
                f6 = f7;
            }
        }
        float f8 = f5 + f3;
        float f9 = f6 + f4;
        Float.isNaN(Float.NaN);
        Float.isNaN(Float.NaN);
        float f10 = f3 + 0.0f;
        float f11 = f4 + 0.0f;
        float f12 = f8 + 0.0f;
        float f13 = f9 + 0.0f;
        int i5 = i2 + 1;
        fArr[i2] = f10;
        int i6 = i5 + 1;
        fArr[i5] = f11;
        int i7 = i6 + 1;
        fArr[i6] = f12;
        int i8 = i7 + 1;
        fArr[i7] = f11;
        int i9 = i8 + 1;
        fArr[i8] = f12;
        int i10 = i9 + 1;
        fArr[i9] = f13;
        fArr[i10] = f10;
        fArr[i10 + 1] = f13;
    }

    /* access modifiers changed from: package-private */
    public void g(float f2, float f3, float f4, float[] fArr) {
        double[] dArr;
        float f5 = f(f2, this.u);
        w1[] w1VarArr = this.h;
        int i2 = 0;
        if (w1VarArr != null) {
            double d2 = (double) f5;
            w1VarArr[0].g(d2, this.o);
            this.h[0].d(d2, this.n);
            float f6 = this.u[0];
            while (true) {
                dArr = this.o;
                if (i2 >= dArr.length) {
                    break;
                }
                double d3 = dArr[i2];
                double d4 = (double) f6;
                Double.isNaN(d4);
                dArr[i2] = d3 * d4;
                i2++;
            }
            w1 w1Var = this.i;
            if (w1Var != null) {
                double[] dArr2 = this.n;
                if (dArr2.length > 0) {
                    w1Var.d(d2, dArr2);
                    this.i.g(d2, this.o);
                    this.d.l(f3, f4, fArr, this.m, this.o, this.n);
                    return;
                }
                return;
            }
            this.d.l(f3, f4, fArr, this.m, dArr, this.n);
            return;
        }
        o oVar = this.e;
        float f7 = oVar.n;
        o oVar2 = this.d;
        float f8 = f7 - oVar2.n;
        float f9 = oVar.o - oVar2.o;
        fArr[0] = (((oVar.p - oVar2.p) + f8) * f3) + ((1.0f - f3) * f8);
        fArr[1] = (((oVar.q - oVar2.q) + f9) * f4) + ((1.0f - f4) * f9);
    }

    public int h() {
        int i2 = this.d.b;
        Iterator<o> it = this.t.iterator();
        while (it.hasNext()) {
            i2 = Math.max(i2, it.next().b);
        }
        return Math.max(i2, this.e.b);
    }

    /* access modifiers changed from: package-private */
    public float i() {
        return this.e.n;
    }

    /* access modifiers changed from: package-private */
    public float j() {
        return this.e.o;
    }

    /* access modifiers changed from: package-private */
    public o k(int i2) {
        return this.t.get(i2);
    }

    /* access modifiers changed from: package-private */
    public void l(float f2, int i2, int i3, float f3, float f4, float[] fArr) {
        float f5 = f(f2, this.u);
        HashMap<String, q> hashMap = this.x;
        f fVar = null;
        q qVar = hashMap == null ? null : hashMap.get("translationX");
        HashMap<String, q> hashMap2 = this.x;
        q qVar2 = hashMap2 == null ? null : hashMap2.get("translationY");
        HashMap<String, q> hashMap3 = this.x;
        q qVar3 = hashMap3 == null ? null : hashMap3.get("rotation");
        HashMap<String, q> hashMap4 = this.x;
        q qVar4 = hashMap4 == null ? null : hashMap4.get("scaleX");
        HashMap<String, q> hashMap5 = this.x;
        q qVar5 = hashMap5 == null ? null : hashMap5.get("scaleY");
        HashMap<String, f> hashMap6 = this.y;
        f fVar2 = hashMap6 == null ? null : hashMap6.get("translationX");
        HashMap<String, f> hashMap7 = this.y;
        f fVar3 = hashMap7 == null ? null : hashMap7.get("translationY");
        HashMap<String, f> hashMap8 = this.y;
        f fVar4 = hashMap8 == null ? null : hashMap8.get("rotation");
        HashMap<String, f> hashMap9 = this.y;
        f fVar5 = hashMap9 == null ? null : hashMap9.get("scaleX");
        HashMap<String, f> hashMap10 = this.y;
        if (hashMap10 != null) {
            fVar = hashMap10.get("scaleY");
        }
        c2 c2Var = new c2();
        c2Var.b();
        c2Var.d(qVar3, f5);
        c2Var.h(qVar, qVar2, f5);
        c2Var.f(qVar4, qVar5, f5);
        c2Var.c(fVar4, f5);
        c2Var.g(fVar2, fVar3, f5);
        c2Var.e(fVar5, fVar, f5);
        w1 w1Var = this.i;
        if (w1Var != null) {
            double[] dArr = this.n;
            if (dArr.length > 0) {
                double d2 = (double) f5;
                w1Var.d(d2, dArr);
                this.i.g(d2, this.o);
                this.d.l(f3, f4, fArr, this.m, this.o, this.n);
            }
            c2Var.a(f3, f4, i2, i3, fArr);
            return;
        }
        int i4 = 0;
        if (this.h != null) {
            double f6 = (double) f(f5, this.u);
            this.h[0].g(f6, this.o);
            this.h[0].d(f6, this.n);
            float f7 = this.u[0];
            while (true) {
                double[] dArr2 = this.o;
                if (i4 < dArr2.length) {
                    double d3 = dArr2[i4];
                    double d4 = (double) f7;
                    Double.isNaN(d4);
                    dArr2[i4] = d3 * d4;
                    i4++;
                } else {
                    this.d.l(f3, f4, fArr, this.m, dArr2, this.n);
                    c2Var.a(f3, f4, i2, i3, fArr);
                    return;
                }
            }
        } else {
            o oVar = this.e;
            float f8 = oVar.n;
            o oVar2 = this.d;
            float f9 = f8 - oVar2.n;
            float f10 = oVar.o - oVar2.o;
            fArr[0] = (((oVar.p - oVar2.p) + f9) * f3) + ((1.0f - f3) * f9);
            fArr[1] = (((oVar.q - oVar2.q) + f10) * f4) + ((1.0f - f4) * f10);
            c2Var.b();
            c2Var.d(qVar3, f5);
            c2Var.h(qVar, qVar2, f5);
            c2Var.f(qVar4, qVar5, f5);
            c2Var.c(fVar4, f5);
            c2Var.g(fVar2, fVar3, f5);
            c2Var.e(fVar5, fVar, f5);
            c2Var.a(f3, f4, i2, i3, fArr);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean m(View view, float f2, long j2, d dVar) {
        boolean z2;
        r.d dVar2;
        boolean z3;
        float f3;
        float f4;
        double d2;
        boolean z4;
        r.d dVar3;
        float f5 = f(f2, null);
        HashMap<String, q> hashMap = this.x;
        if (hashMap != null) {
            for (q qVar : hashMap.values()) {
                qVar.d(view, f5);
            }
        }
        HashMap<String, r> hashMap2 = this.w;
        if (hashMap2 != null) {
            dVar2 = null;
            z2 = false;
            for (r rVar : hashMap2.values()) {
                if (rVar instanceof r.d) {
                    dVar2 = (r.d) rVar;
                } else {
                    z2 |= rVar.d(view, f5, j2, dVar);
                }
            }
        } else {
            z2 = false;
            dVar2 = null;
        }
        w1[] w1VarArr = this.h;
        if (w1VarArr != null) {
            double d3 = (double) f5;
            w1VarArr[0].d(d3, this.n);
            this.h[0].g(d3, this.o);
            w1 w1Var = this.i;
            if (w1Var != null) {
                double[] dArr = this.n;
                if (dArr.length > 0) {
                    w1Var.d(d3, dArr);
                    this.i.g(d3, this.o);
                }
            }
            o oVar = this.d;
            int[] iArr = this.m;
            double[] dArr2 = this.n;
            double[] dArr3 = this.o;
            float f6 = oVar.n;
            float f7 = oVar.o;
            float f8 = oVar.p;
            float f9 = oVar.q;
            if (iArr.length != 0) {
                f4 = f6;
                if (oVar.v.length <= iArr[iArr.length - 1]) {
                    int i2 = iArr[iArr.length - 1] + 1;
                    oVar.v = new double[i2];
                    oVar.w = new double[i2];
                }
            } else {
                f4 = f6;
            }
            float f10 = f8;
            Arrays.fill(oVar.v, Double.NaN);
            for (int i3 = 0; i3 < iArr.length; i3++) {
                oVar.v[iArr[i3]] = dArr2[i3];
                oVar.w[iArr[i3]] = dArr3[i3];
            }
            int i4 = 0;
            float f11 = Float.NaN;
            float f12 = 0.0f;
            float f13 = 0.0f;
            float f14 = f7;
            float f15 = f9;
            float f16 = 0.0f;
            float f17 = 0.0f;
            float f18 = f4;
            while (true) {
                double[] dArr4 = oVar.v;
                if (i4 >= dArr4.length) {
                    break;
                }
                if (Double.isNaN(dArr4[i4])) {
                    dVar3 = dVar2;
                } else {
                    double d4 = 0.0d;
                    if (!Double.isNaN(oVar.v[i4])) {
                        d4 = oVar.v[i4] + 0.0d;
                    }
                    dVar3 = dVar2;
                    float f19 = (float) d4;
                    float f20 = (float) oVar.w[i4];
                    if (i4 == 1) {
                        f12 = f20;
                        f18 = f19;
                    } else if (i4 == 2) {
                        f16 = f20;
                        f14 = f19;
                    } else if (i4 == 3) {
                        f13 = f20;
                        f10 = f19;
                    } else if (i4 == 4) {
                        f17 = f20;
                        f15 = f19;
                    } else if (i4 == 5) {
                        f11 = f19;
                    }
                }
                i4++;
                dVar2 = dVar3;
                f5 = f5;
            }
            if (Float.isNaN(f11)) {
                if (!Float.isNaN(Float.NaN)) {
                    view.setRotation(Float.NaN);
                }
                d2 = d3;
            } else {
                float f21 = (f17 / 2.0f) + f16;
                double d5 = (double) (Float.isNaN(Float.NaN) ? 0.0f : Float.NaN);
                double d6 = (double) f11;
                d2 = d3;
                double degrees = Math.toDegrees(Math.atan2((double) f21, (double) ((f13 / 2.0f) + f12)));
                Double.isNaN(d6);
                Double.isNaN(d6);
                Double.isNaN(d5);
                Double.isNaN(d5);
                view.setRotation((float) (degrees + d6 + d5));
            }
            float f22 = f18 + 0.5f;
            int i5 = (int) f22;
            float f23 = f14 + 0.5f;
            int i6 = (int) f23;
            int i7 = (int) (f22 + f10);
            int i8 = (int) (f23 + f15);
            int i9 = i7 - i5;
            int i10 = i8 - i6;
            if ((i9 == view.getMeasuredWidth() && i10 == view.getMeasuredHeight()) ? false : true) {
                view.measure(View.MeasureSpec.makeMeasureSpec(i9, 1073741824), View.MeasureSpec.makeMeasureSpec(i10, 1073741824));
            }
            view.layout(i5, i6, i7, i8);
            HashMap<String, q> hashMap3 = this.x;
            if (hashMap3 != null) {
                for (q qVar2 : hashMap3.values()) {
                    if (qVar2 instanceof q.d) {
                        double[] dArr5 = this.o;
                        view.setRotation(((float) ((q.d) qVar2).a.c(d2, 0)) + ((float) Math.toDegrees(Math.atan2(dArr5[1], dArr5[0]))));
                    }
                }
            }
            if (dVar2 != null) {
                double[] dArr6 = this.o;
                view.setRotation(dVar2.b(f5, j2, view, dVar) + ((float) Math.toDegrees(Math.atan2(dArr6[1], dArr6[0]))));
                z4 = dVar2.h | z2;
            } else {
                z4 = z2;
            }
            int i11 = 1;
            while (true) {
                w1[] w1VarArr2 = this.h;
                if (i11 >= w1VarArr2.length) {
                    break;
                }
                w1VarArr2[i11].e(d2, this.s);
                this.d.t.get(this.p[i11 - 1]).h(view, this.s);
                i11++;
            }
            l lVar = this.f;
            if (lVar.b == 0) {
                if (f5 <= 0.0f) {
                    view.setVisibility(lVar.c);
                } else if (f5 >= 1.0f) {
                    view.setVisibility(this.g.c);
                } else if (this.g.c != lVar.c) {
                    view.setVisibility(0);
                }
            }
            if (this.z != null) {
                int i12 = 0;
                while (true) {
                    k[] kVarArr = this.z;
                    if (i12 >= kVarArr.length) {
                        break;
                    }
                    kVarArr[i12].q(f5, view);
                    i12++;
                }
            }
            f3 = f5;
            z3 = z4;
        } else {
            f3 = f5;
            o oVar2 = this.d;
            float f24 = oVar2.n;
            o oVar3 = this.e;
            float a2 = je.a(oVar3.n, f24, f3, f24);
            float f25 = oVar2.o;
            float a3 = je.a(oVar3.o, f25, f3, f25);
            float f26 = oVar2.p;
            float f27 = oVar3.p;
            float a4 = je.a(f27, f26, f3, f26);
            float f28 = oVar2.q;
            float f29 = oVar3.q;
            float f30 = a2 + 0.5f;
            int i13 = (int) f30;
            float f31 = a3 + 0.5f;
            int i14 = (int) f31;
            int i15 = (int) (f30 + a4);
            int a5 = (int) (f31 + je.a(f29, f28, f3, f28));
            int i16 = i15 - i13;
            int i17 = a5 - i14;
            if (!(f27 == f26 && f29 == f28)) {
                view.measure(View.MeasureSpec.makeMeasureSpec(i16, 1073741824), View.MeasureSpec.makeMeasureSpec(i17, 1073741824));
            }
            view.layout(i13, i14, i15, a5);
            z3 = z2;
        }
        HashMap<String, f> hashMap4 = this.y;
        if (hashMap4 != null) {
            for (f fVar : hashMap4.values()) {
                if (fVar instanceof f.C0021f) {
                    double[] dArr7 = this.o;
                    view.setRotation(((f.C0021f) fVar).a(f3) + ((float) Math.toDegrees(Math.atan2(dArr7[1], dArr7[0]))));
                } else {
                    fVar.e(view, f3);
                }
            }
        }
        return z3;
    }

    /* access modifiers changed from: package-private */
    public void o(ConstraintWidget constraintWidget, b bVar) {
        o oVar = this.e;
        oVar.c = 1.0f;
        oVar.f = 1.0f;
        n(oVar);
        this.e.k((float) constraintWidget.O(), (float) constraintWidget.P(), (float) constraintWidget.N(), (float) constraintWidget.w());
        this.e.d(bVar.u(this.b));
        this.g.k(constraintWidget, bVar, this.b);
    }

    public void p(int i2) {
        this.A = i2;
    }

    /* access modifiers changed from: package-private */
    public void q(View view) {
        o oVar = this.d;
        oVar.c = 0.0f;
        oVar.f = 0.0f;
        oVar.k(view.getX(), view.getY(), (float) view.getWidth(), (float) view.getHeight());
        this.f.i(view);
    }

    /* access modifiers changed from: package-private */
    public void r(ConstraintWidget constraintWidget, b bVar) {
        o oVar = this.d;
        oVar.c = 0.0f;
        oVar.f = 0.0f;
        n(oVar);
        this.d.k((float) constraintWidget.O(), (float) constraintWidget.P(), (float) constraintWidget.N(), (float) constraintWidget.w());
        b.a u2 = bVar.u(this.b);
        this.d.d(u2);
        this.j = u2.c.f;
        this.f.k(constraintWidget, bVar, this.b);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    public void s(int i2, int i3, long j2) {
        ArrayList arrayList;
        String str;
        HashSet<String> hashSet;
        HashSet<String> hashSet2;
        String str2;
        f fVar;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        Iterator<String> it;
        String str10;
        String str11;
        String str12;
        String str13;
        double d2;
        String str14;
        String str15;
        char c2;
        String str16;
        String str17;
        String str18;
        double[] dArr;
        double[][] dArr2;
        float[] fArr;
        String str19;
        HashSet<String> hashSet3;
        Iterator<String> it2;
        r rVar;
        char c3;
        ConstraintAttribute constraintAttribute;
        Iterator<String> it3;
        String str20;
        HashSet<String> hashSet4;
        HashSet<String> hashSet5;
        q qVar;
        char c4;
        ConstraintAttribute constraintAttribute2;
        new HashSet();
        HashSet<String> hashSet6 = new HashSet<>();
        HashSet<String> hashSet7 = new HashSet<>();
        HashSet<String> hashSet8 = new HashSet<>();
        HashMap<String, Integer> hashMap = new HashMap<>();
        int i4 = this.A;
        if (i4 != -1) {
            this.d.s = i4;
        }
        this.f.h(this.g, hashSet7);
        ArrayList<b> arrayList2 = this.v;
        if (arrayList2 != null) {
            Iterator<b> it4 = arrayList2.iterator();
            arrayList = null;
            while (it4.hasNext()) {
                b next = it4.next();
                if (next instanceof h) {
                    h hVar = (h) next;
                    o oVar = new o(i2, i3, hVar, this.d, this.e);
                    int binarySearch = Collections.binarySearch(this.t, oVar);
                    if (binarySearch == 0) {
                        StringBuilder V0 = je.V0(" KeyPath positon \"");
                        V0.append(oVar.f);
                        V0.append("\" outside of range");
                        Log.e("MotionController", V0.toString());
                    }
                    this.t.add((-binarySearch) - 1, oVar);
                    int i5 = hVar.e;
                    if (i5 != -1) {
                        this.c = i5;
                    }
                } else if (next instanceof e) {
                    next.b(hashSet8);
                } else if (next instanceof j) {
                    next.b(hashSet6);
                } else if (next instanceof k) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add((k) next);
                } else {
                    next.d(hashMap);
                    next.b(hashSet7);
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            this.z = (k[]) arrayList.toArray(new k[0]);
        }
        String str21 = "scaleY";
        String str22 = "scaleX";
        String str23 = "progress";
        String str24 = "translationZ";
        String str25 = "translationY";
        String str26 = "translationX";
        String str27 = "rotationY";
        String str28 = "rotationX";
        String str29 = "CUSTOM,";
        if (!hashSet7.isEmpty()) {
            this.x = new HashMap<>();
            Iterator<String> it5 = hashSet7.iterator();
            while (it5.hasNext()) {
                String next2 = it5.next();
                if (!next2.startsWith(str29)) {
                    hashSet4 = hashSet7;
                    hashSet5 = hashSet8;
                    it3 = it5;
                    str20 = str29;
                    switch (next2.hashCode()) {
                        case -1249320806:
                            if (next2.equals(str28)) {
                                c4 = 0;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case -1249320805:
                            if (next2.equals(str27)) {
                                c4 = 1;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case -1225497657:
                            if (next2.equals(str26)) {
                                c4 = 2;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case -1225497656:
                            if (next2.equals(str25)) {
                                c4 = 3;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case -1225497655:
                            if (next2.equals(str24)) {
                                c4 = 4;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case -1001078227:
                            if (next2.equals(str23)) {
                                c4 = 5;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case -908189618:
                            if (next2.equals(str22)) {
                                c4 = 6;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case -908189617:
                            if (next2.equals(str21)) {
                                c4 = 7;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case -797520672:
                            if (next2.equals("waveVariesBy")) {
                                c4 = '\b';
                                break;
                            }
                            c4 = 65535;
                            break;
                        case -760884510:
                            if (next2.equals("transformPivotX")) {
                                c4 = '\t';
                                break;
                            }
                            c4 = 65535;
                            break;
                        case -760884509:
                            if (next2.equals("transformPivotY")) {
                                c4 = '\n';
                                break;
                            }
                            c4 = 65535;
                            break;
                        case -40300674:
                            if (next2.equals("rotation")) {
                                c4 = 11;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case -4379043:
                            if (next2.equals("elevation")) {
                                c4 = '\f';
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 37232917:
                            if (next2.equals("transitionPathRotate")) {
                                c4 = '\r';
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 92909918:
                            if (next2.equals("alpha")) {
                                c4 = 14;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 156108012:
                            if (next2.equals("waveOffset")) {
                                c4 = 15;
                                break;
                            }
                            c4 = 65535;
                            break;
                        default:
                            c4 = 65535;
                            break;
                    }
                    switch (c4) {
                        case 0:
                            qVar = new q.i();
                            break;
                        case 1:
                            qVar = new q.j();
                            break;
                        case 2:
                            qVar = new q.m();
                            break;
                        case 3:
                            qVar = new q.n();
                            break;
                        case 4:
                            qVar = new q.o();
                            break;
                        case 5:
                            qVar = new q.g();
                            break;
                        case 6:
                            qVar = new q.k();
                            break;
                        case 7:
                            qVar = new q.l();
                            break;
                        case '\b':
                            qVar = new q.a();
                            break;
                        case '\t':
                            qVar = new q.e();
                            break;
                        case '\n':
                            qVar = new q.f();
                            break;
                        case 11:
                            qVar = new q.h();
                            break;
                        case '\f':
                            qVar = new q.c();
                            break;
                        case '\r':
                            qVar = new q.d();
                            break;
                        case 14:
                            qVar = new q.a();
                            break;
                        case 15:
                            qVar = new q.a();
                            break;
                        default:
                            qVar = null;
                            break;
                    }
                } else {
                    it3 = it5;
                    SparseArray sparseArray = new SparseArray();
                    hashSet5 = hashSet8;
                    String str30 = next2.split(",")[1];
                    hashSet4 = hashSet7;
                    for (Iterator<b> it6 = this.v.iterator(); it6.hasNext(); it6 = it6) {
                        b next3 = it6.next();
                        HashMap<String, ConstraintAttribute> hashMap2 = next3.d;
                        if (!(hashMap2 == null || (constraintAttribute2 = hashMap2.get(str30)) == null)) {
                            sparseArray.append(next3.a, constraintAttribute2);
                        }
                        str29 = str29;
                    }
                    str20 = str29;
                    qVar = new q.b(next2, sparseArray);
                }
                if (qVar != null) {
                    qVar.e(next2);
                    this.x.put(next2, qVar);
                }
                it5 = it3;
                hashSet8 = hashSet5;
                hashSet7 = hashSet4;
                str29 = str20;
            }
            hashSet = hashSet7;
            hashSet2 = hashSet8;
            str = str29;
            ArrayList<b> arrayList3 = this.v;
            if (arrayList3 != null) {
                Iterator<b> it7 = arrayList3.iterator();
                while (it7.hasNext()) {
                    b next4 = it7.next();
                    if (next4 instanceof c) {
                        next4.a(this.x);
                    }
                }
            }
            this.f.d(this.x, 0);
            this.g.d(this.x, 100);
            for (String str31 : this.x.keySet()) {
                this.x.get(str31).f(hashMap.containsKey(str31) ? hashMap.get(str31).intValue() : 0);
            }
        } else {
            hashSet = hashSet7;
            hashSet2 = hashSet8;
            str = str29;
        }
        if (!hashSet6.isEmpty()) {
            if (this.w == null) {
                this.w = new HashMap<>();
            }
            Iterator<String> it8 = hashSet6.iterator();
            while (it8.hasNext()) {
                String next5 = it8.next();
                if (!this.w.containsKey(next5)) {
                    if (!next5.startsWith(str)) {
                        it2 = it8;
                        switch (next5.hashCode()) {
                            case -1249320806:
                                if (next5.equals(str28)) {
                                    c3 = 0;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case -1249320805:
                                if (next5.equals(str27)) {
                                    c3 = 1;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case -1225497657:
                                if (next5.equals(str26)) {
                                    c3 = 2;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case -1225497656:
                                if (next5.equals(str25)) {
                                    c3 = 3;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case -1225497655:
                                if (next5.equals(str24)) {
                                    c3 = 4;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case -1001078227:
                                if (next5.equals(str23)) {
                                    c3 = 5;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case -908189618:
                                if (next5.equals(str22)) {
                                    c3 = 6;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case -908189617:
                                if (next5.equals(str21)) {
                                    c3 = 7;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case -40300674:
                                if (next5.equals("rotation")) {
                                    c3 = '\b';
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case -4379043:
                                if (next5.equals("elevation")) {
                                    c3 = '\t';
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 37232917:
                                if (next5.equals("transitionPathRotate")) {
                                    c3 = '\n';
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 92909918:
                                if (next5.equals("alpha")) {
                                    c3 = 11;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            default:
                                c3 = 65535;
                                break;
                        }
                        switch (c3) {
                            case 0:
                                rVar = new r.g();
                                rVar.i = j2;
                                break;
                            case 1:
                                rVar = new r.h();
                                rVar.i = j2;
                                break;
                            case 2:
                                rVar = new r.k();
                                rVar.i = j2;
                                break;
                            case 3:
                                rVar = new r.l();
                                rVar.i = j2;
                                break;
                            case 4:
                                rVar = new r.m();
                                rVar.i = j2;
                                break;
                            case 5:
                                rVar = new r.e();
                                rVar.i = j2;
                                break;
                            case 6:
                                rVar = new r.i();
                                rVar.i = j2;
                                break;
                            case 7:
                                rVar = new r.j();
                                rVar.i = j2;
                                break;
                            case '\b':
                                rVar = new r.f();
                                rVar.i = j2;
                                break;
                            case '\t':
                                rVar = new r.c();
                                rVar.i = j2;
                                break;
                            case '\n':
                                rVar = new r.d();
                                rVar.i = j2;
                                break;
                            case 11:
                                rVar = new r.a();
                                rVar.i = j2;
                                break;
                            default:
                                rVar = null;
                                break;
                        }
                    } else {
                        SparseArray sparseArray2 = new SparseArray();
                        String str32 = next5.split(",")[1];
                        for (Iterator<b> it9 = this.v.iterator(); it9.hasNext(); it9 = it9) {
                            b next6 = it9.next();
                            HashMap<String, ConstraintAttribute> hashMap3 = next6.d;
                            if (!(hashMap3 == null || (constraintAttribute = hashMap3.get(str32)) == null)) {
                                sparseArray2.append(next6.a, constraintAttribute);
                            }
                            it8 = it8;
                        }
                        it2 = it8;
                        rVar = new r.b(next5, sparseArray2);
                    }
                    if (rVar != null) {
                        rVar.e(next5);
                        this.w.put(next5, rVar);
                    }
                    it8 = it2;
                    str = str;
                }
            }
            str2 = str;
            ArrayList<b> arrayList4 = this.v;
            if (arrayList4 != null) {
                Iterator<b> it10 = arrayList4.iterator();
                while (it10.hasNext()) {
                    b next7 = it10.next();
                    if (next7 instanceof j) {
                        ((j) next7).K(this.w);
                    }
                }
            }
            for (String str33 : this.w.keySet()) {
                this.w.get(str33).f(hashMap.containsKey(str33) ? hashMap.get(str33).intValue() : 0);
            }
        } else {
            str2 = str;
        }
        int size = this.t.size() + 2;
        o[] oVarArr = new o[size];
        oVarArr[0] = this.d;
        oVarArr[size - 1] = this.e;
        if (this.t.size() > 0 && this.c == -1) {
            this.c = 0;
        }
        Iterator<o> it11 = this.t.iterator();
        int i6 = 1;
        while (it11.hasNext()) {
            oVarArr[i6] = it11.next();
            i6++;
        }
        HashSet hashSet9 = new HashSet();
        for (String str34 : this.e.t.keySet()) {
            if (this.d.t.containsKey(str34)) {
                str19 = str2;
                hashSet3 = hashSet;
                if (!hashSet3.contains(str2 + str34)) {
                    hashSet9.add(str34);
                }
            } else {
                str19 = str2;
                hashSet3 = hashSet;
            }
            hashSet = hashSet3;
            str2 = str19;
        }
        String[] strArr = (String[]) hashSet9.toArray(new String[0]);
        this.p = strArr;
        this.q = new int[strArr.length];
        int i7 = 0;
        while (true) {
            String[] strArr2 = this.p;
            if (i7 < strArr2.length) {
                String str35 = strArr2[i7];
                this.q[i7] = 0;
                int i8 = 0;
                while (true) {
                    if (i8 < size) {
                        if (oVarArr[i8].t.containsKey(str35)) {
                            int[] iArr = this.q;
                            iArr[i7] = oVarArr[i8].t.get(str35).e() + iArr[i7];
                        } else {
                            i8++;
                        }
                    }
                }
                i7++;
            } else {
                boolean z2 = oVarArr[0].s != -1;
                int length = strArr2.length + 18;
                boolean[] zArr = new boolean[length];
                int i9 = 1;
                while (i9 < size) {
                    oVarArr[i9].h(oVarArr[i9 - 1], zArr, z2);
                    i9++;
                    str28 = str28;
                }
                String str36 = str28;
                int i10 = 0;
                for (int i11 = 1; i11 < length; i11++) {
                    if (zArr[i11]) {
                        i10++;
                    }
                }
                int[] iArr2 = new int[i10];
                this.m = iArr2;
                this.n = new double[iArr2.length];
                this.o = new double[iArr2.length];
                int i12 = 0;
                for (int i13 = 1; i13 < length; i13++) {
                    if (zArr[i13]) {
                        this.m[i12] = i13;
                        i12++;
                    }
                }
                int[] iArr3 = new int[2];
                iArr3[1] = this.m.length;
                iArr3[0] = size;
                double[][] dArr3 = (double[][]) Array.newInstance(double.class, iArr3);
                double[] dArr4 = new double[size];
                int i14 = 0;
                while (i14 < size) {
                    o oVar2 = oVarArr[i14];
                    double[] dArr5 = dArr3[i14];
                    int[] iArr4 = this.m;
                    float[] fArr2 = {oVar2.f, oVar2.n, oVar2.o, oVar2.p, oVar2.q, oVar2.r};
                    int i15 = 0;
                    int i16 = 0;
                    while (i15 < iArr4.length) {
                        if (iArr4[i15] < 6) {
                            fArr = fArr2;
                            dArr5[i16] = (double) fArr2[iArr4[i15]];
                            i16++;
                        } else {
                            fArr = fArr2;
                        }
                        i15++;
                        fArr2 = fArr;
                        str25 = str25;
                    }
                    dArr4[i14] = (double) oVarArr[i14].c;
                    i14++;
                    str27 = str27;
                    str26 = str26;
                    str25 = str25;
                }
                String str37 = str25;
                String str38 = str26;
                String str39 = str27;
                int i17 = 0;
                while (true) {
                    int[] iArr5 = this.m;
                    if (i17 < iArr5.length) {
                        if (iArr5[i17] < o.x.length) {
                            String I0 = je.I0(new StringBuilder(), o.x[this.m[i17]], " [");
                            for (int i18 = 0; i18 < size; i18++) {
                                StringBuilder V02 = je.V0(I0);
                                V02.append(dArr3[i18][i17]);
                                I0 = V02.toString();
                            }
                        }
                        i17++;
                    } else {
                        this.h = new w1[(this.p.length + 1)];
                        int i19 = 0;
                        while (true) {
                            String[] strArr3 = this.p;
                            if (i19 < strArr3.length) {
                                String str40 = strArr3[i19];
                                int i20 = 0;
                                int i21 = 0;
                                double[] dArr6 = null;
                                double[][] dArr7 = null;
                                while (i20 < size) {
                                    if (oVarArr[i20].t.containsKey(str40)) {
                                        if (dArr7 == null) {
                                            dArr6 = new double[size];
                                            int[] iArr6 = new int[2];
                                            iArr6[1] = oVarArr[i20].t.get(str40).e();
                                            iArr6[0] = size;
                                            dArr7 = (double[][]) Array.newInstance(double.class, iArr6);
                                        }
                                        str17 = str23;
                                        str18 = str24;
                                        dArr6[i21] = (double) oVarArr[i20].c;
                                        o oVar3 = oVarArr[i20];
                                        double[] dArr8 = dArr7[i21];
                                        ConstraintAttribute constraintAttribute3 = oVar3.t.get(str40);
                                        str16 = str40;
                                        if (constraintAttribute3.e() == 1) {
                                            dArr = dArr6;
                                            dArr2 = dArr7;
                                            dArr8[0] = (double) constraintAttribute3.c();
                                        } else {
                                            dArr = dArr6;
                                            dArr2 = dArr7;
                                            int e2 = constraintAttribute3.e();
                                            float[] fArr3 = new float[e2];
                                            constraintAttribute3.d(fArr3);
                                            int i22 = 0;
                                            int i23 = 0;
                                            while (i22 < e2) {
                                                dArr8[i23] = (double) fArr3[i22];
                                                i22++;
                                                i23++;
                                                dArr2 = dArr2;
                                                e2 = e2;
                                                fArr3 = fArr3;
                                            }
                                        }
                                        i21++;
                                        dArr6 = dArr;
                                        dArr7 = dArr2;
                                    } else {
                                        str17 = str23;
                                        str18 = str24;
                                        str16 = str40;
                                    }
                                    i20++;
                                    str23 = str17;
                                    str40 = str16;
                                    str24 = str18;
                                }
                                i19++;
                                this.h[i19] = w1.a(this.c, Arrays.copyOf(dArr6, i21), (double[][]) Arrays.copyOf(dArr7, i21));
                                str23 = str23;
                                str24 = str24;
                            } else {
                                String str41 = str23;
                                String str42 = str24;
                                this.h[0] = w1.a(this.c, dArr4, dArr3);
                                if (oVarArr[0].s != -1) {
                                    int[] iArr7 = new int[size];
                                    double[] dArr9 = new double[size];
                                    int[] iArr8 = new int[2];
                                    iArr8[1] = 2;
                                    iArr8[0] = size;
                                    double[][] dArr10 = (double[][]) Array.newInstance(double.class, iArr8);
                                    for (int i24 = 0; i24 < size; i24++) {
                                        iArr7[i24] = oVarArr[i24].s;
                                        dArr9[i24] = (double) oVarArr[i24].c;
                                        dArr10[i24][0] = (double) oVarArr[i24].n;
                                        dArr10[i24][1] = (double) oVarArr[i24].o;
                                    }
                                    this.i = w1.b(iArr7, dArr9, dArr10);
                                }
                                float f2 = Float.NaN;
                                this.y = new HashMap<>();
                                if (this.v != null) {
                                    Iterator<String> it12 = hashSet2.iterator();
                                    while (it12.hasNext()) {
                                        String next8 = it12.next();
                                        if (!next8.startsWith("CUSTOM")) {
                                            switch (next8.hashCode()) {
                                                case -1249320806:
                                                    str8 = str41;
                                                    str3 = str36;
                                                    str7 = str42;
                                                    str4 = str39;
                                                    str5 = str38;
                                                    str6 = str37;
                                                    if (next8.equals(str3)) {
                                                        c2 = 0;
                                                        break;
                                                    }
                                                    c2 = 65535;
                                                    break;
                                                case -1249320805:
                                                    str8 = str41;
                                                    str7 = str42;
                                                    str4 = str39;
                                                    str5 = str38;
                                                    str6 = str37;
                                                    if (next8.equals(str4)) {
                                                        str3 = str36;
                                                        c2 = 1;
                                                        break;
                                                    }
                                                    str3 = str36;
                                                    c2 = 65535;
                                                    break;
                                                case -1225497657:
                                                    str8 = str41;
                                                    str7 = str42;
                                                    str5 = str38;
                                                    str6 = str37;
                                                    if (!next8.equals(str5)) {
                                                        str4 = str39;
                                                        str3 = str36;
                                                        c2 = 65535;
                                                        break;
                                                    } else {
                                                        str3 = str36;
                                                        str4 = str39;
                                                        c2 = 2;
                                                        break;
                                                    }
                                                case -1225497656:
                                                    str8 = str41;
                                                    str7 = str42;
                                                    str6 = str37;
                                                    if (!next8.equals(str6)) {
                                                        str3 = str36;
                                                        str4 = str39;
                                                        str5 = str38;
                                                        c2 = 65535;
                                                        break;
                                                    } else {
                                                        str3 = str36;
                                                        str4 = str39;
                                                        str5 = str38;
                                                        c2 = 3;
                                                        break;
                                                    }
                                                case -1225497655:
                                                    str8 = str41;
                                                    str7 = str42;
                                                    if (!next8.equals(str7)) {
                                                        str3 = str36;
                                                        str4 = str39;
                                                        str5 = str38;
                                                        str6 = str37;
                                                        c2 = 65535;
                                                        break;
                                                    } else {
                                                        str3 = str36;
                                                        str4 = str39;
                                                        str5 = str38;
                                                        str6 = str37;
                                                        c2 = 4;
                                                        break;
                                                    }
                                                case -1001078227:
                                                    str8 = str41;
                                                    if (next8.equals(str8)) {
                                                        str3 = str36;
                                                        str7 = str42;
                                                        str4 = str39;
                                                        str5 = str38;
                                                        str6 = str37;
                                                        c2 = 5;
                                                        break;
                                                    }
                                                    str3 = str36;
                                                    str7 = str42;
                                                    str4 = str39;
                                                    str5 = str38;
                                                    str6 = str37;
                                                    c2 = 65535;
                                                    break;
                                                case -908189618:
                                                    if (next8.equals(str22)) {
                                                        str8 = str41;
                                                        str3 = str36;
                                                        str7 = str42;
                                                        str4 = str39;
                                                        str5 = str38;
                                                        str6 = str37;
                                                        c2 = 6;
                                                        break;
                                                    }
                                                    str8 = str41;
                                                    str3 = str36;
                                                    str7 = str42;
                                                    str4 = str39;
                                                    str5 = str38;
                                                    str6 = str37;
                                                    c2 = 65535;
                                                    break;
                                                case -908189617:
                                                    if (next8.equals(str21)) {
                                                        str8 = str41;
                                                        str3 = str36;
                                                        str7 = str42;
                                                        str4 = str39;
                                                        str5 = str38;
                                                        str6 = str37;
                                                        c2 = 7;
                                                        break;
                                                    }
                                                    str8 = str41;
                                                    str3 = str36;
                                                    str7 = str42;
                                                    str4 = str39;
                                                    str5 = str38;
                                                    str6 = str37;
                                                    c2 = 65535;
                                                    break;
                                                case -797520672:
                                                    if (next8.equals("waveVariesBy")) {
                                                        str8 = str41;
                                                        str3 = str36;
                                                        str7 = str42;
                                                        str4 = str39;
                                                        str5 = str38;
                                                        str6 = str37;
                                                        c2 = '\b';
                                                        break;
                                                    }
                                                    str8 = str41;
                                                    str3 = str36;
                                                    str7 = str42;
                                                    str4 = str39;
                                                    str5 = str38;
                                                    str6 = str37;
                                                    c2 = 65535;
                                                    break;
                                                case -40300674:
                                                    if (next8.equals("rotation")) {
                                                        str8 = str41;
                                                        str3 = str36;
                                                        str7 = str42;
                                                        str4 = str39;
                                                        str5 = str38;
                                                        str6 = str37;
                                                        c2 = '\t';
                                                        break;
                                                    }
                                                    str8 = str41;
                                                    str3 = str36;
                                                    str7 = str42;
                                                    str4 = str39;
                                                    str5 = str38;
                                                    str6 = str37;
                                                    c2 = 65535;
                                                    break;
                                                case -4379043:
                                                    if (next8.equals("elevation")) {
                                                        str8 = str41;
                                                        str3 = str36;
                                                        str7 = str42;
                                                        str4 = str39;
                                                        str5 = str38;
                                                        str6 = str37;
                                                        c2 = '\n';
                                                        break;
                                                    }
                                                    str8 = str41;
                                                    str3 = str36;
                                                    str7 = str42;
                                                    str4 = str39;
                                                    str5 = str38;
                                                    str6 = str37;
                                                    c2 = 65535;
                                                    break;
                                                case 37232917:
                                                    if (next8.equals("transitionPathRotate")) {
                                                        str8 = str41;
                                                        str3 = str36;
                                                        str7 = str42;
                                                        str4 = str39;
                                                        str5 = str38;
                                                        str6 = str37;
                                                        c2 = 11;
                                                        break;
                                                    }
                                                    str8 = str41;
                                                    str3 = str36;
                                                    str7 = str42;
                                                    str4 = str39;
                                                    str5 = str38;
                                                    str6 = str37;
                                                    c2 = 65535;
                                                    break;
                                                case 92909918:
                                                    if (next8.equals("alpha")) {
                                                        str8 = str41;
                                                        str3 = str36;
                                                        str7 = str42;
                                                        str4 = str39;
                                                        str5 = str38;
                                                        str6 = str37;
                                                        c2 = '\f';
                                                        break;
                                                    }
                                                    str8 = str41;
                                                    str3 = str36;
                                                    str7 = str42;
                                                    str4 = str39;
                                                    str5 = str38;
                                                    str6 = str37;
                                                    c2 = 65535;
                                                    break;
                                                case 156108012:
                                                    if (next8.equals("waveOffset")) {
                                                        str8 = str41;
                                                        str3 = str36;
                                                        str7 = str42;
                                                        str4 = str39;
                                                        str5 = str38;
                                                        str6 = str37;
                                                        c2 = '\r';
                                                        break;
                                                    }
                                                    str8 = str41;
                                                    str3 = str36;
                                                    str7 = str42;
                                                    str4 = str39;
                                                    str5 = str38;
                                                    str6 = str37;
                                                    c2 = 65535;
                                                    break;
                                                default:
                                                    str8 = str41;
                                                    str3 = str36;
                                                    str7 = str42;
                                                    str4 = str39;
                                                    str5 = str38;
                                                    str6 = str37;
                                                    c2 = 65535;
                                                    break;
                                            }
                                            switch (c2) {
                                                case 0:
                                                    fVar = new f.i();
                                                    break;
                                                case 1:
                                                    fVar = new f.j();
                                                    break;
                                                case 2:
                                                    fVar = new f.m();
                                                    break;
                                                case 3:
                                                    fVar = new f.n();
                                                    break;
                                                case 4:
                                                    fVar = new f.o();
                                                    break;
                                                case 5:
                                                    fVar = new f.g();
                                                    break;
                                                case 6:
                                                    fVar = new f.k();
                                                    break;
                                                case 7:
                                                    fVar = new f.l();
                                                    break;
                                                case '\b':
                                                    fVar = new f.b();
                                                    break;
                                                case '\t':
                                                    fVar = new f.h();
                                                    break;
                                                case '\n':
                                                    fVar = new f.e();
                                                    break;
                                                case 11:
                                                    fVar = new f.C0021f();
                                                    break;
                                                case '\f':
                                                    fVar = new f.b();
                                                    break;
                                                case '\r':
                                                    fVar = new f.b();
                                                    break;
                                                default:
                                                    fVar = null;
                                                    break;
                                            }
                                        } else {
                                            str3 = str36;
                                            fVar = new f.c();
                                            str7 = str42;
                                            str4 = str39;
                                            str5 = str38;
                                            str6 = str37;
                                            str8 = str41;
                                        }
                                        if (fVar == null) {
                                            str41 = str8;
                                            str42 = str7;
                                            str37 = str6;
                                            str38 = str5;
                                            str39 = str4;
                                            str36 = str3;
                                        } else {
                                            if (!(fVar.e == 1) || !Float.isNaN(f2)) {
                                                it = it12;
                                                str12 = str8;
                                                str11 = str7;
                                                str9 = str21;
                                                str10 = str22;
                                                str37 = str6;
                                                str13 = str5;
                                            } else {
                                                float[] fArr4 = new float[2];
                                                float f3 = 1.0f / ((float) 99);
                                                double d3 = 0.0d;
                                                float f4 = 0.0f;
                                                it = it12;
                                                str12 = str8;
                                                double d4 = 0.0d;
                                                int i25 = 0;
                                                while (i25 < 100) {
                                                    float f5 = ((float) i25) * f3;
                                                    double d5 = (double) f5;
                                                    x1 x1Var = this.d.a;
                                                    Iterator<o> it13 = this.t.iterator();
                                                    float f6 = Float.NaN;
                                                    float f7 = 0.0f;
                                                    while (it13.hasNext()) {
                                                        o next9 = it13.next();
                                                        x1 x1Var2 = next9.a;
                                                        if (x1Var2 != null) {
                                                            float f8 = next9.c;
                                                            if (f8 < f5) {
                                                                x1Var = x1Var2;
                                                                f7 = f8;
                                                            } else if (Float.isNaN(f6)) {
                                                                f6 = next9.c;
                                                            }
                                                        }
                                                        it13 = it13;
                                                        str22 = str22;
                                                    }
                                                    if (x1Var != null) {
                                                        if (Float.isNaN(f6)) {
                                                            f6 = 1.0f;
                                                        }
                                                        float f9 = f6 - f7;
                                                        d2 = (double) ((((float) x1Var.a((double) ((f5 - f7) / f9))) * f9) + f7);
                                                    } else {
                                                        d2 = d5;
                                                    }
                                                    this.h[0].d(d2, this.n);
                                                    this.d.i(this.m, this.n, fArr4, 0);
                                                    if (i25 > 0) {
                                                        double d6 = (double) f4;
                                                        double d7 = (double) fArr4[1];
                                                        Double.isNaN(d7);
                                                        Double.isNaN(d7);
                                                        double d8 = d3 - d7;
                                                        str14 = str6;
                                                        str15 = str5;
                                                        double d9 = (double) fArr4[0];
                                                        Double.isNaN(d9);
                                                        Double.isNaN(d9);
                                                        double hypot = Math.hypot(d8, d4 - d9);
                                                        Double.isNaN(d6);
                                                        Double.isNaN(d6);
                                                        f4 = (float) (hypot + d6);
                                                    } else {
                                                        str14 = str6;
                                                        str15 = str5;
                                                    }
                                                    i25++;
                                                    d4 = (double) fArr4[0];
                                                    str5 = str15;
                                                    str7 = str7;
                                                    str6 = str14;
                                                    d3 = (double) fArr4[1];
                                                    str22 = str22;
                                                    str21 = str21;
                                                }
                                                str11 = str7;
                                                str9 = str21;
                                                str10 = str22;
                                                str37 = str6;
                                                str13 = str5;
                                                f2 = f4;
                                            }
                                            fVar.f(next8);
                                            this.y.put(next8, fVar);
                                            it12 = it;
                                            str21 = str9;
                                            str36 = str3;
                                            str41 = str12;
                                            str42 = str11;
                                            str22 = str10;
                                            str39 = str4;
                                            str38 = str13;
                                        }
                                    }
                                    Iterator<b> it14 = this.v.iterator();
                                    while (it14.hasNext()) {
                                        b next10 = it14.next();
                                        if (next10 instanceof e) {
                                            ((e) next10).M(this.y);
                                        }
                                    }
                                    for (f fVar2 : this.y.values()) {
                                        fVar2.g(f2);
                                    }
                                    return;
                                }
                                return;
                            }
                        }
                    }
                }
            }
        }
    }

    public String toString() {
        StringBuilder V0 = je.V0(" start: x: ");
        V0.append(this.d.n);
        V0.append(" y: ");
        V0.append(this.d.o);
        V0.append(" end: x: ");
        V0.append(this.e.n);
        V0.append(" y: ");
        V0.append(this.e.o);
        return V0.toString();
    }
}

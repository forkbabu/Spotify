package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.d;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import java.util.ArrayList;
import java.util.HashMap;

public class e extends j {
    private int U0 = -1;
    private int V0 = -1;
    private int W0 = -1;
    private int X0 = -1;
    private int Y0 = -1;
    private int Z0 = -1;
    private float a1 = 0.5f;
    private float b1 = 0.5f;
    private float c1 = 0.5f;
    private float d1 = 0.5f;
    private float e1 = 0.5f;
    private float f1 = 0.5f;
    private int g1 = 0;
    private int h1 = 0;
    private int i1 = 2;
    private int j1 = 2;
    private int k1 = 0;
    private int l1 = -1;
    private int m1 = 0;
    private ArrayList<a> n1 = new ArrayList<>();
    private ConstraintWidget[] o1 = null;
    private ConstraintWidget[] p1 = null;
    private int[] q1 = null;
    private ConstraintWidget[] r1;
    private int s1 = 0;

    private class a {
        private int a = 0;
        private ConstraintWidget b = null;
        int c = 0;
        private ConstraintAnchor d;
        private ConstraintAnchor e;
        private ConstraintAnchor f;
        private ConstraintAnchor g;
        private int h = 0;
        private int i = 0;
        private int j = 0;
        private int k = 0;
        private int l = 0;
        private int m = 0;
        private int n = 0;
        private int o = 0;
        private int p = 0;
        private int q = 0;

        public a(int i2, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, ConstraintAnchor constraintAnchor3, ConstraintAnchor constraintAnchor4, int i3) {
            this.a = i2;
            this.d = constraintAnchor;
            this.e = constraintAnchor2;
            this.f = constraintAnchor3;
            this.g = constraintAnchor4;
            this.h = e.this.R0();
            this.i = e.this.T0();
            this.j = e.this.S0();
            this.k = e.this.Q0();
            this.q = i3;
        }

        public void b(ConstraintWidget constraintWidget) {
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
            int i2 = 0;
            if (this.a == 0) {
                int B1 = e.this.B1(constraintWidget, this.q);
                if (constraintWidget.z() == dimensionBehaviour) {
                    this.p++;
                    B1 = 0;
                }
                int i3 = e.this.g1;
                if (constraintWidget.M() != 8) {
                    i2 = i3;
                }
                this.l = B1 + i2 + this.l;
                int A1 = e.this.A1(constraintWidget, this.q);
                if (this.b == null || this.c < A1) {
                    this.b = constraintWidget;
                    this.c = A1;
                    this.m = A1;
                }
            } else {
                int B12 = e.this.B1(constraintWidget, this.q);
                int A12 = e.this.A1(constraintWidget, this.q);
                if (constraintWidget.L() == dimensionBehaviour) {
                    this.p++;
                    A12 = 0;
                }
                int i4 = e.this.h1;
                if (constraintWidget.M() != 8) {
                    i2 = i4;
                }
                this.m = A12 + i2 + this.m;
                if (this.b == null || this.c < B12) {
                    this.b = constraintWidget;
                    this.c = B12;
                    this.l = B12;
                }
            }
            this.o++;
        }

        public void c() {
            this.c = 0;
            this.b = null;
            this.l = 0;
            this.m = 0;
            this.n = 0;
            this.o = 0;
            this.p = 0;
        }

        /* JADX WARNING: Removed duplicated region for block: B:55:0x00de  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void d(boolean r17, int r18, boolean r19) {
            /*
            // Method dump skipped, instructions count: 855
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.e.a.d(boolean, int, boolean):void");
        }

        public int e() {
            if (this.a == 1) {
                return this.m - e.this.h1;
            }
            return this.m;
        }

        public int f() {
            if (this.a == 0) {
                return this.l - e.this.g1;
            }
            return this.l;
        }

        public void g(int i2) {
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.FIXED;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
            int i3 = this.p;
            if (i3 != 0) {
                int i4 = this.o;
                int i5 = i2 / i3;
                int i6 = 0;
                while (i6 < i4 && this.n + i6 < e.this.s1) {
                    ConstraintWidget constraintWidget = e.this.r1[this.n + i6];
                    if (this.a == 0) {
                        if (constraintWidget != null && constraintWidget.z() == dimensionBehaviour2 && constraintWidget.l == 0) {
                            e.this.V0(constraintWidget, dimensionBehaviour, i5, constraintWidget.L(), constraintWidget.w());
                        }
                    } else if (constraintWidget != null && constraintWidget.L() == dimensionBehaviour2 && constraintWidget.m == 0) {
                        e.this.V0(constraintWidget, constraintWidget.z(), constraintWidget.N(), dimensionBehaviour, i5);
                    }
                    i6++;
                }
                this.l = 0;
                this.m = 0;
                this.b = null;
                this.c = 0;
                int i7 = this.o;
                int i8 = 0;
                while (i8 < i7 && this.n + i8 < e.this.s1) {
                    ConstraintWidget constraintWidget2 = e.this.r1[this.n + i8];
                    if (this.a == 0) {
                        int N = constraintWidget2.N();
                        int i9 = e.this.g1;
                        if (constraintWidget2.M() == 8) {
                            i9 = 0;
                        }
                        this.l = N + i9 + this.l;
                        int A1 = e.this.A1(constraintWidget2, this.q);
                        if (this.b == null || this.c < A1) {
                            this.b = constraintWidget2;
                            this.c = A1;
                            this.m = A1;
                        }
                    } else {
                        int B1 = e.this.B1(constraintWidget2, this.q);
                        int A12 = e.this.A1(constraintWidget2, this.q);
                        int i10 = e.this.h1;
                        if (constraintWidget2.M() == 8) {
                            i10 = 0;
                        }
                        this.m = A12 + i10 + this.m;
                        if (this.b == null || this.c < B1) {
                            this.b = constraintWidget2;
                            this.c = B1;
                            this.l = B1;
                        }
                    }
                    i8++;
                }
            }
        }

        public void h(int i2) {
            this.n = i2;
        }

        public void i(int i2, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, ConstraintAnchor constraintAnchor3, ConstraintAnchor constraintAnchor4, int i3, int i4, int i5, int i6, int i7) {
            this.a = i2;
            this.d = constraintAnchor;
            this.e = constraintAnchor2;
            this.f = constraintAnchor3;
            this.g = constraintAnchor4;
            this.h = i3;
            this.i = i4;
            this.j = i5;
            this.k = i6;
            this.q = i7;
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final int A1(ConstraintWidget constraintWidget, int i) {
        if (constraintWidget == null) {
            return 0;
        }
        if (constraintWidget.L() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            int i2 = constraintWidget.m;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (constraintWidget.t * ((float) i));
                if (i3 != constraintWidget.w()) {
                    constraintWidget.y0(true);
                    V0(constraintWidget, constraintWidget.z(), constraintWidget.N(), ConstraintWidget.DimensionBehaviour.FIXED, i3);
                }
                return i3;
            } else if (i2 == 1) {
                return constraintWidget.w();
            } else {
                if (i2 == 3) {
                    return (int) ((((float) constraintWidget.N()) * constraintWidget.U) + 0.5f);
                }
            }
        }
        return constraintWidget.w();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final int B1(ConstraintWidget constraintWidget, int i) {
        if (constraintWidget == null) {
            return 0;
        }
        if (constraintWidget.z() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            int i2 = constraintWidget.l;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (constraintWidget.q * ((float) i));
                if (i3 != constraintWidget.N()) {
                    constraintWidget.y0(true);
                    V0(constraintWidget, ConstraintWidget.DimensionBehaviour.FIXED, i3, constraintWidget.L(), constraintWidget.w());
                }
                return i3;
            } else if (i2 == 1) {
                return constraintWidget.N();
            } else {
                if (i2 == 3) {
                    return (int) ((((float) constraintWidget.w()) * constraintWidget.U) + 0.5f);
                }
            }
        }
        return constraintWidget.N();
    }

    public void C1(float f) {
        this.c1 = f;
    }

    public void D1(int i) {
        this.W0 = i;
    }

    public void E1(float f) {
        this.d1 = f;
    }

    public void F1(int i) {
        this.X0 = i;
    }

    public void G1(int i) {
        this.i1 = i;
    }

    public void H1(float f) {
        this.a1 = f;
    }

    public void I1(int i) {
        this.g1 = i;
    }

    public void J1(int i) {
        this.U0 = i;
    }

    public void K1(float f) {
        this.e1 = f;
    }

    public void L1(int i) {
        this.Y0 = i;
    }

    public void M1(float f) {
        this.f1 = f;
    }

    public void N1(int i) {
        this.Z0 = i;
    }

    public void O1(int i) {
        this.l1 = i;
    }

    public void P1(int i) {
        this.m1 = i;
    }

    public void Q1(int i) {
        this.j1 = i;
    }

    public void R1(float f) {
        this.b1 = f;
    }

    public void S1(int i) {
        this.h1 = i;
    }

    public void T1(int i) {
        this.V0 = i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:115:0x017a  */
    /* JADX WARNING: Removed duplicated region for block: B:290:0x0536  */
    /* JADX WARNING: Removed duplicated region for block: B:291:0x053c  */
    /* JADX WARNING: Removed duplicated region for block: B:297:0x0551  */
    /* JADX WARNING: Removed duplicated region for block: B:298:0x0554  */
    /* JADX WARNING: Removed duplicated region for block: B:305:0x056f  */
    /* JADX WARNING: Removed duplicated region for block: B:306:0x0571  */
    @Override // androidx.constraintlayout.solver.widgets.j
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void U0(int r35, int r36, int r37, int r38) {
        /*
        // Method dump skipped, instructions count: 1398
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.e.U0(int, int, int, int):void");
    }

    public void U1(int i) {
        this.k1 = i;
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    public void f(d dVar, boolean z) {
        ConstraintWidget constraintWidget;
        super.f(dVar, z);
        ConstraintWidget constraintWidget2 = this.R;
        boolean W02 = constraintWidget2 != null ? ((d) constraintWidget2).W0() : false;
        int i = this.k1;
        if (i != 0) {
            if (i == 1) {
                int size = this.n1.size();
                int i2 = 0;
                while (i2 < size) {
                    this.n1.get(i2).d(W02, i2, i2 == size + -1);
                    i2++;
                }
            } else if (!(i != 2 || this.q1 == null || this.p1 == null || this.o1 == null)) {
                for (int i3 = 0; i3 < this.s1; i3++) {
                    this.r1[i3].b0();
                }
                int[] iArr = this.q1;
                int i4 = iArr[0];
                int i5 = iArr[1];
                ConstraintWidget constraintWidget3 = null;
                for (int i6 = 0; i6 < i4; i6++) {
                    ConstraintWidget constraintWidget4 = this.p1[W02 ? (i4 - i6) - 1 : i6];
                    if (!(constraintWidget4 == null || constraintWidget4.M() == 8)) {
                        if (i6 == 0) {
                            constraintWidget4.j(constraintWidget4.F, this.F, R0());
                            constraintWidget4.w0 = this.U0;
                            constraintWidget4.f0 = this.a1;
                        }
                        if (i6 == i4 - 1) {
                            constraintWidget4.j(constraintWidget4.H, this.H, S0());
                        }
                        if (i6 > 0) {
                            constraintWidget4.j(constraintWidget4.F, constraintWidget3.H, this.g1);
                            constraintWidget3.j(constraintWidget3.H, constraintWidget4.F, 0);
                        }
                        constraintWidget3 = constraintWidget4;
                    }
                }
                for (int i7 = 0; i7 < i5; i7++) {
                    ConstraintWidget constraintWidget5 = this.o1[i7];
                    if (!(constraintWidget5 == null || constraintWidget5.M() == 8)) {
                        if (i7 == 0) {
                            constraintWidget5.j(constraintWidget5.G, this.G, T0());
                            constraintWidget5.x0 = this.V0;
                            constraintWidget5.g0 = this.b1;
                        }
                        if (i7 == i5 - 1) {
                            constraintWidget5.j(constraintWidget5.I, this.I, Q0());
                        }
                        if (i7 > 0) {
                            constraintWidget5.j(constraintWidget5.G, constraintWidget3.I, this.h1);
                            constraintWidget3.j(constraintWidget3.I, constraintWidget5.G, 0);
                        }
                        constraintWidget3 = constraintWidget5;
                    }
                }
                for (int i8 = 0; i8 < i4; i8++) {
                    for (int i9 = 0; i9 < i5; i9++) {
                        int i10 = (i9 * i4) + i8;
                        if (this.m1 == 1) {
                            i10 = (i8 * i5) + i9;
                        }
                        ConstraintWidget[] constraintWidgetArr = this.r1;
                        if (!(i10 >= constraintWidgetArr.length || (constraintWidget = constraintWidgetArr[i10]) == null || constraintWidget.M() == 8)) {
                            ConstraintWidget constraintWidget6 = this.p1[i8];
                            ConstraintWidget constraintWidget7 = this.o1[i9];
                            if (constraintWidget != constraintWidget6) {
                                constraintWidget.j(constraintWidget.F, constraintWidget6.F, 0);
                                constraintWidget.j(constraintWidget.H, constraintWidget6.H, 0);
                            }
                            if (constraintWidget != constraintWidget7) {
                                constraintWidget.j(constraintWidget.G, constraintWidget7.G, 0);
                                constraintWidget.j(constraintWidget.I, constraintWidget7.I, 0);
                            }
                        }
                    }
                }
            }
        } else if (this.n1.size() > 0) {
            this.n1.get(0).d(W02, 0, true);
        }
        X0(false);
    }

    @Override // androidx.constraintlayout.solver.widgets.h, androidx.constraintlayout.solver.widgets.ConstraintWidget
    public void l(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> hashMap) {
        super.l(constraintWidget, hashMap);
        e eVar = (e) constraintWidget;
        this.U0 = eVar.U0;
        this.V0 = eVar.V0;
        this.W0 = eVar.W0;
        this.X0 = eVar.X0;
        this.Y0 = eVar.Y0;
        this.Z0 = eVar.Z0;
        this.a1 = eVar.a1;
        this.b1 = eVar.b1;
        this.c1 = eVar.c1;
        this.d1 = eVar.d1;
        this.e1 = eVar.e1;
        this.f1 = eVar.f1;
        this.g1 = eVar.g1;
        this.h1 = eVar.h1;
        this.i1 = eVar.i1;
        this.j1 = eVar.j1;
        this.k1 = eVar.k1;
        this.l1 = eVar.l1;
        this.m1 = eVar.m1;
    }
}

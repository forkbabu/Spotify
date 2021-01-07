package androidx.constraintlayout.solver.widgets.analyzer;

import androidx.constraintlayout.solver.widgets.ConstraintAnchor;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.a;
import androidx.constraintlayout.solver.widgets.analyzer.b;
import androidx.constraintlayout.solver.widgets.d;
import androidx.constraintlayout.solver.widgets.f;
import java.util.ArrayList;
import java.util.Iterator;

public class g {
    private static b.a a = new b.a();

    private static boolean a(ConstraintWidget constraintWidget) {
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.FIXED;
        ConstraintWidget.DimensionBehaviour z = constraintWidget.z();
        ConstraintWidget.DimensionBehaviour L = constraintWidget.L();
        ConstraintWidget constraintWidget2 = constraintWidget.R;
        d dVar = constraintWidget2 != null ? (d) constraintWidget2 : null;
        if (dVar != null) {
            dVar.z();
        }
        if (dVar != null) {
            dVar.L();
        }
        boolean z2 = z == dimensionBehaviour3 || z == dimensionBehaviour2 || (z == dimensionBehaviour && constraintWidget.l == 0 && constraintWidget.U == 0.0f && constraintWidget.R(0)) || constraintWidget.Y();
        boolean z3 = L == dimensionBehaviour3 || L == dimensionBehaviour2 || (L == dimensionBehaviour && constraintWidget.m == 0 && constraintWidget.U == 0.0f && constraintWidget.R(1)) || constraintWidget.Z();
        if (constraintWidget.U > 0.0f && (z2 || z3)) {
            return true;
        }
        if (!z2 || !z3) {
            return false;
        }
        return true;
    }

    private static void b(ConstraintWidget constraintWidget, b.AbstractC0022b bVar, boolean z) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        ConstraintAnchor constraintAnchor3;
        ConstraintAnchor constraintAnchor4;
        ConstraintAnchor constraintAnchor5;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        if (!(constraintWidget instanceof d) && constraintWidget.X() && a(constraintWidget)) {
            d.Z0(constraintWidget, bVar, new b.a(), 0);
        }
        ConstraintAnchor o = constraintWidget.o(ConstraintAnchor.Type.LEFT);
        ConstraintAnchor o2 = constraintWidget.o(ConstraintAnchor.Type.RIGHT);
        int e = o.e();
        int e2 = o2.e();
        if (o.d() != null && o.k()) {
            Iterator<ConstraintAnchor> it = o.d().iterator();
            while (it.hasNext()) {
                ConstraintAnchor next = it.next();
                ConstraintWidget constraintWidget2 = next.d;
                boolean a2 = a(constraintWidget2);
                if (constraintWidget2.X() && a2) {
                    d.Z0(constraintWidget2, bVar, new b.a(), 0);
                }
                if (constraintWidget2.z() != dimensionBehaviour || a2) {
                    if (!constraintWidget2.X()) {
                        ConstraintAnchor constraintAnchor6 = constraintWidget2.F;
                        if (next == constraintAnchor6 && constraintWidget2.H.f == null) {
                            int f = constraintAnchor6.f() + e;
                            constraintWidget2.j0(f, constraintWidget2.N() + f);
                            b(constraintWidget2, bVar, z);
                        } else {
                            ConstraintAnchor constraintAnchor7 = constraintWidget2.H;
                            if (next == constraintAnchor7 && constraintAnchor6.f == null) {
                                int f2 = e - constraintAnchor7.f();
                                constraintWidget2.j0(f2 - constraintWidget2.N(), f2);
                                b(constraintWidget2, bVar, z);
                            } else if (next == constraintAnchor6 && (constraintAnchor3 = constraintAnchor7.f) != null && constraintAnchor3.k() && !constraintWidget2.T()) {
                                c(bVar, constraintWidget2, z);
                            }
                        }
                    }
                } else if (constraintWidget2.z() == dimensionBehaviour && constraintWidget2.p >= 0 && constraintWidget2.o >= 0) {
                    if ((constraintWidget2.M() == 8 || (constraintWidget2.l == 0 && constraintWidget2.U == 0.0f)) && !constraintWidget2.T() && !constraintWidget2.W()) {
                        if (((next == constraintWidget2.F && (constraintAnchor5 = constraintWidget2.H.f) != null && constraintAnchor5.k()) || (next == constraintWidget2.H && (constraintAnchor4 = constraintWidget2.F.f) != null && constraintAnchor4.k())) && !constraintWidget2.T()) {
                            d(constraintWidget, bVar, constraintWidget2, z);
                        }
                    }
                }
            }
        }
        if (!(constraintWidget instanceof f) && o2.d() != null && o2.k()) {
            Iterator<ConstraintAnchor> it2 = o2.d().iterator();
            while (it2.hasNext()) {
                ConstraintAnchor next2 = it2.next();
                ConstraintWidget constraintWidget3 = next2.d;
                boolean a3 = a(constraintWidget3);
                if (constraintWidget3.X() && a3) {
                    d.Z0(constraintWidget3, bVar, new b.a(), 0);
                }
                boolean z2 = (next2 == constraintWidget3.F && (constraintAnchor2 = constraintWidget3.H.f) != null && constraintAnchor2.k()) || (next2 == constraintWidget3.H && (constraintAnchor = constraintWidget3.F.f) != null && constraintAnchor.k());
                if (constraintWidget3.z() != dimensionBehaviour || a3) {
                    if (!constraintWidget3.X()) {
                        ConstraintAnchor constraintAnchor8 = constraintWidget3.F;
                        if (next2 == constraintAnchor8 && constraintWidget3.H.f == null) {
                            int f3 = constraintAnchor8.f() + e2;
                            constraintWidget3.j0(f3, constraintWidget3.N() + f3);
                            b(constraintWidget3, bVar, z);
                        } else {
                            ConstraintAnchor constraintAnchor9 = constraintWidget3.H;
                            if (next2 == constraintAnchor9 && constraintAnchor8.f == null) {
                                int f4 = e2 - constraintAnchor9.f();
                                constraintWidget3.j0(f4 - constraintWidget3.N(), f4);
                                b(constraintWidget3, bVar, z);
                            } else if (z2 && !constraintWidget3.T()) {
                                c(bVar, constraintWidget3, z);
                            }
                        }
                    }
                } else if (constraintWidget3.z() == dimensionBehaviour && constraintWidget3.p >= 0 && constraintWidget3.o >= 0) {
                    if ((constraintWidget3.M() == 8 || (constraintWidget3.l == 0 && constraintWidget3.U == 0.0f)) && !constraintWidget3.T() && !constraintWidget3.W() && z2 && !constraintWidget3.T()) {
                        d(constraintWidget, bVar, constraintWidget3, z);
                    }
                }
            }
        }
    }

    private static void c(b.AbstractC0022b bVar, ConstraintWidget constraintWidget, boolean z) {
        float x = constraintWidget.x();
        int e = constraintWidget.F.f.e();
        int e2 = constraintWidget.H.f.e();
        int f = constraintWidget.F.f() + e;
        int f2 = e2 - constraintWidget.H.f();
        if (e == e2) {
            x = 0.5f;
        } else {
            e = f;
            e2 = f2;
        }
        int N = constraintWidget.N();
        int i = (e2 - e) - N;
        if (e > e2) {
            i = (e - e2) - N;
        }
        int i2 = ((int) ((x * ((float) i)) + 0.5f)) + e;
        int i3 = i2 + N;
        if (e > e2) {
            i3 = i2 - N;
        }
        constraintWidget.j0(i2, i3);
        b(constraintWidget, bVar, z);
    }

    private static void d(ConstraintWidget constraintWidget, b.AbstractC0022b bVar, ConstraintWidget constraintWidget2, boolean z) {
        int i;
        float x = constraintWidget2.x();
        int f = constraintWidget2.F.f() + constraintWidget2.F.f.e();
        int e = constraintWidget2.H.f.e() - constraintWidget2.H.f();
        if (e >= f) {
            int N = constraintWidget2.N();
            if (constraintWidget2.M() != 8) {
                int i2 = constraintWidget2.l;
                if (i2 == 2) {
                    if (constraintWidget instanceof d) {
                        i = constraintWidget.N();
                    } else {
                        i = constraintWidget.R.N();
                    }
                    N = (int) (constraintWidget2.x() * 0.5f * ((float) i));
                } else if (i2 == 0) {
                    N = e - f;
                }
                N = Math.max(constraintWidget2.o, N);
                int i3 = constraintWidget2.p;
                if (i3 > 0) {
                    N = Math.min(i3, N);
                }
            }
            int i4 = f + ((int) ((x * ((float) ((e - f) - N))) + 0.5f));
            constraintWidget2.j0(i4, N + i4);
            b(constraintWidget2, bVar, z);
        }
    }

    private static void e(b.AbstractC0022b bVar, ConstraintWidget constraintWidget) {
        float J = constraintWidget.J();
        int e = constraintWidget.G.f.e();
        int e2 = constraintWidget.I.f.e();
        int f = constraintWidget.G.f() + e;
        int f2 = e2 - constraintWidget.I.f();
        if (e == e2) {
            J = 0.5f;
        } else {
            e = f;
            e2 = f2;
        }
        int w = constraintWidget.w();
        int i = (e2 - e) - w;
        if (e > e2) {
            i = (e - e2) - w;
        }
        int i2 = (int) ((J * ((float) i)) + 0.5f);
        int i3 = e + i2;
        int i4 = i3 + w;
        if (e > e2) {
            i3 = e - i2;
            i4 = i3 - w;
        }
        constraintWidget.m0(i3, i4);
        h(constraintWidget, bVar);
    }

    private static void f(ConstraintWidget constraintWidget, b.AbstractC0022b bVar, ConstraintWidget constraintWidget2) {
        int i;
        float J = constraintWidget2.J();
        int f = constraintWidget2.G.f() + constraintWidget2.G.f.e();
        int e = constraintWidget2.I.f.e() - constraintWidget2.I.f();
        if (e >= f) {
            int w = constraintWidget2.w();
            if (constraintWidget2.M() != 8) {
                int i2 = constraintWidget2.m;
                if (i2 == 2) {
                    if (constraintWidget instanceof d) {
                        i = constraintWidget.w();
                    } else {
                        i = constraintWidget.R.w();
                    }
                    w = (int) (J * 0.5f * ((float) i));
                } else if (i2 == 0) {
                    w = e - f;
                }
                w = Math.max(constraintWidget2.r, w);
                int i3 = constraintWidget2.s;
                if (i3 > 0) {
                    w = Math.min(i3, w);
                }
            }
            int i4 = f + ((int) ((J * ((float) ((e - f) - w))) + 0.5f));
            constraintWidget2.m0(i4, w + i4);
            h(constraintWidget2, bVar);
        }
    }

    public static void g(d dVar, b.AbstractC0022b bVar) {
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.FIXED;
        ConstraintWidget.DimensionBehaviour z = dVar.z();
        ConstraintWidget.DimensionBehaviour L = dVar.L();
        dVar.c0();
        ArrayList<ConstraintWidget> arrayList = dVar.H0;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).c0();
        }
        boolean W0 = dVar.W0();
        if (z == dimensionBehaviour) {
            dVar.j0(0, dVar.N());
        } else {
            dVar.k0(0);
        }
        boolean z2 = false;
        boolean z3 = false;
        for (int i2 = 0; i2 < size; i2++) {
            ConstraintWidget constraintWidget = arrayList.get(i2);
            if (constraintWidget instanceof f) {
                f fVar = (f) constraintWidget;
                if (fVar.M0() == 1) {
                    if (fVar.N0() != -1) {
                        fVar.Q0(fVar.N0());
                    } else if (fVar.O0() != -1 && dVar.Y()) {
                        fVar.Q0(dVar.N() - fVar.O0());
                    } else if (dVar.Y()) {
                        fVar.Q0((int) ((fVar.P0() * ((float) dVar.N())) + 0.5f));
                    }
                    z2 = true;
                }
            } else if ((constraintWidget instanceof a) && ((a) constraintWidget).Q0() == 0) {
                z3 = true;
            }
        }
        if (z2) {
            for (int i3 = 0; i3 < size; i3++) {
                ConstraintWidget constraintWidget2 = arrayList.get(i3);
                if (constraintWidget2 instanceof f) {
                    f fVar2 = (f) constraintWidget2;
                    if (fVar2.M0() == 1) {
                        b(fVar2, bVar, W0);
                    }
                }
            }
        }
        b(dVar, bVar, W0);
        if (z3) {
            for (int i4 = 0; i4 < size; i4++) {
                ConstraintWidget constraintWidget3 = arrayList.get(i4);
                if (constraintWidget3 instanceof a) {
                    a aVar = (a) constraintWidget3;
                    if (aVar.Q0() == 0 && aVar.M0()) {
                        b(aVar, bVar, W0);
                    }
                }
            }
        }
        if (L == dimensionBehaviour) {
            dVar.m0(0, dVar.w());
        } else {
            dVar.l0(0);
        }
        boolean z4 = false;
        boolean z5 = false;
        for (int i5 = 0; i5 < size; i5++) {
            ConstraintWidget constraintWidget4 = arrayList.get(i5);
            if (constraintWidget4 instanceof f) {
                f fVar3 = (f) constraintWidget4;
                if (fVar3.M0() == 0) {
                    if (fVar3.N0() != -1) {
                        fVar3.Q0(fVar3.N0());
                    } else if (fVar3.O0() != -1 && dVar.Z()) {
                        fVar3.Q0(dVar.w() - fVar3.O0());
                    } else if (dVar.Z()) {
                        fVar3.Q0((int) ((fVar3.P0() * ((float) dVar.w())) + 0.5f));
                    }
                    z4 = true;
                }
            } else if ((constraintWidget4 instanceof a) && ((a) constraintWidget4).Q0() == 1) {
                z5 = true;
            }
        }
        if (z4) {
            for (int i6 = 0; i6 < size; i6++) {
                ConstraintWidget constraintWidget5 = arrayList.get(i6);
                if (constraintWidget5 instanceof f) {
                    f fVar4 = (f) constraintWidget5;
                    if (fVar4.M0() == 0) {
                        h(fVar4, bVar);
                    }
                }
            }
        }
        h(dVar, bVar);
        if (z5) {
            for (int i7 = 0; i7 < size; i7++) {
                ConstraintWidget constraintWidget6 = arrayList.get(i7);
                if (constraintWidget6 instanceof a) {
                    a aVar2 = (a) constraintWidget6;
                    if (aVar2.Q0() == 1 && aVar2.M0()) {
                        h(aVar2, bVar);
                    }
                }
            }
        }
        for (int i8 = 0; i8 < size; i8++) {
            ConstraintWidget constraintWidget7 = arrayList.get(i8);
            if (constraintWidget7.X() && a(constraintWidget7)) {
                d.Z0(constraintWidget7, bVar, a, 0);
                b(constraintWidget7, bVar, W0);
                h(constraintWidget7, bVar);
            }
        }
    }

    private static void h(ConstraintWidget constraintWidget, b.AbstractC0022b bVar) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        ConstraintAnchor constraintAnchor3;
        ConstraintAnchor constraintAnchor4;
        ConstraintAnchor constraintAnchor5;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        if (!(constraintWidget instanceof d) && constraintWidget.X() && a(constraintWidget)) {
            d.Z0(constraintWidget, bVar, new b.a(), 0);
        }
        ConstraintAnchor o = constraintWidget.o(ConstraintAnchor.Type.TOP);
        ConstraintAnchor o2 = constraintWidget.o(ConstraintAnchor.Type.BOTTOM);
        int e = o.e();
        int e2 = o2.e();
        if (o.d() != null && o.k()) {
            Iterator<ConstraintAnchor> it = o.d().iterator();
            while (it.hasNext()) {
                ConstraintAnchor next = it.next();
                ConstraintWidget constraintWidget2 = next.d;
                boolean a2 = a(constraintWidget2);
                if (constraintWidget2.X() && a2) {
                    d.Z0(constraintWidget2, bVar, new b.a(), 0);
                }
                if (constraintWidget2.L() != dimensionBehaviour || a2) {
                    if (!constraintWidget2.X()) {
                        ConstraintAnchor constraintAnchor6 = constraintWidget2.G;
                        if (next == constraintAnchor6 && constraintWidget2.I.f == null) {
                            int f = constraintAnchor6.f() + e;
                            constraintWidget2.m0(f, constraintWidget2.w() + f);
                            h(constraintWidget2, bVar);
                        } else {
                            ConstraintAnchor constraintAnchor7 = constraintWidget2.I;
                            if (next == constraintAnchor7 && constraintAnchor7.f == null) {
                                int f2 = e - constraintAnchor7.f();
                                constraintWidget2.m0(f2 - constraintWidget2.w(), f2);
                                h(constraintWidget2, bVar);
                            } else if (next == constraintAnchor6 && (constraintAnchor3 = constraintAnchor7.f) != null && constraintAnchor3.k()) {
                                e(bVar, constraintWidget2);
                            }
                        }
                    }
                } else if (constraintWidget2.L() == dimensionBehaviour && constraintWidget2.s >= 0 && constraintWidget2.r >= 0) {
                    if ((constraintWidget2.M() == 8 || (constraintWidget2.m == 0 && constraintWidget2.U == 0.0f)) && !constraintWidget2.V() && !constraintWidget2.W()) {
                        if (((next == constraintWidget2.G && (constraintAnchor5 = constraintWidget2.I.f) != null && constraintAnchor5.k()) || (next == constraintWidget2.I && (constraintAnchor4 = constraintWidget2.G.f) != null && constraintAnchor4.k())) && !constraintWidget2.V()) {
                            f(constraintWidget, bVar, constraintWidget2);
                        }
                    }
                }
            }
        }
        if (!(constraintWidget instanceof f)) {
            if (o2.d() != null && o2.k()) {
                Iterator<ConstraintAnchor> it2 = o2.d().iterator();
                while (it2.hasNext()) {
                    ConstraintAnchor next2 = it2.next();
                    ConstraintWidget constraintWidget3 = next2.d;
                    boolean a3 = a(constraintWidget3);
                    if (constraintWidget3.X() && a3) {
                        d.Z0(constraintWidget3, bVar, new b.a(), 0);
                    }
                    boolean z = (next2 == constraintWidget3.G && (constraintAnchor2 = constraintWidget3.I.f) != null && constraintAnchor2.k()) || (next2 == constraintWidget3.I && (constraintAnchor = constraintWidget3.G.f) != null && constraintAnchor.k());
                    if (constraintWidget3.L() != dimensionBehaviour || a3) {
                        if (!constraintWidget3.X()) {
                            ConstraintAnchor constraintAnchor8 = constraintWidget3.G;
                            if (next2 == constraintAnchor8 && constraintWidget3.I.f == null) {
                                int f3 = constraintAnchor8.f() + e2;
                                constraintWidget3.m0(f3, constraintWidget3.w() + f3);
                                h(constraintWidget3, bVar);
                            } else {
                                ConstraintAnchor constraintAnchor9 = constraintWidget3.I;
                                if (next2 == constraintAnchor9 && constraintAnchor8.f == null) {
                                    int f4 = e2 - constraintAnchor9.f();
                                    constraintWidget3.m0(f4 - constraintWidget3.w(), f4);
                                    h(constraintWidget3, bVar);
                                } else if (z && !constraintWidget3.V()) {
                                    e(bVar, constraintWidget3);
                                }
                            }
                        }
                    } else if (constraintWidget3.L() == dimensionBehaviour && constraintWidget3.s >= 0 && constraintWidget3.r >= 0) {
                        if ((constraintWidget3.M() == 8 || (constraintWidget3.m == 0 && constraintWidget3.U == 0.0f)) && !constraintWidget3.V() && !constraintWidget3.W() && z && !constraintWidget3.V()) {
                            f(constraintWidget, bVar, constraintWidget3);
                        }
                    }
                }
            }
            ConstraintAnchor o3 = constraintWidget.o(ConstraintAnchor.Type.BASELINE);
            if (o3.d() != null && o3.k()) {
                int e3 = o3.e();
                Iterator<ConstraintAnchor> it3 = o3.d().iterator();
                while (it3.hasNext()) {
                    ConstraintAnchor next3 = it3.next();
                    ConstraintWidget constraintWidget4 = next3.d;
                    boolean a4 = a(constraintWidget4);
                    if (constraintWidget4.X() && a4) {
                        d.Z0(constraintWidget4, bVar, new b.a(), 0);
                    }
                    if ((constraintWidget4.L() != dimensionBehaviour || a4) && !constraintWidget4.X() && next3 == constraintWidget4.J) {
                        constraintWidget4.i0(e3);
                        h(constraintWidget4, bVar);
                    }
                }
            }
        }
    }
}

package androidx.constraintlayout.solver.widgets.analyzer;

import androidx.constraintlayout.solver.widgets.ConstraintAnchor;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.analyzer.b;
import androidx.constraintlayout.solver.widgets.d;
import androidx.constraintlayout.solver.widgets.f;
import androidx.constraintlayout.solver.widgets.h;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class e {
    private d a;
    private boolean b = true;
    private boolean c = true;
    private d d;
    private ArrayList<WidgetRun> e = new ArrayList<>();
    private b.AbstractC0022b f;
    private b.a g;
    ArrayList<l> h;

    public e(d dVar) {
        new ArrayList();
        this.f = null;
        this.g = new b.a();
        this.h = new ArrayList<>();
        this.a = dVar;
        this.d = dVar;
    }

    private void a(DependencyNode dependencyNode, int i, int i2, DependencyNode dependencyNode2, ArrayList<l> arrayList, l lVar) {
        WidgetRun widgetRun = dependencyNode.d;
        if (widgetRun.c == null) {
            d dVar = this.a;
            if (!(widgetRun == dVar.d || widgetRun == dVar.e)) {
                if (lVar == null) {
                    lVar = new l(widgetRun, i2);
                    arrayList.add(lVar);
                }
                widgetRun.c = lVar;
                lVar.b.add(widgetRun);
                for (d dVar2 : widgetRun.h.k) {
                    if (dVar2 instanceof DependencyNode) {
                        a((DependencyNode) dVar2, i, 0, dependencyNode2, arrayList, lVar);
                    }
                }
                for (d dVar3 : widgetRun.i.k) {
                    if (dVar3 instanceof DependencyNode) {
                        a((DependencyNode) dVar3, i, 1, dependencyNode2, arrayList, lVar);
                    }
                }
                if (i == 1 && (widgetRun instanceof m)) {
                    for (d dVar4 : ((m) widgetRun).k.k) {
                        if (dVar4 instanceof DependencyNode) {
                            a((DependencyNode) dVar4, i, 2, dependencyNode2, arrayList, lVar);
                        }
                    }
                }
                for (DependencyNode dependencyNode3 : widgetRun.h.l) {
                    a(dependencyNode3, i, 0, dependencyNode2, arrayList, lVar);
                }
                for (DependencyNode dependencyNode4 : widgetRun.i.l) {
                    a(dependencyNode4, i, 1, dependencyNode2, arrayList, lVar);
                }
                if (i == 1 && (widgetRun instanceof m)) {
                    for (DependencyNode dependencyNode5 : ((m) widgetRun).k.l) {
                        a(dependencyNode5, i, 2, dependencyNode2, arrayList, lVar);
                    }
                }
            }
        }
    }

    private boolean b(d dVar) {
        int i;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        int i2;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.FIXED;
        Iterator<ConstraintWidget> it = dVar.H0.iterator();
        while (it.hasNext()) {
            ConstraintWidget next = it.next();
            ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = next.Q;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour6 = dimensionBehaviourArr[0];
            ConstraintWidget.DimensionBehaviour dimensionBehaviour7 = dimensionBehaviourArr[1];
            if (next.M() == 8) {
                next.a = true;
            } else {
                float f2 = next.q;
                if (f2 < 1.0f && dimensionBehaviour6 == dimensionBehaviour3) {
                    next.l = 2;
                }
                float f3 = next.t;
                if (f3 < 1.0f && dimensionBehaviour7 == dimensionBehaviour3) {
                    next.m = 2;
                }
                if (next.U > 0.0f) {
                    if (dimensionBehaviour6 == dimensionBehaviour3 && (dimensionBehaviour7 == dimensionBehaviour4 || dimensionBehaviour7 == dimensionBehaviour5)) {
                        next.l = 3;
                    } else if (dimensionBehaviour7 == dimensionBehaviour3 && (dimensionBehaviour6 == dimensionBehaviour4 || dimensionBehaviour6 == dimensionBehaviour5)) {
                        next.m = 3;
                    } else if (dimensionBehaviour6 == dimensionBehaviour3 && dimensionBehaviour7 == dimensionBehaviour3) {
                        if (next.l == 0) {
                            next.l = 3;
                        }
                        if (next.m == 0) {
                            next.m = 3;
                        }
                    }
                }
                if (dimensionBehaviour6 == dimensionBehaviour3 && next.l == 1 && (next.F.f == null || next.H.f == null)) {
                    dimensionBehaviour6 = dimensionBehaviour4;
                }
                ConstraintWidget.DimensionBehaviour dimensionBehaviour8 = (dimensionBehaviour7 == dimensionBehaviour3 && next.m == 1 && (next.G.f == null || next.I.f == null)) ? dimensionBehaviour4 : dimensionBehaviour7;
                k kVar = next.d;
                kVar.d = dimensionBehaviour6;
                int i3 = next.l;
                kVar.a = i3;
                m mVar = next.e;
                mVar.d = dimensionBehaviour8;
                int i4 = next.m;
                mVar.a = i4;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour9 = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
                if ((dimensionBehaviour6 == dimensionBehaviour9 || dimensionBehaviour6 == dimensionBehaviour5 || dimensionBehaviour6 == dimensionBehaviour4) && (dimensionBehaviour8 == dimensionBehaviour9 || dimensionBehaviour8 == dimensionBehaviour5 || dimensionBehaviour8 == dimensionBehaviour4)) {
                    int N = next.N();
                    if (dimensionBehaviour6 == dimensionBehaviour9) {
                        i = (dVar.N() - next.F.g) - next.H.g;
                        dimensionBehaviour = dimensionBehaviour5;
                    } else {
                        dimensionBehaviour = dimensionBehaviour6;
                        i = N;
                    }
                    int w = next.w();
                    if (dimensionBehaviour8 == dimensionBehaviour9) {
                        i2 = (dVar.w() - next.G.g) - next.I.g;
                        dimensionBehaviour2 = dimensionBehaviour5;
                    } else {
                        i2 = w;
                        dimensionBehaviour2 = dimensionBehaviour8;
                    }
                    k(next, dimensionBehaviour, i, dimensionBehaviour2, i2);
                    next.d.e.c(next.N());
                    next.e.e.c(next.w());
                    next.a = true;
                } else {
                    if (dimensionBehaviour6 == dimensionBehaviour3 && (dimensionBehaviour8 == dimensionBehaviour4 || dimensionBehaviour8 == dimensionBehaviour5)) {
                        if (i3 == 3) {
                            if (dimensionBehaviour8 == dimensionBehaviour4) {
                                k(next, dimensionBehaviour4, 0, dimensionBehaviour4, 0);
                            }
                            int w2 = next.w();
                            k(next, dimensionBehaviour5, (int) ((((float) w2) * next.U) + 0.5f), dimensionBehaviour5, w2);
                            next.d.e.c(next.N());
                            next.e.e.c(next.w());
                            next.a = true;
                        } else if (i3 == 1) {
                            k(next, dimensionBehaviour4, 0, dimensionBehaviour8, 0);
                            next.d.e.m = next.N();
                        } else if (i3 == 2) {
                            ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr2 = dVar.Q;
                            if (dimensionBehaviourArr2[0] == dimensionBehaviour5 || dimensionBehaviourArr2[0] == dimensionBehaviour9) {
                                k(next, dimensionBehaviour5, (int) ((f2 * ((float) dVar.N())) + 0.5f), dimensionBehaviour8, next.w());
                                next.d.e.c(next.N());
                                next.e.e.c(next.w());
                                next.a = true;
                            }
                        } else {
                            ConstraintAnchor[] constraintAnchorArr = next.N;
                            if (constraintAnchorArr[0].f == null || constraintAnchorArr[1].f == null) {
                                k(next, dimensionBehaviour4, 0, dimensionBehaviour8, 0);
                                next.d.e.c(next.N());
                                next.e.e.c(next.w());
                                next.a = true;
                            }
                        }
                    }
                    if (dimensionBehaviour8 == dimensionBehaviour3 && (dimensionBehaviour6 == dimensionBehaviour4 || dimensionBehaviour6 == dimensionBehaviour5)) {
                        if (i4 == 3) {
                            if (dimensionBehaviour6 == dimensionBehaviour4) {
                                k(next, dimensionBehaviour4, 0, dimensionBehaviour4, 0);
                            }
                            int N2 = next.N();
                            float f4 = next.U;
                            if (next.v() == -1) {
                                f4 = 1.0f / f4;
                            }
                            k(next, dimensionBehaviour5, N2, dimensionBehaviour5, (int) ((((float) N2) * f4) + 0.5f));
                            next.d.e.c(next.N());
                            next.e.e.c(next.w());
                            next.a = true;
                        } else if (i4 == 1) {
                            k(next, dimensionBehaviour6, 0, dimensionBehaviour4, 0);
                            next.e.e.m = next.w();
                        } else if (i4 == 2) {
                            ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr3 = dVar.Q;
                            if (dimensionBehaviourArr3[1] == dimensionBehaviour5 || dimensionBehaviourArr3[1] == dimensionBehaviour9) {
                                k(next, dimensionBehaviour6, next.N(), dimensionBehaviour5, (int) ((f3 * ((float) dVar.w())) + 0.5f));
                                next.d.e.c(next.N());
                                next.e.e.c(next.w());
                                next.a = true;
                            }
                        } else {
                            ConstraintAnchor[] constraintAnchorArr2 = next.N;
                            if (constraintAnchorArr2[2].f == null || constraintAnchorArr2[3].f == null) {
                                k(next, dimensionBehaviour4, 0, dimensionBehaviour8, 0);
                                next.d.e.c(next.N());
                                next.e.e.c(next.w());
                                next.a = true;
                            }
                        }
                    }
                    if (dimensionBehaviour6 == dimensionBehaviour3 && dimensionBehaviour8 == dimensionBehaviour3) {
                        if (i3 == 1 || i4 == 1) {
                            k(next, dimensionBehaviour4, 0, dimensionBehaviour4, 0);
                            next.d.e.m = next.N();
                            next.e.e.m = next.w();
                        } else if (i4 == 2 && i3 == 2) {
                            ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr4 = dVar.Q;
                            if ((dimensionBehaviourArr4[0] == dimensionBehaviour5 || dimensionBehaviourArr4[0] == dimensionBehaviour5) && (dimensionBehaviourArr4[1] == dimensionBehaviour5 || dimensionBehaviourArr4[1] == dimensionBehaviour5)) {
                                k(next, dimensionBehaviour5, (int) ((f2 * ((float) dVar.N())) + 0.5f), dimensionBehaviour5, (int) ((f3 * ((float) dVar.w())) + 0.5f));
                                next.d.e.c(next.N());
                                next.e.e.c(next.w());
                                next.a = true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    private int d(d dVar, int i) {
        int size = this.h.size();
        long j = 0;
        for (int i2 = 0; i2 < size; i2++) {
            j = Math.max(j, this.h.get(i2).a(dVar, i));
        }
        return (int) j;
    }

    private void h(WidgetRun widgetRun, int i, ArrayList<l> arrayList) {
        for (d dVar : widgetRun.h.k) {
            if (dVar instanceof DependencyNode) {
                a((DependencyNode) dVar, i, 0, widgetRun.i, arrayList, null);
            } else if (dVar instanceof WidgetRun) {
                a(((WidgetRun) dVar).h, i, 0, widgetRun.i, arrayList, null);
            }
        }
        for (d dVar2 : widgetRun.i.k) {
            if (dVar2 instanceof DependencyNode) {
                a((DependencyNode) dVar2, i, 1, widgetRun.h, arrayList, null);
            } else if (dVar2 instanceof WidgetRun) {
                a(((WidgetRun) dVar2).i, i, 1, widgetRun.h, arrayList, null);
            }
        }
        if (i == 1) {
            for (d dVar3 : ((m) widgetRun).k.k) {
                if (dVar3 instanceof DependencyNode) {
                    a((DependencyNode) dVar3, i, 2, null, arrayList, null);
                }
            }
        }
    }

    private void k(ConstraintWidget constraintWidget, ConstraintWidget.DimensionBehaviour dimensionBehaviour, int i, ConstraintWidget.DimensionBehaviour dimensionBehaviour2, int i2) {
        b.a aVar = this.g;
        aVar.a = dimensionBehaviour;
        aVar.b = dimensionBehaviour2;
        aVar.c = i;
        aVar.d = i2;
        this.f.b(constraintWidget, aVar);
        constraintWidget.G0(this.g.e);
        constraintWidget.o0(this.g.f);
        constraintWidget.n0(this.g.h);
        constraintWidget.e0(this.g.g);
    }

    public void c() {
        ArrayList<WidgetRun> arrayList = this.e;
        arrayList.clear();
        this.d.d.f();
        this.d.e.f();
        arrayList.add(this.d.d);
        arrayList.add(this.d.e);
        Iterator<ConstraintWidget> it = this.d.H0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            ConstraintWidget next = it.next();
            if (next instanceof f) {
                arrayList.add(new i(next));
            } else {
                if (next.T()) {
                    if (next.b == null) {
                        next.b = new c(next, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.b);
                } else {
                    arrayList.add(next.d);
                }
                if (next.V()) {
                    if (next.c == null) {
                        next.c = new c(next, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.c);
                } else {
                    arrayList.add(next.e);
                }
                if (next instanceof h) {
                    arrayList.add(new j(next));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator<WidgetRun> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            it2.next().f();
        }
        Iterator<WidgetRun> it3 = arrayList.iterator();
        while (it3.hasNext()) {
            WidgetRun next2 = it3.next();
            if (next2.b != this.d) {
                next2.d();
            }
        }
        this.h.clear();
        l.c = 0;
        h(this.a.d, 0, this.h);
        h(this.a.e, 1, this.h);
        this.b = false;
    }

    public boolean e(boolean z) {
        boolean z2;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.FIXED;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        boolean z3 = true;
        boolean z4 = z & true;
        if (this.b || this.c) {
            Iterator<ConstraintWidget> it = this.a.H0.iterator();
            while (it.hasNext()) {
                ConstraintWidget next = it.next();
                next.n();
                next.a = false;
                next.d.o();
                next.e.n();
            }
            this.a.n();
            d dVar = this.a;
            dVar.a = false;
            dVar.d.o();
            this.a.e.n();
            this.c = false;
        }
        b(this.d);
        this.a.H0(0);
        this.a.I0(0);
        ConstraintWidget.DimensionBehaviour u = this.a.u(0);
        ConstraintWidget.DimensionBehaviour u2 = this.a.u(1);
        if (this.b) {
            c();
        }
        int O = this.a.O();
        int P = this.a.P();
        this.a.d.h.c(O);
        this.a.e.h.c(P);
        l();
        if (u == dimensionBehaviour3 || u2 == dimensionBehaviour3) {
            if (z4) {
                Iterator<WidgetRun> it2 = this.e.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (!it2.next().l()) {
                            z4 = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (z4 && u == dimensionBehaviour3) {
                d dVar2 = this.a;
                dVar2.Q[0] = dimensionBehaviour2;
                dVar2.G0(d(dVar2, 0));
                d dVar3 = this.a;
                dVar3.d.e.c(dVar3.N());
            }
            if (z4 && u2 == dimensionBehaviour3) {
                d dVar4 = this.a;
                dVar4.Q[1] = dimensionBehaviour2;
                dVar4.o0(d(dVar4, 1));
                d dVar5 = this.a;
                dVar5.e.e.c(dVar5.w());
            }
        }
        d dVar6 = this.a;
        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = dVar6.Q;
        if (dimensionBehaviourArr[0] == dimensionBehaviour2 || dimensionBehaviourArr[0] == dimensionBehaviour) {
            int N = dVar6.N() + O;
            this.a.d.i.c(N);
            this.a.d.e.c(N - O);
            l();
            d dVar7 = this.a;
            ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr2 = dVar7.Q;
            if (dimensionBehaviourArr2[1] == dimensionBehaviour2 || dimensionBehaviourArr2[1] == dimensionBehaviour) {
                int w = dVar7.w() + P;
                this.a.e.i.c(w);
                this.a.e.e.c(w - P);
            }
            l();
            z2 = true;
        } else {
            z2 = false;
        }
        Iterator<WidgetRun> it3 = this.e.iterator();
        while (it3.hasNext()) {
            WidgetRun next2 = it3.next();
            if (next2.b != this.a || next2.g) {
                next2.e();
            }
        }
        Iterator<WidgetRun> it4 = this.e.iterator();
        while (true) {
            if (!it4.hasNext()) {
                break;
            }
            WidgetRun next3 = it4.next();
            if ((z2 || next3.b != this.a) && (!next3.h.j || ((!next3.i.j && !(next3 instanceof i)) || (!next3.e.j && !(next3 instanceof c) && !(next3 instanceof i))))) {
                break;
            }
        }
        z3 = false;
        this.a.r0(u);
        this.a.E0(u2);
        return z3;
    }

    public boolean f() {
        if (this.b) {
            Iterator<ConstraintWidget> it = this.a.H0.iterator();
            while (it.hasNext()) {
                ConstraintWidget next = it.next();
                next.n();
                next.a = false;
                k kVar = next.d;
                kVar.e.j = false;
                kVar.g = false;
                kVar.o();
                m mVar = next.e;
                mVar.e.j = false;
                mVar.g = false;
                mVar.n();
            }
            this.a.n();
            d dVar = this.a;
            dVar.a = false;
            k kVar2 = dVar.d;
            kVar2.e.j = false;
            kVar2.g = false;
            kVar2.o();
            m mVar2 = this.a.e;
            mVar2.e.j = false;
            mVar2.g = false;
            mVar2.n();
            c();
        }
        b(this.d);
        this.a.H0(0);
        this.a.I0(0);
        this.a.d.h.c(0);
        this.a.e.h.c(0);
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0135 A[EDGE_INSN: B:72:0x0135->B:59:0x0135 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean g(boolean r13, int r14) {
        /*
        // Method dump skipped, instructions count: 320
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.analyzer.e.g(boolean, int):boolean");
    }

    public void i() {
        this.b = true;
    }

    public void j() {
        this.c = true;
    }

    public void l() {
        f fVar;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.FIXED;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        Iterator<ConstraintWidget> it = this.a.H0.iterator();
        while (it.hasNext()) {
            ConstraintWidget next = it.next();
            if (!next.a) {
                ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = next.Q;
                boolean z = false;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = dimensionBehaviourArr[0];
                ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = dimensionBehaviourArr[1];
                int i = next.l;
                int i2 = next.m;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                boolean z2 = dimensionBehaviour3 == dimensionBehaviour5 || (dimensionBehaviour3 == dimensionBehaviour2 && i == 1);
                if (dimensionBehaviour4 == dimensionBehaviour5 || (dimensionBehaviour4 == dimensionBehaviour2 && i2 == 1)) {
                    z = true;
                }
                f fVar2 = next.d.e;
                boolean z3 = fVar2.j;
                f fVar3 = next.e.e;
                boolean z4 = fVar3.j;
                if (z3 && z4) {
                    k(next, dimensionBehaviour, fVar2.g, dimensionBehaviour, fVar3.g);
                    next.a = true;
                } else if (z3 && z) {
                    k(next, dimensionBehaviour, fVar2.g, dimensionBehaviour5, fVar3.g);
                    if (dimensionBehaviour4 == dimensionBehaviour2) {
                        next.e.e.m = next.w();
                    } else {
                        next.e.e.c(next.w());
                        next.a = true;
                    }
                } else if (z4 && z2) {
                    k(next, dimensionBehaviour5, fVar2.g, dimensionBehaviour, fVar3.g);
                    if (dimensionBehaviour3 == dimensionBehaviour2) {
                        next.d.e.m = next.N();
                    } else {
                        next.d.e.c(next.N());
                        next.a = true;
                    }
                }
                if (next.a && (fVar = next.e.l) != null) {
                    fVar.c(next.p());
                }
            }
        }
    }

    public void m(b.AbstractC0022b bVar) {
        this.f = bVar;
    }
}

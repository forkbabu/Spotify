package androidx.constraintlayout.solver.widgets.analyzer;

import androidx.constraintlayout.solver.widgets.ConstraintAnchor;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.analyzer.DependencyNode;
import androidx.constraintlayout.solver.widgets.analyzer.WidgetRun;
import androidx.constraintlayout.solver.widgets.g;

public class m extends WidgetRun {
    public DependencyNode k;
    f l = null;

    public m(ConstraintWidget constraintWidget) {
        super(constraintWidget);
        DependencyNode dependencyNode = new DependencyNode(this);
        this.k = dependencyNode;
        this.h.e = DependencyNode.Type.TOP;
        this.i.e = DependencyNode.Type.BOTTOM;
        dependencyNode.e = DependencyNode.Type.BASELINE;
        this.f = 1;
    }

    @Override // androidx.constraintlayout.solver.widgets.analyzer.WidgetRun, androidx.constraintlayout.solver.widgets.analyzer.d
    public void a(d dVar) {
        int i;
        float f;
        float f2;
        float f3;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        int ordinal = this.j.ordinal();
        if (ordinal == 1 || ordinal == 2 || ordinal != 3) {
            f fVar = this.e;
            if (fVar.c && !fVar.j && this.d == dimensionBehaviour) {
                ConstraintWidget constraintWidget = this.b;
                int i2 = constraintWidget.m;
                if (i2 == 2) {
                    ConstraintWidget constraintWidget2 = constraintWidget.R;
                    if (constraintWidget2 != null) {
                        f fVar2 = constraintWidget2.e.e;
                        if (fVar2.j) {
                            fVar.c((int) ((((float) fVar2.g) * constraintWidget.t) + 0.5f));
                        }
                    }
                } else if (i2 == 3 && constraintWidget.d.e.j) {
                    int v = constraintWidget.v();
                    if (v == -1) {
                        ConstraintWidget constraintWidget3 = this.b;
                        f2 = (float) constraintWidget3.d.e.g;
                        f3 = constraintWidget3.U;
                    } else if (v == 0) {
                        ConstraintWidget constraintWidget4 = this.b;
                        f = ((float) constraintWidget4.d.e.g) * constraintWidget4.U;
                        i = (int) (f + 0.5f);
                        this.e.c(i);
                    } else if (v != 1) {
                        i = 0;
                        this.e.c(i);
                    } else {
                        ConstraintWidget constraintWidget5 = this.b;
                        f2 = (float) constraintWidget5.d.e.g;
                        f3 = constraintWidget5.U;
                    }
                    f = f2 / f3;
                    i = (int) (f + 0.5f);
                    this.e.c(i);
                }
            }
            DependencyNode dependencyNode = this.h;
            if (dependencyNode.c) {
                DependencyNode dependencyNode2 = this.i;
                if (dependencyNode2.c) {
                    if (!dependencyNode.j || !dependencyNode2.j || !this.e.j) {
                        if (!this.e.j && this.d == dimensionBehaviour) {
                            ConstraintWidget constraintWidget6 = this.b;
                            if (constraintWidget6.l == 0 && !constraintWidget6.V()) {
                                int i3 = this.h.l.get(0).g;
                                DependencyNode dependencyNode3 = this.h;
                                int i4 = i3 + dependencyNode3.f;
                                int i5 = this.i.l.get(0).g + this.i.f;
                                dependencyNode3.c(i4);
                                this.i.c(i5);
                                this.e.c(i5 - i4);
                                return;
                            }
                        }
                        if (!this.e.j && this.d == dimensionBehaviour && this.a == 1 && this.h.l.size() > 0 && this.i.l.size() > 0) {
                            int i6 = (this.i.l.get(0).g + this.i.f) - (this.h.l.get(0).g + this.h.f);
                            f fVar3 = this.e;
                            int i7 = fVar3.m;
                            if (i6 < i7) {
                                fVar3.c(i6);
                            } else {
                                fVar3.c(i7);
                            }
                        }
                        if (this.e.j && this.h.l.size() > 0 && this.i.l.size() > 0) {
                            DependencyNode dependencyNode4 = this.h.l.get(0);
                            DependencyNode dependencyNode5 = this.i.l.get(0);
                            int i8 = dependencyNode4.g + this.h.f;
                            int i9 = dependencyNode5.g + this.i.f;
                            float J = this.b.J();
                            if (dependencyNode4 == dependencyNode5) {
                                i8 = dependencyNode4.g;
                                i9 = dependencyNode5.g;
                                J = 0.5f;
                            }
                            this.h.c((int) ((((float) ((i9 - i8) - this.e.g)) * J) + ((float) i8) + 0.5f));
                            this.i.c(this.h.g + this.e.g);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        ConstraintWidget constraintWidget7 = this.b;
        m(constraintWidget7.G, constraintWidget7.I, 1);
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.constraintlayout.solver.widgets.analyzer.WidgetRun
    public void d() {
        ConstraintWidget constraintWidget;
        ConstraintWidget constraintWidget2;
        ConstraintWidget constraintWidget3;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.FIXED;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        ConstraintWidget constraintWidget4 = this.b;
        if (constraintWidget4.a) {
            this.e.c(constraintWidget4.w());
        }
        if (!this.e.j) {
            this.d = this.b.L();
            if (this.b.Q()) {
                this.l = new a(this);
            }
            ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = this.d;
            if (dimensionBehaviour4 != dimensionBehaviour3) {
                if (dimensionBehaviour4 == dimensionBehaviour && (constraintWidget3 = this.b.R) != null && constraintWidget3.L() == dimensionBehaviour2) {
                    int w = (constraintWidget3.w() - this.b.G.f()) - this.b.I.f();
                    b(this.h, constraintWidget3.e.h, this.b.G.f());
                    b(this.i, constraintWidget3.e.i, -this.b.I.f());
                    this.e.c(w);
                    return;
                } else if (this.d == dimensionBehaviour2) {
                    this.e.c(this.b.w());
                }
            }
        } else if (this.d == dimensionBehaviour && (constraintWidget2 = this.b.R) != null && constraintWidget2.L() == dimensionBehaviour2) {
            b(this.h, constraintWidget2.e.h, this.b.G.f());
            b(this.i, constraintWidget2.e.i, -this.b.I.f());
            return;
        }
        f fVar = this.e;
        boolean z = fVar.j;
        if (z) {
            ConstraintWidget constraintWidget5 = this.b;
            if (constraintWidget5.a) {
                ConstraintAnchor[] constraintAnchorArr = constraintWidget5.N;
                if (constraintAnchorArr[2].f != null && constraintAnchorArr[3].f != null) {
                    if (constraintWidget5.V()) {
                        this.h.f = this.b.N[2].f();
                        this.i.f = -this.b.N[3].f();
                    } else {
                        DependencyNode h = h(this.b.N[2]);
                        if (h != null) {
                            DependencyNode dependencyNode = this.h;
                            int f = this.b.N[2].f();
                            dependencyNode.l.add(h);
                            dependencyNode.f = f;
                            h.k.add(dependencyNode);
                        }
                        DependencyNode h2 = h(this.b.N[3]);
                        if (h2 != null) {
                            DependencyNode dependencyNode2 = this.i;
                            dependencyNode2.l.add(h2);
                            dependencyNode2.f = -this.b.N[3].f();
                            h2.k.add(dependencyNode2);
                        }
                        this.h.b = true;
                        this.i.b = true;
                    }
                    if (this.b.Q()) {
                        b(this.k, this.h, this.b.p());
                        return;
                    }
                    return;
                } else if (constraintAnchorArr[2].f != null) {
                    DependencyNode h3 = h(constraintAnchorArr[2]);
                    if (h3 != null) {
                        DependencyNode dependencyNode3 = this.h;
                        int f2 = this.b.N[2].f();
                        dependencyNode3.l.add(h3);
                        dependencyNode3.f = f2;
                        h3.k.add(dependencyNode3);
                        b(this.i, this.h, this.e.g);
                        if (this.b.Q()) {
                            b(this.k, this.h, this.b.p());
                            return;
                        }
                        return;
                    }
                    return;
                } else if (constraintAnchorArr[3].f != null) {
                    DependencyNode h4 = h(constraintAnchorArr[3]);
                    if (h4 != null) {
                        DependencyNode dependencyNode4 = this.i;
                        dependencyNode4.l.add(h4);
                        dependencyNode4.f = -this.b.N[3].f();
                        h4.k.add(dependencyNode4);
                        b(this.h, this.i, -this.e.g);
                    }
                    if (this.b.Q()) {
                        b(this.k, this.h, this.b.p());
                        return;
                    }
                    return;
                } else if (constraintAnchorArr[4].f != null) {
                    DependencyNode h5 = h(constraintAnchorArr[4]);
                    if (h5 != null) {
                        DependencyNode dependencyNode5 = this.k;
                        dependencyNode5.l.add(h5);
                        dependencyNode5.f = 0;
                        h5.k.add(dependencyNode5);
                        b(this.h, this.k, -this.b.p());
                        b(this.i, this.h, this.e.g);
                        return;
                    }
                    return;
                } else if (!(constraintWidget5 instanceof g) && constraintWidget5.R != null && constraintWidget5.o(ConstraintAnchor.Type.CENTER).f == null) {
                    ConstraintWidget constraintWidget6 = this.b;
                    b(this.h, constraintWidget6.R.e.h, constraintWidget6.P());
                    b(this.i, this.h, this.e.g);
                    if (this.b.Q()) {
                        b(this.k, this.h, this.b.p());
                        return;
                    }
                    return;
                } else {
                    return;
                }
            }
        }
        if (z || this.d != dimensionBehaviour3) {
            fVar.k.add(this);
            if (fVar.j) {
                a(this);
            }
        } else {
            ConstraintWidget constraintWidget7 = this.b;
            int i = constraintWidget7.m;
            if (i == 2) {
                ConstraintWidget constraintWidget8 = constraintWidget7.R;
                if (constraintWidget8 != null) {
                    f fVar2 = constraintWidget8.e.e;
                    fVar.l.add(fVar2);
                    fVar2.k.add(this.e);
                    f fVar3 = this.e;
                    fVar3.b = true;
                    fVar3.k.add(this.h);
                    this.e.k.add(this.i);
                }
            } else if (i == 3 && !constraintWidget7.V()) {
                ConstraintWidget constraintWidget9 = this.b;
                if (constraintWidget9.l != 3) {
                    f fVar4 = constraintWidget9.d.e;
                    this.e.l.add(fVar4);
                    fVar4.k.add(this.e);
                    f fVar5 = this.e;
                    fVar5.b = true;
                    fVar5.k.add(this.h);
                    this.e.k.add(this.i);
                }
            }
        }
        ConstraintWidget constraintWidget10 = this.b;
        ConstraintAnchor[] constraintAnchorArr2 = constraintWidget10.N;
        if (constraintAnchorArr2[2].f != null && constraintAnchorArr2[3].f != null) {
            if (constraintWidget10.V()) {
                this.h.f = this.b.N[2].f();
                this.i.f = -this.b.N[3].f();
            } else {
                DependencyNode h6 = h(this.b.N[2]);
                DependencyNode h7 = h(this.b.N[3]);
                h6.k.add(this);
                if (h6.j) {
                    a(this);
                }
                h7.k.add(this);
                if (h7.j) {
                    a(this);
                }
                this.j = WidgetRun.RunType.CENTER;
            }
            if (this.b.Q()) {
                c(this.k, this.h, 1, this.l);
            }
        } else if (constraintAnchorArr2[2].f != null) {
            DependencyNode h8 = h(constraintAnchorArr2[2]);
            if (h8 != null) {
                DependencyNode dependencyNode6 = this.h;
                int f3 = this.b.N[2].f();
                dependencyNode6.l.add(h8);
                dependencyNode6.f = f3;
                h8.k.add(dependencyNode6);
                c(this.i, this.h, 1, this.e);
                if (this.b.Q()) {
                    c(this.k, this.h, 1, this.l);
                }
                if (this.d == dimensionBehaviour3) {
                    ConstraintWidget constraintWidget11 = this.b;
                    if (constraintWidget11.U > 0.0f) {
                        k kVar = constraintWidget11.d;
                        if (kVar.d == dimensionBehaviour3) {
                            kVar.e.k.add(this.e);
                            this.e.l.add(this.b.d.e);
                            this.e.a = this;
                        }
                    }
                }
            }
        } else if (constraintAnchorArr2[3].f != null) {
            DependencyNode h9 = h(constraintAnchorArr2[3]);
            if (h9 != null) {
                DependencyNode dependencyNode7 = this.i;
                dependencyNode7.l.add(h9);
                dependencyNode7.f = -this.b.N[3].f();
                h9.k.add(dependencyNode7);
                c(this.h, this.i, -1, this.e);
                if (this.b.Q()) {
                    c(this.k, this.h, 1, this.l);
                }
            }
        } else if (constraintAnchorArr2[4].f != null) {
            DependencyNode h10 = h(constraintAnchorArr2[4]);
            if (h10 != null) {
                DependencyNode dependencyNode8 = this.k;
                dependencyNode8.l.add(h10);
                dependencyNode8.f = 0;
                h10.k.add(dependencyNode8);
                c(this.h, this.k, -1, this.l);
                c(this.i, this.h, 1, this.e);
            }
        } else if (!(constraintWidget10 instanceof g) && (constraintWidget = constraintWidget10.R) != null) {
            b(this.h, constraintWidget.e.h, constraintWidget10.P());
            c(this.i, this.h, 1, this.e);
            if (this.b.Q()) {
                c(this.k, this.h, 1, this.l);
            }
            if (this.d == dimensionBehaviour3) {
                ConstraintWidget constraintWidget12 = this.b;
                if (constraintWidget12.U > 0.0f) {
                    k kVar2 = constraintWidget12.d;
                    if (kVar2.d == dimensionBehaviour3) {
                        kVar2.e.k.add(this.e);
                        this.e.l.add(this.b.d.e);
                        this.e.a = this;
                    }
                }
            }
        }
        if (this.e.l.size() == 0) {
            this.e.c = true;
        }
    }

    @Override // androidx.constraintlayout.solver.widgets.analyzer.WidgetRun
    public void e() {
        DependencyNode dependencyNode = this.h;
        if (dependencyNode.j) {
            this.b.I0(dependencyNode.g);
        }
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.constraintlayout.solver.widgets.analyzer.WidgetRun
    public void f() {
        this.c = null;
        this.h.b();
        this.i.b();
        this.k.b();
        this.e.b();
        this.g = false;
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.constraintlayout.solver.widgets.analyzer.WidgetRun
    public boolean l() {
        if (this.d != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || this.b.m == 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void n() {
        this.g = false;
        this.h.b();
        this.h.j = false;
        this.i.b();
        this.i.j = false;
        this.k.b();
        this.k.j = false;
        this.e.j = false;
    }

    public String toString() {
        StringBuilder V0 = je.V0("VerticalRun ");
        V0.append(this.b.t());
        return V0.toString();
    }
}

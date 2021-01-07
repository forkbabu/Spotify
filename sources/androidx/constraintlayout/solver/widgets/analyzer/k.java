package androidx.constraintlayout.solver.widgets.analyzer;

import androidx.constraintlayout.solver.widgets.ConstraintAnchor;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.analyzer.DependencyNode;
import androidx.constraintlayout.solver.widgets.analyzer.WidgetRun;
import androidx.constraintlayout.solver.widgets.g;

public class k extends WidgetRun {
    private static int[] k = new int[2];

    public k(ConstraintWidget constraintWidget) {
        super(constraintWidget);
        this.h.e = DependencyNode.Type.LEFT;
        this.i.e = DependencyNode.Type.RIGHT;
        this.f = 0;
    }

    private void n(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 == -1) {
            int i8 = (int) ((((float) i7) * f) + 0.5f);
            int i9 = (int) ((((float) i6) / f) + 0.5f);
            if (i8 <= i6 && i7 <= i7) {
                iArr[0] = i8;
                iArr[1] = i7;
            } else if (i6 <= i6 && i9 <= i7) {
                iArr[0] = i6;
                iArr[1] = i9;
            }
        } else if (i5 == 0) {
            iArr[0] = (int) ((((float) i7) * f) + 0.5f);
            iArr[1] = i7;
        } else if (i5 == 1) {
            iArr[0] = i6;
            iArr[1] = (int) ((((float) i6) * f) + 0.5f);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:105:0x029c, code lost:
        if (r7 != 1) goto L_0x02fe;
     */
    @Override // androidx.constraintlayout.solver.widgets.analyzer.WidgetRun, androidx.constraintlayout.solver.widgets.analyzer.d
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(androidx.constraintlayout.solver.widgets.analyzer.d r18) {
        /*
        // Method dump skipped, instructions count: 1053
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.analyzer.k.a(androidx.constraintlayout.solver.widgets.analyzer.d):void");
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.constraintlayout.solver.widgets.analyzer.WidgetRun
    public void d() {
        ConstraintWidget constraintWidget;
        ConstraintWidget constraintWidget2;
        ConstraintWidget constraintWidget3;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.FIXED;
        ConstraintWidget constraintWidget4 = this.b;
        if (constraintWidget4.a) {
            this.e.c(constraintWidget4.N());
        }
        if (!this.e.j) {
            ConstraintWidget.DimensionBehaviour z = this.b.z();
            this.d = z;
            if (z != dimensionBehaviour) {
                if (z == dimensionBehaviour2 && (((constraintWidget3 = this.b.R) != null && constraintWidget3.z() == dimensionBehaviour3) || constraintWidget3.z() == dimensionBehaviour2)) {
                    int N = (constraintWidget3.N() - this.b.F.f()) - this.b.H.f();
                    b(this.h, constraintWidget3.d.h, this.b.F.f());
                    b(this.i, constraintWidget3.d.i, -this.b.H.f());
                    this.e.c(N);
                    return;
                } else if (this.d == dimensionBehaviour3) {
                    this.e.c(this.b.N());
                }
            }
        } else if (this.d == dimensionBehaviour2 && (((constraintWidget2 = this.b.R) != null && constraintWidget2.z() == dimensionBehaviour3) || constraintWidget2.z() == dimensionBehaviour2)) {
            b(this.h, constraintWidget2.d.h, this.b.F.f());
            b(this.i, constraintWidget2.d.i, -this.b.H.f());
            return;
        }
        f fVar = this.e;
        if (fVar.j) {
            ConstraintWidget constraintWidget5 = this.b;
            if (constraintWidget5.a) {
                ConstraintAnchor[] constraintAnchorArr = constraintWidget5.N;
                if (constraintAnchorArr[0].f == null || constraintAnchorArr[1].f == null) {
                    if (constraintAnchorArr[0].f != null) {
                        DependencyNode h = h(constraintAnchorArr[0]);
                        if (h != null) {
                            DependencyNode dependencyNode = this.h;
                            int f = this.b.N[0].f();
                            dependencyNode.l.add(h);
                            dependencyNode.f = f;
                            h.k.add(dependencyNode);
                            b(this.i, this.h, this.e.g);
                            return;
                        }
                        return;
                    } else if (constraintAnchorArr[1].f != null) {
                        DependencyNode h2 = h(constraintAnchorArr[1]);
                        if (h2 != null) {
                            DependencyNode dependencyNode2 = this.i;
                            dependencyNode2.l.add(h2);
                            dependencyNode2.f = -this.b.N[1].f();
                            h2.k.add(dependencyNode2);
                            b(this.h, this.i, -this.e.g);
                            return;
                        }
                        return;
                    } else if (!(constraintWidget5 instanceof g) && constraintWidget5.R != null && constraintWidget5.o(ConstraintAnchor.Type.CENTER).f == null) {
                        ConstraintWidget constraintWidget6 = this.b;
                        b(this.h, constraintWidget6.R.d.h, constraintWidget6.O());
                        b(this.i, this.h, this.e.g);
                        return;
                    } else {
                        return;
                    }
                } else if (constraintWidget5.T()) {
                    this.h.f = this.b.N[0].f();
                    this.i.f = -this.b.N[1].f();
                    return;
                } else {
                    DependencyNode h3 = h(this.b.N[0]);
                    if (h3 != null) {
                        DependencyNode dependencyNode3 = this.h;
                        int f2 = this.b.N[0].f();
                        dependencyNode3.l.add(h3);
                        dependencyNode3.f = f2;
                        h3.k.add(dependencyNode3);
                    }
                    DependencyNode h4 = h(this.b.N[1]);
                    if (h4 != null) {
                        DependencyNode dependencyNode4 = this.i;
                        dependencyNode4.l.add(h4);
                        dependencyNode4.f = -this.b.N[1].f();
                        h4.k.add(dependencyNode4);
                    }
                    this.h.b = true;
                    this.i.b = true;
                    return;
                }
            }
        }
        if (this.d == dimensionBehaviour) {
            ConstraintWidget constraintWidget7 = this.b;
            int i = constraintWidget7.l;
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
            } else if (i == 3) {
                if (constraintWidget7.m == 3) {
                    this.h.a = this;
                    this.i.a = this;
                    m mVar = constraintWidget7.e;
                    mVar.h.a = this;
                    mVar.i.a = this;
                    fVar.a = this;
                    if (constraintWidget7.V()) {
                        this.e.l.add(this.b.e.e);
                        this.b.e.e.k.add(this.e);
                        m mVar2 = this.b.e;
                        mVar2.e.a = this;
                        this.e.l.add(mVar2.h);
                        this.e.l.add(this.b.e.i);
                        this.b.e.h.k.add(this.e);
                        this.b.e.i.k.add(this.e);
                    } else if (this.b.T()) {
                        this.b.e.e.l.add(this.e);
                        this.e.k.add(this.b.e.e);
                    } else {
                        this.b.e.e.l.add(this.e);
                    }
                } else {
                    f fVar4 = constraintWidget7.e.e;
                    fVar.l.add(fVar4);
                    fVar4.k.add(this.e);
                    this.b.e.h.k.add(this.e);
                    this.b.e.i.k.add(this.e);
                    f fVar5 = this.e;
                    fVar5.b = true;
                    fVar5.k.add(this.h);
                    this.e.k.add(this.i);
                    this.h.l.add(this.e);
                    this.i.l.add(this.e);
                }
            }
        }
        ConstraintWidget constraintWidget9 = this.b;
        ConstraintAnchor[] constraintAnchorArr2 = constraintWidget9.N;
        if (constraintAnchorArr2[0].f == null || constraintAnchorArr2[1].f == null) {
            if (constraintAnchorArr2[0].f != null) {
                DependencyNode h5 = h(constraintAnchorArr2[0]);
                if (h5 != null) {
                    DependencyNode dependencyNode5 = this.h;
                    int f3 = this.b.N[0].f();
                    dependencyNode5.l.add(h5);
                    dependencyNode5.f = f3;
                    h5.k.add(dependencyNode5);
                    c(this.i, this.h, 1, this.e);
                }
            } else if (constraintAnchorArr2[1].f != null) {
                DependencyNode h6 = h(constraintAnchorArr2[1]);
                if (h6 != null) {
                    DependencyNode dependencyNode6 = this.i;
                    dependencyNode6.l.add(h6);
                    dependencyNode6.f = -this.b.N[1].f();
                    h6.k.add(dependencyNode6);
                    c(this.h, this.i, -1, this.e);
                }
            } else if (!(constraintWidget9 instanceof g) && (constraintWidget = constraintWidget9.R) != null) {
                b(this.h, constraintWidget.d.h, constraintWidget9.O());
                c(this.i, this.h, 1, this.e);
            }
        } else if (constraintWidget9.T()) {
            this.h.f = this.b.N[0].f();
            this.i.f = -this.b.N[1].f();
        } else {
            DependencyNode h7 = h(this.b.N[0]);
            DependencyNode h8 = h(this.b.N[1]);
            h7.k.add(this);
            if (h7.j) {
                a(this);
            }
            h8.k.add(this);
            if (h8.j) {
                a(this);
            }
            this.j = WidgetRun.RunType.CENTER;
        }
    }

    @Override // androidx.constraintlayout.solver.widgets.analyzer.WidgetRun
    public void e() {
        DependencyNode dependencyNode = this.h;
        if (dependencyNode.j) {
            this.b.H0(dependencyNode.g);
        }
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.constraintlayout.solver.widgets.analyzer.WidgetRun
    public void f() {
        this.c = null;
        this.h.b();
        this.i.b();
        this.e.b();
        this.g = false;
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.constraintlayout.solver.widgets.analyzer.WidgetRun
    public boolean l() {
        if (this.d != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || this.b.l == 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void o() {
        this.g = false;
        this.h.b();
        this.h.j = false;
        this.i.b();
        this.i.j = false;
        this.e.j = false;
    }

    public String toString() {
        StringBuilder V0 = je.V0("HorizontalRun ");
        V0.append(this.b.t());
        return V0.toString();
    }
}

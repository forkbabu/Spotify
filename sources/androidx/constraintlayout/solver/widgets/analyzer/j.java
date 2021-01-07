package androidx.constraintlayout.solver.widgets.analyzer;

import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.a;
import androidx.constraintlayout.solver.widgets.analyzer.DependencyNode;

/* access modifiers changed from: package-private */
public class j extends WidgetRun {
    public j(ConstraintWidget constraintWidget) {
        super(constraintWidget);
    }

    private void n(DependencyNode dependencyNode) {
        this.h.k.add(dependencyNode);
        dependencyNode.l.add(this.h);
    }

    @Override // androidx.constraintlayout.solver.widgets.analyzer.WidgetRun, androidx.constraintlayout.solver.widgets.analyzer.d
    public void a(d dVar) {
        a aVar = (a) this.b;
        int O0 = aVar.O0();
        int i = 0;
        int i2 = -1;
        for (DependencyNode dependencyNode : this.h.l) {
            int i3 = dependencyNode.g;
            if (i2 == -1 || i3 < i2) {
                i2 = i3;
            }
            if (i < i3) {
                i = i3;
            }
        }
        if (O0 == 0 || O0 == 2) {
            this.h.c(aVar.P0() + i2);
        } else {
            this.h.c(aVar.P0() + i);
        }
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.constraintlayout.solver.widgets.analyzer.WidgetRun
    public void d() {
        ConstraintWidget constraintWidget = this.b;
        if (constraintWidget instanceof a) {
            this.h.b = true;
            a aVar = (a) constraintWidget;
            int O0 = aVar.O0();
            boolean N0 = aVar.N0();
            int i = 0;
            if (O0 == 0) {
                this.h.e = DependencyNode.Type.LEFT;
                while (i < aVar.I0) {
                    ConstraintWidget constraintWidget2 = aVar.H0[i];
                    if (N0 || constraintWidget2.M() != 8) {
                        DependencyNode dependencyNode = constraintWidget2.d.h;
                        dependencyNode.k.add(this.h);
                        this.h.l.add(dependencyNode);
                    }
                    i++;
                }
                n(this.b.d.h);
                n(this.b.d.i);
            } else if (O0 == 1) {
                this.h.e = DependencyNode.Type.RIGHT;
                while (i < aVar.I0) {
                    ConstraintWidget constraintWidget3 = aVar.H0[i];
                    if (N0 || constraintWidget3.M() != 8) {
                        DependencyNode dependencyNode2 = constraintWidget3.d.i;
                        dependencyNode2.k.add(this.h);
                        this.h.l.add(dependencyNode2);
                    }
                    i++;
                }
                n(this.b.d.h);
                n(this.b.d.i);
            } else if (O0 == 2) {
                this.h.e = DependencyNode.Type.TOP;
                while (i < aVar.I0) {
                    ConstraintWidget constraintWidget4 = aVar.H0[i];
                    if (N0 || constraintWidget4.M() != 8) {
                        DependencyNode dependencyNode3 = constraintWidget4.e.h;
                        dependencyNode3.k.add(this.h);
                        this.h.l.add(dependencyNode3);
                    }
                    i++;
                }
                n(this.b.e.h);
                n(this.b.e.i);
            } else if (O0 == 3) {
                this.h.e = DependencyNode.Type.BOTTOM;
                while (i < aVar.I0) {
                    ConstraintWidget constraintWidget5 = aVar.H0[i];
                    if (N0 || constraintWidget5.M() != 8) {
                        DependencyNode dependencyNode4 = constraintWidget5.e.i;
                        dependencyNode4.k.add(this.h);
                        this.h.l.add(dependencyNode4);
                    }
                    i++;
                }
                n(this.b.e.h);
                n(this.b.e.i);
            }
        }
    }

    @Override // androidx.constraintlayout.solver.widgets.analyzer.WidgetRun
    public void e() {
        ConstraintWidget constraintWidget = this.b;
        if (constraintWidget instanceof a) {
            int O0 = ((a) constraintWidget).O0();
            if (O0 == 0 || O0 == 1) {
                this.b.H0(this.h.g);
            } else {
                this.b.I0(this.h.g);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.constraintlayout.solver.widgets.analyzer.WidgetRun
    public void f() {
        this.c = null;
        this.h.b();
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.constraintlayout.solver.widgets.analyzer.WidgetRun
    public boolean l() {
        return false;
    }
}

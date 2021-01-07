package androidx.constraintlayout.solver.widgets.analyzer;

import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.f;

/* access modifiers changed from: package-private */
public class i extends WidgetRun {
    public i(ConstraintWidget constraintWidget) {
        super(constraintWidget);
        constraintWidget.d.f();
        constraintWidget.e.f();
        this.f = ((f) constraintWidget).M0();
    }

    private void n(DependencyNode dependencyNode) {
        this.h.k.add(dependencyNode);
        dependencyNode.l.add(this.h);
    }

    @Override // androidx.constraintlayout.solver.widgets.analyzer.WidgetRun, androidx.constraintlayout.solver.widgets.analyzer.d
    public void a(d dVar) {
        DependencyNode dependencyNode = this.h;
        if (dependencyNode.c && !dependencyNode.j) {
            this.h.c((int) ((((f) this.b).P0() * ((float) dependencyNode.l.get(0).g)) + 0.5f));
        }
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.constraintlayout.solver.widgets.analyzer.WidgetRun
    public void d() {
        f fVar = (f) this.b;
        int N0 = fVar.N0();
        int O0 = fVar.O0();
        if (fVar.M0() == 1) {
            if (N0 != -1) {
                this.h.l.add(this.b.R.d.h);
                this.b.R.d.h.k.add(this.h);
                this.h.f = N0;
            } else if (O0 != -1) {
                this.h.l.add(this.b.R.d.i);
                this.b.R.d.i.k.add(this.h);
                this.h.f = -O0;
            } else {
                DependencyNode dependencyNode = this.h;
                dependencyNode.b = true;
                dependencyNode.l.add(this.b.R.d.i);
                this.b.R.d.i.k.add(this.h);
            }
            n(this.b.d.h);
            n(this.b.d.i);
            return;
        }
        if (N0 != -1) {
            this.h.l.add(this.b.R.e.h);
            this.b.R.e.h.k.add(this.h);
            this.h.f = N0;
        } else if (O0 != -1) {
            this.h.l.add(this.b.R.e.i);
            this.b.R.e.i.k.add(this.h);
            this.h.f = -O0;
        } else {
            DependencyNode dependencyNode2 = this.h;
            dependencyNode2.b = true;
            dependencyNode2.l.add(this.b.R.e.i);
            this.b.R.e.i.k.add(this.h);
        }
        n(this.b.e.h);
        n(this.b.e.i);
    }

    @Override // androidx.constraintlayout.solver.widgets.analyzer.WidgetRun
    public void e() {
        if (((f) this.b).M0() == 1) {
            this.b.H0(this.h.g);
        } else {
            this.b.I0(this.h.g);
        }
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.constraintlayout.solver.widgets.analyzer.WidgetRun
    public void f() {
        this.h.b();
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.constraintlayout.solver.widgets.analyzer.WidgetRun
    public boolean l() {
        return false;
    }
}

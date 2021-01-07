package androidx.constraintlayout.solver.widgets.analyzer;

import androidx.constraintlayout.solver.widgets.ConstraintAnchor;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;

public abstract class WidgetRun implements d {
    public int a;
    ConstraintWidget b;
    l c;
    protected ConstraintWidget.DimensionBehaviour d;
    f e = new f(this);
    public int f = 0;
    boolean g = false;
    public DependencyNode h = new DependencyNode(this);
    public DependencyNode i = new DependencyNode(this);
    protected RunType j = RunType.NONE;

    enum RunType {
        NONE,
        START,
        END,
        CENTER
    }

    public WidgetRun(ConstraintWidget constraintWidget) {
        this.b = constraintWidget;
    }

    @Override // androidx.constraintlayout.solver.widgets.analyzer.d
    public void a(d dVar) {
    }

    /* access modifiers changed from: protected */
    public final void b(DependencyNode dependencyNode, DependencyNode dependencyNode2, int i2) {
        dependencyNode.l.add(dependencyNode2);
        dependencyNode.f = i2;
        dependencyNode2.k.add(dependencyNode);
    }

    /* access modifiers changed from: protected */
    public final void c(DependencyNode dependencyNode, DependencyNode dependencyNode2, int i2, f fVar) {
        dependencyNode.l.add(dependencyNode2);
        dependencyNode.l.add(this.e);
        dependencyNode.h = i2;
        dependencyNode.i = fVar;
        dependencyNode2.k.add(dependencyNode);
        fVar.k.add(dependencyNode);
    }

    /* access modifiers changed from: package-private */
    public abstract void d();

    /* access modifiers changed from: package-private */
    public abstract void e();

    /* access modifiers changed from: package-private */
    public abstract void f();

    /* access modifiers changed from: protected */
    public final int g(int i2, int i3) {
        int i4;
        if (i3 == 0) {
            ConstraintWidget constraintWidget = this.b;
            int i5 = constraintWidget.p;
            i4 = Math.max(constraintWidget.o, i2);
            if (i5 > 0) {
                i4 = Math.min(i5, i2);
            }
            if (i4 == i2) {
                return i2;
            }
        } else {
            ConstraintWidget constraintWidget2 = this.b;
            int i6 = constraintWidget2.s;
            i4 = Math.max(constraintWidget2.r, i2);
            if (i6 > 0) {
                i4 = Math.min(i6, i2);
            }
            if (i4 == i2) {
                return i2;
            }
        }
        return i4;
    }

    /* access modifiers changed from: protected */
    public final DependencyNode h(ConstraintAnchor constraintAnchor) {
        ConstraintAnchor constraintAnchor2 = constraintAnchor.f;
        if (constraintAnchor2 == null) {
            return null;
        }
        ConstraintWidget constraintWidget = constraintAnchor2.d;
        int ordinal = constraintAnchor2.e.ordinal();
        if (ordinal == 1) {
            return constraintWidget.d.h;
        }
        if (ordinal == 2) {
            return constraintWidget.e.h;
        }
        if (ordinal == 3) {
            return constraintWidget.d.i;
        }
        if (ordinal == 4) {
            return constraintWidget.e.i;
        }
        if (ordinal != 5) {
            return null;
        }
        return constraintWidget.e.k;
    }

    /* access modifiers changed from: protected */
    public final DependencyNode i(ConstraintAnchor constraintAnchor, int i2) {
        ConstraintAnchor constraintAnchor2 = constraintAnchor.f;
        if (constraintAnchor2 == null) {
            return null;
        }
        ConstraintWidget constraintWidget = constraintAnchor2.d;
        WidgetRun widgetRun = i2 == 0 ? constraintWidget.d : constraintWidget.e;
        int ordinal = constraintAnchor2.e.ordinal();
        if (ordinal == 1 || ordinal == 2) {
            return widgetRun.h;
        }
        if (ordinal == 3 || ordinal == 4) {
            return widgetRun.i;
        }
        return null;
    }

    public long j() {
        f fVar = this.e;
        if (fVar.j) {
            return (long) fVar.g;
        }
        return 0;
    }

    public boolean k() {
        return this.g;
    }

    /* access modifiers changed from: package-private */
    public abstract boolean l();

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0053, code lost:
        if (r10.a == 3) goto L_0x00b6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m(androidx.constraintlayout.solver.widgets.ConstraintAnchor r13, androidx.constraintlayout.solver.widgets.ConstraintAnchor r14, int r15) {
        /*
        // Method dump skipped, instructions count: 258
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.analyzer.WidgetRun.m(androidx.constraintlayout.solver.widgets.ConstraintAnchor, androidx.constraintlayout.solver.widgets.ConstraintAnchor, int):void");
    }
}

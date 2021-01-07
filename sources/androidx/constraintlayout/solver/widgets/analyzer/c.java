package androidx.constraintlayout.solver.widgets.analyzer;

import androidx.constraintlayout.solver.widgets.ConstraintAnchor;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.d;
import java.util.ArrayList;
import java.util.Iterator;

public class c extends WidgetRun {
    ArrayList<WidgetRun> k = new ArrayList<>();
    private int l;

    public c(ConstraintWidget constraintWidget, int i) {
        super(constraintWidget);
        WidgetRun widgetRun;
        WidgetRun widgetRun2;
        this.f = i;
        ConstraintWidget constraintWidget2 = this.b;
        ConstraintWidget H = constraintWidget2.H(i);
        while (true) {
            constraintWidget2 = H;
            if (constraintWidget2 == null) {
                break;
            }
            H = constraintWidget2.H(this.f);
        }
        this.b = constraintWidget2;
        ArrayList<WidgetRun> arrayList = this.k;
        int i2 = this.f;
        if (i2 == 0) {
            widgetRun = constraintWidget2.d;
        } else {
            widgetRun = i2 == 1 ? constraintWidget2.e : null;
        }
        arrayList.add(widgetRun);
        ConstraintWidget G = constraintWidget2.G(this.f);
        while (G != null) {
            ArrayList<WidgetRun> arrayList2 = this.k;
            int i3 = this.f;
            if (i3 == 0) {
                widgetRun2 = G.d;
            } else {
                widgetRun2 = i3 == 1 ? G.e : null;
            }
            arrayList2.add(widgetRun2);
            G = G.G(this.f);
        }
        Iterator<WidgetRun> it = this.k.iterator();
        while (it.hasNext()) {
            WidgetRun next = it.next();
            int i4 = this.f;
            if (i4 == 0) {
                next.b.b = this;
            } else if (i4 == 1) {
                next.b.c = this;
            }
        }
        if ((this.f == 0 && ((d) this.b.R).W0()) && this.k.size() > 1) {
            ArrayList<WidgetRun> arrayList3 = this.k;
            this.b = arrayList3.get(arrayList3.size() - 1).b;
        }
        this.l = this.f == 0 ? this.b.y() : this.b.K();
    }

    private ConstraintWidget n() {
        for (int i = 0; i < this.k.size(); i++) {
            WidgetRun widgetRun = this.k.get(i);
            if (widgetRun.b.M() != 8) {
                return widgetRun.b;
            }
        }
        return null;
    }

    private ConstraintWidget o() {
        for (int size = this.k.size() - 1; size >= 0; size--) {
            WidgetRun widgetRun = this.k.get(size);
            if (widgetRun.b.M() != 8) {
                return widgetRun.b;
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01a6, code lost:
        if (r1 != r10) goto L_0x01ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x01cc, code lost:
        if (r1 != r10) goto L_0x01ce;
     */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00ea  */
    @Override // androidx.constraintlayout.solver.widgets.analyzer.WidgetRun, androidx.constraintlayout.solver.widgets.analyzer.d
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(androidx.constraintlayout.solver.widgets.analyzer.d r27) {
        /*
        // Method dump skipped, instructions count: 1086
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.analyzer.c.a(androidx.constraintlayout.solver.widgets.analyzer.d):void");
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.constraintlayout.solver.widgets.analyzer.WidgetRun
    public void d() {
        Iterator<WidgetRun> it = this.k.iterator();
        while (it.hasNext()) {
            it.next().d();
        }
        int size = this.k.size();
        if (size >= 1) {
            ConstraintWidget constraintWidget = this.k.get(0).b;
            ConstraintWidget constraintWidget2 = this.k.get(size - 1).b;
            if (this.f == 0) {
                ConstraintAnchor constraintAnchor = constraintWidget.F;
                ConstraintAnchor constraintAnchor2 = constraintWidget2.H;
                DependencyNode i = i(constraintAnchor, 0);
                int f = constraintAnchor.f();
                ConstraintWidget n = n();
                if (n != null) {
                    f = n.F.f();
                }
                if (i != null) {
                    DependencyNode dependencyNode = this.h;
                    dependencyNode.l.add(i);
                    dependencyNode.f = f;
                    i.k.add(dependencyNode);
                }
                DependencyNode i2 = i(constraintAnchor2, 0);
                int f2 = constraintAnchor2.f();
                ConstraintWidget o = o();
                if (o != null) {
                    f2 = o.H.f();
                }
                if (i2 != null) {
                    DependencyNode dependencyNode2 = this.i;
                    dependencyNode2.l.add(i2);
                    dependencyNode2.f = -f2;
                    i2.k.add(dependencyNode2);
                }
            } else {
                ConstraintAnchor constraintAnchor3 = constraintWidget.G;
                ConstraintAnchor constraintAnchor4 = constraintWidget2.I;
                DependencyNode i3 = i(constraintAnchor3, 1);
                int f3 = constraintAnchor3.f();
                ConstraintWidget n2 = n();
                if (n2 != null) {
                    f3 = n2.G.f();
                }
                if (i3 != null) {
                    DependencyNode dependencyNode3 = this.h;
                    dependencyNode3.l.add(i3);
                    dependencyNode3.f = f3;
                    i3.k.add(dependencyNode3);
                }
                DependencyNode i4 = i(constraintAnchor4, 1);
                int f4 = constraintAnchor4.f();
                ConstraintWidget o2 = o();
                if (o2 != null) {
                    f4 = o2.I.f();
                }
                if (i4 != null) {
                    DependencyNode dependencyNode4 = this.i;
                    dependencyNode4.l.add(i4);
                    dependencyNode4.f = -f4;
                    i4.k.add(dependencyNode4);
                }
            }
            this.h.a = this;
            this.i.a = this;
        }
    }

    @Override // androidx.constraintlayout.solver.widgets.analyzer.WidgetRun
    public void e() {
        for (int i = 0; i < this.k.size(); i++) {
            this.k.get(i).e();
        }
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.constraintlayout.solver.widgets.analyzer.WidgetRun
    public void f() {
        this.c = null;
        Iterator<WidgetRun> it = this.k.iterator();
        while (it.hasNext()) {
            it.next().f();
        }
    }

    @Override // androidx.constraintlayout.solver.widgets.analyzer.WidgetRun
    public long j() {
        int size = this.k.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            WidgetRun widgetRun = this.k.get(i);
            j = ((long) widgetRun.i.f) + widgetRun.j() + j + ((long) widgetRun.h.f);
        }
        return j;
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.constraintlayout.solver.widgets.analyzer.WidgetRun
    public boolean l() {
        int size = this.k.size();
        for (int i = 0; i < size; i++) {
            if (!this.k.get(i).l()) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        StringBuilder V0 = je.V0("ChainRun ");
        V0.append(this.f == 0 ? "horizontal : " : "vertical : ");
        String sb = V0.toString();
        Iterator<WidgetRun> it = this.k.iterator();
        while (it.hasNext()) {
            String x0 = je.x0(sb, "<");
            sb = je.x0(x0 + it.next(), "> ");
        }
        return sb;
    }
}

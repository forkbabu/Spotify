package androidx.constraintlayout.solver.widgets.analyzer;

import androidx.constraintlayout.solver.d;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

public class n {
    static int f;
    ArrayList<ConstraintWidget> a = new ArrayList<>();
    int b = -1;
    int c = 0;
    ArrayList<a> d = null;
    private int e = -1;

    /* access modifiers changed from: package-private */
    public class a {
        public a(n nVar, ConstraintWidget constraintWidget, d dVar, int i) {
            new WeakReference(constraintWidget);
            dVar.p(constraintWidget.F);
            dVar.p(constraintWidget.G);
            dVar.p(constraintWidget.H);
            dVar.p(constraintWidget.I);
            dVar.p(constraintWidget.J);
        }
    }

    public n(int i) {
        int i2 = f;
        f = i2 + 1;
        this.b = i2;
        this.c = i;
    }

    public boolean a(ConstraintWidget constraintWidget) {
        if (this.a.contains(constraintWidget)) {
            return false;
        }
        this.a.add(constraintWidget);
        return true;
    }

    public void b(ArrayList<n> arrayList) {
        int size = this.a.size();
        if (this.e != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                n nVar = arrayList.get(i);
                if (this.e == nVar.b) {
                    d(this.c, nVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public int c(d dVar, int i) {
        int i2;
        int i3;
        if (this.a.size() == 0) {
            return 0;
        }
        ArrayList<ConstraintWidget> arrayList = this.a;
        androidx.constraintlayout.solver.widgets.d dVar2 = (androidx.constraintlayout.solver.widgets.d) arrayList.get(0).R;
        dVar.v();
        dVar2.f(dVar, false);
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            arrayList.get(i4).f(dVar, false);
        }
        if (i == 0 && dVar2.P0 > 0) {
            b.a(dVar2, dVar, arrayList, 0);
        }
        if (i == 1 && dVar2.Q0 > 0) {
            b.a(dVar2, dVar, arrayList, 1);
        }
        try {
            dVar.r();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        this.d = new ArrayList<>();
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            this.d.add(new a(this, arrayList.get(i5), dVar, i));
        }
        if (i == 0) {
            i2 = dVar.p(dVar2.F);
            i3 = dVar.p(dVar2.H);
            dVar.v();
        } else {
            i2 = dVar.p(dVar2.G);
            i3 = dVar.p(dVar2.I);
            dVar.v();
        }
        return i3 - i2;
    }

    public void d(int i, n nVar) {
        Iterator<ConstraintWidget> it = this.a.iterator();
        while (it.hasNext()) {
            ConstraintWidget next = it.next();
            nVar.a(next);
            if (i == 0) {
                next.F0 = nVar.b;
            } else {
                next.G0 = nVar.b;
            }
        }
        this.e = nVar.b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.c;
        sb.append(i == 0 ? "Horizontal" : i == 1 ? "Vertical" : i == 2 ? "Both" : "Unknown");
        sb.append(" [");
        String B0 = je.B0(sb, this.b, "] <");
        Iterator<ConstraintWidget> it = this.a.iterator();
        while (it.hasNext()) {
            StringBuilder Z0 = je.Z0(B0, " ");
            Z0.append(it.next().t());
            B0 = Z0.toString();
        }
        return je.x0(B0, " >");
    }
}

package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.widgets.analyzer.n;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class h extends ConstraintWidget implements g {
    public ConstraintWidget[] H0 = new ConstraintWidget[4];
    public int I0 = 0;

    public void L0(ArrayList<n> arrayList, int i, n nVar) {
        for (int i2 = 0; i2 < this.I0; i2++) {
            nVar.a(this.H0[i2]);
        }
        for (int i3 = 0; i3 < this.I0; i3++) {
            androidx.constraintlayout.solver.widgets.analyzer.h.a(this.H0[i3], i, arrayList, nVar);
        }
    }

    @Override // androidx.constraintlayout.solver.widgets.g
    public void a(ConstraintWidget constraintWidget) {
        if (constraintWidget != this && constraintWidget != null) {
            int i = this.I0 + 1;
            ConstraintWidget[] constraintWidgetArr = this.H0;
            if (i > constraintWidgetArr.length) {
                this.H0 = (ConstraintWidget[]) Arrays.copyOf(constraintWidgetArr, constraintWidgetArr.length * 2);
            }
            ConstraintWidget[] constraintWidgetArr2 = this.H0;
            int i2 = this.I0;
            constraintWidgetArr2[i2] = constraintWidget;
            this.I0 = i2 + 1;
        }
    }

    @Override // androidx.constraintlayout.solver.widgets.g
    public void b() {
        this.I0 = 0;
        Arrays.fill(this.H0, (Object) null);
    }

    @Override // androidx.constraintlayout.solver.widgets.g
    public void c(d dVar) {
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    public void l(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> hashMap) {
        super.l(constraintWidget, hashMap);
        h hVar = (h) constraintWidget;
        this.I0 = 0;
        int i = hVar.I0;
        for (int i2 = 0; i2 < i; i2++) {
            a(hashMap.get(hVar.H0[i2]));
        }
    }
}

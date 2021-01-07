package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.c;
import java.util.ArrayList;

public class k extends ConstraintWidget {
    public ArrayList<ConstraintWidget> H0 = new ArrayList<>();

    public void L0() {
        ArrayList<ConstraintWidget> arrayList = this.H0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ConstraintWidget constraintWidget = this.H0.get(i);
                if (constraintWidget instanceof k) {
                    ((k) constraintWidget).L0();
                }
            }
        }
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    public void a0() {
        this.H0.clear();
        super.a0();
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    public void d0(c cVar) {
        super.d0(cVar);
        int size = this.H0.size();
        for (int i = 0; i < size; i++) {
            this.H0.get(i).d0(cVar);
        }
    }
}

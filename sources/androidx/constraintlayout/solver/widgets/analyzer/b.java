package androidx.constraintlayout.solver.widgets.analyzer;

import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.d;
import java.util.ArrayList;

public class b {
    private final ArrayList<ConstraintWidget> a = new ArrayList<>();
    private a b = new a();
    private d c;

    public static class a {
        public ConstraintWidget.DimensionBehaviour a;
        public ConstraintWidget.DimensionBehaviour b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        public boolean h;
        public boolean i;
        public int j;
    }

    /* renamed from: androidx.constraintlayout.solver.widgets.analyzer.b$b  reason: collision with other inner class name */
    public interface AbstractC0022b {
        void a();

        void b(ConstraintWidget constraintWidget, a aVar);
    }

    public b(d dVar) {
        this.c = dVar;
    }

    private boolean a(AbstractC0022b bVar, ConstraintWidget constraintWidget, int i) {
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.FIXED;
        this.b.a = constraintWidget.z();
        this.b.b = constraintWidget.L();
        this.b.c = constraintWidget.N();
        this.b.d = constraintWidget.w();
        a aVar = this.b;
        aVar.i = false;
        aVar.j = i;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = aVar.a;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        boolean z = dimensionBehaviour2 == dimensionBehaviour3;
        boolean z2 = aVar.b == dimensionBehaviour3;
        boolean z3 = z && constraintWidget.U > 0.0f;
        boolean z4 = z2 && constraintWidget.U > 0.0f;
        if (z3 && constraintWidget.n[0] == 4) {
            aVar.a = dimensionBehaviour;
        }
        if (z4 && constraintWidget.n[1] == 4) {
            aVar.b = dimensionBehaviour;
        }
        bVar.b(constraintWidget, aVar);
        constraintWidget.G0(this.b.e);
        constraintWidget.o0(this.b.f);
        constraintWidget.n0(this.b.h);
        constraintWidget.e0(this.b.g);
        a aVar2 = this.b;
        aVar2.j = 0;
        return aVar2.i;
    }

    private void b(d dVar, int i, int i2) {
        int F = dVar.F();
        int E = dVar.E();
        dVar.A0(0);
        dVar.z0(0);
        dVar.G0(i);
        dVar.o0(i2);
        dVar.A0(F);
        dVar.z0(E);
        this.c.L0();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008f, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x016d, code lost:
        if (r3.e.j != false) goto L_0x016f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long c(androidx.constraintlayout.solver.widgets.d r22, int r23, int r24, int r25, int r26, int r27) {
        /*
        // Method dump skipped, instructions count: 947
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.analyzer.b.c(androidx.constraintlayout.solver.widgets.d, int, int, int, int, int):long");
    }

    public void d(d dVar) {
        this.a.clear();
        int size = dVar.H0.size();
        for (int i = 0; i < size; i++) {
            ConstraintWidget constraintWidget = dVar.H0.get(i);
            ConstraintWidget.DimensionBehaviour z = constraintWidget.z();
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
            if (z == dimensionBehaviour || constraintWidget.L() == dimensionBehaviour) {
                this.a.add(constraintWidget);
            }
        }
        dVar.J0.i();
    }
}

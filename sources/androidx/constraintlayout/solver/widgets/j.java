package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.analyzer.b;

public class j extends h {
    private int J0 = 0;
    private int K0 = 0;
    private int L0 = 0;
    private int M0 = 0;
    private int N0 = 0;
    private int O0 = 0;
    private boolean P0 = false;
    private int Q0 = 0;
    private int R0 = 0;
    protected b.a S0 = new b.a();
    b.AbstractC0022b T0 = null;

    public void M0(boolean z) {
        int i = this.L0;
        if (i <= 0 && this.M0 <= 0) {
            return;
        }
        if (z) {
            this.N0 = this.M0;
            this.O0 = i;
            return;
        }
        this.N0 = i;
        this.O0 = this.M0;
    }

    public void N0() {
        for (int i = 0; i < this.I0; i++) {
            ConstraintWidget constraintWidget = this.H0[i];
            if (constraintWidget != null) {
                constraintWidget.u0(true);
            }
        }
    }

    public int O0() {
        return this.R0;
    }

    public int P0() {
        return this.Q0;
    }

    public int Q0() {
        return this.K0;
    }

    public int R0() {
        return this.N0;
    }

    public int S0() {
        return this.O0;
    }

    public int T0() {
        return this.J0;
    }

    public void U0(int i, int i2, int i3, int i4) {
    }

    /* access modifiers changed from: protected */
    public void V0(ConstraintWidget constraintWidget, ConstraintWidget.DimensionBehaviour dimensionBehaviour, int i, ConstraintWidget.DimensionBehaviour dimensionBehaviour2, int i2) {
        b.AbstractC0022b bVar;
        ConstraintWidget constraintWidget2;
        while (true) {
            bVar = this.T0;
            if (bVar != null || (constraintWidget2 = this.R) == null) {
                break;
            }
            this.T0 = ((d) constraintWidget2).K0;
        }
        b.a aVar = this.S0;
        aVar.a = dimensionBehaviour;
        aVar.b = dimensionBehaviour2;
        aVar.c = i;
        aVar.d = i2;
        bVar.b(constraintWidget, aVar);
        constraintWidget.G0(this.S0.e);
        constraintWidget.o0(this.S0.f);
        constraintWidget.n0(this.S0.h);
        constraintWidget.e0(this.S0.g);
    }

    public boolean W0() {
        return this.P0;
    }

    /* access modifiers changed from: protected */
    public void X0(boolean z) {
        this.P0 = z;
    }

    public void Y0(int i, int i2) {
        this.Q0 = i;
        this.R0 = i2;
    }

    public void Z0(int i) {
        this.J0 = i;
        this.K0 = i;
        this.L0 = i;
        this.M0 = i;
    }

    public void a1(int i) {
        this.K0 = i;
    }

    public void b1(int i) {
        this.M0 = i;
    }

    @Override // androidx.constraintlayout.solver.widgets.h, androidx.constraintlayout.solver.widgets.g
    public void c(d dVar) {
        N0();
    }

    public void c1(int i) {
        this.N0 = i;
    }

    public void d1(int i) {
        this.O0 = i;
    }

    public void e1(int i) {
        this.L0 = i;
        this.N0 = i;
        this.O0 = i;
    }

    public void f1(int i) {
        this.J0 = i;
    }
}

package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.SolverVariable;
import androidx.constraintlayout.solver.b;
import androidx.constraintlayout.solver.d;
import androidx.constraintlayout.solver.widgets.ConstraintAnchor;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import java.util.HashMap;

public class f extends ConstraintWidget {
    protected float H0 = -1.0f;
    protected int I0 = -1;
    protected int J0 = -1;
    private ConstraintAnchor K0 = this.G;
    private int L0;
    private boolean M0;

    public f() {
        this.L0 = 0;
        this.O.clear();
        this.O.add(this.K0);
        int length = this.N.length;
        for (int i = 0; i < length; i++) {
            this.N[i] = this.K0;
        }
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    public void K0(d dVar, boolean z) {
        if (this.R != null) {
            int p = dVar.p(this.K0);
            if (this.L0 == 1) {
                this.W = p;
                this.X = 0;
                o0(this.R.w());
                G0(0);
                return;
            }
            this.W = 0;
            this.X = p;
            G0(this.R.N());
            o0(0);
        }
    }

    public ConstraintAnchor L0() {
        return this.K0;
    }

    public int M0() {
        return this.L0;
    }

    public int N0() {
        return this.I0;
    }

    public int O0() {
        return this.J0;
    }

    public float P0() {
        return this.H0;
    }

    public void Q0(int i) {
        this.K0.q(i);
        this.M0 = true;
    }

    public void R0(int i) {
        if (i > -1) {
            this.H0 = -1.0f;
            this.I0 = i;
            this.J0 = -1;
        }
    }

    public void S0(int i) {
        if (i > -1) {
            this.H0 = -1.0f;
            this.I0 = -1;
            this.J0 = i;
        }
    }

    public void T0(float f) {
        if (f > -1.0f) {
            this.H0 = f;
            this.I0 = -1;
            this.J0 = -1;
        }
    }

    public void U0(int i) {
        if (this.L0 != i) {
            this.L0 = i;
            this.O.clear();
            if (this.L0 == 1) {
                this.K0 = this.F;
            } else {
                this.K0 = this.G;
            }
            this.O.add(this.K0);
            int length = this.N.length;
            for (int i2 = 0; i2 < length; i2++) {
                this.N[i2] = this.K0;
            }
        }
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    public boolean Y() {
        return this.M0;
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    public boolean Z() {
        return this.M0;
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    public void f(d dVar, boolean z) {
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        d dVar2 = (d) this.R;
        if (dVar2 != null) {
            ConstraintAnchor o = dVar2.o(ConstraintAnchor.Type.LEFT);
            ConstraintAnchor o2 = dVar2.o(ConstraintAnchor.Type.RIGHT);
            ConstraintWidget constraintWidget = this.R;
            boolean z2 = true;
            boolean z3 = constraintWidget != null && constraintWidget.Q[0] == dimensionBehaviour;
            if (this.L0 == 0) {
                o = dVar2.o(ConstraintAnchor.Type.TOP);
                o2 = dVar2.o(ConstraintAnchor.Type.BOTTOM);
                ConstraintWidget constraintWidget2 = this.R;
                if (constraintWidget2 == null || constraintWidget2.Q[1] != dimensionBehaviour) {
                    z2 = false;
                }
                z3 = z2;
            }
            if (this.M0 && this.K0.k()) {
                SolverVariable l = dVar.l(this.K0);
                dVar.e(l, this.K0.e());
                if (this.I0 != -1) {
                    if (z3) {
                        dVar.f(dVar.l(o2), l, 0, 5);
                    }
                } else if (this.J0 != -1 && z3) {
                    SolverVariable l2 = dVar.l(o2);
                    dVar.f(l, dVar.l(o), 0, 5);
                    dVar.f(l2, l, 0, 5);
                }
                this.M0 = false;
            } else if (this.I0 != -1) {
                SolverVariable l3 = dVar.l(this.K0);
                dVar.d(l3, dVar.l(o), this.I0, 8);
                if (z3) {
                    dVar.f(dVar.l(o2), l3, 0, 5);
                }
            } else if (this.J0 != -1) {
                SolverVariable l4 = dVar.l(this.K0);
                SolverVariable l5 = dVar.l(o2);
                dVar.d(l4, l5, -this.J0, 8);
                if (z3) {
                    dVar.f(l4, dVar.l(o), 0, 5);
                    dVar.f(l5, l4, 0, 5);
                }
            } else if (this.H0 != -1.0f) {
                SolverVariable l6 = dVar.l(this.K0);
                SolverVariable l7 = dVar.l(o2);
                float f = this.H0;
                b m = dVar.m();
                m.d.f(l6, -1.0f);
                m.d.f(l7, f);
                dVar.c(m);
            }
        }
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    public boolean g() {
        return true;
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    public void l(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> hashMap) {
        super.l(constraintWidget, hashMap);
        f fVar = (f) constraintWidget;
        this.H0 = fVar.H0;
        this.I0 = fVar.I0;
        this.J0 = fVar.J0;
        U0(fVar.L0);
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    public ConstraintAnchor o(ConstraintAnchor.Type type) {
        switch (type.ordinal()) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
            case 3:
                if (this.L0 == 1) {
                    return this.K0;
                }
                break;
            case 2:
            case 4:
                if (this.L0 == 0) {
                    return this.K0;
                }
                break;
        }
        throw new AssertionError(type.name());
    }
}

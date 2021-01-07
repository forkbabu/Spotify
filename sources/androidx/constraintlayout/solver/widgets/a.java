package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.SolverVariable;
import androidx.constraintlayout.solver.b;
import androidx.constraintlayout.solver.d;
import androidx.constraintlayout.solver.widgets.ConstraintAnchor;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import java.util.HashMap;

public class a extends h {
    private int J0 = 0;
    private boolean K0 = true;
    private int L0 = 0;
    boolean M0 = false;

    public boolean M0() {
        int i;
        int i2;
        int i3;
        ConstraintAnchor.Type type = ConstraintAnchor.Type.BOTTOM;
        ConstraintAnchor.Type type2 = ConstraintAnchor.Type.TOP;
        ConstraintAnchor.Type type3 = ConstraintAnchor.Type.RIGHT;
        ConstraintAnchor.Type type4 = ConstraintAnchor.Type.LEFT;
        int i4 = 0;
        boolean z = true;
        while (true) {
            i = this.I0;
            if (i4 >= i) {
                break;
            }
            ConstraintWidget constraintWidget = this.H0[i4];
            if ((this.K0 || constraintWidget.g()) && ((((i2 = this.J0) == 0 || i2 == 1) && !constraintWidget.Y()) || (((i3 = this.J0) == 2 || i3 == 3) && !constraintWidget.Z()))) {
                z = false;
            }
            i4++;
        }
        if (!z || i <= 0) {
            return false;
        }
        int i5 = 0;
        boolean z2 = false;
        for (int i6 = 0; i6 < this.I0; i6++) {
            ConstraintWidget constraintWidget2 = this.H0[i6];
            if (this.K0 || constraintWidget2.g()) {
                if (!z2) {
                    int i7 = this.J0;
                    if (i7 == 0) {
                        i5 = constraintWidget2.o(type4).e();
                    } else if (i7 == 1) {
                        i5 = constraintWidget2.o(type3).e();
                    } else if (i7 == 2) {
                        i5 = constraintWidget2.o(type2).e();
                    } else if (i7 == 3) {
                        i5 = constraintWidget2.o(type).e();
                    }
                    z2 = true;
                }
                int i8 = this.J0;
                if (i8 == 0) {
                    i5 = Math.min(i5, constraintWidget2.o(type4).e());
                } else if (i8 == 1) {
                    i5 = Math.max(i5, constraintWidget2.o(type3).e());
                } else if (i8 == 2) {
                    i5 = Math.min(i5, constraintWidget2.o(type2).e());
                } else if (i8 == 3) {
                    i5 = Math.max(i5, constraintWidget2.o(type).e());
                }
            }
        }
        int i9 = i5 + this.L0;
        int i10 = this.J0;
        if (i10 == 0 || i10 == 1) {
            j0(i9, i9);
        } else {
            m0(i9, i9);
        }
        this.M0 = true;
        return true;
    }

    public boolean N0() {
        return this.K0;
    }

    public int O0() {
        return this.J0;
    }

    public int P0() {
        return this.L0;
    }

    public int Q0() {
        int i = this.J0;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }

    /* access modifiers changed from: protected */
    public void R0() {
        for (int i = 0; i < this.I0; i++) {
            ConstraintWidget constraintWidget = this.H0[i];
            int i2 = this.J0;
            if (i2 == 0 || i2 == 1) {
                constraintWidget.s0(0, true);
            } else if (i2 == 2 || i2 == 3) {
                constraintWidget.s0(1, true);
            }
        }
    }

    public void S0(boolean z) {
        this.K0 = z;
    }

    public void T0(int i) {
        this.J0 = i;
    }

    public void U0(int i) {
        this.L0 = i;
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
        Object[] objArr;
        boolean z2;
        int i;
        int i2;
        int i3;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        ConstraintAnchor[] constraintAnchorArr = this.N;
        constraintAnchorArr[0] = this.F;
        constraintAnchorArr[2] = this.G;
        constraintAnchorArr[1] = this.H;
        constraintAnchorArr[3] = this.I;
        int i4 = 0;
        while (true) {
            objArr = this.N;
            if (i4 >= objArr.length) {
                break;
            }
            objArr[i4].i = dVar.l(objArr[i4]);
            i4++;
        }
        int i5 = this.J0;
        if (i5 >= 0 && i5 < 4) {
            ConstraintAnchor constraintAnchor = objArr[i5];
            if (!this.M0) {
                M0();
            }
            if (this.M0) {
                this.M0 = false;
                int i6 = this.J0;
                if (i6 == 0 || i6 == 1) {
                    dVar.e(this.F.i, this.W);
                    dVar.e(this.H.i, this.W);
                } else if (i6 == 2 || i6 == 3) {
                    dVar.e(this.G.i, this.X);
                    dVar.e(this.I.i, this.X);
                }
            } else {
                int i7 = 0;
                while (true) {
                    if (i7 >= this.I0) {
                        z2 = false;
                        break;
                    }
                    ConstraintWidget constraintWidget = this.H0[i7];
                    if ((this.K0 || constraintWidget.g()) && ((((i2 = this.J0) == 0 || i2 == 1) && constraintWidget.z() == dimensionBehaviour && constraintWidget.F.f != null && constraintWidget.H.f != null) || (((i3 = this.J0) == 2 || i3 == 3) && constraintWidget.L() == dimensionBehaviour && constraintWidget.G.f != null && constraintWidget.I.f != null))) {
                        break;
                    }
                    i7++;
                }
                z2 = true;
                boolean z3 = this.F.i() || this.H.i();
                boolean z4 = this.G.i() || this.I.i();
                boolean z5 = !z2 && (((i = this.J0) == 0 && z3) || ((i == 2 && z4) || ((i == 1 && z3) || (i == 3 && z4))));
                int i8 = 5;
                if (!z5) {
                    i8 = 4;
                }
                for (int i9 = 0; i9 < this.I0; i9++) {
                    ConstraintWidget constraintWidget2 = this.H0[i9];
                    if (this.K0 || constraintWidget2.g()) {
                        SolverVariable l = dVar.l(constraintWidget2.N[this.J0]);
                        ConstraintAnchor[] constraintAnchorArr2 = constraintWidget2.N;
                        int i10 = this.J0;
                        constraintAnchorArr2[i10].i = l;
                        int i11 = (constraintAnchorArr2[i10].f == null || constraintAnchorArr2[i10].f.d != this) ? 0 : constraintAnchorArr2[i10].g + 0;
                        if (i10 == 0 || i10 == 2) {
                            b m = dVar.m();
                            SolverVariable n = dVar.n();
                            n.d = 0;
                            m.h(constraintAnchor.i, l, n, this.L0 - i11);
                            dVar.c(m);
                        } else {
                            b m2 = dVar.m();
                            SolverVariable n2 = dVar.n();
                            n2.d = 0;
                            m2.g(constraintAnchor.i, l, n2, this.L0 + i11);
                            dVar.c(m2);
                        }
                        dVar.d(constraintAnchor.i, l, this.L0 + i11, i8);
                    }
                }
                int i12 = this.J0;
                if (i12 == 0) {
                    dVar.d(this.H.i, this.F.i, 0, 8);
                    dVar.d(this.F.i, this.R.H.i, 0, 4);
                    dVar.d(this.F.i, this.R.F.i, 0, 0);
                } else if (i12 == 1) {
                    dVar.d(this.F.i, this.H.i, 0, 8);
                    dVar.d(this.F.i, this.R.F.i, 0, 4);
                    dVar.d(this.F.i, this.R.H.i, 0, 0);
                } else if (i12 == 2) {
                    dVar.d(this.I.i, this.G.i, 0, 8);
                    dVar.d(this.G.i, this.R.I.i, 0, 4);
                    dVar.d(this.G.i, this.R.G.i, 0, 0);
                } else if (i12 == 3) {
                    dVar.d(this.G.i, this.I.i, 0, 8);
                    dVar.d(this.G.i, this.R.G.i, 0, 4);
                    dVar.d(this.G.i, this.R.I.i, 0, 0);
                }
            }
        }
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    public boolean g() {
        return true;
    }

    @Override // androidx.constraintlayout.solver.widgets.h, androidx.constraintlayout.solver.widgets.ConstraintWidget
    public void l(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> hashMap) {
        super.l(constraintWidget, hashMap);
        a aVar = (a) constraintWidget;
        this.J0 = aVar.J0;
        this.K0 = aVar.K0;
        this.L0 = aVar.L0;
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    public String toString() {
        StringBuilder V0 = je.V0("[Barrier] ");
        V0.append(t());
        V0.append(" {");
        String sb = V0.toString();
        for (int i = 0; i < this.I0; i++) {
            ConstraintWidget constraintWidget = this.H0[i];
            if (i > 0) {
                sb = je.x0(sb, ", ");
            }
            StringBuilder V02 = je.V0(sb);
            V02.append(constraintWidget.t());
            sb = V02.toString();
        }
        return je.x0(sb, "}");
    }
}

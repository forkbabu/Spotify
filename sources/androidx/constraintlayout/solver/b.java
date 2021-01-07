package androidx.constraintlayout.solver;

import androidx.constraintlayout.solver.SolverVariable;
import androidx.constraintlayout.solver.d;
import java.util.ArrayList;

public class b implements d.a {
    SolverVariable a = null;
    float b = 0.0f;
    ArrayList<SolverVariable> c = new ArrayList<>();
    public a d;
    boolean e = false;

    public interface a {
        SolverVariable a(int i);

        void b();

        void c(SolverVariable solverVariable, float f, boolean z);

        void clear();

        float d(SolverVariable solverVariable);

        float e(b bVar, boolean z);

        void f(SolverVariable solverVariable, float f);

        float g(SolverVariable solverVariable, boolean z);

        int h();

        float i(int i);

        boolean j(SolverVariable solverVariable);

        void k(float f);
    }

    public b() {
    }

    private boolean j(SolverVariable solverVariable) {
        return solverVariable.l <= 1;
    }

    private SolverVariable l(boolean[] zArr, SolverVariable solverVariable) {
        SolverVariable.Type type;
        int h = this.d.h();
        SolverVariable solverVariable2 = null;
        float f = 0.0f;
        for (int i = 0; i < h; i++) {
            float i2 = this.d.i(i);
            if (i2 < 0.0f) {
                SolverVariable a2 = this.d.a(i);
                if ((zArr == null || !zArr[a2.b]) && a2 != solverVariable && (((type = a2.i) == SolverVariable.Type.SLACK || type == SolverVariable.Type.ERROR) && i2 < f)) {
                    f = i2;
                    solverVariable2 = a2;
                }
            }
        }
        return solverVariable2;
    }

    @Override // androidx.constraintlayout.solver.d.a
    public void a(SolverVariable solverVariable) {
        float f;
        int i = solverVariable.d;
        if (i != 1) {
            if (i == 2) {
                f = 1000.0f;
            } else if (i == 3) {
                f = 1000000.0f;
            } else if (i == 4) {
                f = 1.0E9f;
            } else if (i == 5) {
                f = 1.0E12f;
            }
            this.d.f(solverVariable, f);
        }
        f = 1.0f;
        this.d.f(solverVariable, f);
    }

    @Override // androidx.constraintlayout.solver.d.a
    public SolverVariable b(d dVar, boolean[] zArr) {
        return l(zArr, null);
    }

    public b c(d dVar, int i) {
        this.d.f(dVar.k(i, "ep"), 1.0f);
        this.d.f(dVar.k(i, "em"), -1.0f);
        return this;
    }

    @Override // androidx.constraintlayout.solver.d.a
    public void clear() {
        this.d.clear();
        this.a = null;
        this.b = 0.0f;
    }

    /* access modifiers changed from: package-private */
    public boolean d(d dVar) {
        boolean j;
        boolean j2;
        int h = this.d.h();
        SolverVariable solverVariable = null;
        boolean z = false;
        SolverVariable solverVariable2 = null;
        float f = 0.0f;
        boolean z2 = false;
        float f2 = 0.0f;
        boolean z3 = false;
        for (int i = 0; i < h; i++) {
            float i2 = this.d.i(i);
            SolverVariable a2 = this.d.a(i);
            if (a2.i == SolverVariable.Type.UNRESTRICTED) {
                if (solverVariable == null) {
                    j2 = j(a2);
                } else if (f > i2) {
                    j2 = j(a2);
                } else if (!z2 && j(a2)) {
                    f = i2;
                    solverVariable = a2;
                    z2 = true;
                }
                z2 = j2;
                f = i2;
                solverVariable = a2;
            } else if (solverVariable == null && i2 < 0.0f) {
                if (solverVariable2 == null) {
                    j = j(a2);
                } else if (f2 > i2) {
                    j = j(a2);
                } else if (!z3 && j(a2)) {
                    f2 = i2;
                    solverVariable2 = a2;
                    z3 = true;
                }
                z3 = j;
                f2 = i2;
                solverVariable2 = a2;
            }
        }
        if (solverVariable == null) {
            solverVariable = solverVariable2;
        }
        if (solverVariable == null) {
            z = true;
        } else {
            m(solverVariable);
        }
        if (this.d.h() == 0) {
            this.e = true;
        }
        return z;
    }

    public b e(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4, float f) {
        this.d.f(solverVariable, -1.0f);
        this.d.f(solverVariable2, 1.0f);
        this.d.f(solverVariable3, f);
        this.d.f(solverVariable4, -f);
        return this;
    }

    public b f(float f, float f2, float f3, SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4) {
        this.b = 0.0f;
        if (f2 == 0.0f || f == f3) {
            this.d.f(solverVariable, 1.0f);
            this.d.f(solverVariable2, -1.0f);
            this.d.f(solverVariable4, 1.0f);
            this.d.f(solverVariable3, -1.0f);
        } else if (f == 0.0f) {
            this.d.f(solverVariable, 1.0f);
            this.d.f(solverVariable2, -1.0f);
        } else if (f3 == 0.0f) {
            this.d.f(solverVariable3, 1.0f);
            this.d.f(solverVariable4, -1.0f);
        } else {
            float f4 = (f / f2) / (f3 / f2);
            this.d.f(solverVariable, 1.0f);
            this.d.f(solverVariable2, -1.0f);
            this.d.f(solverVariable4, f4);
            this.d.f(solverVariable3, -f4);
        }
        return this;
    }

    public b g(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.b = (float) i;
        }
        if (!z) {
            this.d.f(solverVariable, -1.0f);
            this.d.f(solverVariable2, 1.0f);
            this.d.f(solverVariable3, 1.0f);
        } else {
            this.d.f(solverVariable, 1.0f);
            this.d.f(solverVariable2, -1.0f);
            this.d.f(solverVariable3, -1.0f);
        }
        return this;
    }

    public b h(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.b = (float) i;
        }
        if (!z) {
            this.d.f(solverVariable, -1.0f);
            this.d.f(solverVariable2, 1.0f);
            this.d.f(solverVariable3, -1.0f);
        } else {
            this.d.f(solverVariable, 1.0f);
            this.d.f(solverVariable2, -1.0f);
            this.d.f(solverVariable3, 1.0f);
        }
        return this;
    }

    public b i(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4, float f) {
        this.d.f(solverVariable3, 0.5f);
        this.d.f(solverVariable4, 0.5f);
        this.d.f(solverVariable, -0.5f);
        this.d.f(solverVariable2, -0.5f);
        this.b = -f;
        return this;
    }

    @Override // androidx.constraintlayout.solver.d.a
    public boolean isEmpty() {
        return this.a == null && this.b == 0.0f && this.d.h() == 0;
    }

    public SolverVariable k(SolverVariable solverVariable) {
        return l(null, solverVariable);
    }

    /* access modifiers changed from: package-private */
    public void m(SolverVariable solverVariable) {
        SolverVariable solverVariable2 = this.a;
        if (solverVariable2 != null) {
            this.d.f(solverVariable2, -1.0f);
            this.a.c = -1;
            this.a = null;
        }
        float g = this.d.g(solverVariable, true) * -1.0f;
        this.a = solverVariable;
        if (g != 1.0f) {
            this.b /= g;
            this.d.k(g);
        }
    }

    public void n(d dVar, SolverVariable solverVariable, boolean z) {
        if (solverVariable.f) {
            float d2 = this.d.d(solverVariable);
            this.b = (solverVariable.e * d2) + this.b;
            this.d.g(solverVariable, z);
            if (z) {
                solverVariable.c(this);
            }
            if (this.d.h() == 0) {
                this.e = true;
                dVar.a = true;
            }
        }
    }

    public void o(d dVar, b bVar, boolean z) {
        float e2 = this.d.e(bVar, z);
        this.b = (bVar.b * e2) + this.b;
        if (z) {
            bVar.a.c(this);
        }
        if (this.a != null && this.d.h() == 0) {
            this.e = true;
            dVar.a = true;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0081  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r8 = this;
            androidx.constraintlayout.solver.SolverVariable r0 = r8.a
            if (r0 != 0) goto L_0x0007
            java.lang.String r0 = "0"
            goto L_0x0016
        L_0x0007:
            java.lang.String r0 = ""
            java.lang.StringBuilder r0 = defpackage.je.V0(r0)
            androidx.constraintlayout.solver.SolverVariable r1 = r8.a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L_0x0016:
            java.lang.String r1 = " = "
            java.lang.String r0 = defpackage.je.x0(r0, r1)
            float r1 = r8.b
            r2 = 0
            r3 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 == 0) goto L_0x0033
            java.lang.StringBuilder r0 = defpackage.je.V0(r0)
            float r1 = r8.b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 1
            goto L_0x0034
        L_0x0033:
            r1 = 0
        L_0x0034:
            androidx.constraintlayout.solver.b$a r4 = r8.d
            int r4 = r4.h()
        L_0x003a:
            if (r3 >= r4) goto L_0x009c
            androidx.constraintlayout.solver.b$a r5 = r8.d
            androidx.constraintlayout.solver.SolverVariable r5 = r5.a(r3)
            if (r5 != 0) goto L_0x0045
            goto L_0x0099
        L_0x0045:
            androidx.constraintlayout.solver.b$a r6 = r8.d
            float r6 = r6.i(r3)
            int r7 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r7 != 0) goto L_0x0050
            goto L_0x0099
        L_0x0050:
            java.lang.String r5 = r5.toString()
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L_0x0063
            int r1 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r1 >= 0) goto L_0x0076
            java.lang.String r1 = "- "
            java.lang.String r0 = defpackage.je.x0(r0, r1)
            goto L_0x0074
        L_0x0063:
            int r1 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r1 <= 0) goto L_0x006e
            java.lang.String r1 = " + "
            java.lang.String r0 = defpackage.je.x0(r0, r1)
            goto L_0x0076
        L_0x006e:
            java.lang.String r1 = " - "
            java.lang.String r0 = defpackage.je.x0(r0, r1)
        L_0x0074:
            float r6 = r6 * r7
        L_0x0076:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x0081
            java.lang.String r0 = defpackage.je.x0(r0, r5)
            goto L_0x0098
        L_0x0081:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = " "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = r1.toString()
        L_0x0098:
            r1 = 1
        L_0x0099:
            int r3 = r3 + 1
            goto L_0x003a
        L_0x009c:
            if (r1 != 0) goto L_0x00a4
            java.lang.String r1 = "0.0"
            java.lang.String r0 = defpackage.je.x0(r0, r1)
        L_0x00a4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.b.toString():java.lang.String");
    }

    public b(c cVar) {
        this.d = new a(this, cVar);
    }
}

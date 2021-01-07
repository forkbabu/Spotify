package androidx.constraintlayout.solver;

import androidx.constraintlayout.solver.SolverVariable;
import androidx.constraintlayout.solver.widgets.ConstraintAnchor;
import java.util.Arrays;

public class d {
    public static boolean p = false;
    private static int q = 1000;
    public static long r;
    public boolean a;
    int b;
    private a c;
    private int d;
    private int e;
    b[] f;
    public boolean g;
    private boolean[] h;
    int i;
    int j;
    private int k;
    final c l;
    private SolverVariable[] m;
    private int n;
    private a o;

    /* access modifiers changed from: package-private */
    public interface a {
        void a(SolverVariable solverVariable);

        SolverVariable b(d dVar, boolean[] zArr);

        void clear();

        boolean isEmpty();
    }

    public d() {
        this.a = false;
        this.b = 0;
        this.d = 32;
        this.e = 32;
        this.f = null;
        this.g = false;
        this.h = new boolean[32];
        this.i = 1;
        this.j = 0;
        this.k = 32;
        this.m = new SolverVariable[q];
        this.n = 0;
        this.f = new b[32];
        u();
        c cVar = new c();
        this.l = cVar;
        this.c = new g(cVar);
        this.o = new b(cVar);
    }

    private SolverVariable a(SolverVariable.Type type, String str) {
        SolverVariable a2 = this.l.c.a();
        if (a2 == null) {
            a2 = new SolverVariable(type);
            a2.i = type;
        } else {
            a2.d();
            a2.i = type;
        }
        int i2 = this.n;
        int i3 = q;
        if (i2 >= i3) {
            int i4 = i3 * 2;
            q = i4;
            this.m = (SolverVariable[]) Arrays.copyOf(this.m, i4);
        }
        SolverVariable[] solverVariableArr = this.m;
        int i5 = this.n;
        this.n = i5 + 1;
        solverVariableArr[i5] = a2;
        return a2;
    }

    private final void i(b bVar) {
        int i2;
        if (bVar.e) {
            bVar.a.e(this, bVar.b);
        } else {
            b[] bVarArr = this.f;
            int i3 = this.j;
            bVarArr[i3] = bVar;
            SolverVariable solverVariable = bVar.a;
            solverVariable.c = i3;
            this.j = i3 + 1;
            solverVariable.f(this, bVar);
        }
        if (this.a) {
            int i4 = 0;
            while (i4 < this.j) {
                if (this.f[i4] == null) {
                    System.out.println("WTF");
                }
                b[] bVarArr2 = this.f;
                if (bVarArr2[i4] != null && bVarArr2[i4].e) {
                    b bVar2 = bVarArr2[i4];
                    bVar2.a.e(this, bVar2.b);
                    this.l.b.b(bVar2);
                    this.f[i4] = null;
                    int i5 = i4 + 1;
                    int i6 = i5;
                    while (true) {
                        i2 = this.j;
                        if (i5 >= i2) {
                            break;
                        }
                        b[] bVarArr3 = this.f;
                        int i7 = i5 - 1;
                        bVarArr3[i7] = bVarArr3[i5];
                        if (bVarArr3[i7].a.c == i5) {
                            bVarArr3[i7].a.c = i7;
                        }
                        i6 = i5;
                        i5++;
                    }
                    if (i6 < i2) {
                        this.f[i6] = null;
                    }
                    this.j = i2 - 1;
                    i4--;
                }
                i4++;
            }
            this.a = false;
        }
    }

    private void j() {
        for (int i2 = 0; i2 < this.j; i2++) {
            b bVar = this.f[i2];
            bVar.a.e = bVar.b;
        }
    }

    private void q() {
        int i2 = this.d * 2;
        this.d = i2;
        this.f = (b[]) Arrays.copyOf(this.f, i2);
        c cVar = this.l;
        cVar.d = (SolverVariable[]) Arrays.copyOf(cVar.d, this.d);
        int i3 = this.d;
        this.h = new boolean[i3];
        this.e = i3;
        this.k = i3;
    }

    private final int t(a aVar) {
        for (int i2 = 0; i2 < this.i; i2++) {
            this.h[i2] = false;
        }
        boolean z = false;
        int i3 = 0;
        while (!z) {
            i3++;
            if (i3 >= this.i * 2) {
                return i3;
            }
            SolverVariable solverVariable = ((b) aVar).a;
            if (solverVariable != null) {
                this.h[solverVariable.b] = true;
            }
            SolverVariable b2 = aVar.b(this, this.h);
            if (b2 != null) {
                boolean[] zArr = this.h;
                int i4 = b2.b;
                if (zArr[i4]) {
                    return i3;
                }
                zArr[i4] = true;
            }
            if (b2 != null) {
                float f2 = Float.MAX_VALUE;
                int i5 = -1;
                for (int i6 = 0; i6 < this.j; i6++) {
                    b bVar = this.f[i6];
                    if (bVar.a.i != SolverVariable.Type.UNRESTRICTED && !bVar.e && bVar.d.j(b2)) {
                        float d2 = bVar.d.d(b2);
                        if (d2 < 0.0f) {
                            float f3 = (-bVar.b) / d2;
                            if (f3 < f2) {
                                i5 = i6;
                                f2 = f3;
                            }
                        }
                    }
                }
                if (i5 > -1) {
                    b bVar2 = this.f[i5];
                    bVar2.a.c = -1;
                    bVar2.m(b2);
                    SolverVariable solverVariable2 = bVar2.a;
                    solverVariable2.c = i5;
                    solverVariable2.f(this, bVar2);
                }
            } else {
                z = true;
            }
        }
        return i3;
    }

    private void u() {
        for (int i2 = 0; i2 < this.j; i2++) {
            b bVar = this.f[i2];
            if (bVar != null) {
                this.l.b.b(bVar);
            }
            this.f[i2] = null;
        }
    }

    public void b(SolverVariable solverVariable, SolverVariable solverVariable2, int i2, float f2, SolverVariable solverVariable3, SolverVariable solverVariable4, int i3, int i4) {
        b m2 = m();
        if (solverVariable2 == solverVariable3) {
            m2.d.f(solverVariable, 1.0f);
            m2.d.f(solverVariable4, 1.0f);
            m2.d.f(solverVariable2, -2.0f);
        } else if (f2 == 0.5f) {
            m2.d.f(solverVariable, 1.0f);
            m2.d.f(solverVariable2, -1.0f);
            m2.d.f(solverVariable3, -1.0f);
            m2.d.f(solverVariable4, 1.0f);
            if (i2 > 0 || i3 > 0) {
                m2.b = (float) ((-i2) + i3);
            }
        } else if (f2 <= 0.0f) {
            m2.d.f(solverVariable, -1.0f);
            m2.d.f(solverVariable2, 1.0f);
            m2.b = (float) i2;
        } else if (f2 >= 1.0f) {
            m2.d.f(solverVariable4, -1.0f);
            m2.d.f(solverVariable3, 1.0f);
            m2.b = (float) (-i3);
        } else {
            float f3 = 1.0f - f2;
            m2.d.f(solverVariable, f3 * 1.0f);
            m2.d.f(solverVariable2, f3 * -1.0f);
            m2.d.f(solverVariable3, -1.0f * f2);
            m2.d.f(solverVariable4, 1.0f * f2);
            if (i2 > 0 || i3 > 0) {
                m2.b = (((float) i3) * f2) + (((float) (-i2)) * f3);
            }
        }
        if (i4 != 8) {
            m2.c(this, i4);
        }
        c(m2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:73:0x013b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x013c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void c(androidx.constraintlayout.solver.b r11) {
        /*
        // Method dump skipped, instructions count: 323
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.d.c(androidx.constraintlayout.solver.b):void");
    }

    public b d(SolverVariable solverVariable, SolverVariable solverVariable2, int i2, int i3) {
        if (i3 == 8 && solverVariable2.f && solverVariable.c == -1) {
            solverVariable.e(this, solverVariable2.e + ((float) i2));
            return null;
        }
        b m2 = m();
        boolean z = false;
        if (i2 != 0) {
            if (i2 < 0) {
                i2 *= -1;
                z = true;
            }
            m2.b = (float) i2;
        }
        if (!z) {
            m2.d.f(solverVariable, -1.0f);
            m2.d.f(solverVariable2, 1.0f);
        } else {
            m2.d.f(solverVariable, 1.0f);
            m2.d.f(solverVariable2, -1.0f);
        }
        if (i3 != 8) {
            m2.c(this, i3);
        }
        c(m2);
        return m2;
    }

    public void e(SolverVariable solverVariable, int i2) {
        int i3 = solverVariable.c;
        if (i3 == -1) {
            solverVariable.e(this, (float) i2);
            for (int i4 = 0; i4 < this.b + 1; i4++) {
                SolverVariable solverVariable2 = this.l.d[i4];
            }
        } else if (i3 != -1) {
            b bVar = this.f[i3];
            if (bVar.e) {
                bVar.b = (float) i2;
            } else if (bVar.d.h() == 0) {
                bVar.e = true;
                bVar.b = (float) i2;
            } else {
                b m2 = m();
                if (i2 < 0) {
                    m2.b = (float) (i2 * -1);
                    m2.d.f(solverVariable, 1.0f);
                } else {
                    m2.b = (float) i2;
                    m2.d.f(solverVariable, -1.0f);
                }
                c(m2);
            }
        } else {
            b m3 = m();
            m3.a = solverVariable;
            float f2 = (float) i2;
            solverVariable.e = f2;
            m3.b = f2;
            m3.e = true;
            c(m3);
        }
    }

    public void f(SolverVariable solverVariable, SolverVariable solverVariable2, int i2, int i3) {
        b m2 = m();
        SolverVariable n2 = n();
        n2.d = 0;
        m2.g(solverVariable, solverVariable2, n2, i2);
        if (i3 != 8) {
            m2.d.f(k(i3, null), (float) ((int) (m2.d.d(n2) * -1.0f)));
        }
        c(m2);
    }

    public void g(SolverVariable solverVariable, SolverVariable solverVariable2, int i2, int i3) {
        b m2 = m();
        SolverVariable n2 = n();
        n2.d = 0;
        m2.h(solverVariable, solverVariable2, n2, i2);
        if (i3 != 8) {
            m2.d.f(k(i3, null), (float) ((int) (m2.d.d(n2) * -1.0f)));
        }
        c(m2);
    }

    public void h(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4, float f2, int i2) {
        b m2 = m();
        m2.e(solverVariable, solverVariable2, solverVariable3, solverVariable4, f2);
        if (i2 != 8) {
            m2.c(this, i2);
        }
        c(m2);
    }

    public SolverVariable k(int i2, String str) {
        if (this.i + 1 >= this.e) {
            q();
        }
        SolverVariable a2 = a(SolverVariable.Type.ERROR, str);
        int i3 = this.b + 1;
        this.b = i3;
        this.i++;
        a2.b = i3;
        a2.d = i2;
        this.l.d[i3] = a2;
        this.c.a(a2);
        return a2;
    }

    public SolverVariable l(Object obj) {
        SolverVariable solverVariable = null;
        if (obj == null) {
            return null;
        }
        if (this.i + 1 >= this.e) {
            q();
        }
        if (obj instanceof ConstraintAnchor) {
            ConstraintAnchor constraintAnchor = (ConstraintAnchor) obj;
            solverVariable = constraintAnchor.h();
            if (solverVariable == null) {
                constraintAnchor.p();
                solverVariable = constraintAnchor.h();
            }
            int i2 = solverVariable.b;
            if (i2 == -1 || i2 > this.b || this.l.d[i2] == null) {
                if (i2 != -1) {
                    solverVariable.d();
                }
                int i3 = this.b + 1;
                this.b = i3;
                this.i++;
                solverVariable.b = i3;
                solverVariable.i = SolverVariable.Type.UNRESTRICTED;
                this.l.d[i3] = solverVariable;
            }
        }
        return solverVariable;
    }

    public b m() {
        b a2 = this.l.b.a();
        if (a2 == null) {
            a2 = new b(this.l);
            r++;
        } else {
            a2.a = null;
            a2.d.clear();
            a2.b = 0.0f;
            a2.e = false;
        }
        SolverVariable.b();
        return a2;
    }

    public SolverVariable n() {
        if (this.i + 1 >= this.e) {
            q();
        }
        SolverVariable a2 = a(SolverVariable.Type.SLACK, null);
        int i2 = this.b + 1;
        this.b = i2;
        this.i++;
        a2.b = i2;
        this.l.d[i2] = a2;
        return a2;
    }

    public c o() {
        return this.l;
    }

    public int p(Object obj) {
        SolverVariable h2 = ((ConstraintAnchor) obj).h();
        if (h2 != null) {
            return (int) (h2.e + 0.5f);
        }
        return 0;
    }

    public void r() {
        if (this.c.isEmpty()) {
            j();
        } else if (this.g) {
            boolean z = false;
            int i2 = 0;
            while (true) {
                if (i2 >= this.j) {
                    z = true;
                    break;
                } else if (!this.f[i2].e) {
                    break;
                } else {
                    i2++;
                }
            }
            if (!z) {
                s(this.c);
            } else {
                j();
            }
        } else {
            s(this.c);
        }
    }

    /* access modifiers changed from: package-private */
    public void s(a aVar) {
        float f2;
        int i2;
        boolean z;
        SolverVariable.Type type = SolverVariable.Type.UNRESTRICTED;
        int i3 = 0;
        while (true) {
            f2 = 0.0f;
            i2 = 1;
            if (i3 >= this.j) {
                z = false;
                break;
            }
            b[] bVarArr = this.f;
            if (bVarArr[i3].a.i != type && bVarArr[i3].b < 0.0f) {
                z = true;
                break;
            }
            i3++;
        }
        if (z) {
            boolean z2 = false;
            int i4 = 0;
            while (!z2) {
                i4 += i2;
                float f3 = Float.MAX_VALUE;
                int i5 = 0;
                int i6 = -1;
                int i7 = -1;
                int i8 = 0;
                while (i5 < this.j) {
                    b bVar = this.f[i5];
                    if (bVar.a.i != type && !bVar.e && bVar.b < f2) {
                        int h2 = bVar.d.h();
                        int i9 = 0;
                        while (i9 < h2) {
                            SolverVariable a2 = bVar.d.a(i9);
                            float d2 = bVar.d.d(a2);
                            if (d2 > f2) {
                                for (int i10 = 0; i10 < 9; i10++) {
                                    float f4 = a2.g[i10] / d2;
                                    if ((f4 < f3 && i10 == i8) || i10 > i8) {
                                        i7 = a2.b;
                                        i8 = i10;
                                        f3 = f4;
                                        i6 = i5;
                                    }
                                }
                            }
                            i9++;
                            f2 = 0.0f;
                        }
                    }
                    i5++;
                    f2 = 0.0f;
                }
                if (i6 != -1) {
                    b bVar2 = this.f[i6];
                    bVar2.a.c = -1;
                    bVar2.m(this.l.d[i7]);
                    SolverVariable solverVariable = bVar2.a;
                    solverVariable.c = i6;
                    solverVariable.f(this, bVar2);
                } else {
                    z2 = true;
                }
                if (i4 > this.i / 2) {
                    z2 = true;
                }
                f2 = 0.0f;
                i2 = 1;
            }
        }
        t(aVar);
        j();
    }

    public void v() {
        c cVar;
        int i2 = 0;
        while (true) {
            cVar = this.l;
            SolverVariable[] solverVariableArr = cVar.d;
            if (i2 >= solverVariableArr.length) {
                break;
            }
            SolverVariable solverVariable = solverVariableArr[i2];
            if (solverVariable != null) {
                solverVariable.d();
            }
            i2++;
        }
        cVar.c.c(this.m, this.n);
        this.n = 0;
        Arrays.fill(this.l.d, (Object) null);
        this.b = 0;
        this.c.clear();
        this.i = 1;
        for (int i3 = 0; i3 < this.j; i3++) {
            b[] bVarArr = this.f;
            if (bVarArr[i3] != null) {
                bVarArr[i3].getClass();
            }
        }
        u();
        this.j = 0;
        this.o = new b(this.l);
    }
}

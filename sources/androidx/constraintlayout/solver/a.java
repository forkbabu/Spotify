package androidx.constraintlayout.solver;

import androidx.constraintlayout.solver.b;
import java.util.Arrays;

public class a implements b.a {
    int a = 0;
    private final b b;
    protected final c c;
    private int d = 8;
    private int[] e = new int[8];
    private int[] f = new int[8];
    private float[] g = new float[8];
    private int h = -1;
    private int i = -1;
    private boolean j = false;

    a(b bVar, c cVar) {
        this.b = bVar;
        this.c = cVar;
    }

    @Override // androidx.constraintlayout.solver.b.a
    public SolverVariable a(int i2) {
        int i3 = this.h;
        int i4 = 0;
        while (i3 != -1 && i4 < this.a) {
            if (i4 == i2) {
                return this.c.d[this.e[i3]];
            }
            i3 = this.f[i3];
            i4++;
        }
        return null;
    }

    @Override // androidx.constraintlayout.solver.b.a
    public void b() {
        int i2 = this.h;
        int i3 = 0;
        while (i2 != -1 && i3 < this.a) {
            float[] fArr = this.g;
            fArr[i2] = fArr[i2] * -1.0f;
            i2 = this.f[i2];
            i3++;
        }
    }

    @Override // androidx.constraintlayout.solver.b.a
    public void c(SolverVariable solverVariable, float f2, boolean z) {
        if (f2 <= -0.001f || f2 >= 0.001f) {
            int i2 = this.h;
            if (i2 == -1) {
                this.h = 0;
                this.g[0] = f2;
                this.e[0] = solverVariable.b;
                this.f[0] = -1;
                solverVariable.l++;
                solverVariable.a(this.b);
                this.a++;
                if (!this.j) {
                    int i3 = this.i + 1;
                    this.i = i3;
                    int[] iArr = this.e;
                    if (i3 >= iArr.length) {
                        this.j = true;
                        this.i = iArr.length - 1;
                        return;
                    }
                    return;
                }
                return;
            }
            int i4 = 0;
            int i5 = -1;
            while (i2 != -1 && i4 < this.a) {
                int[] iArr2 = this.e;
                int i6 = iArr2[i2];
                int i7 = solverVariable.b;
                if (i6 == i7) {
                    float[] fArr = this.g;
                    float f3 = fArr[i2] + f2;
                    if (f3 > -0.001f && f3 < 0.001f) {
                        f3 = 0.0f;
                    }
                    fArr[i2] = f3;
                    if (f3 == 0.0f) {
                        if (i2 == this.h) {
                            this.h = this.f[i2];
                        } else {
                            int[] iArr3 = this.f;
                            iArr3[i5] = iArr3[i2];
                        }
                        if (z) {
                            solverVariable.c(this.b);
                        }
                        if (this.j) {
                            this.i = i2;
                        }
                        solverVariable.l--;
                        this.a--;
                        return;
                    }
                    return;
                }
                if (iArr2[i2] < i7) {
                    i5 = i2;
                }
                i2 = this.f[i2];
                i4++;
            }
            int i8 = this.i;
            int i9 = i8 + 1;
            if (this.j) {
                int[] iArr4 = this.e;
                if (iArr4[i8] != -1) {
                    i8 = iArr4.length;
                }
            } else {
                i8 = i9;
            }
            int[] iArr5 = this.e;
            if (i8 >= iArr5.length && this.a < iArr5.length) {
                int i10 = 0;
                while (true) {
                    int[] iArr6 = this.e;
                    if (i10 >= iArr6.length) {
                        break;
                    } else if (iArr6[i10] == -1) {
                        i8 = i10;
                        break;
                    } else {
                        i10++;
                    }
                }
            }
            int[] iArr7 = this.e;
            if (i8 >= iArr7.length) {
                i8 = iArr7.length;
                int i11 = this.d * 2;
                this.d = i11;
                this.j = false;
                this.i = i8 - 1;
                this.g = Arrays.copyOf(this.g, i11);
                this.e = Arrays.copyOf(this.e, this.d);
                this.f = Arrays.copyOf(this.f, this.d);
            }
            this.e[i8] = solverVariable.b;
            this.g[i8] = f2;
            if (i5 != -1) {
                int[] iArr8 = this.f;
                iArr8[i8] = iArr8[i5];
                iArr8[i5] = i8;
            } else {
                this.f[i8] = this.h;
                this.h = i8;
            }
            solverVariable.l++;
            solverVariable.a(this.b);
            this.a++;
            if (!this.j) {
                this.i++;
            }
            int i12 = this.i;
            int[] iArr9 = this.e;
            if (i12 >= iArr9.length) {
                this.j = true;
                this.i = iArr9.length - 1;
            }
        }
    }

    @Override // androidx.constraintlayout.solver.b.a
    public final void clear() {
        int i2 = this.h;
        int i3 = 0;
        while (i2 != -1 && i3 < this.a) {
            SolverVariable solverVariable = this.c.d[this.e[i2]];
            if (solverVariable != null) {
                solverVariable.c(this.b);
            }
            i2 = this.f[i2];
            i3++;
        }
        this.h = -1;
        this.i = -1;
        this.j = false;
        this.a = 0;
    }

    @Override // androidx.constraintlayout.solver.b.a
    public final float d(SolverVariable solverVariable) {
        int i2 = this.h;
        int i3 = 0;
        while (i2 != -1 && i3 < this.a) {
            if (this.e[i2] == solverVariable.b) {
                return this.g[i2];
            }
            i2 = this.f[i2];
            i3++;
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.solver.b.a
    public float e(b bVar, boolean z) {
        float d2 = d(bVar.a);
        g(bVar.a, z);
        b.a aVar = bVar.d;
        int h2 = aVar.h();
        for (int i2 = 0; i2 < h2; i2++) {
            SolverVariable a2 = aVar.a(i2);
            c(a2, aVar.d(a2) * d2, z);
        }
        return d2;
    }

    @Override // androidx.constraintlayout.solver.b.a
    public final void f(SolverVariable solverVariable, float f2) {
        if (f2 == 0.0f) {
            g(solverVariable, true);
            return;
        }
        int i2 = this.h;
        if (i2 == -1) {
            this.h = 0;
            this.g[0] = f2;
            this.e[0] = solverVariable.b;
            this.f[0] = -1;
            solverVariable.l++;
            solverVariable.a(this.b);
            this.a++;
            if (!this.j) {
                int i3 = this.i + 1;
                this.i = i3;
                int[] iArr = this.e;
                if (i3 >= iArr.length) {
                    this.j = true;
                    this.i = iArr.length - 1;
                    return;
                }
                return;
            }
            return;
        }
        int i4 = 0;
        int i5 = -1;
        while (i2 != -1 && i4 < this.a) {
            int[] iArr2 = this.e;
            int i6 = iArr2[i2];
            int i7 = solverVariable.b;
            if (i6 == i7) {
                this.g[i2] = f2;
                return;
            }
            if (iArr2[i2] < i7) {
                i5 = i2;
            }
            i2 = this.f[i2];
            i4++;
        }
        int i8 = this.i;
        int i9 = i8 + 1;
        if (this.j) {
            int[] iArr3 = this.e;
            if (iArr3[i8] != -1) {
                i8 = iArr3.length;
            }
        } else {
            i8 = i9;
        }
        int[] iArr4 = this.e;
        if (i8 >= iArr4.length && this.a < iArr4.length) {
            int i10 = 0;
            while (true) {
                int[] iArr5 = this.e;
                if (i10 >= iArr5.length) {
                    break;
                } else if (iArr5[i10] == -1) {
                    i8 = i10;
                    break;
                } else {
                    i10++;
                }
            }
        }
        int[] iArr6 = this.e;
        if (i8 >= iArr6.length) {
            i8 = iArr6.length;
            int i11 = this.d * 2;
            this.d = i11;
            this.j = false;
            this.i = i8 - 1;
            this.g = Arrays.copyOf(this.g, i11);
            this.e = Arrays.copyOf(this.e, this.d);
            this.f = Arrays.copyOf(this.f, this.d);
        }
        this.e[i8] = solverVariable.b;
        this.g[i8] = f2;
        if (i5 != -1) {
            int[] iArr7 = this.f;
            iArr7[i8] = iArr7[i5];
            iArr7[i5] = i8;
        } else {
            this.f[i8] = this.h;
            this.h = i8;
        }
        solverVariable.l++;
        solverVariable.a(this.b);
        int i12 = this.a + 1;
        this.a = i12;
        if (!this.j) {
            this.i++;
        }
        int[] iArr8 = this.e;
        if (i12 >= iArr8.length) {
            this.j = true;
        }
        if (this.i >= iArr8.length) {
            this.j = true;
            this.i = iArr8.length - 1;
        }
    }

    @Override // androidx.constraintlayout.solver.b.a
    public final float g(SolverVariable solverVariable, boolean z) {
        int i2 = this.h;
        if (i2 == -1) {
            return 0.0f;
        }
        int i3 = 0;
        int i4 = -1;
        while (i2 != -1 && i3 < this.a) {
            if (this.e[i2] == solverVariable.b) {
                if (i2 == this.h) {
                    this.h = this.f[i2];
                } else {
                    int[] iArr = this.f;
                    iArr[i4] = iArr[i2];
                }
                if (z) {
                    solverVariable.c(this.b);
                }
                solverVariable.l--;
                this.a--;
                this.e[i2] = -1;
                if (this.j) {
                    this.i = i2;
                }
                return this.g[i2];
            }
            i3++;
            i4 = i2;
            i2 = this.f[i2];
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.solver.b.a
    public int h() {
        return this.a;
    }

    @Override // androidx.constraintlayout.solver.b.a
    public float i(int i2) {
        int i3 = this.h;
        int i4 = 0;
        while (i3 != -1 && i4 < this.a) {
            if (i4 == i2) {
                return this.g[i3];
            }
            i3 = this.f[i3];
            i4++;
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.solver.b.a
    public boolean j(SolverVariable solverVariable) {
        int i2 = this.h;
        if (i2 == -1) {
            return false;
        }
        int i3 = 0;
        while (i2 != -1 && i3 < this.a) {
            if (this.e[i2] == solverVariable.b) {
                return true;
            }
            i2 = this.f[i2];
            i3++;
        }
        return false;
    }

    @Override // androidx.constraintlayout.solver.b.a
    public void k(float f2) {
        int i2 = this.h;
        int i3 = 0;
        while (i2 != -1 && i3 < this.a) {
            float[] fArr = this.g;
            fArr[i2] = fArr[i2] / f2;
            i2 = this.f[i2];
            i3++;
        }
    }

    public String toString() {
        int i2 = this.h;
        String str = "";
        int i3 = 0;
        while (i2 != -1 && i3 < this.a) {
            StringBuilder V0 = je.V0(je.x0(str, " -> "));
            V0.append(this.g[i2]);
            V0.append(" : ");
            StringBuilder V02 = je.V0(V0.toString());
            V02.append(this.c.d[this.e[i2]]);
            str = V02.toString();
            i2 = this.f[i2];
            i3++;
        }
        return str;
    }
}

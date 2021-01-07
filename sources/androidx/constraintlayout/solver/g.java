package androidx.constraintlayout.solver;

import androidx.constraintlayout.solver.b;
import java.util.Arrays;
import java.util.Comparator;

public class g extends b {
    private int f = 128;
    private SolverVariable[] g = new SolverVariable[128];
    private SolverVariable[] h = new SolverVariable[128];
    private int i = 0;
    b j = new b(this);

    /* access modifiers changed from: package-private */
    public class a implements Comparator<SolverVariable> {
        a(g gVar) {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.Comparator
        public int compare(SolverVariable solverVariable, SolverVariable solverVariable2) {
            return solverVariable.b - solverVariable2.b;
        }
    }

    class b implements Comparable {
        SolverVariable a;

        public b(g gVar) {
        }

        @Override // java.lang.Comparable
        public int compareTo(Object obj) {
            return this.a.b - ((SolverVariable) obj).b;
        }

        @Override // java.lang.Object
        public String toString() {
            String str = "[ ";
            if (this.a != null) {
                for (int i = 0; i < 9; i++) {
                    StringBuilder V0 = je.V0(str);
                    V0.append(this.a.h[i]);
                    V0.append(" ");
                    str = V0.toString();
                }
            }
            StringBuilder Z0 = je.Z0(str, "] ");
            Z0.append(this.a);
            return Z0.toString();
        }
    }

    public g(c cVar) {
        super(cVar);
    }

    private final void q(SolverVariable solverVariable) {
        int i2;
        int i3 = this.i + 1;
        SolverVariable[] solverVariableArr = this.g;
        if (i3 > solverVariableArr.length) {
            SolverVariable[] solverVariableArr2 = (SolverVariable[]) Arrays.copyOf(solverVariableArr, solverVariableArr.length * 2);
            this.g = solverVariableArr2;
            this.h = (SolverVariable[]) Arrays.copyOf(solverVariableArr2, solverVariableArr2.length * 2);
        }
        SolverVariable[] solverVariableArr3 = this.g;
        int i4 = this.i;
        solverVariableArr3[i4] = solverVariable;
        int i5 = i4 + 1;
        this.i = i5;
        if (i5 > 1 && solverVariableArr3[i5 - 1].b > solverVariable.b) {
            int i6 = 0;
            while (true) {
                i2 = this.i;
                if (i6 >= i2) {
                    break;
                }
                this.h[i6] = this.g[i6];
                i6++;
            }
            Arrays.sort(this.h, 0, i2, new a(this));
            for (int i7 = 0; i7 < this.i; i7++) {
                this.g[i7] = this.h[i7];
            }
        }
        solverVariable.a = true;
        solverVariable.a(this);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void r(SolverVariable solverVariable) {
        int i2 = 0;
        while (i2 < this.i) {
            if (this.g[i2] == solverVariable) {
                while (true) {
                    int i3 = this.i;
                    if (i2 < i3 - 1) {
                        SolverVariable[] solverVariableArr = this.g;
                        int i4 = i2 + 1;
                        solverVariableArr[i2] = solverVariableArr[i4];
                        i2 = i4;
                    } else {
                        this.i = i3 - 1;
                        solverVariable.a = false;
                        return;
                    }
                }
            } else {
                i2++;
            }
        }
    }

    @Override // androidx.constraintlayout.solver.b, androidx.constraintlayout.solver.d.a
    public void a(SolverVariable solverVariable) {
        this.j.a = solverVariable;
        Arrays.fill(solverVariable.h, 0.0f);
        solverVariable.h[solverVariable.d] = 1.0f;
        q(solverVariable);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0035, code lost:
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0053, code lost:
        if (r8 < r7) goto L_0x0057;
     */
    @Override // androidx.constraintlayout.solver.b, androidx.constraintlayout.solver.d.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.constraintlayout.solver.SolverVariable b(androidx.constraintlayout.solver.d r11, boolean[] r12) {
        /*
            r10 = this;
            r11 = 0
            r0 = -1
            r1 = 0
            r2 = -1
        L_0x0004:
            int r3 = r10.i
            if (r1 >= r3) goto L_0x005d
            androidx.constraintlayout.solver.SolverVariable[] r3 = r10.g
            r4 = r3[r1]
            int r5 = r4.b
            boolean r5 = r12[r5]
            if (r5 == 0) goto L_0x0013
            goto L_0x005a
        L_0x0013:
            androidx.constraintlayout.solver.g$b r5 = r10.j
            r5.a = r4
            r4 = 8
            r6 = 1
            if (r2 != r0) goto L_0x0039
            r5.getClass()
        L_0x001f:
            if (r4 < 0) goto L_0x0035
            androidx.constraintlayout.solver.SolverVariable r3 = r5.a
            float[] r3 = r3.h
            r3 = r3[r4]
            r7 = 0
            int r8 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r8 <= 0) goto L_0x002d
            goto L_0x0035
        L_0x002d:
            int r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r3 >= 0) goto L_0x0032
            goto L_0x0036
        L_0x0032:
            int r4 = r4 + -1
            goto L_0x001f
        L_0x0035:
            r6 = 0
        L_0x0036:
            if (r6 == 0) goto L_0x005a
            goto L_0x0059
        L_0x0039:
            r3 = r3[r2]
            r5.getClass()
        L_0x003e:
            if (r4 < 0) goto L_0x0056
            float[] r7 = r3.h
            r7 = r7[r4]
            androidx.constraintlayout.solver.SolverVariable r8 = r5.a
            float[] r8 = r8.h
            r8 = r8[r4]
            int r9 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r9 != 0) goto L_0x0051
            int r4 = r4 + -1
            goto L_0x003e
        L_0x0051:
            int r3 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r3 >= 0) goto L_0x0056
            goto L_0x0057
        L_0x0056:
            r6 = 0
        L_0x0057:
            if (r6 == 0) goto L_0x005a
        L_0x0059:
            r2 = r1
        L_0x005a:
            int r1 = r1 + 1
            goto L_0x0004
        L_0x005d:
            if (r2 != r0) goto L_0x0061
            r11 = 0
            return r11
        L_0x0061:
            androidx.constraintlayout.solver.SolverVariable[] r11 = r10.g
            r11 = r11[r2]
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.g.b(androidx.constraintlayout.solver.d, boolean[]):androidx.constraintlayout.solver.SolverVariable");
    }

    @Override // androidx.constraintlayout.solver.b, androidx.constraintlayout.solver.d.a
    public void clear() {
        this.i = 0;
        this.b = 0.0f;
    }

    @Override // androidx.constraintlayout.solver.b, androidx.constraintlayout.solver.d.a
    public boolean isEmpty() {
        return this.i == 0;
    }

    @Override // androidx.constraintlayout.solver.b
    public void o(d dVar, b bVar, boolean z) {
        SolverVariable solverVariable = bVar.a;
        if (solverVariable != null) {
            b.a aVar = bVar.d;
            int h2 = aVar.h();
            for (int i2 = 0; i2 < h2; i2++) {
                SolverVariable a2 = aVar.a(i2);
                float i3 = aVar.i(i2);
                b bVar2 = this.j;
                bVar2.a = a2;
                boolean z2 = true;
                if (a2.a) {
                    for (int i4 = 0; i4 < 9; i4++) {
                        float[] fArr = bVar2.a.h;
                        fArr[i4] = (solverVariable.h[i4] * i3) + fArr[i4];
                        if (Math.abs(fArr[i4]) < 1.0E-4f) {
                            bVar2.a.h[i4] = 0.0f;
                        } else {
                            z2 = false;
                        }
                    }
                    if (z2) {
                        g.this.r(bVar2.a);
                    }
                    z2 = false;
                } else {
                    for (int i5 = 0; i5 < 9; i5++) {
                        float f2 = solverVariable.h[i5];
                        if (f2 != 0.0f) {
                            float f3 = f2 * i3;
                            if (Math.abs(f3) < 1.0E-4f) {
                                f3 = 0.0f;
                            }
                            bVar2.a.h[i5] = f3;
                        } else {
                            bVar2.a.h[i5] = 0.0f;
                        }
                    }
                }
                if (z2) {
                    q(a2);
                }
                this.b = (bVar.b * i3) + this.b;
            }
            r(solverVariable);
        }
    }

    @Override // androidx.constraintlayout.solver.b
    public String toString() {
        StringBuilder Z0 = je.Z0("", " goal -> (");
        Z0.append(this.b);
        Z0.append(") : ");
        String sb = Z0.toString();
        for (int i2 = 0; i2 < this.i; i2++) {
            this.j.a = this.g[i2];
            StringBuilder V0 = je.V0(sb);
            V0.append(this.j);
            V0.append(" ");
            sb = V0.toString();
        }
        return sb;
    }
}

package androidx.constraintlayout.solver;

import java.util.Arrays;

public class SolverVariable {
    private static int n = 1;
    public boolean a;
    public int b = -1;
    int c = -1;
    public int d = 0;
    public float e;
    public boolean f = false;
    float[] g = new float[9];
    float[] h = new float[9];
    Type i;
    b[] j = new b[16];
    int k = 0;
    public int l = 0;
    int m = -1;

    public enum Type {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public SolverVariable(Type type) {
        this.i = type;
    }

    static void b() {
        n++;
    }

    public final void a(b bVar) {
        int i2 = 0;
        while (true) {
            int i3 = this.k;
            if (i2 >= i3) {
                b[] bVarArr = this.j;
                if (i3 >= bVarArr.length) {
                    this.j = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                b[] bVarArr2 = this.j;
                int i4 = this.k;
                bVarArr2[i4] = bVar;
                this.k = i4 + 1;
                return;
            } else if (this.j[i2] != bVar) {
                i2++;
            } else {
                return;
            }
        }
    }

    public final void c(b bVar) {
        int i2 = this.k;
        int i3 = 0;
        while (i3 < i2) {
            if (this.j[i3] == bVar) {
                while (i3 < i2 - 1) {
                    b[] bVarArr = this.j;
                    int i4 = i3 + 1;
                    bVarArr[i3] = bVarArr[i4];
                    i3 = i4;
                }
                this.k--;
                return;
            }
            i3++;
        }
    }

    public void d() {
        this.i = Type.UNKNOWN;
        this.d = 0;
        this.b = -1;
        this.c = -1;
        this.e = 0.0f;
        this.f = false;
        this.m = -1;
        int i2 = this.k;
        for (int i3 = 0; i3 < i2; i3++) {
            this.j[i3] = null;
        }
        this.k = 0;
        this.l = 0;
        this.a = false;
        Arrays.fill(this.h, 0.0f);
    }

    public void e(d dVar, float f2) {
        this.e = f2;
        this.f = true;
        this.m = -1;
        int i2 = this.k;
        this.c = -1;
        for (int i3 = 0; i3 < i2; i3++) {
            this.j[i3].n(dVar, this, false);
        }
        this.k = 0;
    }

    public final void f(d dVar, b bVar) {
        int i2 = this.k;
        for (int i3 = 0; i3 < i2; i3++) {
            this.j[i3].o(dVar, bVar, false);
        }
        this.k = 0;
    }

    public String toString() {
        StringBuilder V0 = je.V0("");
        V0.append(this.b);
        return V0.toString();
    }
}

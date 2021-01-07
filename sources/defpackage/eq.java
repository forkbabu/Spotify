package defpackage;

import android.util.Pair;
import com.google.android.exoplayer2.q0;
import com.google.android.exoplayer2.r0;
import com.google.android.exoplayer2.source.e0;
import com.google.android.exoplayer2.source.f0;
import com.google.android.exoplayer2.source.t;
import com.google.android.exoplayer2.v0;

/* renamed from: eq  reason: default package */
public abstract class eq extends jq {
    private a c;

    /* renamed from: eq$a */
    public static final class a {
        private final int a;
        private final int[] b;
        private final f0[] c;

        a(int[] iArr, f0[] f0VarArr, int[] iArr2, int[][][] iArr3, f0 f0Var) {
            this.b = iArr;
            this.c = f0VarArr;
            this.a = iArr.length;
        }

        public int a() {
            return this.a;
        }

        public int b(int i) {
            return this.b[i];
        }

        public f0 c(int i) {
            return this.c[i];
        }
    }

    @Override // defpackage.jq
    public final void d(Object obj) {
        this.c = (a) obj;
    }

    @Override // defpackage.jq
    public final kq e(q0[] q0VarArr, f0 f0Var, t.a aVar, v0 v0Var) {
        int[] iArr;
        int[] iArr2 = new int[(q0VarArr.length + 1)];
        int length = q0VarArr.length + 1;
        e0[][] e0VarArr = new e0[length][];
        int[][][] iArr3 = new int[(q0VarArr.length + 1)][][];
        for (int i = 0; i < length; i++) {
            int i2 = f0Var.a;
            e0VarArr[i] = new e0[i2];
            iArr3[i] = new int[i2][];
        }
        int length2 = q0VarArr.length;
        int[] iArr4 = new int[length2];
        for (int i3 = 0; i3 < length2; i3++) {
            iArr4[i3] = q0VarArr[i3].r();
        }
        for (int i4 = 0; i4 < f0Var.a; i4++) {
            e0 a2 = f0Var.a(i4);
            int length3 = q0VarArr.length;
            int i5 = 0;
            int i6 = 0;
            while (true) {
                if (i5 >= q0VarArr.length) {
                    break;
                }
                q0 q0Var = q0VarArr[i5];
                for (int i7 = 0; i7 < a2.a; i7++) {
                    int e = q0Var.e(a2.a(i7)) & 7;
                    if (e > i6) {
                        if (e == 4) {
                            length3 = i5;
                            break;
                        }
                        length3 = i5;
                        i6 = e;
                    }
                }
                i5++;
            }
            if (length3 == q0VarArr.length) {
                iArr = new int[a2.a];
            } else {
                q0 q0Var2 = q0VarArr[length3];
                int[] iArr5 = new int[a2.a];
                for (int i8 = 0; i8 < a2.a; i8++) {
                    iArr5[i8] = q0Var2.e(a2.a(i8));
                }
                iArr = iArr5;
            }
            int i9 = iArr2[length3];
            e0VarArr[length3][i9] = a2;
            iArr3[length3][i9] = iArr;
            iArr2[length3] = iArr2[length3] + 1;
        }
        f0[] f0VarArr = new f0[q0VarArr.length];
        int[] iArr6 = new int[q0VarArr.length];
        for (int i10 = 0; i10 < q0VarArr.length; i10++) {
            int i11 = iArr2[i10];
            f0VarArr[i10] = new f0((e0[]) com.google.android.exoplayer2.util.f0.F(e0VarArr[i10], i11));
            iArr3[i10] = (int[][]) com.google.android.exoplayer2.util.f0.F(iArr3[i10], i11);
            iArr6[i10] = q0VarArr[i10].c();
        }
        a aVar2 = new a(iArr6, f0VarArr, iArr4, iArr3, new f0((e0[]) com.google.android.exoplayer2.util.f0.F(e0VarArr[q0VarArr.length], iArr2[q0VarArr.length])));
        Pair<r0[], gq[]> g = g(aVar2, iArr3, iArr4);
        return new kq((r0[]) g.first, (gq[]) g.second, aVar2);
    }

    public final a f() {
        return this.c;
    }

    /* access modifiers changed from: protected */
    public abstract Pair<r0[], gq[]> g(a aVar, int[][][] iArr, int[] iArr2);
}

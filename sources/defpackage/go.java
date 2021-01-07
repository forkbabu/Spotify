package defpackage;

import android.util.Log;
import com.google.android.exoplayer2.source.a0;
import defpackage.io;

/* renamed from: go  reason: default package */
public final class go implements io.b {
    private final int[] a;
    private final a0[] b;

    public go(int[] iArr, a0[] a0VarArr) {
        this.a = iArr;
        this.b = a0VarArr;
    }

    public int[] a() {
        int[] iArr = new int[this.b.length];
        int i = 0;
        while (true) {
            a0[] a0VarArr = this.b;
            if (i >= a0VarArr.length) {
                return iArr;
            }
            if (a0VarArr[i] != null) {
                iArr[i] = a0VarArr[i].q();
            }
            i++;
        }
    }

    public void b(long j) {
        a0[] a0VarArr = this.b;
        for (a0 a0Var : a0VarArr) {
            if (a0Var != null) {
                a0Var.F(j);
            }
        }
    }

    public zj c(int i, int i2) {
        int i3 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i3 >= iArr.length) {
                Log.e("BaseMediaChunkOutput", "Unmatched track of type: " + i2);
                return new pj();
            } else if (i2 == iArr[i3]) {
                return this.b[i3];
            } else {
                i3++;
            }
        }
    }
}

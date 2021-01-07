package com.google.android.exoplayer2.source;

public class n implements c0 {
    protected final c0[] a;

    public n(c0[] c0VarArr) {
        this.a = c0VarArr;
    }

    @Override // com.google.android.exoplayer2.source.c0
    public final long a() {
        long j = Long.MAX_VALUE;
        for (c0 c0Var : this.a) {
            long a2 = c0Var.a();
            if (a2 != Long.MIN_VALUE) {
                j = Math.min(j, a2);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    @Override // com.google.android.exoplayer2.source.c0
    public boolean b(long j) {
        boolean z = false;
        while (true) {
            long a2 = a();
            if (a2 == Long.MIN_VALUE) {
                break;
            }
            c0[] c0VarArr = this.a;
            boolean z2 = false;
            for (c0 c0Var : c0VarArr) {
                long a3 = c0Var.a();
                boolean z3 = a3 != Long.MIN_VALUE && a3 <= j;
                if (a3 == a2 || z3) {
                    z2 |= c0Var.b(j);
                }
            }
            z |= z2;
            if (!z2) {
                break;
            }
        }
        return z;
    }

    @Override // com.google.android.exoplayer2.source.c0
    public final long c() {
        long j = Long.MAX_VALUE;
        for (c0 c0Var : this.a) {
            long c = c0Var.c();
            if (c != Long.MIN_VALUE) {
                j = Math.min(j, c);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    @Override // com.google.android.exoplayer2.source.c0
    public final void e(long j) {
        for (c0 c0Var : this.a) {
            c0Var.e(j);
        }
    }

    @Override // com.google.android.exoplayer2.source.c0
    public boolean isLoading() {
        for (c0 c0Var : this.a) {
            if (c0Var.isLoading()) {
                return true;
            }
        }
        return false;
    }
}

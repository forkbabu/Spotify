package defpackage;

import io.reactivex.functions.l;
import io.reactivex.s;

/* renamed from: a1e  reason: default package */
public abstract class a1e implements l<s<? extends Throwable>, s<?>> {
    private final int a;
    private final long b;
    private int c;

    public a1e(int i, long j) {
        this.a = i;
        this.b = j;
    }

    public long a() {
        return this.b;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public s<?> apply(s<? extends Throwable> sVar) {
        return s.d1(sVar, s.u0(1, this.a + 1), x0e.a).W(new y0e(this), false, Integer.MAX_VALUE);
    }

    /* access modifiers changed from: package-private */
    public abstract s<Long> b();

    public s c(u3 u3Var) {
        S s = u3Var.b;
        s.getClass();
        int intValue = s.intValue();
        this.c = intValue;
        if (intValue < this.a) {
            return b();
        }
        F f = u3Var.a;
        f.getClass();
        return s.P(f);
    }
}

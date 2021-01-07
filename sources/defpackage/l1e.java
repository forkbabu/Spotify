package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.l;
import io.reactivex.s;
import io.reactivex.v;
import java.util.concurrent.TimeUnit;

/* renamed from: l1e  reason: default package */
public class l1e implements l<s<Throwable>, v<?>> {
    private final int a;
    private final long b;

    public l1e(int i, long j) {
        this.a = i;
        this.b = j;
    }

    public v a(u3 u3Var) {
        F f = u3Var.a;
        f.getClass();
        F f2 = f;
        S s = u3Var.b;
        s.getClass();
        long intValue = (long) s.intValue();
        if (intValue == ((long) this.a)) {
            return s.P(f2);
        }
        Logger.b("Failed %d attempt with error: %s, retrying...", Long.valueOf(intValue), f2.getMessage());
        return s.W0(this.b * intValue, TimeUnit.MILLISECONDS);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public v<?> apply(s<Throwable> sVar) {
        return s.d1(sVar, s.u0(1, this.a + 1), f1e.a).W(new c1e(this), false, Integer.MAX_VALUE);
    }
}

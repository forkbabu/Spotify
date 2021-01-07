package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.l;
import io.reactivex.g;
import io.reactivex.internal.operators.flowable.FlowableRange;
import io.reactivex.internal.operators.flowable.k;
import io.reactivex.schedulers.a;
import java.util.concurrent.TimeUnit;

/* renamed from: i1e  reason: default package */
public class i1e implements l<g<Throwable>, tpf<Object>> {
    private final int a;
    private final long b;

    i1e(int i, long j) {
        this.a = i;
        this.b = j;
    }

    public tpf a(u3 u3Var) {
        F f = u3Var.a;
        f.getClass();
        F f2 = f;
        S s = u3Var.b;
        s.getClass();
        long intValue = (long) s.intValue();
        Logger.b("Failed %d attempt with error: %s, retrying...", Long.valueOf(intValue), f2.getMessage());
        if (intValue == ((long) this.a)) {
            return g.B(f2);
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        int i = g.b;
        return g.m0(this.b * intValue, timeUnit, a.a());
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public tpf<Object> apply(g<Throwable> gVar) {
        g<Object> gVar2;
        g<Throwable> gVar3 = gVar;
        int i = this.a + 1;
        int i2 = g.b;
        if (i >= 0) {
            if (i == 0) {
                gVar2 = k.c;
            } else if (i == 1) {
                gVar2 = g.N(1);
            } else if (((long) 1) + ((long) (i - 1)) <= 2147483647L) {
                gVar2 = new FlowableRange(1, i);
            } else {
                throw new IllegalArgumentException("Integer overflow");
            }
            return gVar3.p0(gVar2, f1e.a).F(new b1e(this));
        }
        throw new IllegalArgumentException(je.p0("count >= 0 required but it was ", i));
    }
}

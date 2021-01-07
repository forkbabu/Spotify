package defpackage;

import io.reactivex.functions.l;

/* renamed from: yo5  reason: default package */
public class yo5 implements l<xo5<b91>, b91> {
    private final to5 a;

    yo5(to5 to5) {
        to5.getClass();
        this.a = to5;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public b91 apply(xo5<b91> xo5) {
        xo5<b91> xo52 = xo5;
        if (xo52.b()) {
            return this.a.a();
        }
        b91 a2 = xo52.a();
        return (a2 == null || a2.body().isEmpty()) ? this.a.c() : a2;
    }
}

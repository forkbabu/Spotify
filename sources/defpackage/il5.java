package defpackage;

import defpackage.rl5;
import io.reactivex.functions.c;

/* renamed from: il5  reason: default package */
public class il5 implements c<rl5, b91, rl5> {
    private final tf5 a;

    public il5(tf5 tf5) {
        this.a = tf5;
    }

    private boolean b(b91 b91, b91 b912) {
        return this.a.c(b91) != this.a.c(b912);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // io.reactivex.functions.c
    public rl5 a(rl5 rl5, b91 b91) {
        rl5 rl52 = rl5;
        b91 b912 = b91;
        b91 b = rl52.b();
        boolean z = false;
        boolean z2 = qf5.f(b) || qf5.e(b) || qf5.g(b) || !(b.body().isEmpty() ^ true);
        boolean z3 = (b912.body().isEmpty() ^ true) && !ej5.b(b912.custom(), b912.body()) && !b912.custom().boolValue("offline", false) && b(b, b912);
        boolean boolValue = b.custom().boolValue("offline", false);
        boolean z4 = (b912.body().isEmpty() ^ true) && b912.custom().boolValue("offline", false) && b(b, b912);
        if (z2 || z3 || (boolValue && z4)) {
            z = true;
        }
        if (!z) {
            return rl52;
        }
        rl5.a e = rl52.e();
        e.a(b912);
        return e.build();
    }
}

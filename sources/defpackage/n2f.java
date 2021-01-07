package defpackage;

import com.spotify.mobius.e0;
import defpackage.p2f;
import defpackage.q2f;
import defpackage.x2f;

/* renamed from: n2f  reason: default package */
public final /* synthetic */ class n2f implements ti0 {
    public final /* synthetic */ w2f a;

    public /* synthetic */ n2f(w2f w2f) {
        this.a = w2f;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        q2f.s sVar = (q2f.s) obj;
        x2f d = this.a.d();
        d.getClass();
        if ((d instanceof x2f.a) || (d instanceof x2f.c) || (d instanceof x2f.b) || (d instanceof x2f.i)) {
            return e0.a(z42.l(new p2f.b()));
        }
        return e0.h();
    }
}

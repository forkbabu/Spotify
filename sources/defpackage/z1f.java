package defpackage;

import com.spotify.mobius.e0;
import defpackage.p2f;
import defpackage.q2f;

/* renamed from: z1f  reason: default package */
public final /* synthetic */ class z1f implements ti0 {
    public final /* synthetic */ w2f a;

    public /* synthetic */ z1f(w2f w2f) {
        this.a = w2f;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        w2f w2f = this.a;
        String v = ((q2f.b) obj).v();
        return e0.g(w2f.m(v), z42.l(new p2f.e(w2f.c().h(v))));
    }
}

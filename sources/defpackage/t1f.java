package defpackage;

import com.spotify.mobius.e0;
import defpackage.p2f;
import defpackage.q2f;

/* renamed from: t1f  reason: default package */
public final /* synthetic */ class t1f implements ti0 {
    public final /* synthetic */ w2f a;

    public /* synthetic */ t1f(w2f w2f) {
        this.a = w2f;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        q2f.e eVar = (q2f.e) obj;
        if (this.a.e()) {
            return e0.a(z42.l(new p2f.b0(), new p2f.b()));
        }
        return e0.a(z42.l(new p2f.b()));
    }
}

package defpackage;

import com.spotify.mobius.e0;
import defpackage.q2f;

/* renamed from: i2f  reason: default package */
public final /* synthetic */ class i2f implements ti0 {
    public final /* synthetic */ w2f a;

    public /* synthetic */ i2f(w2f w2f) {
        this.a = w2f;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        x2f x2f;
        w2f w2f = this.a;
        q2f.l lVar = (q2f.l) obj;
        String w = lVar.w();
        if (lVar.v()) {
            x2f = x2f.c(w);
        } else {
            x2f = x2f.g(w);
        }
        return e0.f(w2f.k(x2f));
    }
}

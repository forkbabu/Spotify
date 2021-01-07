package defpackage;

import com.spotify.player.model.ContextTrack;
import kotlin.jvm.internal.h;

/* renamed from: h0e  reason: default package */
public final class h0e {
    private d0e a;
    private final cmf<d0e> b;

    public h0e(cmf<d0e> cmf) {
        h.f(cmf, ContextTrack.Metadata.KEY_PROVIDER);
        this.b = cmf;
    }

    public final synchronized d0e a() {
        d0e d0e;
        d0e = this.a;
        if (d0e == null) {
            d0e = this.b.invoke();
            this.a = d0e;
        }
        return d0e;
    }

    public final synchronized void b() {
        this.a = null;
    }
}

package defpackage;

import com.spotify.android.flags.c;
import com.spotify.remoteconfig.h9;

/* renamed from: z9c  reason: default package */
public final class z9c implements fjf<y9c> {
    private final wlf<c> a;
    private final wlf<fm9> b;
    private final wlf<h9> c;

    public z9c(wlf<c> wlf, wlf<fm9> wlf2, wlf<h9> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new y9c(this.a.get(), this.b.get(), this.c.get());
    }
}

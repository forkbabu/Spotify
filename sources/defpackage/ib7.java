package defpackage;

import com.spotify.remoteconfig.m6;
import defpackage.gb7;

/* renamed from: ib7  reason: default package */
public final class ib7 implements fjf<hb7> {
    private final wlf<gb7.a> a;
    private final wlf<m6> b;

    public ib7(wlf<gb7.a> wlf, wlf<m6> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new hb7(ejf.a(this.a), this.b.get());
    }
}

package defpackage;

import com.spotify.remoteconfig.x6;

/* renamed from: xe5  reason: default package */
public final class xe5 implements fjf<we5> {
    private final wlf<x6> a;

    public xe5(wlf<x6> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new we5(this.a.get());
    }
}

package defpackage;

import com.spotify.remoteconfig.nb;

/* renamed from: pab  reason: default package */
public final class pab implements fjf<Boolean> {
    private final wlf<nb> a;

    public pab(wlf<nb> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return Boolean.valueOf(this.a.get().b());
    }
}

package defpackage;

import com.spotify.remoteconfig.oc;

/* renamed from: s8b  reason: default package */
public final class s8b implements fjf<Boolean> {
    private final wlf<oc> a;

    public s8b(wlf<oc> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return Boolean.valueOf(this.a.get().a());
    }
}

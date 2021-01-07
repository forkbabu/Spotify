package defpackage;

import com.spotify.remoteconfig.mc;

/* renamed from: bfc  reason: default package */
public final class bfc implements fjf<afc> {
    private final wlf<mc> a;

    public bfc(wlf<mc> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new afc(this.a.get());
    }
}

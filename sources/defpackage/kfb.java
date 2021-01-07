package defpackage;

import com.spotify.remoteconfig.wa;

/* renamed from: kfb  reason: default package */
public final class kfb implements fjf<jfb> {
    private final wlf<wa> a;

    public kfb(wlf<wa> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new jfb(this.a.get());
    }
}

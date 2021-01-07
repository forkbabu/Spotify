package defpackage;

import com.spotify.remoteconfig.gj;

/* renamed from: qr0  reason: default package */
public final class qr0 implements fjf<pr0> {
    private final wlf<gj> a;

    public qr0(wlf<gj> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new pr0(this.a.get());
    }
}

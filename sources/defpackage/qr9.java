package defpackage;

import com.spotify.remoteconfig.a6;

/* renamed from: qr9  reason: default package */
public final class qr9 implements fjf<pr9> {
    private final wlf<a6> a;
    private final wlf<ps9> b;

    public qr9(wlf<a6> wlf, wlf<ps9> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new pr9(this.a.get(), this.b.get());
    }
}

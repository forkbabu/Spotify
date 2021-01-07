package defpackage;

import com.spotify.remoteconfig.gj;

/* renamed from: js0  reason: default package */
public final class js0 implements fjf<is0> {
    private final wlf<gj> a;

    public js0(wlf<gj> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new is0(this.a.get());
    }
}

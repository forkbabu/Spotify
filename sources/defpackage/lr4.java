package defpackage;

import com.spotify.remoteconfig.jj;

/* renamed from: lr4  reason: default package */
public final class lr4 implements fjf<kr4> {
    private final wlf<jj> a;

    public lr4(wlf<jj> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new kr4(this.a.get());
    }
}

package defpackage;

import com.spotify.share.util.a;

/* renamed from: l3e  reason: default package */
public final class l3e implements fjf<k3e> {
    private final wlf<a> a;

    public l3e(wlf<a> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new k3e(this.a.get());
    }
}

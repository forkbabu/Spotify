package defpackage;

import com.spotify.remoteconfig.q9;

/* renamed from: j26  reason: default package */
public final class j26 implements fjf<i26> {
    private final wlf<k26> a;
    private final wlf<q9> b;

    public j26(wlf<k26> wlf, wlf<q9> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new i26(this.a.get(), this.b.get());
    }
}

package defpackage;

import com.spotify.remoteconfig.q9;

/* renamed from: g26  reason: default package */
public final class g26 implements fjf<f26> {
    private final wlf<q9> a;

    public g26(wlf<q9> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new f26(this.a.get());
    }
}

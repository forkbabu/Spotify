package defpackage;

import com.spotify.mobile.android.util.t;

/* renamed from: al4  reason: default package */
public final class al4 implements fjf<zk4> {
    private final wlf<t> a;

    public al4(wlf<t> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new zk4(this.a.get());
    }
}

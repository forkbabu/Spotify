package defpackage;

import com.spotify.music.navigation.t;

/* renamed from: g71  reason: default package */
public final class g71 implements fjf<f71> {
    private final wlf<t> a;

    public g71(wlf<t> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new f71(this.a.get());
    }
}

package defpackage;

import com.spotify.music.follow.m;

/* renamed from: hj2  reason: default package */
public final class hj2 implements fjf<gj2> {
    private final wlf<m> a;

    public hj2(wlf<m> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new gj2(this.a.get());
    }
}

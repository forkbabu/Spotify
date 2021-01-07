package defpackage;

import com.spotify.music.libs.viewuri.c;

/* renamed from: k81  reason: default package */
public final class k81 implements fjf<j81> {
    private final wlf<c.a> a;

    public k81(wlf<c.a> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new j81(this.a.get());
    }
}

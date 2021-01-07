package defpackage;

import com.spotify.music.libs.viewuri.c;

/* renamed from: p68  reason: default package */
public final class p68 implements fjf<o68> {
    private final wlf<c.a> a;

    public p68(wlf<c.a> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new o68(this.a.get());
    }
}

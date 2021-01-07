package defpackage;

import com.spotify.libs.search.history.i;
import com.spotify.music.navigation.t;

/* renamed from: t58  reason: default package */
public final class t58 implements fjf<s58> {
    private final wlf<t> a;
    private final wlf<i> b;
    private final wlf<s6b> c;
    private final wlf<jb8> d;
    private final wlf<j81> e;

    public t58(wlf<t> wlf, wlf<i> wlf2, wlf<s6b> wlf3, wlf<jb8> wlf4, wlf<j81> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    public static t58 a(wlf<t> wlf, wlf<i> wlf2, wlf<s6b> wlf3, wlf<jb8> wlf4, wlf<j81> wlf5) {
        return new t58(wlf, wlf2, wlf3, wlf4, wlf5);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new s58(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}

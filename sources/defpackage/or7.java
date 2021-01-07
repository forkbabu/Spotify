package defpackage;

import com.spotify.music.features.profile.entity.v;
import com.spotify.music.navigation.t;
import com.spotify.remoteconfig.s6;
import io.reactivex.y;

/* renamed from: or7  reason: default package */
public final class or7 implements fjf<nr7> {
    private final wlf<y> a;
    private final wlf<y> b;
    private final wlf<y> c;
    private final wlf<t> d;
    private final wlf<v> e;
    private final wlf<at7> f;
    private final wlf<txc> g;
    private final wlf<s6> h;

    public or7(wlf<y> wlf, wlf<y> wlf2, wlf<y> wlf3, wlf<t> wlf4, wlf<v> wlf5, wlf<at7> wlf6, wlf<txc> wlf7, wlf<s6> wlf8) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
        this.h = wlf8;
    }

    public static or7 a(wlf<y> wlf, wlf<y> wlf2, wlf<y> wlf3, wlf<t> wlf4, wlf<v> wlf5, wlf<at7> wlf6, wlf<txc> wlf7, wlf<s6> wlf8) {
        return new or7(wlf, wlf2, wlf3, wlf4, wlf5, wlf6, wlf7, wlf8);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new nr7(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get());
    }
}

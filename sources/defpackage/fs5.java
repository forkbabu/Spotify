package defpackage;

import com.spotify.music.libs.partnerapps.api.c;
import com.spotify.music.navigation.i;
import com.spotify.music.navigation.t;
import io.reactivex.y;

/* renamed from: fs5  reason: default package */
public final class fs5 implements fjf<es5> {
    private final wlf<hla> a;
    private final wlf<c> b;
    private final wlf<fla> c;
    private final wlf<xr5> d;
    private final wlf<y> e;
    private final wlf<vla> f;
    private final wlf<t> g;
    private final wlf<i> h;
    private final wlf<Boolean> i;

    public fs5(wlf<hla> wlf, wlf<c> wlf2, wlf<fla> wlf3, wlf<xr5> wlf4, wlf<y> wlf5, wlf<vla> wlf6, wlf<t> wlf7, wlf<i> wlf8, wlf<Boolean> wlf9) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
        this.h = wlf8;
        this.i = wlf9;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new es5(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get(), this.i.get().booleanValue());
    }
}

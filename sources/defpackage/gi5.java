package defpackage;

import com.spotify.music.features.home.common.viewbinder.v;
import com.spotify.music.navigation.t;
import io.reactivex.y;

/* renamed from: gi5  reason: default package */
public final class gi5 implements fjf<fi5> {
    private final wlf<w51> a;
    private final wlf<v> b;
    private final wlf<vh5> c;
    private final wlf<il5> d;
    private final wlf<y> e;
    private final wlf<y> f;
    private final wlf<t> g;
    private final wlf<hha> h;
    private final wlf<qf5> i;
    private final wlf<ml5> j;
    private final wlf<b60> k;
    private final wlf<String> l;

    public gi5(wlf<w51> wlf, wlf<v> wlf2, wlf<vh5> wlf3, wlf<il5> wlf4, wlf<y> wlf5, wlf<y> wlf6, wlf<t> wlf7, wlf<hha> wlf8, wlf<qf5> wlf9, wlf<ml5> wlf10, wlf<b60> wlf11, wlf<String> wlf12) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
        this.h = wlf8;
        this.i = wlf9;
        this.j = wlf10;
        this.k = wlf11;
        this.l = wlf12;
    }

    public static gi5 a(wlf<w51> wlf, wlf<v> wlf2, wlf<vh5> wlf3, wlf<il5> wlf4, wlf<y> wlf5, wlf<y> wlf6, wlf<t> wlf7, wlf<hha> wlf8, wlf<qf5> wlf9, wlf<ml5> wlf10, wlf<b60> wlf11, wlf<String> wlf12) {
        return new gi5(wlf, wlf2, wlf3, wlf4, wlf5, wlf6, wlf7, wlf8, wlf9, wlf10, wlf11, wlf12);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new fi5(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get(), this.i.get(), this.j.get(), this.k.get(), this.l.get());
    }
}

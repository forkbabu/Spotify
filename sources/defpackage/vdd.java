package defpackage;

import android.content.Context;
import com.spotify.music.navigation.t;
import com.spotify.music.sociallistening.participantlist.impl.j;
import com.squareup.picasso.Picasso;
import io.reactivex.y;

/* renamed from: vdd  reason: default package */
public final class vdd implements fjf<udd> {
    private final wlf<f4d> a;
    private final wlf<t> b;
    private final wlf<j> c;
    private final wlf<afd> d;
    private final wlf<y> e;
    private final wlf<y> f;
    private final wlf<y> g;
    private final wlf<Context> h;
    private final wlf<jzc> i;
    private final wlf<cfd> j;
    private final wlf<Picasso> k;

    public vdd(wlf<f4d> wlf, wlf<t> wlf2, wlf<j> wlf3, wlf<afd> wlf4, wlf<y> wlf5, wlf<y> wlf6, wlf<y> wlf7, wlf<Context> wlf8, wlf<jzc> wlf9, wlf<cfd> wlf10, wlf<Picasso> wlf11) {
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
    }

    public static vdd a(wlf<f4d> wlf, wlf<t> wlf2, wlf<j> wlf3, wlf<afd> wlf4, wlf<y> wlf5, wlf<y> wlf6, wlf<y> wlf7, wlf<Context> wlf8, wlf<jzc> wlf9, wlf<cfd> wlf10, wlf<Picasso> wlf11) {
        return new vdd(wlf, wlf2, wlf3, wlf4, wlf5, wlf6, wlf7, wlf8, wlf9, wlf10, wlf11);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new udd(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get(), this.i.get(), this.j.get(), this.k.get());
    }
}

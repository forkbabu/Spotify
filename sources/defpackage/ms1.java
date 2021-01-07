package defpackage;

import android.content.Context;
import com.spotify.mobile.android.rx.w;
import com.spotify.player.model.PlayerState;
import com.spotify.remoteconfig.g7;
import io.reactivex.g;
import io.reactivex.y;

/* renamed from: ms1  reason: default package */
public final class ms1 implements fjf<ls1> {
    private final wlf<Context> a;
    private final wlf<y> b;
    private final wlf<y> c;
    private final wlf<hl2> d;
    private final wlf<w> e;
    private final wlf<g<PlayerState>> f;
    private final wlf<cqe> g;
    private final wlf<ai2> h;
    private final wlf<mg2> i;
    private final wlf<hh2> j;
    private final wlf<g7> k;
    private final wlf<ts1> l;

    public ms1(wlf<Context> wlf, wlf<y> wlf2, wlf<y> wlf3, wlf<hl2> wlf4, wlf<w> wlf5, wlf<g<PlayerState>> wlf6, wlf<cqe> wlf7, wlf<ai2> wlf8, wlf<mg2> wlf9, wlf<hh2> wlf10, wlf<g7> wlf11, wlf<ts1> wlf12) {
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

    @Override // defpackage.wlf
    public Object get() {
        return new ls1(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l);
    }
}

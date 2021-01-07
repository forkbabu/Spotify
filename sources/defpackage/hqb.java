package defpackage;

import com.google.protobuf.u;
import com.spotify.mobile.android.util.ui.k;
import com.spotify.music.features.ads.model.Ad;
import com.spotify.music.navigation.t;
import com.spotify.player.model.PlayerState;
import io.reactivex.g;

/* renamed from: hqb  reason: default package */
public final class hqb implements fjf<gqb> {
    private final wlf<g<Ad>> a;
    private final wlf<g<PlayerState>> b;
    private final wlf<t> c;
    private final wlf<cqe> d;
    private final wlf<gl0<u>> e;
    private final wlf<k> f;

    public hqb(wlf<g<Ad>> wlf, wlf<g<PlayerState>> wlf2, wlf<t> wlf3, wlf<cqe> wlf4, wlf<gl0<u>> wlf5, wlf<k> wlf6) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new gqb(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get());
    }
}

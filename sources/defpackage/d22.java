package defpackage;

import androidx.fragment.app.c;
import com.spotify.encore.mobile.snackbar.SnackbarManager;
import com.spotify.mobile.android.rx.v;
import com.spotify.mobile.android.rx.w;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.ui.contextmenu.u3;
import com.spotify.music.libs.web.RxWebToken;
import com.spotify.music.playlist.service.b;
import com.spotify.music.premiummini.a;
import com.spotify.music.premiummini.k;
import com.spotify.playlist.endpoints.d;
import defpackage.ij9;
import io.reactivex.g;
import io.reactivex.s;

/* renamed from: d22  reason: default package */
public final class d22 implements fjf<c22> {
    private final wlf<Boolean> a;
    private final wlf<tka> b;
    private final wlf<u3> c;
    private final wlf<c> d;
    private final wlf<SnackbarManager> e;
    private final wlf<t9b> f;
    private final wlf<cqe> g;
    private final wlf<g<SessionState>> h;
    private final wlf<d> i;
    private final wlf<d9c> j;
    private final wlf<kzc> k;
    private final wlf<ij9.b> l;
    private final wlf<s<com.spotify.music.connection.g>> m;
    private final wlf<RxWebToken> n;
    private final wlf<Boolean> o;
    private final wlf<k> p;
    private final wlf<a> q;
    private final wlf<com.spotify.music.offlinetrials.limited.logging.a> r;
    private final wlf<com.spotify.music.offlinetrials.limited.logging.c> s;
    private final wlf<v> t;
    private final wlf<w> u;
    private final wlf<b.a> v;
    private final wlf<com.spotify.music.libs.yourlibraryx.pin.a> w;

    public d22(wlf<Boolean> wlf, wlf<tka> wlf2, wlf<u3> wlf3, wlf<c> wlf4, wlf<SnackbarManager> wlf5, wlf<t9b> wlf6, wlf<cqe> wlf7, wlf<g<SessionState>> wlf8, wlf<d> wlf9, wlf<d9c> wlf10, wlf<kzc> wlf11, wlf<ij9.b> wlf12, wlf<s<com.spotify.music.connection.g>> wlf13, wlf<RxWebToken> wlf14, wlf<Boolean> wlf15, wlf<k> wlf16, wlf<a> wlf17, wlf<com.spotify.music.offlinetrials.limited.logging.a> wlf18, wlf<com.spotify.music.offlinetrials.limited.logging.c> wlf19, wlf<v> wlf20, wlf<w> wlf21, wlf<b.a> wlf22, wlf<com.spotify.music.libs.yourlibraryx.pin.a> wlf23) {
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
        this.m = wlf13;
        this.n = wlf14;
        this.o = wlf15;
        this.p = wlf16;
        this.q = wlf17;
        this.r = wlf18;
        this.s = wlf19;
        this.t = wlf20;
        this.u = wlf21;
        this.v = wlf22;
        this.w = wlf23;
    }

    public static d22 a(wlf<Boolean> wlf, wlf<tka> wlf2, wlf<u3> wlf3, wlf<c> wlf4, wlf<SnackbarManager> wlf5, wlf<t9b> wlf6, wlf<cqe> wlf7, wlf<g<SessionState>> wlf8, wlf<d> wlf9, wlf<d9c> wlf10, wlf<kzc> wlf11, wlf<ij9.b> wlf12, wlf<s<com.spotify.music.connection.g>> wlf13, wlf<RxWebToken> wlf14, wlf<Boolean> wlf15, wlf<k> wlf16, wlf<a> wlf17, wlf<com.spotify.music.offlinetrials.limited.logging.a> wlf18, wlf<com.spotify.music.offlinetrials.limited.logging.c> wlf19, wlf<v> wlf20, wlf<w> wlf21, wlf<b.a> wlf22, wlf<com.spotify.music.libs.yourlibraryx.pin.a> wlf23) {
        return new d22(wlf, wlf2, wlf3, wlf4, wlf5, wlf6, wlf7, wlf8, wlf9, wlf10, wlf11, wlf12, wlf13, wlf14, wlf15, wlf16, wlf17, wlf18, wlf19, wlf20, wlf21, wlf22, wlf23);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new c22(this.a.get().booleanValue(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get(), this.i.get(), this.j.get(), this.k.get(), this.l.get(), this.m.get(), this.n.get(), this.o.get().booleanValue(), this.p.get(), this.q.get(), this.r.get(), this.s.get(), this.t.get(), this.u.get(), this.v.get(), this.w.get());
    }
}

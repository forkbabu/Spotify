package defpackage;

import com.spotify.libs.connect.ConnectManager;
import com.spotify.mobile.android.service.session.SessionState;
import io.reactivex.g;
import io.reactivex.y;

/* renamed from: m8d  reason: default package */
public final class m8d implements fjf<g8d> {
    private final wlf<w7d> a;
    private final wlf<x7d> b;
    private final wlf<v7d> c;
    private final wlf<g<SessionState>> d;
    private final wlf<ConnectManager> e;
    private final wlf<y> f;
    private final wlf<y> g;
    private final wlf<y> h;
    private final wlf<com.spotify.music.json.g> i;

    public m8d(wlf<w7d> wlf, wlf<x7d> wlf2, wlf<v7d> wlf3, wlf<g<SessionState>> wlf4, wlf<ConnectManager> wlf5, wlf<y> wlf6, wlf<y> wlf7, wlf<y> wlf8, wlf<com.spotify.music.json.g> wlf9) {
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
        return new g8d(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get(), this.i.get());
    }
}

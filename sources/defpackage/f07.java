package defpackage;

import com.spotify.libs.search.history.l;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.music.libs.assistedcuration.presenter.k;
import io.reactivex.g;
import io.reactivex.y;

/* renamed from: f07  reason: default package */
public final class f07 implements fjf<e07> {
    private final wlf<y> a;
    private final wlf<g<SessionState>> b;
    private final wlf<l> c;
    private final wlf<com.spotify.music.libs.assistedcuration.presenter.y> d;
    private final wlf<k.a> e;

    public f07(wlf<y> wlf, wlf<g<SessionState>> wlf2, wlf<l> wlf3, wlf<com.spotify.music.libs.assistedcuration.presenter.y> wlf4, wlf<k.a> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new e07(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}

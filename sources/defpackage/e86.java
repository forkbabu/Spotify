package defpackage;

import com.spotify.music.navigation.t;
import com.spotify.music.spotlets.offline.util.OffliningLogger;
import com.spotify.playlist.endpoints.i;
import com.spotify.playlist.endpoints.v;
import io.reactivex.y;

/* renamed from: e86  reason: default package */
public final class e86 implements fjf<d86> {
    private final wlf<y76> a;
    private final wlf<OffliningLogger> b;
    private final wlf<y> c;
    private final wlf<String> d;
    private final wlf<v> e;
    private final wlf<i> f;
    private final wlf<m8c> g;
    private final wlf<t> h;

    public e86(wlf<y76> wlf, wlf<OffliningLogger> wlf2, wlf<y> wlf3, wlf<String> wlf4, wlf<v> wlf5, wlf<i> wlf6, wlf<m8c> wlf7, wlf<t> wlf8) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
        this.h = wlf8;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new d86(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
    }
}

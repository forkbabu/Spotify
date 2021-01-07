package defpackage;

import com.spotify.libs.connect.sorting.hashing.a;
import com.spotify.libs.connect.u;
import com.spotify.music.connection.n;
import com.spotify.music.spotlets.offline.util.c;
import io.reactivex.y;

/* renamed from: vt4  reason: default package */
public final class vt4 implements fjf<ut4> {
    private final wlf<hba> a;
    private final wlf<c> b;
    private final wlf<n> c;
    private final wlf<y> d;
    private final wlf<yu0> e;
    private final wlf<a> f;
    private final wlf<u> g;

    public vt4(wlf<hba> wlf, wlf<c> wlf2, wlf<n> wlf3, wlf<y> wlf4, wlf<yu0> wlf5, wlf<a> wlf6, wlf<u> wlf7) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ut4(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get());
    }
}

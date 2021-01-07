package defpackage;

import com.spotify.music.features.podcast.entity.loadedpage.data.h;
import com.spotify.music.features.podcast.entity.loadedpage.data.k;
import com.spotify.music.libs.viewuri.c;
import io.reactivex.y;

/* renamed from: x47  reason: default package */
public final class x47 implements fjf<w47> {
    private final wlf<c57> a;
    private final wlf<k47> b;
    private final wlf<y> c;
    private final wlf<Integer> d;
    private final wlf<h> e;
    private final wlf<h57> f;
    private final wlf<k> g;
    private final wlf<c.a> h;
    private final wlf<etc> i;
    private final wlf<spa> j;
    private final wlf<o47> k;

    public x47(wlf<c57> wlf, wlf<k47> wlf2, wlf<y> wlf3, wlf<Integer> wlf4, wlf<h> wlf5, wlf<h57> wlf6, wlf<k> wlf7, wlf<c.a> wlf8, wlf<etc> wlf9, wlf<spa> wlf10, wlf<o47> wlf11) {
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

    @Override // defpackage.wlf
    public Object get() {
        return new w47(this.a.get(), this.b.get(), this.c.get(), this.d.get().intValue(), this.e.get(), this.f.get(), this.g.get(), this.h.get(), this.i.get(), this.j.get(), this.k.get());
    }
}

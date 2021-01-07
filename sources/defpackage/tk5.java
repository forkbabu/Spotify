package defpackage;

import com.spotify.music.features.home.common.cache.a;
import com.spotify.music.features.home.common.cache.b;
import com.spotify.music.features.home.common.datasource.h;
import com.spotify.music.features.home.common.datasource.j;
import io.reactivex.y;

/* renamed from: tk5  reason: default package */
public final class tk5 implements fjf<sk5> {
    private final wlf<y> a;
    private final wlf<Boolean> b;
    private final wlf<Boolean> c;
    private final wlf<nf5> d;
    private final wlf<h81> e;
    private final wlf<h> f;
    private final wlf<j> g;
    private final wlf<a<byte[]>> h;
    private final wlf<b> i;

    public tk5(wlf<y> wlf, wlf<Boolean> wlf2, wlf<Boolean> wlf3, wlf<nf5> wlf4, wlf<h81> wlf5, wlf<h> wlf6, wlf<j> wlf7, wlf<a<byte[]>> wlf8, wlf<b> wlf9) {
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

    public static tk5 a(wlf<y> wlf, wlf<Boolean> wlf2, wlf<Boolean> wlf3, wlf<nf5> wlf4, wlf<h81> wlf5, wlf<h> wlf6, wlf<j> wlf7, wlf<a<byte[]>> wlf8, wlf<b> wlf9) {
        return new tk5(wlf, wlf2, wlf3, wlf4, wlf5, wlf6, wlf7, wlf8, wlf9);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new sk5(this.a.get(), this.b.get().booleanValue(), this.c.get().booleanValue(), this.d.get(), this.e, this.f.get(), this.g.get(), this.h.get(), this.i.get());
    }
}

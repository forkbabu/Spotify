package defpackage;

import com.spotify.music.features.yourlibrary.musicpages.filterandsort.MusicPagesFiltering;
import com.spotify.music.features.yourlibrary.musicpages.filtertags.loader.b;
import io.reactivex.y;

/* renamed from: ib9  reason: default package */
public final class ib9 implements fjf<hb9> {
    private final wlf<jb9> a;
    private final wlf<b> b;
    private final wlf<MusicPagesFiltering> c;
    private final wlf<lb9> d;
    private final wlf<y> e;
    private final wlf<lf9> f;

    public ib9(wlf<jb9> wlf, wlf<b> wlf2, wlf<MusicPagesFiltering> wlf3, wlf<lb9> wlf4, wlf<y> wlf5, wlf<lf9> wlf6) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new hb9(this.a, this.b, this.c, this.d, this.e, this.f);
    }
}

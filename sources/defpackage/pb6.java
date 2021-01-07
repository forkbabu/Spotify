package defpackage;

import com.spotify.music.features.playlistentity.w;
import com.spotify.playlist.endpoints.v;
import io.reactivex.y;

/* renamed from: pb6  reason: default package */
public final class pb6 implements fjf<ob6> {
    private final wlf<lb6> a;
    private final wlf<hb6> b;
    private final wlf<v> c;
    private final wlf<w> d;
    private final wlf<String> e;
    private final wlf<y> f;

    public pb6(wlf<lb6> wlf, wlf<hb6> wlf2, wlf<v> wlf3, wlf<w> wlf4, wlf<String> wlf5, wlf<y> wlf6) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ob6(this.a, this.b, this.c, this.d, this.e, this.f);
    }
}

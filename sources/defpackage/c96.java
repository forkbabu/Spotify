package defpackage;

import com.spotify.music.features.playlistentity.l;
import io.reactivex.y;

/* renamed from: c96  reason: default package */
public final class c96 implements fjf<b96> {
    private final wlf<l> a;
    private final wlf<y> b;

    public c96(wlf<l> wlf, wlf<y> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new b96(this.a.get(), this.b.get());
    }
}

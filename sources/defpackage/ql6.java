package defpackage;

import com.spotify.music.features.playlistentity.header.o0;
import com.spotify.music.features.playlistentity.w;
import io.reactivex.y;

/* renamed from: ql6  reason: default package */
public final class ql6 implements fjf<pl6> {
    private final wlf<o0> a;
    private final wlf<w> b;
    private final wlf<String> c;
    private final wlf<y> d;

    public ql6(wlf<o0> wlf, wlf<w> wlf2, wlf<String> wlf3, wlf<y> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new pl6(this.a, this.b, this.c, this.d);
    }
}

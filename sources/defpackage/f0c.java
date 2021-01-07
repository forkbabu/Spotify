package defpackage;

import com.spotify.music.nowplaying.common.view.carousel.adapter.viewholder.k;
import com.spotify.music.nowplaying.common.view.carousel.adapter.viewholder.o;

/* renamed from: f0c  reason: default package */
public final class f0c implements fjf<e0c> {
    private final wlf<o> a;
    private final wlf<k> b;

    public f0c(wlf<o> wlf, wlf<k> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new e0c(this.a.get(), this.b.get());
    }
}

package defpackage;

import com.spotify.music.nowplaying.common.view.carousel.adapter.viewholder.k;
import com.spotify.music.nowplaying.common.view.carousel.adapter.viewholder.o;

/* renamed from: s4c  reason: default package */
public final class s4c implements fjf<r4c> {
    private final wlf<o> a;
    private final wlf<k> b;

    public s4c(wlf<o> wlf, wlf<k> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new r4c(this.a.get(), this.b.get());
    }
}

package defpackage;

import com.spotify.music.nowplaying.common.view.carousel.adapter.viewholder.k;
import com.spotify.music.nowplaying.common.view.carousel.adapter.viewholder.o;

/* renamed from: izb  reason: default package */
public final class izb implements fjf<hzb> {
    private final wlf<o> a;
    private final wlf<k> b;

    public izb(wlf<o> wlf, wlf<k> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new hzb(this.a.get(), this.b.get());
    }
}

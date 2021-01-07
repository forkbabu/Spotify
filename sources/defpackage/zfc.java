package defpackage;

import com.spotify.music.podcast.ui.trailer.h;

/* renamed from: zfc  reason: default package */
public final class zfc implements fjf<yfc> {
    private final wlf<h> a;
    private final wlf<pfc> b;

    public zfc(wlf<h> wlf, wlf<pfc> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new yfc(this.a.get(), this.b.get());
    }
}

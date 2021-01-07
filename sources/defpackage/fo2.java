package defpackage;

import com.spotify.music.nowplaying.ads.view.nextbutton.c;

/* renamed from: fo2  reason: default package */
public final class fo2 implements fjf<eo2> {
    private final wlf<no2> a;
    private final wlf<c> b;

    public fo2(wlf<no2> wlf, wlf<c> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new eo2(this.a.get(), this.b.get());
    }
}

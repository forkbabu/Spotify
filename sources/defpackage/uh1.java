package defpackage;

import android.content.Context;
import com.spotify.mobile.android.service.media.browser.t;
import com.spotify.music.libs.podcast.loader.o;

/* renamed from: uh1  reason: default package */
public final class uh1 implements fjf<th1> {
    private final wlf<Context> a;
    private final wlf<o> b;
    private final wlf<t> c;
    private final wlf<cf0> d;
    private final wlf<com.spotify.mobile.android.service.media.browser.o> e;

    public uh1(wlf<Context> wlf, wlf<o> wlf2, wlf<t> wlf3, wlf<cf0> wlf4, wlf<com.spotify.mobile.android.service.media.browser.o> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new th1(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}

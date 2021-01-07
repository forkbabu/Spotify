package defpackage;

import android.content.Context;
import com.spotify.mobile.android.service.media.browser.o;
import com.spotify.playlist.endpoints.d;

/* renamed from: sh1  reason: default package */
public final class sh1 implements fjf<rh1> {
    private final wlf<Context> a;
    private final wlf<d> b;
    private final wlf<o> c;
    private final wlf<cf0> d;

    public sh1(wlf<Context> wlf, wlf<d> wlf2, wlf<o> wlf3, wlf<cf0> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new rh1(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}

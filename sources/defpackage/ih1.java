package defpackage;

import android.content.Context;
import com.spotify.mobile.android.service.media.browser.o;

/* renamed from: ih1  reason: default package */
public final class ih1 implements fjf<hh1> {
    private final wlf<Context> a;
    private final wlf<q9a> b;
    private final wlf<o> c;

    public ih1(wlf<Context> wlf, wlf<q9a> wlf2, wlf<o> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new hh1(this.a.get(), this.b.get(), this.c.get());
    }
}

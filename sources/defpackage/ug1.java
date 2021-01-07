package defpackage;

import android.content.Context;
import com.spotify.libs.album.a;
import com.spotify.mobile.android.service.media.browser.o;

/* renamed from: ug1  reason: default package */
public final class ug1 implements fjf<tg1> {
    private final wlf<Context> a;
    private final wlf<a> b;
    private final wlf<o> c;

    public ug1(wlf<Context> wlf, wlf<a> wlf2, wlf<o> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new tg1(this.a.get(), this.b.get(), this.c.get());
    }
}

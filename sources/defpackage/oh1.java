package defpackage;

import android.content.Context;
import com.spotify.mobile.android.service.media.browser.o;
import io.reactivex.s;

/* renamed from: oh1  reason: default package */
public final class oh1 implements fjf<nh1> {
    private final wlf<Context> a;
    private final wlf<o> b;
    private final wlf<s<String>> c;
    private final wlf<gaa> d;

    public oh1(wlf<Context> wlf, wlf<o> wlf2, wlf<s<String>> wlf3, wlf<gaa> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new nh1(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}

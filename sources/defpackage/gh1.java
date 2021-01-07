package defpackage;

import android.content.Context;
import com.spotify.mobile.android.service.media.browser.q;

/* renamed from: gh1  reason: default package */
public final class gh1 implements fjf<fh1> {
    private final wlf<Context> a;
    private final wlf<q> b;

    public gh1(wlf<Context> wlf, wlf<q> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new fh1(this.a.get(), this.b.get());
    }
}

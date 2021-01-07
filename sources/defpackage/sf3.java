package defpackage;

import android.content.Context;
import com.spotify.mobile.android.rx.v;

/* renamed from: sf3  reason: default package */
public final class sf3 implements fjf<rf3> {
    private final wlf<v> a;
    private final wlf<String> b;
    private final wlf<Context> c;

    public sf3(wlf<v> wlf, wlf<String> wlf2, wlf<Context> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new rf3(this.a.get(), this.b.get(), this.c.get());
    }
}

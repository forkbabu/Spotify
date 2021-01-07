package defpackage;

import com.spotify.mobile.android.rx.w;
import defpackage.h1e;

/* renamed from: v78  reason: default package */
public final class v78 implements fjf<h1e<b91>> {
    private final wlf<w> a;
    private final wlf<ie8> b;
    private final wlf<ke8> c;

    public v78(wlf<w> wlf, wlf<ie8> wlf2, wlf<ke8> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        wlf<ie8> wlf = this.b;
        wlf<ke8> wlf2 = this.c;
        h1e.a aVar = new h1e.a();
        aVar.a(new a78(this.a.get(), wlf2, wlf));
        return aVar.b();
    }
}

package defpackage;

import com.spotify.pageloader.PageLoaderView;

/* renamed from: bmc  reason: default package */
public final class bmc implements fjf<amc> {
    private final wlf<cbc<wjc>> a;
    private final wlf<PageLoaderView.a<wjc>> b;
    private final wlf<olc> c;

    public bmc(wlf<cbc<wjc>> wlf, wlf<PageLoaderView.a<wjc>> wlf2, wlf<olc> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new amc(this.a.get(), this.b.get(), ejf.a(this.c));
    }
}

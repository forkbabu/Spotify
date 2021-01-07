package defpackage;

import android.app.Activity;
import com.spotify.mobile.android.hubframework.defaults.v;
import com.spotify.music.libs.viewuri.c;
import defpackage.w51;
import java.util.Map;

/* renamed from: b65  reason: default package */
public final class b65 implements fjf<w51> {
    private final wlf<Activity> a;
    private final wlf<c.a> b;
    private final wlf<v> c;
    private final wlf<nk9> d;
    private final wlf<p71> e;
    private final wlf<Map<String, a71>> f;

    public b65(wlf<Activity> wlf, wlf<c.a> wlf2, wlf<v> wlf3, wlf<nk9> wlf4, wlf<p71> wlf5, wlf<Map<String, a71>> wlf6) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
    }

    @Override // defpackage.wlf
    public Object get() {
        v vVar = this.c.get();
        nk9 nk9 = this.d.get();
        w51.b b2 = vVar.a(this.a.get(), this.b.get()).c(this.e.get()).a(this.f.get()).b();
        b2.l(nk9);
        b2.m(nk9);
        return b2.a();
    }
}

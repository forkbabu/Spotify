package defpackage;

import android.content.Context;
import com.spotify.mobile.android.ui.contextmenu.v3;
import com.spotify.music.libs.viewuri.c;

/* renamed from: c71  reason: default package */
public final class c71 implements fjf<b71> {
    private final wlf<Context> a;
    private final wlf<v3> b;
    private final wlf<c.a> c;
    private final wlf<p71> d;
    private final wlf<j81> e;
    private final wlf<ere> f;

    public c71(wlf<Context> wlf, wlf<v3> wlf2, wlf<c.a> wlf3, wlf<p71> wlf4, wlf<j81> wlf5, wlf<ere> wlf6) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
    }

    public static c71 a(wlf<Context> wlf, wlf<v3> wlf2, wlf<c.a> wlf3, wlf<p71> wlf4, wlf<j81> wlf5, wlf<ere> wlf6) {
        return new c71(wlf, wlf2, wlf3, wlf4, wlf5, wlf6);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new b71(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get());
    }
}

package defpackage;

import android.content.Context;
import com.spotify.android.glue.patterns.toolbarmenu.h0;
import com.spotify.music.libs.viewuri.c;

/* renamed from: nf3  reason: default package */
public final class nf3 implements fjf<if3> {
    private final wlf<c> a;
    private final wlf<Context> b;
    private final wlf<h0> c;
    private final wlf<lf3> d;
    private final wlf<com.spotify.music.spotlets.scannables.c> e;
    private final wlf<bre> f;

    public nf3(wlf<c> wlf, wlf<Context> wlf2, wlf<h0> wlf3, wlf<lf3> wlf4, wlf<com.spotify.music.spotlets.scannables.c> wlf5, wlf<bre> wlf6) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
    }

    public static nf3 a(wlf<c> wlf, wlf<Context> wlf2, wlf<h0> wlf3, wlf<lf3> wlf4, wlf<com.spotify.music.spotlets.scannables.c> wlf5, wlf<bre> wlf6) {
        return new nf3(wlf, wlf2, wlf3, wlf4, wlf5, wlf6);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new if3(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get());
    }
}

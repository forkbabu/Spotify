package defpackage;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.spotify.instrumentation.a;
import com.spotify.music.features.playlistentity.g;
import defpackage.a2a;

/* renamed from: d07  reason: default package */
public final class d07 implements fjf<c07> {
    private final wlf<Context> a;
    private final wlf<e07> b;
    private final wlf<a2a.a> c;
    private final wlf<sa0> d;
    private final wlf<g> e;
    private final wlf<Fragment> f;
    private final wlf<a> g;
    private final wlf<x1a> h;
    private final wlf<wec> i;

    public d07(wlf<Context> wlf, wlf<e07> wlf2, wlf<a2a.a> wlf3, wlf<sa0> wlf4, wlf<g> wlf5, wlf<Fragment> wlf6, wlf<a> wlf7, wlf<x1a> wlf8, wlf<wec> wlf9) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
        this.h = wlf8;
        this.i = wlf9;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new c07(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
    }
}

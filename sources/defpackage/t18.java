package defpackage;

import android.app.Activity;
import com.google.protobuf.u;
import com.spotify.inappmessaging.m;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.remoteconfig.c6;

/* renamed from: t18  reason: default package */
public final class t18 implements fjf<s18> {
    private final wlf<m> a;
    private final wlf<c6> b;
    private final wlf<c18> c;
    private final wlf<v08> d;
    private final wlf<q08> e;
    private final wlf<h28> f;
    private final wlf<SpSharedPreferences<Object>> g;
    private final wlf<rp0> h;
    private final wlf<Activity> i;
    private final wlf<e18> j;
    private final wlf<q18> k;
    private final wlf<gl0<u>> l;
    private final wlf<n18> m;
    private final wlf<b28> n;

    public t18(wlf<m> wlf, wlf<c6> wlf2, wlf<c18> wlf3, wlf<v08> wlf4, wlf<q08> wlf5, wlf<h28> wlf6, wlf<SpSharedPreferences<Object>> wlf7, wlf<rp0> wlf8, wlf<Activity> wlf9, wlf<e18> wlf10, wlf<q18> wlf11, wlf<gl0<u>> wlf12, wlf<n18> wlf13, wlf<b28> wlf14) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
        this.h = wlf8;
        this.i = wlf9;
        this.j = wlf10;
        this.k = wlf11;
        this.l = wlf12;
        this.m = wlf13;
        this.n = wlf14;
    }

    public static t18 a(wlf<m> wlf, wlf<c6> wlf2, wlf<c18> wlf3, wlf<v08> wlf4, wlf<q08> wlf5, wlf<h28> wlf6, wlf<SpSharedPreferences<Object>> wlf7, wlf<rp0> wlf8, wlf<Activity> wlf9, wlf<e18> wlf10, wlf<q18> wlf11, wlf<gl0<u>> wlf12, wlf<n18> wlf13, wlf<b28> wlf14) {
        return new t18(wlf, wlf2, wlf3, wlf4, wlf5, wlf6, wlf7, wlf8, wlf9, wlf10, wlf11, wlf12, wlf13, wlf14);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new s18(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get(), this.i.get(), this.j.get(), this.k.get(), this.l.get(), this.m.get(), this.n.get());
    }
}

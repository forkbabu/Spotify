package com.spotify.music.libs.carmodeengine.settings;

import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import io.reactivex.s;

public class q implements c6a {
    static final SpSharedPreferences.b<Object, String> d = SpSharedPreferences.b.e("car_mode_availability");
    static final SpSharedPreferences.b<Object, Boolean> e = SpSharedPreferences.b.e("car_mode_auto_activation");
    static final SpSharedPreferences.b<Object, Boolean> f = SpSharedPreferences.b.e("car_mode_prevent_screen_lock");
    static final SpSharedPreferences.b<Object, Integer> g = SpSharedPreferences.b.e("car_mode_opt_in_count");
    private static final BiMap<y6a, String> h = ImmutableBiMap.of(y6a.a(), "ALWAYS", y6a.b(), "IN_CAR", y6a.d(), "NEVER");
    private final SpSharedPreferences<Object> a;
    private final y6a b;
    private final boolean c;

    public q(SpSharedPreferences<Object> spSharedPreferences, y6a y6a, boolean z) {
        this.a = spSharedPreferences;
        this.b = y6a;
        this.c = z;
    }

    static y6a k(SpSharedPreferences.Update update) {
        y6a y6a = h.mo68inverse().get(update.a);
        y6a.getClass();
        return y6a;
    }

    @Override // defpackage.c6a
    public int a() {
        return this.a.f(g, 0);
    }

    @Override // defpackage.c6a
    public s<y6a> b() {
        return this.a.r(d).Q(e.a).j0(h.a).E0(s.c0(new l(this))).E();
    }

    @Override // defpackage.c6a
    public void c(boolean z) {
        SpSharedPreferences.a<Object> b2 = this.a.b();
        b2.a(f, z);
        b2.i();
    }

    @Override // defpackage.c6a
    public void d(y6a y6a) {
        SpSharedPreferences.a<Object> b2 = this.a.b();
        b2.f(d, h.get(y6a));
        b2.i();
    }

    @Override // defpackage.c6a
    public s<Boolean> e() {
        return this.a.p(f).Q(k.a).j0(d.a).E0(s.c0(new j(this))).E();
    }

    @Override // defpackage.c6a
    public s<Boolean> f() {
        return this.a.p(e).Q(f.a).j0(i.a).E0(s.c0(new g(this))).E();
    }

    @Override // defpackage.c6a
    public void g(int i) {
        SpSharedPreferences.a<Object> b2 = this.a.b();
        b2.b(g, i);
        b2.i();
    }

    @Override // defpackage.c6a
    public void h(boolean z) {
        SpSharedPreferences.a<Object> b2 = this.a.b();
        b2.a(e, z);
        b2.i();
    }

    public /* synthetic */ Boolean i() {
        return Boolean.valueOf(this.a.d(e, this.c));
    }

    public y6a j() {
        BiMap<y6a, String> biMap = h;
        y6a y6a = biMap.mo68inverse().get(this.a.m(d, biMap.get(this.b)));
        y6a.getClass();
        return y6a;
    }

    public /* synthetic */ Boolean l() {
        return Boolean.valueOf(this.a.d(f, true));
    }
}

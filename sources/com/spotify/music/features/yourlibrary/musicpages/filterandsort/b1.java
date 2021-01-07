package com.spotify.music.features.yourlibrary.musicpages.filterandsort;

import android.content.res.Resources;
import com.google.common.base.MoreObjects;
import com.google.common.base.Supplier;
import com.spotify.music.features.yourlibrary.musicpages.e1;
import defpackage.di9;

public class b1 {
    private final Supplier<a> a = MoreObjects.memoize(new c(this));
    private final Supplier<a> b = MoreObjects.memoize(new e(this));
    private final Supplier<a> c = MoreObjects.memoize(new d(this));
    private final Supplier<a> d = MoreObjects.memoize(new b(this));
    private final e1 e;
    private final Resources f;

    /* access modifiers changed from: private */
    public interface a {
        ane a();

        di9 b();
    }

    public b1(e1 e1Var, Resources resources) {
        this.e = e1Var;
        this.f = resources;
    }

    static ane a(String str) {
        return new ane(str, false, null, 6);
    }

    static ane b(String str, ane ane) {
        return new ane(str, false, ane);
    }

    static di9.d c(String str, int i, ane ane) {
        di9.d.a a2 = di9.d.a();
        a2.c(new ane(str, false, ane));
        a2.d(i);
        return a2.a();
    }

    static di9.d e(String str, int i) {
        di9.d.a a2 = di9.d.a();
        a2.c(new ane(str, false, null, 6));
        a2.d(i);
        return a2.a();
    }

    public ane g() {
        return this.c.get().a();
    }

    public ane h() {
        return this.b.get().a();
    }

    public ane i() {
        return this.a.get().a();
    }

    public ane j() {
        return this.d.get().a();
    }

    public di9 k() {
        return this.c.get().b();
    }

    public di9 l() {
        return this.b.get().b();
    }

    public di9 m() {
        return this.a.get().b();
    }

    public di9 n() {
        return this.d.get().b();
    }

    public Boolean o() {
        return Boolean.valueOf(!this.e.g());
    }
}

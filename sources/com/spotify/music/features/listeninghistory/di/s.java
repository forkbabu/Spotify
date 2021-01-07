package com.spotify.music.features.listeninghistory.di;

import androidx.fragment.app.Fragment;
import com.spotify.pageloader.o0;
import kotlin.jvm.internal.h;

public final class s implements fjf<cbc<rm5>> {
    private final wlf<dbc> a;
    private final wlf<Fragment> b;
    private final wlf<o0<rm5>> c;

    public s(wlf<dbc> wlf, wlf<Fragment> wlf2, wlf<o0<rm5>> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    public static cbc<rm5> a(dbc dbc, Fragment fragment, o0<rm5> o0Var) {
        h.e(dbc, "pageLoaderScopeFactory");
        h.e(fragment, "fragment");
        h.e(o0Var, "loadable");
        cbc<rm5> a2 = dbc.a(fragment, o0Var);
        h.d(a2, "pageLoaderScopeFactory.create(fragment, loadable)");
        return a2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return a(this.a.get(), this.b.get(), this.c.get());
    }
}

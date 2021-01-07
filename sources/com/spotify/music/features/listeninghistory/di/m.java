package com.spotify.music.features.listeninghistory.di;

import android.app.Activity;
import com.spotify.mobile.android.hubframework.defaults.v;
import com.spotify.mobile.android.ui.contextmenu.v3;
import com.spotify.music.libs.viewuri.c;
import com.spotify.player.model.ContextTrack;
import defpackage.w51;
import kotlin.jvm.internal.h;

public final class m implements fjf<w51> {
    private final wlf<v> a;
    private final wlf<Activity> b;
    private final wlf<c.a> c;
    private final wlf<nk9> d;
    private final wlf<v3> e;
    private final wlf<p71> f;

    public m(wlf<v> wlf, wlf<Activity> wlf2, wlf<c.a> wlf3, wlf<nk9> wlf4, wlf<v3> wlf5, wlf<p71> wlf6) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
    }

    @Override // defpackage.wlf
    public Object get() {
        v vVar = this.a.get();
        Activity activity = this.b.get();
        c.a aVar = this.c.get();
        nk9 nk9 = this.d.get();
        v3 v3Var = this.e.get();
        p71 p71 = this.f.get();
        h.e(vVar, "spotifyHubsConfig");
        h.e(activity, "activity");
        h.e(aVar, ContextTrack.Metadata.KEY_PROVIDER);
        h.e(nk9, "registryResolver");
        h.e(v3Var, "contextMenuProvider");
        h.e(p71, "hubsInteractionLogger");
        w51.b b2 = vVar.a(activity, aVar).b(v3Var, p71).b();
        b2.l(nk9);
        b2.m(nk9);
        w51 a2 = b2.a();
        h.d(a2, "spotifyHubsConfig\n      …ver)\n            .build()");
        return a2;
    }
}

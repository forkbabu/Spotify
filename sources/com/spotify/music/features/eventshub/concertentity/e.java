package com.spotify.music.features.eventshub.concertentity;

import android.content.Context;
import com.spotify.mobile.android.hubframework.defaults.playback.i;
import com.spotify.mobile.android.hubframework.defaults.v;
import com.spotify.mobile.android.ui.contextmenu.v3;

public final class e implements fjf<w51> {
    private final wlf<ConcertEntityFragment> a;
    private final wlf<v3> b;
    private final wlf<v> c;
    private final wlf<i> d;
    private final wlf<p71> e;

    public e(wlf<ConcertEntityFragment> wlf, wlf<v3> wlf2, wlf<v> wlf3, wlf<i> wlf4, wlf<p71> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        ConcertEntityFragment concertEntityFragment = this.a.get();
        v3 v3Var = this.b.get();
        v vVar = this.c.get();
        i iVar = this.d.get();
        p71 p71 = this.e.get();
        vVar.getClass();
        Context F2 = concertEntityFragment.F2();
        if (F2 != null) {
            return vVar.a(F2, concertEntityFragment).c(p71).b(v3Var, p71).a(iVar).a();
        }
        throw new IllegalStateException("Fragment is not attached!");
    }
}

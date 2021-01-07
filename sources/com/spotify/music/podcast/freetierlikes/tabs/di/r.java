package com.spotify.music.podcast.freetierlikes.tabs.di;

import androidx.fragment.app.Fragment;
import com.spotify.player.model.ContextTrack;
import kotlin.jvm.internal.h;

public final class r implements fjf<cbc<wjc>> {
    private final wlf<dbc> a;
    private final wlf<wlc> b;
    private final wlf<Fragment> c;

    public r(wlf<dbc> wlf, wlf<wlc> wlf2, wlf<Fragment> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        dbc dbc = this.a.get();
        wlc wlc = this.b.get();
        Fragment fragment = this.c.get();
        h.e(dbc, "factory");
        h.e(wlc, ContextTrack.Metadata.KEY_PROVIDER);
        h.e(fragment, "fragment");
        cbc a2 = dbc.a(fragment, wlc.a());
        h.d(a2, "factory.create(fragment,…ovider.provideLoadable())");
        return a2;
    }
}

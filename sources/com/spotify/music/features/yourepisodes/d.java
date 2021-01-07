package com.spotify.music.features.yourepisodes;

import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.music.libs.viewuri.c;
import com.spotify.music.podcastentityrow.v;
import com.spotify.music.podcastentityrow.w;
import com.spotify.music.podcastentityrow.z;
import kotlin.jvm.internal.h;

public final class d implements fjf<v> {
    private final wlf<c> a;
    private final wlf<Player> b;
    private final wlf<w> c;

    public d(wlf<c> wlf, wlf<Player> wlf2, wlf<w> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        c cVar = this.a.get();
        Player player = this.b.get();
        w wVar = this.c.get();
        h.e(cVar, "viewUri");
        h.e(player, "player");
        h.e(wVar, "contextCreator");
        return new z(cVar, player, wVar);
    }
}

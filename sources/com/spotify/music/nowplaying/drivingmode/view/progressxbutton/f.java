package com.spotify.music.nowplaying.drivingmode.view.progressxbutton;

import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.music.nowplaying.drivingmode.loggers.d;
import com.spotify.player.model.PlayerState;
import io.reactivex.g;
import io.reactivex.y;

public final class f implements fjf<e> {
    public static e a(y yVar, y yVar2) {
        return new e(yVar, yVar2);
    }

    public static g b(y yVar, Object obj, g<PlayerState> gVar, wlf<Player> wlf, d dVar) {
        return new g(yVar, (e) obj, gVar, wlf, dVar);
    }
}

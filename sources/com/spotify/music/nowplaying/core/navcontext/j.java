package com.spotify.music.nowplaying.core.navcontext;

import com.spotify.player.model.PlayerState;

public class j {
    public f a(PlayerState playerState) {
        EntityType d = EntityType.d(playerState);
        g gVar = new g(playerState);
        switch (d.ordinal()) {
            case 1:
                return gVar.a(d);
            case 2:
            case 23:
            case 24:
                return gVar.b(d);
            case 3:
                return gVar.c(d);
            case 4:
            case 7:
            case 14:
            case 16:
            case 20:
            case 26:
            case 27:
            case 32:
            case 33:
            case 34:
            case 35:
            default:
                return gVar.j(d);
            case 5:
            case 6:
            case 19:
            case 21:
            case 28:
                return gVar.o(d);
            case 8:
            case 18:
            case 25:
                return gVar.m(d);
            case 9:
                return gVar.e(d);
            case 10:
                return gVar.f(d);
            case 11:
                return gVar.g(d);
            case 12:
                return gVar.h(d);
            case 13:
                return gVar.i(d);
            case 15:
            case 30:
            case 37:
                return gVar.n(d);
            case 17:
                return gVar.d(d);
            case 22:
                return gVar.p(d);
            case 29:
            case 36:
                return gVar.r(d);
            case 31:
            case 38:
                return gVar.s(d);
        }
    }
}

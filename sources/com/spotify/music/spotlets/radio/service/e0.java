package com.spotify.music.spotlets.radio.service;

import com.spotify.mobile.android.rx.v;
import com.spotify.mobile.android.util.o0;
import com.spotify.music.explicitcontent.f;
import com.spotify.player.model.PlayerState;
import io.reactivex.g;
import io.reactivex.y;

public final class e0 implements fjf<d0> {
    public static void a(RadioActionsService radioActionsService, v vVar) {
        radioActionsService.n = vVar;
    }

    public static void b(RadioActionsService radioActionsService, Object obj) {
        radioActionsService.c = (d0) obj;
    }

    public static void c(RadioActionsService radioActionsService, yn1 yn1) {
        radioActionsService.f = yn1;
    }

    public static d0 d(yfd yfd, k0 k0Var, wfd wfd, h0 h0Var, o0 o0Var, f fVar, y yVar, com.spotify.player.play.f fVar2, g<PlayerState> gVar) {
        return new d0(yfd, k0Var, wfd, h0Var, o0Var, fVar, yVar, fVar2, gVar);
    }
}

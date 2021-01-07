package com.spotify.music.nowplaying.common.view.contextmenu;

import com.spotify.player.options.RepeatMode;
import com.spotify.ubi.specification.factories.s0;

public final class w {
    public static nqe a(s0 s0Var, RepeatMode repeatMode) {
        int ordinal = repeatMode.ordinal();
        if (ordinal == 0) {
            return s0Var.G().a();
        }
        if (ordinal == 1) {
            return s0Var.G().b();
        }
        if (ordinal == 2) {
            return s0Var.G().c();
        }
        throw new IllegalStateException("Unexpected value: " + repeatMode);
    }

    public static nqe b(s0 s0Var, boolean z) {
        if (z) {
            return s0Var.H().b();
        }
        return s0Var.H().a();
    }
}

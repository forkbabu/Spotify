package com.spotify.music.genie;

import com.spotify.music.genie.q;
import com.spotify.player.model.PlayerState;
import io.reactivex.functions.c;

public final /* synthetic */ class i implements c {
    public static final /* synthetic */ i a = new i();

    private /* synthetic */ i() {
    }

    @Override // io.reactivex.functions.c
    public final Object a(Object obj, Object obj2) {
        return new q.a(((Boolean) obj).booleanValue(), (PlayerState) obj2);
    }
}

package com.spotify.music.libs.mediabrowserservice;

import com.google.common.collect.ImmutableMap;
import com.spotify.player.model.PlayerState;
import io.reactivex.functions.l;

public final /* synthetic */ class i implements l {
    public final /* synthetic */ n1 a;
    public final /* synthetic */ PlayerState b;
    public final /* synthetic */ ImmutableMap c;

    public /* synthetic */ i(n1 n1Var, PlayerState playerState, ImmutableMap immutableMap) {
        this.a = n1Var;
        this.b = playerState;
        this.c = immutableMap;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.b(this.b, this.c, (pja) obj);
    }
}

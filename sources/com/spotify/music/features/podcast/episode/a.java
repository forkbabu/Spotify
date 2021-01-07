package com.spotify.music.features.podcast.episode;

import com.spotify.player.model.PlayerState;
import io.reactivex.functions.l;

public final /* synthetic */ class a implements l {
    public final /* synthetic */ e0 a;
    public final /* synthetic */ String b;

    public /* synthetic */ a(e0 e0Var, String str) {
        this.a = e0Var;
        this.b = str;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.b(this.b, (PlayerState) obj);
    }
}

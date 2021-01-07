package com.spotify.music.cyoa.game;

import com.spotify.music.cyoa.game.t;
import com.spotify.music.cyoa.model.CyoaGame;

public final /* synthetic */ class d implements t.a {
    public final /* synthetic */ s a;
    public final /* synthetic */ CyoaGame b;

    public /* synthetic */ d(s sVar, CyoaGame cyoaGame) {
        this.a = sVar;
        this.b = cyoaGame;
    }

    @Override // com.spotify.music.cyoa.game.t.a
    public final void a() {
        this.a.b(this.b);
    }
}

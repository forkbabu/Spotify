package com.spotify.music.cyoa.game;

import com.spotify.music.cyoa.model.CyoaGame;
import io.reactivex.functions.g;

public final /* synthetic */ class e implements g {
    public final /* synthetic */ s a;

    public /* synthetic */ e(s sVar) {
        this.a = sVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.d((CyoaGame) obj);
    }
}

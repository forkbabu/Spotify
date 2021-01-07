package com.spotify.music.cyoa.game;

import com.spotify.music.cyoa.model.CyoaGameStatus;
import io.reactivex.functions.g;

public final /* synthetic */ class b implements g {
    public final /* synthetic */ s a;
    public final /* synthetic */ int b;

    public /* synthetic */ b(s sVar, int i) {
        this.a = sVar;
        this.b = i;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.e(this.b, (CyoaGameStatus) obj);
    }
}

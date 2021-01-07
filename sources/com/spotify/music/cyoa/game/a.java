package com.spotify.music.cyoa.game;

import com.spotify.music.cyoa.model.CyoaGameStatus;
import io.reactivex.functions.g;

public final /* synthetic */ class a implements g {
    public final /* synthetic */ t a;

    public /* synthetic */ a(t tVar) {
        this.a = tVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.e((CyoaGameStatus) obj);
    }
}

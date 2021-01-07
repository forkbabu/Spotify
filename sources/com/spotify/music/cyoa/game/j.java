package com.spotify.music.cyoa.game;

import io.reactivex.functions.g;

public final /* synthetic */ class j implements g {
    public final /* synthetic */ u a;

    public /* synthetic */ j(u uVar) {
        this.a = uVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.m((Long) obj);
    }
}

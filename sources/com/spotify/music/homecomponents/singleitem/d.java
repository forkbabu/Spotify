package com.spotify.music.homecomponents.singleitem;

import com.spotify.music.homecomponents.singleitem.HomeSingleItemPlayClickCommandHandler;
import com.spotify.player.model.PlayerState;
import io.reactivex.functions.g;

public final /* synthetic */ class d implements g {
    public final /* synthetic */ HomeSingleItemPlayClickCommandHandler.AnonymousClass1 a;

    public /* synthetic */ d(HomeSingleItemPlayClickCommandHandler.AnonymousClass1 r1) {
        this.a = r1;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        HomeSingleItemPlayClickCommandHandler.c(HomeSingleItemPlayClickCommandHandler.this, (PlayerState) obj);
    }
}

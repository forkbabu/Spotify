package com.spotify.music.homecomponents.promotionv2;

import com.spotify.music.homecomponents.promotionv2.HomePromotionPlayClickCommandHandler;
import com.spotify.player.model.PlayerState;
import io.reactivex.functions.g;

public final /* synthetic */ class e implements g {
    public final /* synthetic */ HomePromotionPlayClickCommandHandler.AnonymousClass1 a;

    public /* synthetic */ e(HomePromotionPlayClickCommandHandler.AnonymousClass1 r1) {
        this.a = r1;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        HomePromotionPlayClickCommandHandler.c(HomePromotionPlayClickCommandHandler.this, (PlayerState) obj);
    }
}

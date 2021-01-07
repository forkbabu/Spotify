package com.spotify.music.homecomponents.promotionv2;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

public final /* synthetic */ class d implements g {
    public static final /* synthetic */ d a = new d();

    private /* synthetic */ d() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.e((Throwable) obj, "Error subscribing to player state from HomePromotionComponent.", new Object[0]);
    }
}

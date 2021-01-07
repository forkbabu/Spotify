package com.spotify.player.queue;

import com.google.common.base.Optional;
import com.spotify.player.model.PlayerQueue;
import io.reactivex.functions.l;

public final /* synthetic */ class c implements l {
    public static final /* synthetic */ c a = new c();

    private /* synthetic */ c() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return (PlayerQueue) ((Optional) obj).get();
    }
}

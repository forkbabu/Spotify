package com.spotify.player.sub;

import com.google.common.base.Optional;
import com.spotify.player.model.PlayerState;
import io.reactivex.functions.l;

public final /* synthetic */ class f implements l {
    public static final /* synthetic */ f a = new f();

    private /* synthetic */ f() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return (PlayerState) ((Optional) obj).get();
    }
}

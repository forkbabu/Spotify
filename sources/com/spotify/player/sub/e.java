package com.spotify.player.sub;

import com.google.common.base.Optional;
import com.spotify.player.model.PlayerError;
import io.reactivex.functions.l;

public final /* synthetic */ class e implements l {
    public static final /* synthetic */ e a = new e();

    private /* synthetic */ e() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return (PlayerError) ((Optional) obj).get();
    }
}

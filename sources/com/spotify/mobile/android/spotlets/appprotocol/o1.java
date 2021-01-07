package com.spotify.mobile.android.spotlets.appprotocol;

import com.google.common.base.Optional;
import com.spotify.player.model.command.options.LoggingParams;
import io.reactivex.functions.l;

public final /* synthetic */ class o1 implements l {
    public static final /* synthetic */ o1 a = new o1();

    private /* synthetic */ o1() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        int i = e4.D;
        return Optional.of(LoggingParams.builder().interactionId((String) obj).build());
    }
}

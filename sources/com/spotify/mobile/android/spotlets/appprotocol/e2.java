package com.spotify.mobile.android.spotlets.appprotocol;

import com.spotify.player.model.command.options.LoggingParams;
import io.reactivex.functions.l;

public final /* synthetic */ class e2 implements l {
    public static final /* synthetic */ e2 a = new e2();

    private /* synthetic */ e2() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        int i = e4.D;
        return LoggingParams.builder().interactionId((String) obj).build();
    }
}

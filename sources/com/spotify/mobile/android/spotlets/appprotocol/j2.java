package com.spotify.mobile.android.spotlets.appprotocol;

import com.spotify.player.model.command.options.LoggingParams;
import io.reactivex.functions.l;

public final /* synthetic */ class j2 implements l {
    public static final /* synthetic */ j2 a = new j2();

    private /* synthetic */ j2() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        int i = e4.D;
        return LoggingParams.builder().interactionId((String) obj).build();
    }
}

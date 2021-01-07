package com.spotify.mobile.android.spotlets.appprotocol;

import com.spotify.player.model.command.options.LoggingParams;
import io.reactivex.functions.l;

public final /* synthetic */ class v2 implements l {
    public static final /* synthetic */ v2 a = new v2();

    private /* synthetic */ v2() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        int i = e4.D;
        return LoggingParams.builder().interactionId((String) obj).build();
    }
}

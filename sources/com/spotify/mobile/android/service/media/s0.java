package com.spotify.mobile.android.service.media;

import com.spotify.player.model.command.options.LoggingParams;
import io.reactivex.functions.l;

public final /* synthetic */ class s0 implements l {
    public static final /* synthetic */ s0 a = new s0();

    private /* synthetic */ s0() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return LoggingParams.builder().interactionId((String) obj).build();
    }
}

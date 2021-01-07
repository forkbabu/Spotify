package com.spotify.mobile.android.service.media;

import com.spotify.player.model.command.options.LoggingParams;
import io.reactivex.functions.l;

public final /* synthetic */ class b1 implements l {
    public static final /* synthetic */ b1 a = new b1();

    private /* synthetic */ b1() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return LoggingParams.builder().interactionId((String) obj).build();
    }
}

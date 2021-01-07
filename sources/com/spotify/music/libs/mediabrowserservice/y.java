package com.spotify.music.libs.mediabrowserservice;

import com.spotify.player.model.command.options.LoggingParams;
import io.reactivex.functions.l;

public final /* synthetic */ class y implements l {
    public static final /* synthetic */ y a = new y();

    private /* synthetic */ y() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return LoggingParams.builder().interactionId((String) obj).build();
    }
}

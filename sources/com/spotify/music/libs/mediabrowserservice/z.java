package com.spotify.music.libs.mediabrowserservice;

import com.google.common.base.Optional;
import com.spotify.player.model.command.options.LoggingParams;
import io.reactivex.functions.l;

public final /* synthetic */ class z implements l {
    public static final /* synthetic */ z a = new z();

    private /* synthetic */ z() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return Optional.of(LoggingParams.builder().interactionId((String) obj).build());
    }
}

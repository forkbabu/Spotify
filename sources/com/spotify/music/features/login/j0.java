package com.spotify.music.features.login;

import com.spotify.music.spotlets.tracker.identifier.EventIdentifier;
import defpackage.m11;

public final /* synthetic */ class j0 implements ti0 {
    public static final /* synthetic */ j0 a = new j0();

    private /* synthetic */ j0() {
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        m11.m mVar = (m11.m) obj;
        return EventIdentifier.MAGICLINK_TOKEN_RECEIVED_SUCCESS;
    }
}

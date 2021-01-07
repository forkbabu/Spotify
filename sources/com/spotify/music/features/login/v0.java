package com.spotify.music.features.login;

import com.spotify.music.spotlets.tracker.identifier.EventIdentifier;
import defpackage.m11;

public final /* synthetic */ class v0 implements ti0 {
    public static final /* synthetic */ v0 a = new v0();

    private /* synthetic */ v0() {
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        m11.c cVar = (m11.c) obj;
        return EventIdentifier.MAGICLINK_LOGIN_SUCCESS;
    }
}

package com.spotify.music.features.login;

import com.spotify.music.spotlets.tracker.identifier.ErrorTypeIdentifier;
import defpackage.l11;

public final /* synthetic */ class p0 implements ti0 {
    public static final /* synthetic */ p0 a = new p0();

    private /* synthetic */ p0() {
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        l11.f fVar = (l11.f) obj;
        return ErrorTypeIdentifier.PASSWORD_TOKEN_EXPIRED;
    }
}

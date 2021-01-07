package com.spotify.music.features.login;

import com.spotify.music.spotlets.tracker.identifier.EventIdentifier;
import defpackage.m11;

public final /* synthetic */ class u0 implements ti0 {
    public static final /* synthetic */ u0 a = new u0();

    private /* synthetic */ u0() {
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        m11.a aVar = (m11.a) obj;
        return EventIdentifier.MAGICLINK_LOGIN_ALREADY_LOGGED_IN;
    }
}

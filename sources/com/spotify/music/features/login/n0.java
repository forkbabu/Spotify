package com.spotify.music.features.login;

import com.spotify.music.spotlets.tracker.identifier.EventIdentifier;
import defpackage.m11;

public final /* synthetic */ class n0 implements ti0 {
    public static final /* synthetic */ n0 a = new n0();

    private /* synthetic */ n0() {
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        m11.d dVar = (m11.d) obj;
        return EventIdentifier.MAGICLINK_REQUEST_BAD_EMAIL;
    }
}

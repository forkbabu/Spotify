package com.spotify.music.features.login;

import com.spotify.music.spotlets.tracker.identifier.EventIdentifier;
import defpackage.m11;

public final /* synthetic */ class y0 implements ti0 {
    public static final /* synthetic */ y0 a = new y0();

    private /* synthetic */ y0() {
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        m11.k kVar = (m11.k) obj;
        return EventIdentifier.SMARTLOCK_SAVE_CREDENTIALS_SUCCESS;
    }
}

package com.spotify.music.features.login;

import com.spotify.music.spotlets.tracker.identifier.EventIdentifier;
import defpackage.m11;

public final /* synthetic */ class w0 implements ti0 {
    public static final /* synthetic */ w0 a = new w0();

    private /* synthetic */ w0() {
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        m11.e eVar = (m11.e) obj;
        return EventIdentifier.MAGICLINK_REQUEST_BAD_EMAIL_PREFILLED;
    }
}

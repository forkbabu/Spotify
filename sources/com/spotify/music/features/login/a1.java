package com.spotify.music.features.login;

import com.spotify.music.spotlets.tracker.identifier.EventIdentifier;
import defpackage.m11;

public final /* synthetic */ class a1 implements ti0 {
    public static final /* synthetic */ a1 a = new a1();

    private /* synthetic */ a1() {
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        m11.i iVar = (m11.i) obj;
        return EventIdentifier.MAGICLINK_REQUEST_USER_NOT_FOUND_PREFILLED;
    }
}

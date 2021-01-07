package com.spotify.music.features.login;

import com.spotify.music.spotlets.tracker.identifier.ErrorTypeIdentifier;
import defpackage.l11;

public final /* synthetic */ class q implements ti0 {
    public static final /* synthetic */ q a = new q();

    private /* synthetic */ q() {
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        l11.b bVar = (l11.b) obj;
        return ErrorTypeIdentifier.MAGIC_LINK_LOGIN_FAILURE;
    }
}

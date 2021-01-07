package com.spotify.music.features.login;

import com.spotify.music.spotlets.tracker.identifier.DialogIdentifier;
import defpackage.k11;

public final /* synthetic */ class z0 implements ti0 {
    public static final /* synthetic */ z0 a = new z0();

    private /* synthetic */ z0() {
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        k11.b bVar = (k11.b) obj;
        return DialogIdentifier.MAGIC_LINK_TOKEN_EXPIRED;
    }
}

package com.spotify.music.features.login;

import com.spotify.music.spotlets.tracker.identifier.ClickIdentifier;
import defpackage.j11;

public final /* synthetic */ class e0 implements ti0 {
    public static final /* synthetic */ e0 a = new e0();

    private /* synthetic */ e0() {
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        j11.e eVar = (j11.e) obj;
        return ClickIdentifier.MAGICLINK_ON_LOGGED_IN_DISMISSED;
    }
}

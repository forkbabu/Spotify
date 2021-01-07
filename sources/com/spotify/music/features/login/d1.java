package com.spotify.music.features.login;

import com.spotify.music.spotlets.tracker.identifier.ClickIdentifier;
import defpackage.j11;

public final /* synthetic */ class d1 implements ti0 {
    public static final /* synthetic */ d1 a = new d1();

    private /* synthetic */ d1() {
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        j11.f fVar = (j11.f) obj;
        return ClickIdentifier.MAGICLINK_ON_LOGGED_IN_SET_PASSWORD;
    }
}

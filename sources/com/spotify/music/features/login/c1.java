package com.spotify.music.features.login;

import com.spotify.music.spotlets.tracker.identifier.ScreenIdentifier;
import defpackage.p11;

public final /* synthetic */ class c1 implements ti0 {
    public static final /* synthetic */ c1 a = new c1();

    private /* synthetic */ c1() {
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        p11.d dVar = (p11.d) obj;
        return ScreenIdentifier.ON_LOGGED_IN;
    }
}

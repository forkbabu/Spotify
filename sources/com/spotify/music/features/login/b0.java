package com.spotify.music.features.login;

import com.spotify.music.spotlets.tracker.identifier.ClickIdentifier;
import defpackage.j11;

public final /* synthetic */ class b0 implements ti0 {
    public static final /* synthetic */ b0 a = new b0();

    private /* synthetic */ b0() {
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        j11.j jVar = (j11.j) obj;
        return ClickIdentifier.RESEND_MAGIC_LINK;
    }
}

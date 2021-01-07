package com.spotify.music.mainactivity.eventsources;

import com.spotify.android.flags.c;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobius.q;
import io.reactivex.g;
import kotlin.jvm.internal.h;

public final class MainActivityEventSources {
    public static final MainActivityEventSources a = new MainActivityEventSources();

    private MainActivityEventSources() {
    }

    public final q<ufb> a(g<c> gVar, g<SessionState> gVar2) {
        h.e(gVar, "flags");
        h.e(gVar2, "sessionState");
        return new MainActivityEventSources$provideEventSource$1(gVar, gVar2);
    }
}

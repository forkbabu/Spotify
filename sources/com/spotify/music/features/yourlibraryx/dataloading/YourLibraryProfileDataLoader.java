package com.spotify.music.features.yourlibraryx.dataloading;

import com.spotify.mobile.android.service.session.SessionState;
import io.reactivex.g;
import kotlin.a;
import kotlin.d;
import kotlin.jvm.internal.h;

public final class YourLibraryProfileDataLoader {
    private final d a = a.b(new YourLibraryProfileDataLoader$profileDataFlowable$2(this));
    private final g<SessionState> b;
    private final bqa c;

    public YourLibraryProfileDataLoader(g<SessionState> gVar, bqa bqa) {
        h.e(gVar, "sessionStateFlowable");
        h.e(bqa, "coreProfile");
        this.b = gVar;
        this.c = bqa;
    }

    public final g<com.spotify.music.features.yourlibraryx.domain.g> c() {
        return (g) this.a.getValue();
    }
}

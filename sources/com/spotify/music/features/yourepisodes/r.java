package com.spotify.music.features.yourepisodes;

import com.spotify.mobile.android.util.l0;
import defpackage.onc;
import kotlin.jvm.internal.h;

public final class r implements q {
    @Override // com.spotify.music.features.yourepisodes.q
    public boolean a(onc onc) {
        h.e(onc, "state");
        if (onc instanceof onc.c) {
            onc.c cVar = (onc.c) onc;
            if (cVar.f()) {
                l0 z = l0.z(cVar.a());
                h.d(z, "SpotifyLink.of(state.asUpdate().contextUri)");
                if (z.y()) {
                    return true;
                }
            }
        }
        return false;
    }
}

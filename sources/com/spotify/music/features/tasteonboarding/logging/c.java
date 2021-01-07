package com.spotify.music.features.tasteonboarding.logging;

import java.util.UUID;
import kotlin.jvm.internal.h;

public final class c implements b {
    @Override // com.spotify.music.features.tasteonboarding.logging.b
    public String a() {
        String uuid = UUID.randomUUID().toString();
        h.d(uuid, "UUID.randomUUID().toString()");
        return uuid;
    }
}

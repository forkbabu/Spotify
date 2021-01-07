package com.spotify.music.features.updateemail;

import com.spotify.music.email.e;
import com.spotify.remoteconfig.gk;
import kotlin.jvm.internal.h;

public final class a implements e {
    private final gk a;

    public a(gk gkVar) {
        h.e(gkVar, "properties");
        this.a = gkVar;
    }

    @Override // com.spotify.music.email.e
    public boolean a() {
        return this.a.a();
    }
}

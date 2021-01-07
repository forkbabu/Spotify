package com.spotify.music.features.yourlibrary.container;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.spotify.music.json.d;
import com.spotify.music.json.e;
import com.spotify.music.json.g;

/* access modifiers changed from: package-private */
public final class l extends d {
    l(g gVar) {
        super(gVar);
    }

    @Override // com.spotify.music.json.d
    public e b(e eVar) {
        eVar.a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        return eVar;
    }
}

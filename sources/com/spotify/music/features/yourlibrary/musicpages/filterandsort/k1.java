package com.spotify.music.features.yourlibrary.musicpages.filterandsort;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.spotify.music.json.d;
import com.spotify.music.json.e;
import com.spotify.music.json.g;

class k1 extends d {
    k1(MusicPagesFiltering musicPagesFiltering, g gVar) {
        super(gVar);
    }

    @Override // com.spotify.music.json.d
    public e b(e eVar) {
        eVar.a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        return eVar;
    }
}

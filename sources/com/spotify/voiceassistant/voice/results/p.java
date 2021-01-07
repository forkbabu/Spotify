package com.spotify.voiceassistant.voice.results;

import com.spotify.voiceassistant.player.models.SearchRequest;
import com.spotify.voiceassistant.player.models.SearchResponse;
import io.reactivex.l;

public final class p implements fjf<o> {
    private final wlf<pg0<SearchRequest, SearchResponse, l<e>>> a;

    public p(wlf<pg0<SearchRequest, SearchResponse, l<e>>> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new o(this.a.get());
    }
}

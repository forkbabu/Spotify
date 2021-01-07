package com.spotify.voiceassistant.voice.results;

import com.spotify.voice.results.model.e;
import com.spotify.voiceassistant.player.models.SearchRequest;
import com.spotify.voiceassistant.player.models.SearchResponse;
import io.reactivex.functions.l;
import java.util.List;
import kotlin.jvm.internal.h;

final class j<T, R> implements l<List<? extends e.a>, e> {
    final /* synthetic */ SearchResponse a;
    final /* synthetic */ SearchRequest b;

    j(SearchResponse searchResponse, SearchRequest searchRequest) {
        this.a = searchResponse;
        this.b = searchRequest;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public e apply(List<? extends e.a> list) {
        List<? extends e.a> list2 = list;
        h.e(list2, "it");
        String requestId = this.a.requestId();
        h.d(requestId, "searchResponse.requestId()");
        e a2 = e.a(this.b.textQuery(), list2);
        h.d(a2, "ResultsPageModel.create(request.textQuery(), it)");
        return new e(requestId, a2);
    }
}

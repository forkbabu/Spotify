package com.spotify.music.features.entityselector.pages.search.effecthandlers;

import com.spotify.music.features.entityselector.pages.search.effecthandlers.d;
import com.spotify.searchview.assistedcuration.proto.DrillDownViewResponse;
import io.reactivex.d0;
import io.reactivex.functions.l;
import java.util.Map;
import kotlin.jvm.internal.h;

final class a<T, R> implements l<Map<String, String>, d0<? extends DrillDownViewResponse>> {
    final /* synthetic */ d.a a;

    a(d.a aVar) {
        this.a = aVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public d0<? extends DrillDownViewResponse> apply(Map<String, String> map) {
        Map<String, String> map2 = map;
        h.e(map2, "queryParams");
        return this.a.a.b.b("tracks", map2);
    }
}

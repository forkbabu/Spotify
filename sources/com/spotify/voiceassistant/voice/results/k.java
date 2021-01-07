package com.spotify.voiceassistant.voice.results;

import com.google.common.base.Optional;
import com.spotify.player.model.command.options.PreparePlayOptions;
import com.spotify.voice.results.model.e;
import com.spotify.voiceassistant.player.models.SearchRequest;
import com.spotify.voiceassistant.player.models.SearchResponse;
import com.spotify.voiceassistant.player.models.metadata.MetadataItem;
import io.reactivex.internal.operators.flowable.a0;
import io.reactivex.internal.operators.maybe.MaybeConcatIterable;
import io.reactivex.internal.operators.maybe.b;
import io.reactivex.l;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.d;
import kotlin.jvm.internal.h;

public final class k implements pg0<SearchRequest, SearchResponse, l<e>> {
    private final nmf<h, l<e.a>> a;

    public k(nmf<h, l<e.a>> nmf) {
        h.e(nmf, "metaDataItemMapper");
        this.a = nmf;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // defpackage.pg0
    public l<e> a(SearchRequest searchRequest, SearchResponse searchResponse) {
        SearchRequest searchRequest2 = searchRequest;
        SearchResponse searchResponse2 = searchResponse;
        h.e(searchRequest2, "request");
        h.e(searchResponse2, "searchResponse");
        Optional<MetadataItem> feedbackDetails = searchResponse2.feedbackDetails();
        h.d(feedbackDetails, "searchResponse.feedbackDetails()");
        if (feedbackDetails.isPresent()) {
            String textQuery = searchRequest2.textQuery();
            h.d(textQuery, "request.textQuery()");
            if (!(textQuery.length() == 0)) {
                Optional<PreparePlayOptions> playOptions = searchResponse2.playOptions();
                h.d(playOptions, "searchResponse.playOptions()");
                if (playOptions.isPresent()) {
                    MetadataItem metadataItem = searchResponse2.feedbackDetails().get();
                    List t = d.t(metadataItem);
                    List<MetadataItem> alternativeResults = searchResponse2.alternativeResults();
                    h.d(alternativeResults, "searchResponse.alternativeResults()");
                    List<MetadataItem> C = d.C(t, alternativeResults);
                    h.d(metadataItem, "playingItemMetadata");
                    ArrayList arrayList = new ArrayList(d.e(C, 10));
                    for (MetadataItem metadataItem2 : C) {
                        arrayList.add(this.a.invoke(new h(h.a(metadataItem2, metadataItem), metadataItem2)));
                    }
                    a0 a0Var = new a0(new MaybeConcatIterable(arrayList));
                    h.d(a0Var, "Maybe.concat(\n          …     }\n        ).toList()");
                    l<e> l = a0Var.r(i.a).l(new j(searchResponse2, searchRequest2));
                    h.d(l, "mapToResultModeList(meta…          )\n            }");
                    return l;
                }
            }
        }
        b bVar = b.a;
        h.d(bVar, "Maybe.empty()");
        return bVar;
    }
}

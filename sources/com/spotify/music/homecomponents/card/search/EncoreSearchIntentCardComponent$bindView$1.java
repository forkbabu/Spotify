package com.spotify.music.homecomponents.card.search;

import com.spotify.encore.consumer.components.api.searchintentcard.SearchIntentCard;
import kotlin.f;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

final class EncoreSearchIntentCardComponent$bindView$1 extends Lambda implements nmf<SearchIntentCard.Events, f> {
    final /* synthetic */ s81 $data;
    final /* synthetic */ EncoreSearchIntentCardComponent this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    EncoreSearchIntentCardComponent$bindView$1(EncoreSearchIntentCardComponent encoreSearchIntentCardComponent, s81 s81) {
        super(1);
        this.this$0 = encoreSearchIntentCardComponent;
        this.$data = s81;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public f invoke(SearchIntentCard.Events events) {
        SearchIntentCard.Events events2 = events;
        h.e(events2, "it");
        if (events2.ordinal() == 0) {
            EncoreSearchIntentCardComponent.a(this.this$0).a(this.$data);
        }
        return f.a;
    }
}

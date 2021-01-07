package com.spotify.music.features.entityselector.pages.search.effecthandlers;

import com.spotify.searchview.assistedcuration.proto.RelatedEntity;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

final class SearchEffectHandlersKt$toTrack$1 extends Lambda implements nmf<RelatedEntity, CharSequence> {
    public static final SearchEffectHandlersKt$toTrack$1 a = new SearchEffectHandlersKt$toTrack$1();

    SearchEffectHandlersKt$toTrack$1() {
        super(1);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public CharSequence invoke(RelatedEntity relatedEntity) {
        RelatedEntity relatedEntity2 = relatedEntity;
        h.d(relatedEntity2, "it");
        String i = relatedEntity2.i();
        h.d(i, "it.name");
        return i;
    }
}

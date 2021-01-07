package com.spotify.music.features.entityselector.pages.search.view;

import defpackage.uz4;
import kotlin.f;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

final class SearchViews$connect$1 extends Lambda implements nmf<String, f> {
    final /* synthetic */ da2 $eventConsumer;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SearchViews$connect$1(da2 da2) {
        super(1);
        this.$eventConsumer = da2;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public f invoke(String str) {
        String str2 = str;
        h.e(str2, "searchQuery");
        this.$eventConsumer.accept(new uz4.e(str2));
        return f.a;
    }
}

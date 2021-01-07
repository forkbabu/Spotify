package com.spotify.music.features.wrapped2020.stories.container;

import java.util.Comparator;
import kotlin.jvm.internal.h;

final class a<T> implements Comparator<com.spotify.mobile.android.share.menu.preview.api.a> {
    final /* synthetic */ ShareDestinationsConfiguration$order$1 a;

    a(ShareDestinationsConfiguration$order$1 shareDestinationsConfiguration$order$1) {
        this.a = shareDestinationsConfiguration$order$1;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // java.util.Comparator
    public int compare(com.spotify.mobile.android.share.menu.preview.api.a aVar, com.spotify.mobile.android.share.menu.preview.api.a aVar2) {
        return h.g(this.a.this$0.a.indexOf(aVar.a()), this.a.this$0.a.indexOf(aVar2.a()));
    }
}

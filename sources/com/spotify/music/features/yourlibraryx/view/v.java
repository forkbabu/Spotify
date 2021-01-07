package com.spotify.music.features.yourlibraryx.view;

import com.spotify.music.features.yourlibraryx.domain.YourLibraryXEvent;
import io.reactivex.functions.l;
import kotlin.f;
import kotlin.jvm.internal.h;

final class v<T, R> implements l<f, YourLibraryXEvent.s> {
    final /* synthetic */ YourLibraryXHeaderView a;

    v(YourLibraryXHeaderView yourLibraryXHeaderView) {
        this.a = yourLibraryXHeaderView;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public YourLibraryXEvent.s apply(f fVar) {
        h.e(fVar, "it");
        eh9 D = YourLibraryXHeaderView.D(this.a);
        return new YourLibraryXEvent.s(D != null ? D.e() : null);
    }
}

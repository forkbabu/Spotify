package com.spotify.music.features.podcast.entity.loadedpage.data;

import com.spotify.mobile.android.util.Assertion;
import com.spotify.pageloader.l0;
import com.spotify.playlist.models.Show;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final /* synthetic */ class PodcastShowLoadableProviderImpl$getLoadStateObservable$1 extends FunctionReferenceImpl implements nmf<a, l0<a>> {
    PodcastShowLoadableProviderImpl$getLoadStateObservable$1(g gVar) {
        super(1, gVar, g.class, "mapBaseDataModelToLoadState", "mapBaseDataModelToLoadState(Lcom/spotify/music/features/podcast/entity/loadedpage/data/BaseShowDataModel;)Lcom/spotify/pageloader/LoadState;", 0);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public l0<a> invoke(a aVar) {
        a aVar2 = aVar;
        h.e(aVar2, "p1");
        ((g) this.receiver).getClass();
        if (aVar2.b() == Show.MediaType.UNKNOWN) {
            Assertion.v("Mediatype received is UNKNOWN.");
        }
        int ordinal = aVar2.b().ordinal();
        if (ordinal == 2) {
            l0<a> g = l0.g();
            h.d(g, "LoadState.notFound()");
            return g;
        } else if (ordinal != 3) {
            l0<a> b = l0.b(aVar2);
            h.d(b, "LoadState.loaded(model)");
            return b;
        } else {
            l0<a> g2 = l0.g();
            h.d(g2, "LoadState.notFound()");
            return g2;
        }
    }
}

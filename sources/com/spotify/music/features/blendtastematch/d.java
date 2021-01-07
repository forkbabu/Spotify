package com.spotify.music.features.blendtastematch;

import com.spotify.music.features.blendtastematch.view.b;
import com.spotify.music.libs.viewuri.c;
import com.spotify.pageloader.PageLoaderView;
import com.spotify.pageloader.s0;
import kotlin.jvm.internal.h;

public final class d {

    /* access modifiers changed from: package-private */
    public static final class a<I, O> implements sg0<com.spotify.music.features.blendtastematch.api.d, s0> {
        final /* synthetic */ b a;

        a(b bVar) {
            this.a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // defpackage.sg0
        public s0 apply(com.spotify.music.features.blendtastematch.api.d dVar) {
            return this.a.b(dVar);
        }
    }

    public final PageLoaderView.a<com.spotify.music.features.blendtastematch.api.d> a(zac zac, c.a aVar, ij9 ij9, b bVar) {
        h.e(zac, "factory");
        h.e(aVar, "viewUriProvider");
        h.e(ij9, "pageView");
        h.e(bVar, "pageElementFactory");
        PageLoaderView.a<com.spotify.music.features.blendtastematch.api.d> b = zac.b(aVar.getViewUri(), ij9);
        b.e(new a(bVar));
        h.d(b, "builder.loaded { pageElementFactory.create(it) }");
        return b;
    }
}

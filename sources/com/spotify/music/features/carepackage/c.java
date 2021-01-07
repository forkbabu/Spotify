package com.spotify.music.features.carepackage;

import com.spotify.music.libs.viewuri.c;
import com.spotify.music.pageloader.skeleton.SkeletonComponents;
import com.spotify.pageloader.PageLoaderView;
import com.spotify.pageloader.s0;
import com.spotify.pageloader.w0;
import com.spotify.playlist.models.k;
import io.reactivex.s;
import kotlin.jvm.internal.h;

public final class c {

    /* access modifiers changed from: package-private */
    public static final class a<I, O> implements sg0<s<k>, s0> {
        final /* synthetic */ com.spotify.music.features.carepackage.view.b a;
        final /* synthetic */ ui4 b;

        a(com.spotify.music.features.carepackage.view.b bVar, ui4 ui4) {
            this.a = bVar;
            this.b = ui4;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // defpackage.sg0
        public s0 apply(s<k> sVar) {
            return this.a.b(sVar, this.b);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b<T> implements tg0<w0> {
        public static final b a = new b();

        b() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // defpackage.tg0
        public w0 get() {
            SkeletonComponents skeletonComponents = SkeletonComponents.ROW;
            return fbc.c(SkeletonComponents.TOOLBAR_SPACE, SkeletonComponents.HEADER_FULLBLEED_CENTER, skeletonComponents, skeletonComponents, skeletonComponents, skeletonComponents, skeletonComponents, SkeletonComponents.PILL_BUTTON_LARGE);
        }
    }

    public final PageLoaderView.a<s<k>> a(zac zac, c.a aVar, ij9 ij9, com.spotify.music.features.carepackage.view.b bVar, ui4 ui4) {
        h.e(zac, "factory");
        h.e(aVar, "viewUriProvider");
        h.e(ij9, "pageView");
        h.e(bVar, "pageElementProviderFactory");
        h.e(ui4, "audioPlusLogger");
        PageLoaderView.a<s<k>> b2 = zac.b(aVar.getViewUri(), ij9);
        b2.i(b.a);
        b2.e(new a(bVar, ui4));
        h.d(b2, "builder\n                …(data, audioPlusLogger) }");
        return b2;
    }
}

package com.spotify.voice.results.impl;

import android.content.res.Resources;
import com.spotify.music.C0707R;
import com.spotify.music.libs.viewuri.c;
import com.spotify.pageloader.PageLoaderView;
import com.spotify.pageloader.m0;
import com.spotify.pageloader.o0;
import com.spotify.pageloader.s0;
import com.spotify.voice.results.model.NoResultsPageException;
import com.spotify.voice.results.model.e;
import io.reactivex.d0;
import io.reactivex.functions.l;
import io.reactivex.z;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.h;

public final class c {

    /* access modifiers changed from: package-private */
    public static final class a<T, R> implements l<Throwable, d0<? extends e>> {
        final /* synthetic */ Resources a;

        a(Resources resources) {
            this.a = resources;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public d0<? extends e> apply(Throwable th) {
            Throwable th2 = th;
            h.e(th2, "it");
            if (th2 instanceof NoResultsPageException) {
                return z.z(e.a(this.a.getString(C0707R.string.voice_search_results_error_title), EmptyList.a));
            }
            return z.q(th2);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b<I, O> implements sg0<e, s0> {
        final /* synthetic */ a a;

        b(a aVar) {
            this.a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // defpackage.sg0
        public s0 apply(e eVar) {
            return this.a.b(eVar);
        }
    }

    public static final o0<e> a(z<e> zVar, Resources resources) {
        h.e(zVar, "results");
        h.e(resources, "resources");
        o0<e> a2 = m0.a(zVar.D(new a(resources)));
        h.d(a2, "SingleLoadable.create(\n …}\n            }\n        )");
        return a2;
    }

    public static final PageLoaderView.a<e> b(zac zac, c.a aVar, ij9 ij9, a aVar2) {
        h.e(zac, "factory");
        h.e(aVar, "viewUriProvider");
        h.e(ij9, "pageView");
        h.e(aVar2, "pageElementFactory");
        PageLoaderView.a<e> b2 = zac.b(aVar.getViewUri(), ij9);
        b2.e(new b(aVar2));
        h.d(b2, "factory.createViewBuilde…reate(resultsPageModel) }");
        return b2;
    }
}

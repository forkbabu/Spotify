package com.spotify.music.features.listeninghistory.di;

import com.spotify.music.libs.viewuri.c;
import com.spotify.pageloader.PageLoaderView;
import com.spotify.pageloader.s0;
import com.spotify.pageloader.w0;
import kotlin.jvm.internal.h;

public final class q {

    /* access modifiers changed from: package-private */
    public static final class a<I, O> implements sg0<rm5, s0> {
        final /* synthetic */ com.spotify.music.features.listeninghistory.presenter.a a;
        final /* synthetic */ fn5 b;

        a(com.spotify.music.features.listeninghistory.presenter.a aVar, fn5 fn5) {
            this.a = aVar;
            this.b = fn5;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // defpackage.sg0
        public s0 apply(rm5 rm5) {
            rm5 rm52 = rm5;
            com.spotify.music.features.listeninghistory.presenter.a aVar = this.a;
            fn5 fn5 = this.b;
            h.d(rm52, "data");
            return new pm5(aVar, fn5, rm52);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b<T> implements tg0<w0> {
        final /* synthetic */ w0 a;

        b(w0 w0Var) {
            this.a = w0Var;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // defpackage.tg0
        public w0 get() {
            return this.a;
        }
    }

    public static final PageLoaderView.a<rm5> a(c.a aVar, zac zac, ij9 ij9, w0 w0Var, com.spotify.music.features.listeninghistory.presenter.a aVar2, fn5 fn5) {
        h.e(aVar, "viewUriProvider");
        h.e(zac, "pageLoaderFactory");
        h.e(ij9, "pageViewObservable");
        h.e(w0Var, "placeholderPageElement");
        h.e(aVar2, "presenter");
        h.e(fn5, "viewBinder");
        PageLoaderView.a<rm5> b2 = zac.b(aVar.getViewUri(), ij9);
        b2.e(new a(aVar2, fn5));
        b2.i(new b(w0Var));
        h.d(b2, "pageLoaderFactory\n      … placeholderPageElement }");
        return b2;
    }
}

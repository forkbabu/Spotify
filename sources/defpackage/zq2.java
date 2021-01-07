package defpackage;

import com.spotify.music.carmodehome.page.c;
import com.spotify.music.carmodehome.page.h;
import com.spotify.music.libs.viewuri.c;
import com.spotify.pageloader.ObservableLoadable;
import com.spotify.pageloader.PageLoaderView;
import com.spotify.pageloader.o0;
import com.spotify.pageloader.s0;
import io.reactivex.functions.l;
import io.reactivex.s;

/* renamed from: zq2  reason: default package */
public final class zq2 {

    /* access modifiers changed from: package-private */
    /* renamed from: zq2$a */
    public static final class a<T, R> implements l<com.spotify.music.carmodehome.model.a, h> {
        public static final a a = new a();

        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public h apply(com.spotify.music.carmodehome.model.a aVar) {
            com.spotify.music.carmodehome.model.a aVar2 = aVar;
            kotlin.jvm.internal.h.e(aVar2, "it");
            return new h(aVar2.a(), null, null, 6);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: zq2$b */
    public static final class b<I, O> implements sg0<s<h>, s0> {
        final /* synthetic */ c a;

        b(c cVar) {
            this.a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // defpackage.sg0
        public s0 apply(s<h> sVar) {
            return this.a.b(sVar);
        }
    }

    public static final o0<s<h>> a(uq2 uq2) {
        kotlin.jvm.internal.h.e(uq2, "homeRepository");
        s<R> j0 = uq2.c().j0(a.a);
        kotlin.jvm.internal.h.d(j0, "homeRepository.fetchHome…ewModel(it.homeShelves) }");
        return ObservableLoadable.a(j0);
    }

    public static final PageLoaderView.a<s<h>> b(zac zac, c.a aVar, ij9 ij9, com.spotify.music.carmodehome.page.c cVar) {
        kotlin.jvm.internal.h.e(zac, "factory");
        kotlin.jvm.internal.h.e(aVar, "viewUriProvider");
        kotlin.jvm.internal.h.e(ij9, "pageView");
        kotlin.jvm.internal.h.e(cVar, "pageElementFactory");
        PageLoaderView.a<s<h>> b2 = zac.b(aVar.getViewUri(), ij9);
        b2.e(new b(cVar));
        kotlin.jvm.internal.h.d(b2, "factory.createViewBuilde…ctory.create(viewModel) }");
        return b2;
    }
}

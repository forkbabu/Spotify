package defpackage;

import com.spotify.music.features.podcast.episode.transcript.ui.page.g;
import com.spotify.music.libs.viewuri.c;
import com.spotify.pageloader.PageLoaderView;
import com.spotify.pageloader.l0;
import com.spotify.pageloader.o0;
import com.spotify.pageloader.s0;
import com.spotify.pageloader.w0;
import com.spotify.playlist.models.e;
import io.reactivex.functions.l;
import kotlin.jvm.internal.h;

/* renamed from: va7  reason: default package */
public final class va7 {

    /* access modifiers changed from: package-private */
    /* renamed from: va7$a */
    public static final class a<T, R> implements l<ab7, l0<ab7>> {
        public static final a a = new a();

        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public l0<ab7> apply(ab7 ab7) {
            ab7 ab72 = ab7;
            h.e(ab72, "it");
            return l0.b(ab72);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: va7$b */
    public static final class b<T, R> implements l<Throwable, l0<ab7>> {
        public static final b a = new b();

        b() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public l0<ab7> apply(Throwable th) {
            Throwable th2 = th;
            h.e(th2, "it");
            return l0.h(th2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: va7$c */
    public static final class c<T> implements tg0<w0> {
        final /* synthetic */ w0 a;

        c(w0 w0Var) {
            this.a = w0Var;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // defpackage.tg0
        public w0 get() {
            return this.a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: va7$d */
    public static final class d<I, O> implements sg0<ab7, s0> {
        final /* synthetic */ db7 a;
        final /* synthetic */ com.spotify.music.features.podcast.episode.transcript.ui.page.d b;
        final /* synthetic */ g c;

        d(db7 db7, com.spotify.music.features.podcast.episode.transcript.ui.page.d dVar, g gVar) {
            this.a = db7;
            this.b = dVar;
            this.c = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // defpackage.sg0
        public s0 apply(ab7 ab7) {
            return this.a.b(ab7, this.b, this.c);
        }
    }

    public final o0<ab7> a(ya7 ya7, e.b bVar) {
        h.e(ya7, "dataSource");
        h.e(bVar, "episodeTranscriptItem");
        com.spotify.pageloader.c cVar = new com.spotify.pageloader.c(ya7.a(bVar).P().j0(a.a).G0((R) l0.c()).r0(b.a));
        h.d(cVar, "Loadable.from(\n         …WentWrong(it) }\n        )");
        return cVar;
    }

    public final PageLoaderView.a<ab7> b(zac zac, ij9 ij9, c.a aVar, db7 db7, com.spotify.music.features.podcast.episode.transcript.ui.page.d dVar, g gVar, w0 w0Var) {
        h.e(zac, "factory");
        h.e(ij9, "pageView");
        h.e(aVar, "viewUriProvider");
        h.e(db7, "pageElementFactory");
        h.e(dVar, "transcriptPresenter");
        h.e(gVar, "transcriptViewBinder");
        h.e(w0Var, "placeholderElement");
        PageLoaderView.a<ab7> b2 = zac.b(aVar.getViewUri(), ij9);
        b2.i(new c(w0Var));
        b2.e(new d(db7, dVar, gVar));
        h.d(b2, "factory\n        .createV…r\n            )\n        }");
        return b2;
    }
}

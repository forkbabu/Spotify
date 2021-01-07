package com.spotify.music.features.yourepisodes.domain;

import com.spotify.mobius.rx2.m;
import com.spotify.music.features.yourepisodes.domain.f;
import com.spotify.music.features.yourepisodes.interactor.h;
import com.spotify.music.navigation.t;
import io.reactivex.functions.g;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;

public final class i {

    static final class a<Upstream, Downstream> implements w<f.e, j> {
        final /* synthetic */ com.spotify.music.features.yourepisodes.interactor.d a;
        final /* synthetic */ h b;
        final /* synthetic */ com.spotify.music.features.yourepisodes.interactor.a c;
        final /* synthetic */ t d;

        a(com.spotify.music.features.yourepisodes.interactor.d dVar, h hVar, com.spotify.music.features.yourepisodes.interactor.a aVar, t tVar) {
            this.a = dVar;
            this.b = hVar;
            this.c = aVar;
            this.d = tVar;
        }

        @Override // io.reactivex.w
        public final v<j> apply(s<f.e> sVar) {
            kotlin.jvm.internal.h.e(sVar, "it");
            s<R> J0 = sVar.J0(new h(this.a));
            kotlin.jvm.internal.h.d(J0, "upstream.switchMap { eff…leRange\n        )\n    }\n}");
            return J0;
        }
    }

    static final class b<T> implements g<f.c> {
        final /* synthetic */ com.spotify.music.features.yourepisodes.interactor.d a;
        final /* synthetic */ h b;
        final /* synthetic */ com.spotify.music.features.yourepisodes.interactor.a c;
        final /* synthetic */ t f;

        b(com.spotify.music.features.yourepisodes.interactor.d dVar, h hVar, com.spotify.music.features.yourepisodes.interactor.a aVar, t tVar) {
            this.a = dVar;
            this.b = hVar;
            this.c = aVar;
            this.f = tVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(f.c cVar) {
            this.b.a(cVar.a().a());
        }
    }

    static final class c<T> implements g<f.b> {
        final /* synthetic */ com.spotify.music.features.yourepisodes.interactor.d a;
        final /* synthetic */ h b;
        final /* synthetic */ com.spotify.music.features.yourepisodes.interactor.a c;
        final /* synthetic */ t f;

        c(com.spotify.music.features.yourepisodes.interactor.d dVar, h hVar, com.spotify.music.features.yourepisodes.interactor.a aVar, t tVar) {
            this.a = dVar;
            this.b = hVar;
            this.c = aVar;
            this.f = tVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(f.b bVar) {
            this.b.pause();
        }
    }

    static final class d<T> implements g<f.d> {
        final /* synthetic */ com.spotify.music.features.yourepisodes.interactor.d a;
        final /* synthetic */ h b;
        final /* synthetic */ com.spotify.music.features.yourepisodes.interactor.a c;
        final /* synthetic */ t f;

        d(com.spotify.music.features.yourepisodes.interactor.d dVar, h hVar, com.spotify.music.features.yourepisodes.interactor.a aVar, t tVar) {
            this.a = dVar;
            this.b = hVar;
            this.c = aVar;
            this.f = tVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(f.d dVar) {
            f.d dVar2 = dVar;
            kotlin.jvm.internal.h.d(dVar2, "it");
            com.spotify.music.features.yourepisodes.interactor.a aVar = this.c;
            if (dVar2.a()) {
                aVar.a();
            } else {
                aVar.b();
            }
        }
    }

    static final class e<T> implements g<f.a> {
        final /* synthetic */ com.spotify.music.features.yourepisodes.interactor.d a;
        final /* synthetic */ h b;
        final /* synthetic */ com.spotify.music.features.yourepisodes.interactor.a c;
        final /* synthetic */ t f;

        e(com.spotify.music.features.yourepisodes.interactor.d dVar, h hVar, com.spotify.music.features.yourepisodes.interactor.a aVar, t tVar) {
            this.a = dVar;
            this.b = hVar;
            this.c = aVar;
            this.f = tVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(f.a aVar) {
            this.f.a();
        }
    }

    public static final w<f, j> a(com.spotify.music.features.yourepisodes.interactor.d dVar, h hVar, com.spotify.music.features.yourepisodes.interactor.a aVar, t tVar) {
        kotlin.jvm.internal.h.e(dVar, "listenLaterInteractor");
        kotlin.jvm.internal.h.e(hVar, "playerInteractor");
        kotlin.jvm.internal.h.e(aVar, "downloadInteractor");
        kotlin.jvm.internal.h.e(tVar, "navigator");
        m f = com.spotify.mobius.rx2.i.f();
        f.h(f.e.class, new a(dVar, hVar, aVar, tVar));
        f.d(f.c.class, new b(dVar, hVar, aVar, tVar));
        f.d(f.b.class, new c(dVar, hVar, aVar, tVar));
        f.d(f.d.class, new d(dVar, hVar, aVar, tVar));
        f.d(f.a.class, new e(dVar, hVar, aVar, tVar));
        return f.i();
    }
}

package com.spotify.music.features.yourlibraryx.effecthandlers;

import com.spotify.music.features.yourlibraryx.domain.YourLibraryXEvent;
import com.spotify.music.features.yourlibraryx.domain.c;
import io.reactivex.d0;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;
import io.reactivex.y;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.EmptySet;

public final class g {
    private final b a;
    private final d b;
    private final e c;
    private final f d;
    private final c e;
    private final kh9 f;
    private final a g;
    private final com.spotify.music.features.yourlibraryx.recentsearch.a h;
    private final y i;

    /* access modifiers changed from: package-private */
    public static final class a<Upstream, Downstream> implements w<c.q, YourLibraryXEvent> {
        final /* synthetic */ w a;

        /* renamed from: com.spotify.music.features.yourlibraryx.effecthandlers.g$a$a  reason: collision with other inner class name */
        static final class C0271a<T, R> implements io.reactivex.functions.l<c.q, com.spotify.music.features.yourlibraryx.domain.l> {
            public static final C0271a a = new C0271a();

            C0271a() {
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // io.reactivex.functions.l
            public com.spotify.music.features.yourlibraryx.domain.l apply(c.q qVar) {
                c.q qVar2 = qVar;
                kotlin.jvm.internal.h.e(qVar2, "it");
                return qVar2.a();
            }
        }

        a(w wVar) {
            this.a = wVar;
        }

        @Override // io.reactivex.w
        public final v<YourLibraryXEvent> apply(s<c.q> sVar) {
            kotlin.jvm.internal.h.e(sVar, "effects");
            return sVar.j0(C0271a.a).q(this.a);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b<Upstream, Downstream> implements w<c.n, YourLibraryXEvent> {
        final /* synthetic */ g a;

        static final class a<T, R> implements io.reactivex.functions.l<c.n, Set<? extends String>> {
            public static final a a = new a();

            a() {
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // io.reactivex.functions.l
            public Set<? extends String> apply(c.n nVar) {
                c.n nVar2 = nVar;
                kotlin.jvm.internal.h.e(nVar2, "it");
                return nVar2.a();
            }
        }

        /* renamed from: com.spotify.music.features.yourlibraryx.effecthandlers.g$b$b  reason: collision with other inner class name */
        static final class C0272b<T1, T2, R> implements io.reactivex.functions.c<Pair<? extends Set<? extends String>, ? extends Set<? extends String>>, Set<? extends String>, Pair<? extends Set<? extends String>, ? extends Set<? extends String>>> {
            public static final C0272b a = new C0272b();

            C0272b() {
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // io.reactivex.functions.c
            public Pair<? extends Set<? extends String>, ? extends Set<? extends String>> a(Pair<? extends Set<? extends String>, ? extends Set<? extends String>> pair, Set<? extends String> set) {
                Pair<? extends Set<? extends String>, ? extends Set<? extends String>> pair2 = pair;
                Set<? extends String> set2 = set;
                kotlin.jvm.internal.h.e(pair2, "previous");
                kotlin.jvm.internal.h.e(set2, "next");
                return new Pair<>(pair2.c(), set2);
            }
        }

        /* access modifiers changed from: package-private */
        public static final class c<T, R> implements io.reactivex.functions.l<Pair<? extends Set<? extends String>, ? extends Set<? extends String>>, io.reactivex.e> {
            final /* synthetic */ b a;

            c(b bVar) {
                this.a = bVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // io.reactivex.functions.l
            public io.reactivex.e apply(Pair<? extends Set<? extends String>, ? extends Set<? extends String>> pair) {
                Pair<? extends Set<? extends String>, ? extends Set<? extends String>> pair2 = pair;
                kotlin.jvm.internal.h.e(pair2, "it");
                return io.reactivex.a.u(new h(this, pair2));
            }
        }

        b(g gVar) {
            this.a = gVar;
        }

        @Override // io.reactivex.w
        public final v<YourLibraryXEvent> apply(s<c.n> sVar) {
            kotlin.jvm.internal.h.e(sVar, "effects");
            s<R> j0 = sVar.E().j0(a.a);
            EmptySet emptySet = EmptySet.a;
            return j0.y0(new Pair(emptySet, emptySet), C0272b.a).Y(new c(this)).N();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c<T> implements io.reactivex.functions.g<c.a> {
        final /* synthetic */ g a;

        c(g gVar) {
            this.a = gVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(c.a aVar) {
            this.a.a.a();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d<T> implements io.reactivex.functions.g<c.g> {
        final /* synthetic */ g a;

        d(g gVar) {
            this.a = gVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(c.g gVar) {
            c.g gVar2 = gVar;
            this.a.g.a(gVar2.c(), gVar2.b(), gVar2.a());
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e<Upstream, Downstream> implements w<c.i, YourLibraryXEvent> {
        final /* synthetic */ g a;

        static final class a<T, R> implements io.reactivex.functions.l<c.i, io.reactivex.e> {
            final /* synthetic */ e a;

            a(e eVar) {
                this.a = eVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // io.reactivex.functions.l
            public io.reactivex.e apply(c.i iVar) {
                c.i iVar2 = iVar;
                kotlin.jvm.internal.h.e(iVar2, "it");
                return this.a.a.h.a(iVar2.a());
            }
        }

        e(g gVar) {
            this.a = gVar;
        }

        @Override // io.reactivex.w
        public final v<YourLibraryXEvent> apply(s<c.i> sVar) {
            kotlin.jvm.internal.h.e(sVar, "effects");
            return sVar.K0(new a(this)).N();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f<Upstream, Downstream> implements w<c.b, YourLibraryXEvent> {
        final /* synthetic */ g a;

        static final class a<T, R> implements io.reactivex.functions.l<c.b, io.reactivex.e> {
            final /* synthetic */ f a;

            a(f fVar) {
                this.a = fVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // io.reactivex.functions.l
            public io.reactivex.e apply(c.b bVar) {
                c.b bVar2 = bVar;
                kotlin.jvm.internal.h.e(bVar2, "it");
                return this.a.a.h.b(bVar2.a());
            }
        }

        f(g gVar) {
            this.a = gVar;
        }

        @Override // io.reactivex.w
        public final v<YourLibraryXEvent> apply(s<c.b> sVar) {
            kotlin.jvm.internal.h.e(sVar, "effects");
            return sVar.K0(new a(this)).N();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.spotify.music.features.yourlibraryx.effecthandlers.g$g  reason: collision with other inner class name */
    public static final class C0273g<Upstream, Downstream> implements w<c.h, YourLibraryXEvent> {
        final /* synthetic */ g a;

        /* renamed from: com.spotify.music.features.yourlibraryx.effecthandlers.g$g$a */
        static final class a<T, R> implements io.reactivex.functions.l<c.h, d0<? extends YourLibraryXEvent>> {
            final /* synthetic */ C0273g a;

            a(C0273g gVar) {
                this.a = gVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // io.reactivex.functions.l
            public d0<? extends YourLibraryXEvent> apply(c.h hVar) {
                c.h hVar2 = hVar;
                kotlin.jvm.internal.h.e(hVar2, "event");
                return this.a.a.d.a(hVar2.a()).A(i.a);
            }
        }

        C0273g(g gVar) {
            this.a = gVar;
        }

        @Override // io.reactivex.w
        public final v<YourLibraryXEvent> apply(s<c.h> sVar) {
            kotlin.jvm.internal.h.e(sVar, "effects");
            return sVar.L0(new a(this));
        }
    }

    /* access modifiers changed from: package-private */
    public static final class h<Upstream, Downstream> implements w<c.o, YourLibraryXEvent> {
        final /* synthetic */ g a;

        static final class a<T, R> implements io.reactivex.functions.l<c.o, d0<? extends YourLibraryXEvent>> {
            final /* synthetic */ h a;

            a(h hVar) {
                this.a = hVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // io.reactivex.functions.l
            public d0<? extends YourLibraryXEvent> apply(c.o oVar) {
                c.o oVar2 = oVar;
                kotlin.jvm.internal.h.e(oVar2, "event");
                return this.a.a.d.b(oVar2.a()).A(j.a);
            }
        }

        h(g gVar) {
            this.a = gVar;
        }

        @Override // io.reactivex.w
        public final v<YourLibraryXEvent> apply(s<c.o> sVar) {
            kotlin.jvm.internal.h.e(sVar, "effects");
            return sVar.L0(new a(this));
        }
    }

    /* access modifiers changed from: package-private */
    public static final class i<T> implements io.reactivex.functions.g<c.C0270c> {
        final /* synthetic */ g a;

        i(g gVar) {
            this.a = gVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(c.C0270c cVar) {
            this.a.a.b();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class j<T> implements io.reactivex.functions.g<c.d> {
        final /* synthetic */ g a;

        j(g gVar) {
            this.a = gVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(c.d dVar) {
            c.d dVar2 = dVar;
            this.a.a.e(dVar2.a(), dVar2.b());
        }
    }

    /* access modifiers changed from: package-private */
    public static final class k<T> implements io.reactivex.functions.g<c.e> {
        final /* synthetic */ g a;

        k(g gVar) {
            this.a = gVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(c.e eVar) {
            this.a.a.c(eVar.a());
        }
    }

    /* access modifiers changed from: package-private */
    public static final class l<T> implements io.reactivex.functions.g<c.f> {
        final /* synthetic */ g a;

        l(g gVar) {
            this.a = gVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(c.f fVar) {
            this.a.a.d(fVar.a());
        }
    }

    /* access modifiers changed from: package-private */
    public static final class m<T> implements io.reactivex.functions.g<c.l> {
        final /* synthetic */ g a;

        m(g gVar) {
            this.a = gVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(c.l lVar) {
            this.a.b.a(lVar.a());
        }
    }

    /* access modifiers changed from: package-private */
    public static final class n<T> implements io.reactivex.functions.g<c.p> {
        public static final n a = new n();

        n() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(c.p pVar) {
        }
    }

    /* access modifiers changed from: package-private */
    public static final class o<Upstream, Downstream> implements w<c.m, YourLibraryXEvent> {
        final /* synthetic */ g a;

        static final class a<T, R> implements io.reactivex.functions.l<c.m, v<? extends YourLibraryXEvent>> {
            final /* synthetic */ o a;

            a(o oVar) {
                this.a = oVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // io.reactivex.functions.l
            public v<? extends YourLibraryXEvent> apply(c.m mVar) {
                c.m mVar2 = mVar;
                kotlin.jvm.internal.h.e(mVar2, "effect");
                return this.a.a.c.d(mVar2.b()).j0(new k(mVar2));
            }
        }

        o(g gVar) {
            this.a = gVar;
        }

        @Override // io.reactivex.w
        public final v<YourLibraryXEvent> apply(s<c.m> sVar) {
            kotlin.jvm.internal.h.e(sVar, "effects");
            return sVar.E().J0(new a(this));
        }
    }

    /* access modifiers changed from: package-private */
    public static final class p<T> implements io.reactivex.functions.g<c.k> {
        final /* synthetic */ g a;

        p(g gVar) {
            this.a = gVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(c.k kVar) {
            this.a.f.b(kVar.a());
        }
    }

    /* access modifiers changed from: package-private */
    public static final class q<T> implements io.reactivex.functions.g<c.j> {
        final /* synthetic */ g a;

        q(g gVar) {
            this.a = gVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(c.j jVar) {
            this.a.f.a(jVar.a());
        }
    }

    public g(b bVar, d dVar, e eVar, f fVar, c cVar, kh9 kh9, a aVar, com.spotify.music.features.yourlibraryx.recentsearch.a aVar2, y yVar) {
        kotlin.jvm.internal.h.e(bVar, "navigation");
        kotlin.jvm.internal.h.e(dVar, "sortEffectHandler");
        kotlin.jvm.internal.h.e(eVar, "yourLibraryEffectHandler");
        kotlin.jvm.internal.h.e(fVar, "pinEffectHandler");
        kotlin.jvm.internal.h.e(cVar, "playlistEffectHandler");
        kotlin.jvm.internal.h.e(kh9, "preferences");
        kotlin.jvm.internal.h.e(aVar, "contextMenu");
        kotlin.jvm.internal.h.e(aVar2, "recentSearches");
        kotlin.jvm.internal.h.e(yVar, "mainScheduler");
        this.a = bVar;
        this.b = dVar;
        this.c = eVar;
        this.d = fVar;
        this.e = cVar;
        this.f = kh9;
        this.g = aVar;
        this.h = aVar2;
        this.i = yVar;
    }

    public final w<com.spotify.music.features.yourlibraryx.domain.c, YourLibraryXEvent> i(w<com.spotify.music.features.yourlibraryx.domain.l, YourLibraryXEvent> wVar) {
        kotlin.jvm.internal.h.e(wVar, "viewEffects");
        com.spotify.mobius.rx2.m f2 = com.spotify.mobius.rx2.i.f();
        f2.d(c.C0270c.class, new i(this));
        f2.d(c.d.class, new j(this));
        f2.d(c.e.class, new k(this));
        f2.d(c.f.class, new l(this));
        f2.d(c.l.class, new m(this));
        f2.d(c.p.class, n.a);
        f2.h(c.m.class, new o(this));
        f2.d(c.k.class, new p(this));
        f2.d(c.j.class, new q(this));
        f2.h(c.q.class, new a(wVar));
        f2.h(c.n.class, new b(this));
        f2.d(c.a.class, new c(this));
        f2.e(c.g.class, new d(this), this.i);
        f2.h(c.i.class, new e(this));
        f2.h(c.b.class, new f(this));
        f2.h(c.h.class, new C0273g(this));
        f2.h(c.o.class, new h(this));
        w<com.spotify.music.features.yourlibraryx.domain.c, YourLibraryXEvent> i2 = f2.i();
        kotlin.jvm.internal.h.d(i2, "RxMobius\n            .su…   }\n            .build()");
        return i2;
    }
}

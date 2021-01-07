package com.spotify.music.features.followfeed.mobius;

import defpackage.o25;
import io.reactivex.functions.l;
import io.reactivex.functions.n;
import io.reactivex.s;
import java.util.Set;
import kotlin.jvm.internal.h;

public final class k implements com.spotify.mobius.g<b91, o25> {
    private final io.reactivex.disposables.a a = new io.reactivex.disposables.a();
    private final b61 b;
    private final u15 c;
    private final s<o25> f;

    static final class a<T> implements n<Boolean> {
        public static final a a = new a();

        a() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.n
        public boolean test(Boolean bool) {
            Boolean bool2 = bool;
            h.e(bool2, "it");
            return bool2.booleanValue();
        }
    }

    static final class b<T, R> implements l<Boolean, o25.t> {
        public static final b a = new b();

        b() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public o25.t apply(Boolean bool) {
            h.e(bool, "it");
            return o25.t.a;
        }
    }

    static final class c<T> implements io.reactivex.functions.g<o25.t> {
        final /* synthetic */ da2 a;

        c(da2 da2) {
            this.a = da2;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(o25.t tVar) {
            this.a.accept(tVar);
        }
    }

    static final class d<T, R> implements l<Set<? extends Integer>, o25.x> {
        public static final d a = new d();

        d() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public o25.x apply(Set<? extends Integer> set) {
            Set<? extends Integer> set2 = set;
            h.e(set2, "it");
            return new o25.x(set2);
        }
    }

    static final class e<T> implements io.reactivex.functions.g<o25.x> {
        final /* synthetic */ da2 a;

        e(da2 da2) {
            this.a = da2;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(o25.x xVar) {
            this.a.accept(xVar);
        }
    }

    static final class f<T> implements io.reactivex.functions.g<o25> {
        final /* synthetic */ da2 a;

        f(da2 da2) {
            this.a = da2;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(o25 o25) {
            this.a.accept(o25);
        }
    }

    public static final class g implements com.spotify.mobius.h<b91> {
        final /* synthetic */ k a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        g(k kVar) {
            this.a = kVar;
        }

        @Override // com.spotify.mobius.h, defpackage.da2
        public void accept(Object obj) {
            b91 b91 = (b91) obj;
            h.e(b91, "model");
            this.a.b.k(b91);
            this.a.c.T(b91.body().isEmpty());
        }

        @Override // com.spotify.mobius.h, defpackage.w92
        public void dispose() {
            this.a.a.f();
            this.a.c.P();
        }
    }

    public k(b61 b61, u15 u15, s<o25> sVar) {
        h.e(b61, "hubsPresenter");
        h.e(u15, "hubsViewBinder");
        h.e(sVar, "feedEventObservable");
        this.b = b61;
        this.c = u15;
        this.f = sVar;
    }

    @Override // com.spotify.mobius.g
    public com.spotify.mobius.h<b91> t(da2<o25> da2) {
        h.e(da2, "output");
        this.a.e(this.c.S().Q(a.a).j0(b.a).subscribe(new c(da2)), this.c.R().j0(d.a).subscribe(new e(da2)), this.f.subscribe(new f(da2)));
        return new g(this);
    }
}

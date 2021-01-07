package com.spotify.music.carmodehome.page;

import com.spotify.music.carmodehome.model.HomeShelf;
import com.spotify.music.connection.l;
import io.reactivex.functions.g;
import io.reactivex.s;
import io.reactivex.y;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.h;

public final class d {
    private h a = new h(EmptyList.a, null, null, 6);
    private final io.reactivex.disposables.a b = new io.reactivex.disposables.a();
    private final y c;
    private final g d;
    private final s<h> e;
    private final dr2 f;
    private final l g;
    private final s<Boolean> h;

    static final class a<T> implements g<h> {
        final /* synthetic */ d a;

        a(d dVar) {
            this.a = dVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(h hVar) {
            d dVar = this.a;
            dVar.a = h.a(dVar.a, hVar.c(), null, null, 6);
            this.a.d.b(this.a.a);
        }
    }

    static final class b<T1, T2, R> implements io.reactivex.functions.c<Boolean, Boolean, Boolean> {
        public static final b a = new b();

        b() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // io.reactivex.functions.c
        public Boolean a(Boolean bool, Boolean bool2) {
            return Boolean.valueOf(bool.booleanValue() && !bool2.booleanValue());
        }
    }

    static final class c<T> implements g<Boolean> {
        final /* synthetic */ d a;

        c(d dVar) {
            this.a = dVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(Boolean bool) {
            Boolean bool2 = bool;
            h.d(bool2, "show");
            if (bool2.booleanValue()) {
                this.a.d.a();
            } else {
                this.a.d.c();
            }
        }
    }

    public d(y yVar, g gVar, s<h> sVar, dr2 dr2, l lVar, s<Boolean> sVar2) {
        h.e(yVar, "mainThreadScheduler");
        h.e(gVar, "viewBinder");
        h.e(sVar, "dataSource");
        h.e(dr2, "homeUbiLogger");
        h.e(lVar, "rxConnectionState");
        h.e(sVar2, "coreOfflineBarSuppressedObservable");
        this.c = yVar;
        this.d = gVar;
        this.e = sVar;
        this.f = dr2;
        this.g = lVar;
        this.h = sVar2;
    }

    public final void d(int i) {
        HomeShelf homeShelf = this.a.c().get(i);
        h a2 = h.a(this.a, null, homeShelf.c(), homeShelf.b().get(0).b().c(), 1);
        this.a = a2;
        this.d.b(a2);
        String a3 = this.a.c().get(i).a();
        if (this.a.c().get(i).d() == HomeShelf.Type.SHORTCUT_LIST) {
            this.f.d(a3, i);
        } else {
            this.f.c(a3, i);
        }
    }

    public final void e() {
        this.b.b(this.e.o0(this.c).subscribe(new a(this)));
        this.b.b(s.n(this.h, this.g.b(), b.a).o0(this.c).subscribe(new c(this)));
    }

    public final void f() {
        this.b.f();
    }
}

package com.spotify.music.newplaying.scroll;

import com.spotify.music.newplaying.scroll.view.PeekScrollView;
import com.spotify.music.newplaying.scroll.view.j;
import com.spotify.rxjava2.p;
import io.reactivex.functions.l;
import io.reactivex.internal.operators.flowable.k;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class g {
    private final p a = new p();

    /* access modifiers changed from: package-private */
    public static final class a<T, R> implements l<Boolean, tpf<? extends f>> {
        final /* synthetic */ j a;

        a(j jVar) {
            this.a = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public tpf<? extends f> apply(Boolean bool) {
            Boolean bool2 = bool;
            h.e(bool2, "scrolled");
            if (!bool2.booleanValue()) {
                return ((PeekScrollView) this.a).e();
            }
            int i = io.reactivex.g.b;
            return k.c;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b<T> implements io.reactivex.functions.g<f> {
        final /* synthetic */ j a;

        b(j jVar) {
            this.a = jVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(f fVar) {
            ((PeekScrollView) this.a).h();
        }
    }

    public final void a(j jVar) {
        h.e(jVar, "scrollViewBinder");
        this.a.b(((PeekScrollView) jVar).d().f0(new a(jVar)).subscribe(new b(jVar)));
    }

    public final void b() {
        this.a.a();
    }
}

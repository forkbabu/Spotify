package com.spotify.music.newplaying.scroll;

import com.spotify.music.newplaying.scroll.view.PeekScrollView;
import com.spotify.music.newplaying.scroll.view.j;
import com.spotify.rxjava2.p;
import io.reactivex.g;
import kotlin.jvm.internal.h;

public final class c {
    private final p a = new p();
    private final g<String> b;

    /* access modifiers changed from: package-private */
    public static final class a<T> implements io.reactivex.functions.g<String> {
        final /* synthetic */ j a;

        a(j jVar) {
            this.a = jVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(String str) {
            ((PeekScrollView) this.a).smoothScrollTo(0, 0);
        }
    }

    public c(g<String> gVar) {
        h.e(gVar, "trackUriFlowable");
        this.b = gVar;
    }

    public final void a(j jVar) {
        h.e(jVar, "peekScrollViewBinder");
        this.a.b(this.b.subscribe(new a(jVar)));
    }

    public final void b() {
        this.a.a();
    }
}

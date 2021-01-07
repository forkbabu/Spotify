package com.spotify.music.alarmlauncher;

import io.reactivex.a0;
import io.reactivex.c0;
import kotlin.f;
import kotlin.jvm.internal.h;

final class g<T> implements c0<f> {
    final /* synthetic */ h a;

    static final class a implements io.reactivex.functions.f {
        final /* synthetic */ g a;

        a(g gVar) {
            this.a = gVar;
        }

        @Override // io.reactivex.functions.f
        public final void cancel() {
            this.a.a.a = null;
        }
    }

    g(h hVar) {
        this.a = hVar;
    }

    @Override // io.reactivex.c0
    public final void subscribe(a0<f> a0Var) {
        h.e(a0Var, "newEmitter");
        a0Var.e(new a(this));
        this.a.a = a0Var;
    }
}

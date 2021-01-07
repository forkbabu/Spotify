package com.spotify.nowplaying.ui.components.color;

import com.squareup.picasso.z;
import io.reactivex.a0;
import io.reactivex.c0;
import io.reactivex.functions.f;
import kotlin.jvm.internal.h;

final class e<T> implements c0<Integer> {
    final /* synthetic */ f a;
    final /* synthetic */ String b;

    static final class a implements f {
        final /* synthetic */ e a;
        final /* synthetic */ a b;

        a(e eVar, a aVar) {
            this.a = eVar;
            this.b = aVar;
        }

        @Override // io.reactivex.functions.f
        public final void cancel() {
            this.a.a.c().c(this.b);
        }
    }

    e(f fVar, String str) {
        this.a = fVar;
        this.b = str;
    }

    @Override // io.reactivex.c0
    public final void subscribe(a0<Integer> a0Var) {
        h.e(a0Var, "it");
        f fVar = this.a;
        fVar.getClass();
        a a2 = a.a(new d(fVar, a0Var));
        a0Var.e(new a(this, a2));
        z m = this.a.c().m(this.b);
        m.x(fwd.b);
        m.o(a2);
    }
}

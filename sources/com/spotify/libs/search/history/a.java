package com.spotify.libs.search.history;

import com.spotify.libs.search.history.o;
import io.reactivex.functions.f;

public final /* synthetic */ class a implements f {
    public final /* synthetic */ f a;
    public final /* synthetic */ o.a b;

    public /* synthetic */ a(f fVar, o.a aVar) {
        this.a = fVar;
        this.b = aVar;
    }

    @Override // io.reactivex.functions.f
    public final void cancel() {
        this.a.h(this.b);
    }
}

package com.spotify.mobius.rx2;

import com.spotify.mobius.rx2.r;
import io.reactivex.functions.a;

class q implements a {
    final /* synthetic */ Object a;
    final /* synthetic */ r.a b;

    q(r.a aVar, Object obj) {
        this.b = aVar;
        this.a = obj;
    }

    @Override // io.reactivex.functions.a
    public void run() {
        r.this.a.accept(this.a);
    }
}

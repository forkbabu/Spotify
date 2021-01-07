package com.spotify.nowplaying.ui.components.color;

import com.spotify.nowplaying.ui.components.color.a;
import io.reactivex.a0;

public final class d implements a.AbstractC0356a {
    final /* synthetic */ f a;
    final /* synthetic */ a0 b;

    d(f fVar, a0 a0Var) {
        this.a = fVar;
        this.b = a0Var;
    }

    @Override // com.spotify.nowplaying.ui.components.color.a.AbstractC0356a
    public void a(int i) {
        this.b.onSuccess(Integer.valueOf(i));
    }

    @Override // com.spotify.nowplaying.ui.components.color.a.AbstractC0356a
    public void b() {
        this.b.onSuccess(Integer.valueOf(this.a.b()));
    }
}

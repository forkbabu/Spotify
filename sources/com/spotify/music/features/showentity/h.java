package com.spotify.music.features.showentity;

import com.spotify.music.features.showentity.r;
import com.spotify.music.features.showentity.t;
import io.reactivex.functions.l;

public final /* synthetic */ class h implements l {
    public final /* synthetic */ r.b a;

    public /* synthetic */ h(r.b bVar) {
        this.a = bVar;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return new t.a(this.a.a(), (Throwable) obj);
    }
}

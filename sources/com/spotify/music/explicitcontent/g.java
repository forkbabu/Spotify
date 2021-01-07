package com.spotify.music.explicitcontent;

import com.spotify.mobile.android.rx.w;
import io.reactivex.s;

public class g implements f {
    private final w a;

    g(w wVar) {
        this.a = wVar;
    }

    @Override // com.spotify.music.explicitcontent.f
    public s<Boolean> a() {
        return this.a.c("lock-filter-explicit-content").j0(a.a);
    }

    @Override // com.spotify.music.explicitcontent.f
    public s<Boolean> b() {
        return this.a.c("filter-explicit-content").j0(a.a);
    }
}

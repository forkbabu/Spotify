package com.spotify.music.explicitcontent;

import com.spotify.mobile.android.rx.w;
import com.spotify.remoteconfig.e8;
import io.reactivex.s;

public class k implements j {
    private final e8 a;
    private final w b;

    public k(e8 e8Var, w wVar) {
        this.a = e8Var;
        this.b = wVar;
    }

    @Override // com.spotify.music.explicitcontent.j
    public s<Boolean> a() {
        if (this.a.a()) {
            return s.i0(Boolean.TRUE);
        }
        return this.b.c("explicit-content-setting-hidden").j0(e.a).E();
    }
}

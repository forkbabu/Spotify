package com.spotify.music.appprotocol.volume;

import com.spotify.mobile.android.service.media.v1;
import defpackage.ff2;
import io.reactivex.y;

public class m {
    private final v1 a;
    private final y b;

    public m(v1 v1Var, y yVar) {
        this.a = v1Var;
        this.b = yVar;
    }

    public void a(og0<String, ff2> og0, ff2.a aVar) {
        sr1 sr1 = (sr1) og0;
        sr1.a.d(sr1.b, "com.spotify.volume.volume_state", new l(this.a, aVar, this.b));
    }
}

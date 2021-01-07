package com.spotify.voice.experience;

import com.spotify.music.libs.voice.e;
import java.util.Random;

public final class m implements fjf<String> {
    private final wlf<e> a;
    private final wlf<Random> b;

    public m(wlf<e> wlf, wlf<Random> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    public static String a(e eVar, Random random) {
        return eVar.a(new e(random));
    }

    @Override // defpackage.wlf
    public Object get() {
        return a(this.a.get(), this.b.get());
    }
}

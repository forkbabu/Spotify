package com.spotify.music.features.album.encore;

import com.spotify.ubi.specification.factories.l;
import kotlin.jvm.internal.h;

public final class m {
    private final ere a;
    private final l b;

    public m(ere ere, l lVar) {
        h.e(ere, "ubiLogger");
        h.e(lVar, "eventFactory");
        this.a = ere;
        this.b = lVar;
    }

    public final void a(String str, Integer num) {
        h.e(str, "trackUri");
        this.a.a(this.b.d().b(num, str).b());
    }

    public final void b(String str, Integer num) {
        h.e(str, "trackUri");
        this.a.a(this.b.d().b(num, str).a(str));
    }
}

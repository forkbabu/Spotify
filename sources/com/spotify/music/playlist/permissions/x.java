package com.spotify.music.playlist.permissions;

import com.spotify.http.u;
import com.spotify.music.playlist.permissions.v;
import kotlin.jvm.internal.h;

public final class x implements fjf<a> {
    private final wlf<u> a;

    public x(wlf<u> wlf) {
        this.a = wlf;
    }

    public static a a(u uVar) {
        v.a aVar = v.a;
        h.e(uVar, "retrofitMaker");
        a aVar2 = (a) uVar.b(a.class);
        yif.g(aVar2, "Cannot return null from a non-@Nullable @Provides method");
        return aVar2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return a(this.a.get());
    }
}

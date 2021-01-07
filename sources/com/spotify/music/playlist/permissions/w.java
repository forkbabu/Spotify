package com.spotify.music.playlist.permissions;

import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.playlist.permissions.v;
import com.spotify.ubi.specification.factories.n2;
import kotlin.jvm.internal.h;

public final class w implements fjf<n2> {
    private final wlf<String> a;

    public w(wlf<String> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        String str = this.a.get();
        v.a aVar = v.a;
        h.e(str, "playlistUri");
        return new n2(PageIdentifiers.PLAYLIST_PERMISSIONS.path(), str);
    }
}

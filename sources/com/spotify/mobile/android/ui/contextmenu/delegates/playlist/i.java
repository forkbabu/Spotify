package com.spotify.mobile.android.ui.contextmenu.delegates.playlist;

import com.spotify.mobile.android.ui.contextmenu.z3;
import com.spotify.playlist.models.j;
import com.spotify.remoteconfig.AndroidLibsContextMenuPlaylistProperties;

public final class i implements fjf<h> {
    private final wlf<z3<j>> a;
    private final wlf<AndroidLibsContextMenuPlaylistProperties> b;

    public i(wlf<z3<j>> wlf, wlf<AndroidLibsContextMenuPlaylistProperties> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new h(this.a.get(), this.b.get());
    }
}

package com.spotify.music.features.editplaylist.dialog;

import android.content.Context;

public final class j implements fjf<SavePlaylistDialog> {
    private final wlf<Context> a;

    public j(wlf<Context> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new SavePlaylistDialog(this.a.get());
    }
}

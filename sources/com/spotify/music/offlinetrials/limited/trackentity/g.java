package com.spotify.music.offlinetrials.limited.trackentity;

import com.spotify.base.java.logging.Logger;

public class g implements a71 {
    private final l a;

    public g(l lVar) {
        this.a = lVar;
    }

    @Override // defpackage.a71
    public void b(o81 o81, n61 n61) {
        Boolean bool = (Boolean) n61.a().get("download");
        if (bool == null) {
            Logger.d("Missing event data!", new Object[0]);
        } else if (bool.booleanValue()) {
            this.a.b();
        } else {
            this.a.c();
        }
    }
}

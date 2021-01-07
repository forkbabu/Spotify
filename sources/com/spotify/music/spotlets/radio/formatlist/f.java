package com.spotify.music.spotlets.radio.formatlist;

import com.spotify.http.u;

public final class f implements fjf<sfd> {
    private final wlf<u> a;

    public f(wlf<u> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        sfd sfd = (sfd) this.a.get().c(sfd.class);
        yif.g(sfd, "Cannot return null from a non-@Nullable @Provides method");
        return sfd;
    }
}

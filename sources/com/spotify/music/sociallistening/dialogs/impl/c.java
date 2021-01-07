package com.spotify.music.sociallistening.dialogs.impl;

import android.app.Activity;

public final class c implements fjf<SocialListeningDialogsImpl> {
    private final wlf<Activity> a;
    private final wlf<cfd> b;
    private final wlf<x9d> c;

    public c(wlf<Activity> wlf, wlf<cfd> wlf2, wlf<x9d> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new SocialListeningDialogsImpl(this.a.get(), this.b.get(), this.c.get());
    }
}

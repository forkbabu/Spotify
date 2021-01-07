package com.spotify.music.features.podcast.entity.di;

import com.spotify.music.features.podcast.entity.di.PodcastQuoteSharingModule;
import defpackage.fic;
import defpackage.zrc;
import kotlin.jvm.internal.h;

public final class w implements fjf<zrc.a> {
    private final wlf<fic> a;

    public w(wlf<fic> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        fic fic = this.a.get();
        PodcastQuoteSharingModule.Companion companion = PodcastQuoteSharingModule.a;
        h.e(fic, "delegate");
        zrc.a a2 = zrc.a.a(fic.b.class, fic);
        h.d(a2, "AdapterDelegatesManager.…a, delegate\n            )");
        return a2;
    }
}

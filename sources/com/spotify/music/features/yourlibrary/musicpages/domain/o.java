package com.spotify.music.features.yourlibrary.musicpages.domain;

import com.spotify.mobius.e0;
import com.spotify.music.features.yourlibrary.musicpages.domain.r0;
import com.spotify.music.features.yourlibrary.musicpages.domain.s0;
import com.spotify.music.features.yourlibrary.musicpages.pages.u;

public final /* synthetic */ class o implements ti0 {
    public final /* synthetic */ MusicPagesModel a;

    public /* synthetic */ o(MusicPagesModel musicPagesModel) {
        this.a = musicPagesModel;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        s0.f fVar = (s0.f) obj;
        u m = this.a.m();
        int ordinal = m.k().ordinal();
        if (ordinal == 0) {
            String orNull = m.t().orNull();
            orNull.getClass();
            return e0.a(z42.l(new r0.e0(orNull), new r0.l()));
        } else if (ordinal == 1) {
            return e0.a(z42.l(new r0.d0(), new r0.h()));
        } else {
            if (ordinal == 2) {
                return e0.h();
            }
            if (ordinal == 3) {
                String orNull2 = m.t().orNull();
                orNull2.getClass();
                return e0.a(z42.l(new r0.f0(orNull2), new r0.l()));
            } else if (ordinal == 4) {
                return e0.h();
            } else {
                throw new IllegalArgumentException("Unsupported music item clicked");
            }
        }
    }
}

package com.spotify.music.features.yourlibrary.musicpages.domain;

import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableSet;
import com.spotify.mobius.e0;
import com.spotify.music.features.yourlibrary.musicpages.domain.r0;
import com.spotify.music.features.yourlibrary.musicpages.domain.s0;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;
import com.spotify.playlist.models.PlayabilityRestriction;

public final /* synthetic */ class x implements ti0 {
    public static final /* synthetic */ x a = new x();

    private /* synthetic */ x() {
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        s0.l0 l0Var = (s0.l0) obj;
        MusicItem Q = l0Var.Q();
        if (Q.o()) {
            int i = ImmutableSet.a;
            ImmutableSet.Builder builder = new ImmutableSet.Builder();
            MusicItem.g y = Q.y();
            boolean z = true;
            builder.mo53add((ImmutableSet.Builder) new r0.y(Q.A(), l0Var.R(), y.m(), true));
            PlayabilityRestriction k = y.k();
            if (k == PlayabilityRestriction.EXPLICIT_CONTENT) {
                builder.mo53add((ImmutableSet.Builder) new r0.c1(Q.A(), y.e()));
            }
            if (k == PlayabilityRestriction.AGE_RESTRICTED) {
                builder.mo53add((ImmutableSet.Builder) new r0.a1(Q.A(), Q.j()));
            }
            if (!(k == PlayabilityRestriction.NO_RESTRICTION || k == PlayabilityRestriction.UNKNOWN)) {
                z = false;
            }
            if (z) {
                String l = Q.y().l();
                if (MoreObjects.isNullOrEmpty(l)) {
                    return e0.a(builder.build());
                }
                builder.mo53add((ImmutableSet.Builder) new r0.n0(l));
            }
            return e0.a(builder.build());
        }
        throw new IllegalArgumentException("Unsupported music item clicked");
    }
}

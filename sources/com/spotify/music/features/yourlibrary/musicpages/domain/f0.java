package com.spotify.music.features.yourlibrary.musicpages.domain;

import com.google.common.base.MoreObjects;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableSet;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobius.e0;
import com.spotify.music.features.yourlibrary.musicpages.domain.r0;
import com.spotify.music.features.yourlibrary.musicpages.domain.s0;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;
import com.spotify.playlist.models.PlayabilityRestriction;

public final /* synthetic */ class f0 implements ti0 {
    public final /* synthetic */ MusicPagesModel a;

    public /* synthetic */ f0(MusicPagesModel musicPagesModel) {
        this.a = musicPagesModel;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        Optional optional;
        MusicPagesModel musicPagesModel = this.a;
        s0.j0 j0Var = (s0.j0) obj;
        MusicItem Q = j0Var.Q();
        if (Q.o()) {
            qpd orNull = musicPagesModel.b().orNull();
            if (orNull == null) {
                Assertion.g("Active sort option was null!");
                return e0.h();
            }
            int i = ImmutableSet.a;
            ImmutableSet.Builder builder = new ImmutableSet.Builder();
            MusicItem.g y = Q.y();
            PlayabilityRestriction k = y.k();
            boolean z = false;
            if (Q.type() == MusicItem.Type.TRACK_SHUFFLE_ONLY) {
                builder.mo53add((ImmutableSet.Builder) new r0.y(Q.A(), j0Var.R(), y.m(), false));
                String l = y.l();
                if (MoreObjects.isNullOrEmpty(l)) {
                    optional = Optional.absent();
                } else {
                    optional = Optional.of(new r0.n0(l));
                }
            } else {
                optional = Optional.of(new r0.o0(Q, musicPagesModel.m().r(), orNull, j0Var.S()));
            }
            if (k == PlayabilityRestriction.EXPLICIT_CONTENT) {
                builder.mo53add((ImmutableSet.Builder) new r0.c1(Q.A(), y.e()));
            }
            if (k == PlayabilityRestriction.AGE_RESTRICTED) {
                builder.mo53add((ImmutableSet.Builder) new r0.a1(Q.A(), Q.j()));
            }
            if (k == PlayabilityRestriction.NO_RESTRICTION || k == PlayabilityRestriction.UNKNOWN) {
                z = true;
            }
            if (z && optional.isPresent()) {
                builder.mo53add((ImmutableSet.Builder) optional.get());
            }
            return e0.a(builder.build());
        }
        throw new IllegalArgumentException("Unsupported music item clicked");
    }
}

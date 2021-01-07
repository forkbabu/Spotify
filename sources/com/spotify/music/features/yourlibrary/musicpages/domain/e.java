package com.spotify.music.features.yourlibrary.musicpages.domain;

import com.google.common.collect.ImmutableSet;
import com.spotify.mobius.e0;
import com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel;
import com.spotify.music.features.yourlibrary.musicpages.domain.r0;
import com.spotify.music.features.yourlibrary.musicpages.domain.s0;
import com.spotify.music.yourlibrary.interfaces.YourLibraryTabsCollapseState;

public final /* synthetic */ class e implements ti0 {
    public final /* synthetic */ MusicPagesModel a;

    public /* synthetic */ e(MusicPagesModel musicPagesModel) {
        this.a = musicPagesModel;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        s0.b0 b0Var = (s0.b0) obj;
        MusicPagesModel.a v = this.a.v();
        v.h(true);
        MusicPagesModel c = v.c();
        int i = ImmutableSet.a;
        ImmutableSet.Builder builder = new ImmutableSet.Builder();
        builder.mo60add((Object[]) new r0[]{new r0.w0(true), new r0.C0262r0(YourLibraryTabsCollapseState.COLLAPSED, false), new r0.q0(true), new r0.p0(true)});
        if (c.j()) {
            builder.mo53add((ImmutableSet.Builder) new r0.z0(true));
        } else {
            builder.mo53add((ImmutableSet.Builder) new r0.z());
        }
        return e0.g(c, builder.build());
    }
}

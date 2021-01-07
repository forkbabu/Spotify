package com.spotify.music.features.yourlibrary.musicpages.domain;

import com.spotify.mobius.e0;
import com.spotify.music.features.yourlibrary.musicpages.domain.r0;
import com.spotify.music.features.yourlibrary.musicpages.domain.s0;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;

public final /* synthetic */ class d implements ti0 {
    public static final /* synthetic */ d a = new d();

    private /* synthetic */ d() {
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        MusicItem Q = ((s0.m) obj).Q();
        MusicItem.Type z = Q.type();
        if (z == MusicItem.Type.PLAYLIST || z == MusicItem.Type.ARTIST || z == MusicItem.Type.ARTIST_TWO_LINES || z == MusicItem.Type.ALBUM || z == MusicItem.Type.TRACK || z == MusicItem.Type.TRACK_SHUFFLE_ONLY) {
            return e0.a(z42.l(new r0.b1(Q)));
        }
        return e0.h();
    }
}

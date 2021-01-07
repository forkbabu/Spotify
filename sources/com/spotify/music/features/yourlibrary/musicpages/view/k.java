package com.spotify.music.features.yourlibrary.musicpages.view;

import com.spotify.music.features.yourlibrary.musicpages.domain.s0;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;
import com.spotify.music.features.yourlibrary.musicpages.view.r0;

public final /* synthetic */ class k implements r0.b {
    public final /* synthetic */ da2 a;

    public /* synthetic */ k(da2 da2) {
        this.a = da2;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.view.r0.b
    public final void a(MusicItem musicItem, int i) {
        this.a.accept(s0.J(musicItem, i, musicItem.k()));
    }
}

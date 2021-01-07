package com.spotify.music.features.yourlibrary.musicpages.view;

import com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel;
import io.reactivex.functions.l;

public final /* synthetic */ class r implements l {
    public static final /* synthetic */ r a = new r();

    private /* synthetic */ r() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        MusicPagesModel musicPagesModel = (MusicPagesModel) obj;
        return new u3(musicPagesModel.q(), musicPagesModel.m().t().orNull());
    }
}

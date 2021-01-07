package com.spotify.music.newplaying.scroll.widgets.btl;

import com.spotify.music.behindthelyrics.model.business.TrackAnnotationSet;
import io.reactivex.functions.l;

public final /* synthetic */ class e implements l {
    public final /* synthetic */ l a;

    public /* synthetic */ e(l lVar) {
        this.a = lVar;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return l.b(this.a, (TrackAnnotationSet) obj);
    }
}

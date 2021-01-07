package com.spotify.music.behindthelyrics.service;

import com.spotify.music.behindthelyrics.model.business.TracksAndResources;
import io.reactivex.functions.l;
import io.reactivex.s;

public final /* synthetic */ class a implements l {
    public final /* synthetic */ f a;

    public /* synthetic */ a(f fVar) {
        this.a = fVar;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return ((al2) this.a.b).b((TracksAndResources) obj).g(s.i0(Boolean.TRUE));
    }
}

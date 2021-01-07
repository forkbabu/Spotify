package com.spotify.music.features.imagerecs.presenter;

import com.spotify.music.features.imagerecs.model.ImageRecsEntity;
import io.reactivex.functions.l;

public final /* synthetic */ class c implements l {
    public final /* synthetic */ l a;

    public /* synthetic */ c(l lVar) {
        this.a = lVar;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return l.d(this.a, (ImageRecsEntity) obj);
    }
}

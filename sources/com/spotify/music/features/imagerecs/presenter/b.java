package com.spotify.music.features.imagerecs.presenter;

import com.spotify.music.features.imagerecs.model.ImageRecsEntity;
import io.reactivex.functions.l;

public final /* synthetic */ class b implements l {
    public final /* synthetic */ ImageRecsEntity a;

    public /* synthetic */ b(ImageRecsEntity imageRecsEntity) {
        this.a = imageRecsEntity;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        Boolean bool = (Boolean) obj;
        return this.a.getImageId();
    }
}

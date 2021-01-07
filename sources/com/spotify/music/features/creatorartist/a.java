package com.spotify.music.features.creatorartist;

import com.google.common.base.Function;
import com.spotify.music.features.creatorartist.model.ImageModel;

public final /* synthetic */ class a implements Function {
    public static final /* synthetic */ a a = new a();

    private /* synthetic */ a() {
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        return ImageModel.convertToImage((ImageModel) obj);
    }
}

package com.spotify.music.features.hiddencontent;

import com.google.common.base.Function;
import com.spotify.music.libs.collection.json.ArtistJacksonModel;

public final /* synthetic */ class e implements Function {
    public static final /* synthetic */ e a = new e();

    private /* synthetic */ e() {
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        return ((ArtistJacksonModel) obj).getArtist();
    }
}

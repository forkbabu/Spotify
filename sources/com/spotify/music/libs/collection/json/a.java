package com.spotify.music.libs.collection.json;

import com.google.common.base.Function;

public final /* synthetic */ class a implements Function {
    public static final /* synthetic */ a a = new a();

    private /* synthetic */ a() {
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        return ((ArtistJacksonModel) obj).getArtist();
    }
}

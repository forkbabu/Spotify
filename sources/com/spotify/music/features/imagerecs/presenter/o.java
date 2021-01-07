package com.spotify.music.features.imagerecs.presenter;

import com.spotify.music.features.imagerecs.model.ImageRecsEntity;
import com.spotify.music.features.imagerecs.model.TrackRecsEntity;
import io.reactivex.z;

public class o {
    private final j a;

    public o(j jVar) {
        this.a = jVar;
    }

    public z<ImageRecsEntity> a() {
        return this.a.a();
    }

    public z<TrackRecsEntity> b(String str) {
        return this.a.b(str);
    }
}

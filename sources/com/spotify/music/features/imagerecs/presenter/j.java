package com.spotify.music.features.imagerecs.presenter;

import com.spotify.music.features.imagerecs.model.ImageRecsEntity;
import com.spotify.music.features.imagerecs.model.TrackRecsEntity;
import io.reactivex.z;

public interface j {
    @zqf("image-recs/v1/image-upload")
    z<ImageRecsEntity> a();

    @zqf("image-recs/v1/recs/{imageid}")
    z<TrackRecsEntity> b(@mrf(encoded = true, value = "imageid") String str);
}

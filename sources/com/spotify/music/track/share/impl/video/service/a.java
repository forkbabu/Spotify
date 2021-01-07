package com.spotify.music.track.share.impl.video.service;

import io.reactivex.z;
import okhttp3.e0;
import retrofit2.v;

public interface a {
    @irf("canvas-shareables/v1/transform-canvas")
    z<TransformCanvasResponse> a(@uqf TransformCanvasRequest transformCanvasRequest);

    @zqf
    @qrf
    z<v<e0>> b(@srf String str);
}

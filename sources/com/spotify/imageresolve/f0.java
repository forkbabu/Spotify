package com.spotify.imageresolve;

import com.spotify.imageresolve.proto.ProjectionsResponse;
import io.reactivex.z;
import retrofit2.v;

public interface f0 {
    @zqf("image-resolve/v1/resolve/map")
    z<v<ProjectionsResponse>> a();
}

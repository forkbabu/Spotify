package com.spotify.music.libs.bluetooth;

import io.reactivex.z;

public interface k {
    @erf({"No-Webgate-Authentication: true"})
    @zqf("external-accessory-categorizer/v1/categorize/{name}")
    z<CategorizerResponse> a(@mrf("name") String str);
}

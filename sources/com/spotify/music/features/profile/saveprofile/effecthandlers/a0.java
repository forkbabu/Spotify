package com.spotify.music.features.profile.saveprofile.effecthandlers;

import io.reactivex.z;
import okhttp3.c0;

interface a0 {
    @erf({"Content-Encoding: identity"})
    @irf("/v4/user-profile")
    z<SaveProfileEffectHandlers$ImageUploadResponse> a(@uqf c0 c0Var);
}

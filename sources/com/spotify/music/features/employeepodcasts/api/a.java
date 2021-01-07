package com.spotify.music.features.employeepodcasts.api;

import io.reactivex.z;

public interface a {
    @zqf("shelter/auth/google/callback")
    z<ShelterLoginResponse> a(@nrf("code") String str, @nrf("redirect_uri_override") String str2);
}

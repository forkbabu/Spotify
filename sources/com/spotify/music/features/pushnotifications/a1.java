package com.spotify.music.features.pushnotifications;

import com.spotify.music.features.pushnotifications.model.PushRegistrationData;
import io.reactivex.z;
import okhttp3.e0;
import retrofit2.v;

public interface a1 {
    @irf("pushka-tokens/register")
    z<v<e0>> a(@uqf PushRegistrationData pushRegistrationData);
}

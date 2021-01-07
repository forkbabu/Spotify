package com.spotify.music.features.profile.saveprofile.effecthandlers;

import io.reactivex.a;

public interface b0 {
    @irf("identity/v2/profile-image/{username}/{uploadToken}")
    a a(@mrf("username") String str, @mrf("uploadToken") String str2);

    @vqf("identity/v2/profile-image/{username}")
    a b(@mrf("username") String str);
}

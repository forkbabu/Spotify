package com.spotify.music.libs.partnerapps.api;

import com.google.common.collect.ImmutableMap;
import com.spotify.music.libs.partnerapps.PartnerType;
import io.reactivex.z;

public interface c {
    z<ImmutableMap<PartnerType, cla>> a();

    z<ImmutableMap<PartnerType, bla>> b();

    z<ImmutableMap<PartnerType, bla>> c();
}

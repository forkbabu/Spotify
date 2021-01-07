package com.spotify.music.features.trackcredits.adapter;

import com.google.common.base.MoreObjects;
import com.google.common.base.Optional;
import com.spotify.music.features.trackcredits.adapter.TrackCreditsAdapter;

public abstract class d {
    public static d a(String str, TrackCreditsAdapter.ViewType viewType) {
        return new c(str, Optional.absent(), viewType);
    }

    public static d b(String str, String str2, TrackCreditsAdapter.ViewType viewType) {
        if (MoreObjects.isNullOrEmpty(str2)) {
            return new c(str, Optional.absent(), viewType);
        }
        return new c(str, Optional.of(str2), viewType);
    }

    public abstract Optional<String> c();

    public abstract String d();

    public abstract TrackCreditsAdapter.ViewType e();
}

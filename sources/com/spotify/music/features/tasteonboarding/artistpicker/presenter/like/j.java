package com.spotify.music.features.tasteonboarding.artistpicker.presenter.like;

import com.spotify.mobile.android.util.l0;
import java.util.Map;

public class j {
    private final Map<ContentType, wlf<i>> a;

    public j(Map<ContentType, wlf<i>> map) {
        this.a = map;
    }

    public i a(String str) {
        return this.a.get(ContentType.valueOf(l0.z(str).q().toString())).get();
    }
}

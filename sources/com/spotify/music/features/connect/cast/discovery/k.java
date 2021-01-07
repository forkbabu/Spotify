package com.spotify.music.features.connect.cast.discovery;

import com.google.common.base.Optional;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.music.json.g;

public class k implements i {
    private final j a;

    public k(SpSharedPreferences<Object> spSharedPreferences, g gVar) {
        this.a = new c(spSharedPreferences, gVar);
    }

    @Override // com.spotify.music.features.connect.cast.discovery.i
    public boolean a() {
        return ((c) this.a).a();
    }

    @Override // com.spotify.music.features.connect.cast.discovery.i
    public Optional<DiscoveryConfiguration> b() {
        if (((c) this.a).a()) {
            return ((c) this.a).b();
        }
        return Optional.absent();
    }
}

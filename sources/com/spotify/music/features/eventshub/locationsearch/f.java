package com.spotify.music.features.eventshub.locationsearch;

import com.google.common.base.MoreObjects;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.music.features.eventshub.locationsearch.model.Location;

public class f {
    static final SpSharedPreferences.b<Object, Integer> b = SpSharedPreferences.b.c("concerts_location_geonameid");
    static final SpSharedPreferences.b<Object, String> c = SpSharedPreferences.b.c("concerts_location_name");
    private final SpSharedPreferences<Object> a;

    public f(SpSharedPreferences<Object> spSharedPreferences) {
        this.a = spSharedPreferences;
    }

    public Location a() {
        Location location = Location.EMPTY;
        int f = this.a.f(b, location.mGeonameId);
        String m = this.a.m(c, location.mLocationName);
        return (f == -1 || MoreObjects.isNullOrEmpty(m)) ? location : new Location(f, m);
    }

    public void b(Location location) {
        SpSharedPreferences.a<Object> b2 = this.a.b();
        b2.b(b, location.mGeonameId);
        b2.f(c, location.mLocationName);
        b2.j();
    }
}

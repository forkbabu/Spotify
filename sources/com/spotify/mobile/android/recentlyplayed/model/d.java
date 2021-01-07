package com.spotify.mobile.android.recentlyplayed.model;

import io.reactivex.internal.functions.Functions;
import io.reactivex.s;
import java.util.HashMap;
import java.util.Map;

public final class d {
    private final Map<String, Object> a = new HashMap();

    private d() {
    }

    public static d b(int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        d dVar = new d();
        dVar.a.put("updateThrottling", Integer.valueOf(i));
        dVar.a.put("limit", Integer.valueOf(i2));
        dVar.a.put("include_shows", Boolean.valueOf(z));
        dVar.a.put("include_radio", Boolean.valueOf(z2));
        dVar.a.put("include_daily_mix", Boolean.valueOf(z3));
        dVar.a.put("include_collection_songs", Boolean.valueOf(z4));
        dVar.a.put("include_your_episodes", Boolean.valueOf(z5));
        dVar.a.put("exclude_shows_mixed", Boolean.valueOf(z6));
        dVar.a.put("exclude_shows_audio", Boolean.valueOf(z7));
        dVar.a.put("exclude_shows_video", Boolean.valueOf(z8));
        return dVar;
    }

    public Map<String, String> a() {
        return (Map) s.d0(this.a.entrySet()).i(new b(this), Functions.r(c.a, a.a)).d();
    }

    public /* synthetic */ Map c() {
        return new HashMap(this.a.size());
    }
}

package com.spotify.music.features.podcast.episode.datasource;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.mobile.android.hubframework.model.json.HubsJsonViewModel;
import com.spotify.music.features.podcast.episode.datasource.x;
import com.spotify.music.json.e;
import java.io.IOException;
import okhttp3.e0;
import retrofit2.v;

public class y {
    private final ObjectMapper a;

    public y(e eVar) {
        this.a = eVar.a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).build();
    }

    public x a(v<e0> vVar) {
        try {
            e0 a2 = vVar.a();
            if (vVar.f() && a2 != null) {
                return new x.c((b91) this.a.readValue(a2.b(), HubsJsonViewModel.class));
            }
            e0 d = vVar.d();
            if (vVar.f() || d == null) {
                return new x.a("Invalid body");
            }
            return new x.c((b91) this.a.readValue(d.b(), HubsJsonViewModel.class));
        } catch (IOException e) {
            return new x.a(e.getMessage());
        }
    }
}

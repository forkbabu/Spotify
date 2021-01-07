package com.spotify.music.features.playlistentity.homemix;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.music.features.playlistentity.homemix.models.HomeMix;
import com.spotify.music.features.playlistentity.homemix.models.f;
import com.spotify.music.features.playlistentity.homemix.models.h;
import com.spotify.music.features.playlistentity.homemix.models.i;
import com.spotify.music.json.g;
import com.spotify.playlist.models.j;
import com.spotify.playlist.models.l;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HomeMixFormatListAttributesHelper {
    private final ObjectMapper a;

    /* access modifiers changed from: package-private */
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class AffinityUsers implements JacksonModel {
        @JsonProperty("users")
        private final List<f> mAffinityUsers;

        public AffinityUsers(@JsonProperty("users") List<f> list) {
            this.mAffinityUsers = list;
        }

        public List<f> getAffinityUsers() {
            return this.mAffinityUsers;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    static class Tastes implements JacksonModel {
        @JsonProperty("taste")
        private final List<h> mHomeMixTastes;

        public Tastes(@JsonProperty("taste") List<h> list) {
            this.mHomeMixTastes = list;
        }

        public List<h> getHomeMixTastes() {
            return this.mHomeMixTastes;
        }
    }

    public HomeMixFormatListAttributesHelper(g gVar) {
        this.a = gVar.a();
    }

    private List<f> b(l lVar) {
        lVar.getClass();
        String str = lVar.d().get("home-mix.v1");
        if (str == null) {
            return Collections.emptyList();
        }
        try {
            return ((AffinityUsers) this.a.readValue(str, AffinityUsers.class)).getAffinityUsers();
        } catch (IOException e) {
            Logger.d("JSON Parsing error: %s", e.getMessage());
            return Collections.emptyList();
        }
    }

    public i a(j jVar) {
        HomeMix c = c(jVar);
        if (c != null) {
            return i.a(c.isUserEnabled(), c.includeExplicit(), c.isFamilyMember());
        }
        return null;
    }

    public HomeMix c(j jVar) {
        jVar.getClass();
        String str = jVar.f().get("home-mix.v1");
        if (str == null) {
            return null;
        }
        try {
            return (HomeMix) this.a.readValue(str, HomeMix.class);
        } catch (IOException e) {
            Logger.d("JSON Parsing error: %s", e.getMessage());
            return null;
        }
    }

    public List<com.spotify.music.features.playlistentity.homemix.models.g> d(List<l> list) {
        ArrayList arrayList = new ArrayList();
        for (l lVar : list) {
            arrayList.add(com.spotify.music.features.playlistentity.homemix.models.g.b(lVar, b(lVar)));
        }
        return arrayList;
    }

    public Map<String, com.spotify.music.features.playlistentity.homemix.models.g> e(List<l> list) {
        HashMap hashMap = new HashMap();
        for (l lVar : list) {
            hashMap.put(lVar.getUri(), com.spotify.music.features.playlistentity.homemix.models.g.b(lVar, b(lVar)));
        }
        return hashMap;
    }

    public List<h> f(j jVar) {
        jVar.getClass();
        String str = jVar.f().get("home-mix.v1");
        if (str == null) {
            return Collections.emptyList();
        }
        try {
            return ((Tastes) this.a.readValue(str, Tastes.class)).getHomeMixTastes();
        } catch (IOException e) {
            Logger.d("JSON Parsing error: %s", e.getMessage());
            return Collections.emptyList();
        }
    }
}

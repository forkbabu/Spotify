package com.spotify.music.libs.podcast.loader;

import com.google.common.collect.ImmutableMap;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.playlist.model.policy.DecorationPolicy;
import com.spotify.mobile.android.playlist.model.policy.ListPolicy;
import com.spotify.mobile.android.playlist.model.policy.Policy;
import com.spotify.playlist.models.Episode;
import com.spotify.playlist.models.i;
import io.reactivex.s;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

@Deprecated
public class h implements l {
    private static final HashMap<String, Boolean> c;
    private static final HashMap<String, Boolean> d;
    private static final Map<String, Boolean> e;
    private final j a;
    private final i b;

    static {
        HashMap<String, Boolean> hashMap = new HashMap<>();
        Boolean bool = Boolean.TRUE;
        hashMap.put("link", bool);
        hashMap.put("name", bool);
        hashMap.put("offline", bool);
        hashMap.put("isNew", bool);
        hashMap.put("isInListenLater", bool);
        hashMap.put("isPlayed", bool);
        hashMap.put("length", bool);
        hashMap.put("timeLeft", bool);
        hashMap.put("playable", bool);
        hashMap.put("available", bool);
        hashMap.put("covers", bool);
        hashMap.put("isExplicit", bool);
        hashMap.put("freezeFrames", bool);
        hashMap.put("manifestId", bool);
        hashMap.put("mediaTypeEnum", bool);
        hashMap.put("description", bool);
        hashMap.put("publishDate", bool);
        hashMap.put("isMusicAndTalk", bool);
        c = hashMap;
        HashMap<String, Boolean> hashMap2 = new HashMap<>();
        hashMap2.put("name", bool);
        hashMap2.put("link", bool);
        hashMap2.put("inCollection", bool);
        hashMap2.put("covers", bool);
        d = hashMap2;
        e = ImmutableMap.of("artists", bool);
    }

    public h(i iVar, String str, boolean z) {
        this.b = iVar;
        this.a = new j(str, z);
        Logger.b("Creating new CollectionEpisodesDataLoader", new Object[0]);
    }

    private Policy c() {
        ListPolicy listPolicy = new ListPolicy();
        HashMap<String, Boolean> hashMap = c;
        HashMap hashMap2 = new HashMap(this.a.c().size() + hashMap.size());
        hashMap2.putAll(hashMap);
        for (String str : this.a.c()) {
            hashMap2.put(str, Boolean.TRUE);
        }
        listPolicy.setListAttributes(hashMap2);
        listPolicy.setShowAttributes(d);
        listPolicy.setPodcastSegmentsAttributes(e);
        DecorationPolicy decorationPolicy = new DecorationPolicy();
        decorationPolicy.setListPolicy(listPolicy);
        return new Policy(decorationPolicy);
    }

    public s<i<Episode>> a() {
        e eVar = e.a;
        LinkedHashMap linkedHashMap = new LinkedHashMap(this.a.b().e());
        if (linkedHashMap.containsKey("group") && linkedHashMap.get("group") == null) {
            linkedHashMap.put("group", "");
        }
        if (this.a.f()) {
            return this.b.b(this.a.d(), linkedHashMap, c()).A(eVar).P();
        }
        if (this.a.e()) {
            return this.b.c(this.a.d(), linkedHashMap, c()).A(b.a).P();
        }
        return this.b.e(this.a.d(), linkedHashMap, c()).A(eVar).P();
    }

    public j b() {
        return this.a;
    }

    public s<i<Episode>> d() {
        e eVar = e.a;
        LinkedHashMap linkedHashMap = new LinkedHashMap(this.a.b().e());
        if (linkedHashMap.containsKey("group") && linkedHashMap.get("group") == null) {
            linkedHashMap.put("group", "");
        }
        if (this.a.f()) {
            return this.b.d(this.a.d(), linkedHashMap, c()).j0(eVar);
        }
        if (this.a.e()) {
            return this.b.a(this.a.d(), linkedHashMap, c()).j0(b.a);
        }
        return this.b.f(this.a.d(), linkedHashMap, c()).j0(eVar);
    }
}

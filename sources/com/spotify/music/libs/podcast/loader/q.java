package com.spotify.music.libs.podcast.loader;

import com.spotify.mobile.android.playlist.model.policy.DecorationPolicy;
import com.spotify.mobile.android.playlist.model.policy.ListPolicy;
import com.spotify.mobile.android.util.SortOption;
import com.spotify.music.libs.podcast.loader.ShowUriBuilder;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class q {
    private static final HashMap<String, Boolean> k;
    private static final HashMap<String, Boolean> l;
    private final Set<String> a = new HashSet(0);
    private final Set<String> b = new HashSet(0);
    private final String c;
    private String d;
    private Integer e;
    private Integer f;
    private SortOption g;
    private boolean h;
    private boolean i;
    private boolean j;

    static {
        HashMap<String, Boolean> hashMap = new HashMap<>(15);
        Boolean bool = Boolean.TRUE;
        hashMap.put("link", bool);
        hashMap.put("name", bool);
        hashMap.put("offline", bool);
        hashMap.put("isNew", bool);
        hashMap.put("isInListenLater", bool);
        hashMap.put("isPlayed", bool);
        hashMap.put("length", bool);
        hashMap.put("timeLeft", bool);
        hashMap.put("publishDate", bool);
        hashMap.put("playable", bool);
        hashMap.put("available", bool);
        hashMap.put("covers", bool);
        hashMap.put("freezeFrames", bool);
        hashMap.put("manifestId", bool);
        hashMap.put("mediaTypeEnum", bool);
        hashMap.put("isExplicit", bool);
        hashMap.put("backgroundable", bool);
        hashMap.put("description", bool);
        hashMap.put("type", bool);
        hashMap.put("isMusicAndTalk", bool);
        k = hashMap;
        HashMap<String, Boolean> hashMap2 = new HashMap<>(3);
        hashMap2.put("link", bool);
        hashMap2.put("inCollection", bool);
        hashMap2.put("name", bool);
        hashMap2.put("trailerUri", bool);
        l = hashMap2;
    }

    protected q(String str) {
        this.c = str;
    }

    public void a(String str) {
        this.b.add(str);
    }

    public void b(String str) {
        this.a.add(str);
    }

    public DecorationPolicy c() {
        HashMap hashMap;
        Boolean bool = Boolean.TRUE;
        DecorationPolicy decorationPolicy = new DecorationPolicy();
        ListPolicy listPolicy = new ListPolicy();
        HashMap<String, Boolean> hashMap2 = k;
        HashMap hashMap3 = new HashMap(this.a.size() + hashMap2.size());
        hashMap3.putAll(hashMap2);
        for (String str : this.a) {
            hashMap3.put(str, bool);
        }
        listPolicy.setListAttributes(hashMap3);
        listPolicy.setShowAttributes(l);
        decorationPolicy.setListPolicy(listPolicy);
        if (this.b.isEmpty()) {
            hashMap = null;
        } else {
            HashMap hashMap4 = new HashMap(this.b.size());
            for (String str2 : this.b) {
                hashMap4.put(str2, bool);
            }
            hashMap = hashMap4;
        }
        decorationPolicy.setAuxiliarySectionsAttributes(hashMap);
        return decorationPolicy;
    }

    public String d() {
        return this.c;
    }

    public ShowUriBuilder e() {
        ShowUriBuilder showUriBuilder = new ShowUriBuilder("sp://core-show/v1/shows/<b62-show-id>");
        showUriBuilder.n(100);
        showUriBuilder.l(this.c);
        showUriBuilder.b(this.i);
        showUriBuilder.e(this.h);
        showUriBuilder.i(this.j);
        showUriBuilder.k(this.e, this.f);
        showUriBuilder.m(this.g);
        showUriBuilder.o(false);
        showUriBuilder.j(ShowUriBuilder.Format.PROTOBUF);
        String str = this.d;
        if (str != null) {
            showUriBuilder.f(str);
            showUriBuilder.g(15);
        }
        return showUriBuilder;
    }

    public void f(boolean z, boolean z2, boolean z3) {
        this.h = z;
        this.i = z2;
        this.j = z3;
    }

    public void g(String str) {
        this.d = str;
    }

    public void h(Integer num, Integer num2) {
        this.e = num;
        this.f = num2;
    }

    public void i(SortOption sortOption) {
        this.g = sortOption;
    }
}

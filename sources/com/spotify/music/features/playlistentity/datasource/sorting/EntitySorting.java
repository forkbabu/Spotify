package com.spotify.music.features.playlistentity.datasource.sorting;

import android.content.Context;
import android.text.TextUtils;
import com.adjust.sdk.Constants;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.google.common.base.MoreObjects;
import com.google.common.base.Optional;
import com.google.common.collect.FluentIterable;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.mobile.android.util.prefs.i;
import com.spotify.music.json.d;
import com.spotify.music.json.e;
import com.spotify.music.json.g;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

abstract class EntitySorting {
    private final Context a;
    private final i b;
    private final d c;
    private SortingModel d;

    /* access modifiers changed from: private */
    public static class SortOrderLruCache<A, B> extends LinkedHashMap<A, B> implements JacksonModel {
        private static final long serialVersionUID = -6935808408745498897L;
        private final int mMaxEntries;

        @JsonCreator
        public SortOrderLruCache() {
            this(Constants.ONE_SECOND);
        }

        /* access modifiers changed from: protected */
        @Override // java.util.LinkedHashMap
        public boolean removeEldestEntry(Map.Entry<A, B> entry) {
            return size() > this.mMaxEntries;
        }

        public SortOrderLruCache(int i) {
            super(Math.max(i + 1, 0), 1.0f, true);
            this.mMaxEntries = i;
        }
    }

    /* access modifiers changed from: private */
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class SortingModel implements JacksonModel {
        @JsonProperty("map")
        private final SortOrderLruCache<cfc, String> mSortMap;

        @JsonCreator
        public SortingModel(@JsonProperty("map") SortOrderLruCache<cfc, String> sortOrderLruCache) {
            this.mSortMap = (SortOrderLruCache) MoreObjects.firstNonNull(sortOrderLruCache, new SortOrderLruCache());
        }

        public SortOrderLruCache<cfc, String> getMap() {
            return this.mSortMap;
        }
    }

    class a extends d {
        a(EntitySorting entitySorting, g gVar) {
            super(gVar);
        }

        @Override // com.spotify.music.json.d
        public e b(e eVar) {
            eVar.a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            return eVar;
        }
    }

    public EntitySorting(Context context, i iVar, g gVar) {
        this.a = context;
        this.c = new a(this, gVar);
        this.b = iVar;
    }

    private static cfc a(String str) {
        cfc cfc = new cfc(str);
        if (cfc.a() == null) {
            Assertion.g("Uri " + str + " is invalid/unsupported.");
        }
        return cfc;
    }

    private SortingModel c() {
        SortingModel sortingModel = this.d;
        if (sortingModel != null) {
            return sortingModel;
        }
        String m = this.b.d(this.a).m(b(), "");
        if (!TextUtils.isEmpty(m)) {
            try {
                this.d = (SortingModel) this.c.a().readValue(m, SortingModel.class);
            } catch (IOException unused) {
                Assertion.g("Failed to fetch sorting for items.");
            }
        }
        if (this.d == null) {
            this.d = new SortingModel(new SortOrderLruCache(Constants.ONE_SECOND));
        }
        return this.d;
    }

    /* access modifiers changed from: protected */
    public abstract SpSharedPreferences.b<Object, String> b();

    public ane d(String str, ane ane, List<ane> list) {
        String str2 = (String) c().getMap().get(a(str));
        if (str2 == null) {
            return ane;
        }
        int lastIndexOf = str2.lastIndexOf(" REVERSE");
        boolean z = false;
        if (lastIndexOf > 0) {
            str2 = str2.substring(0, lastIndexOf);
            z = true;
        }
        Optional firstMatch = FluentIterable.from(list).firstMatch(new a(str2));
        if (!firstMatch.isPresent()) {
            return ane;
        }
        return ((ane) firstMatch.get()).a(z);
    }

    public void e(String str, ane ane) {
        String str2;
        SortingModel c2 = c();
        StringBuilder sb = new StringBuilder();
        sb.append(ane.c());
        sb.append(ane.e() ? " REVERSE" : "");
        String sb2 = sb.toString();
        cfc a2 = a(str);
        SortOrderLruCache<cfc, String> map = c2.getMap();
        map.remove(a2);
        map.put(a2, sb2);
        try {
            str2 = this.c.a().writeValueAsString(c2);
        } catch (JsonProcessingException e) {
            Assertion.g("Failed to write sorting for items: " + e);
            str2 = null;
        }
        if (str2 != null) {
            SpSharedPreferences.a<Object> b2 = this.b.d(this.a).b();
            b2.f(b(), str2);
            b2.i();
        }
    }
}

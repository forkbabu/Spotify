package com.spotify.mobile.android.util;

import android.content.Context;
import android.text.TextUtils;
import com.adjust.sdk.Constants;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.mobile.android.util.prefs.i;
import com.spotify.music.json.d;
import com.spotify.music.json.e;
import com.spotify.music.json.g;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public abstract class EntitySorting {
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
        private final SortOrderLruCache<String, String> mSortMap;

        @JsonCreator
        public SortingModel(@JsonProperty("map") SortOrderLruCache<String, String> sortOrderLruCache) {
            this.mSortMap = sortOrderLruCache;
        }

        public SortOrderLruCache<String, String> getMap() {
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

    private SortingModel c() {
        SortingModel sortingModel = this.d;
        if (sortingModel != null && sortingModel.getMap() != null) {
            return this.d;
        }
        String m = this.b.d(this.a).m(b(), "");
        if (!TextUtils.isEmpty(m)) {
            try {
                this.d = (SortingModel) this.c.a().readValue(m, SortingModel.class);
            } catch (IOException unused) {
                Assertion.g("Failed to fetch sorting for items.");
            }
        }
        SortingModel sortingModel2 = this.d;
        if (sortingModel2 == null || sortingModel2.getMap() == null) {
            this.d = new SortingModel(new SortOrderLruCache(Constants.ONE_SECOND));
        }
        return this.d;
    }

    @Deprecated
    public SortOption a(String str, SortOption sortOption, List<SortOption> list) {
        String str2 = (String) c().getMap().get(str);
        SortOption sortOption2 = null;
        if (str2 != null) {
            int lastIndexOf = str2.lastIndexOf(" REVERSE");
            boolean z = false;
            if (lastIndexOf > 0) {
                str2 = str2.substring(0, lastIndexOf);
                z = true;
            }
            int indexOf = list.indexOf(new SortOption(str2));
            if (indexOf > -1) {
                sortOption2 = new SortOption(list.get(indexOf));
                sortOption2.h(z, true);
            }
        }
        return (SortOption) x.n(sortOption2, sortOption);
    }

    /* access modifiers changed from: protected */
    public abstract SpSharedPreferences.b<Object, String> b();

    @Deprecated
    public void d(String str, String str2) {
        String str3;
        SortingModel c2 = c();
        SortOrderLruCache<String, String> map = c2.getMap();
        map.remove(str);
        map.put(str, str2);
        try {
            str3 = this.c.a().writeValueAsString(c2);
        } catch (JsonProcessingException e) {
            Assertion.g("Failed to write sorting for items: " + e);
            str3 = null;
        }
        if (str3 != null) {
            SpSharedPreferences.a<Object> b2 = this.b.d(this.a).b();
            b2.f(b(), str3);
            b2.i();
        }
    }
}

package com.spotify.music.features.yourlibrary.musicpages.filterandsort;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.music.json.d;
import com.spotify.music.json.g;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.operators.observable.o;
import io.reactivex.internal.operators.observable.v;
import io.reactivex.s;
import io.reactivex.y;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MusicPagesFiltering {
    private final e1 a;
    private final d b;
    private final s<String> c;
    private final y d;
    private final int e;
    private final io.reactivex.subjects.a<a> f = io.reactivex.subjects.a.h1();
    private s<String> g;
    private String h;
    private FilteringModel i;

    /* access modifiers changed from: private */
    public static class FilteringLruCache<A, B> extends LinkedHashMap<A, B> implements JacksonModel {
        private static final long serialVersionUID = 5725615578088416848L;
        private int mMaxEntries;

        @JsonCreator
        public FilteringLruCache() {
            this(100);
        }

        /* access modifiers changed from: protected */
        @Override // java.util.LinkedHashMap
        public boolean removeEldestEntry(Map.Entry<A, B> entry) {
            return size() > this.mMaxEntries;
        }

        FilteringLruCache(int i) {
            super(i, 1.0f, true);
            this.mMaxEntries = i;
        }
    }

    /* access modifiers changed from: private */
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class FilteringModel implements JacksonModel {
        @JsonProperty("states")
        private final FilteringLruCache<String, Map<String, Boolean>> mFilterMap;

        @JsonCreator
        public FilteringModel(@JsonProperty("states") FilteringLruCache<String, Map<String, Boolean>> filteringLruCache) {
            this.mFilterMap = filteringLruCache;
        }

        public void clearFilterState(String str) {
            this.mFilterMap.remove(str);
        }

        public ImmutableMap<String, Boolean> getFilterState(String str) {
            return ImmutableMap.copyOf((Map) MoreObjects.firstNonNull(this.mFilterMap.get(str), ImmutableMap.of()));
        }

        public FilteringLruCache<String, Map<String, Boolean>> getMap() {
            return this.mFilterMap;
        }

        public void setFilterState(String str, String str2, Boolean bool) {
            Map map = (Map) this.mFilterMap.get(str);
            if (map == null) {
                map = new HashMap();
                this.mFilterMap.put(str, map);
            }
            map.put(str2, bool);
        }
    }

    /* access modifiers changed from: protected */
    public static abstract class a {
        private static final a a = new w0("");
        public static final /* synthetic */ int b = 0;

        protected a() {
        }

        public abstract String b();
    }

    public MusicPagesFiltering(g1 g1Var, g gVar, io.reactivex.g<SessionState> gVar2, y yVar) {
        g1Var.getClass();
        f1 f1Var = new f1(g1Var);
        this.a = f1Var;
        this.b = new k1(this, gVar);
        this.c = new v(gVar2.O(t0.a).C(m0.a));
        this.d = yVar;
        this.e = 100;
    }

    /* access modifiers changed from: private */
    public void h() {
        if (this.i != null && this.h != null) {
            String str = null;
            try {
                str = this.b.a().writeValueAsString(this.i);
            } catch (JsonProcessingException unused) {
                Assertion.g("Failed to write filter states.");
            }
            if (str != null) {
                e1 e1Var = this.a;
                f1 f1Var = (f1) e1Var;
                SpSharedPreferences.a<Object> b2 = f1Var.a.b.b(f1Var.a.a, this.h).b();
                b2.f(g1.c, str);
                b2.i();
            }
        }
    }

    public void a(String str) {
        FilteringModel filteringModel;
        if (this.g != null && (filteringModel = this.i) != null) {
            filteringModel.clearFilterState(str);
            io.reactivex.subjects.a<a> aVar = this.f;
            int i2 = a.b;
            aVar.onNext(new w0(str));
        }
    }

    public /* synthetic */ String c(a aVar) {
        if (aVar != a.a) {
            h();
        }
        return aVar.b();
    }

    public io.reactivex.v d(String str) {
        if (this.i == null || !str.equals(this.h)) {
            FilteringModel filteringModel = null;
            f1 f1Var = (f1) this.a;
            String m = f1Var.a.b.b(f1Var.a.a, str).m(g1.c, "");
            m.getClass();
            if (!MoreObjects.isNullOrEmpty(m)) {
                try {
                    filteringModel = (FilteringModel) this.b.a().readValue(m, FilteringModel.class);
                } catch (IOException unused) {
                    Assertion.g("Failed parsing filter states.");
                }
            }
            if (filteringModel == null) {
                filteringModel = new FilteringModel(new FilteringLruCache(this.e));
            }
            this.h = str;
            this.i = filteringModel;
        }
        return this.f.G0(a.a).o0(this.d).j0(new l0(this));
    }

    public /* synthetic */ void e() {
        this.d.b(new j0(this));
    }

    public /* synthetic */ ImmutableMap f(String str, String str2) {
        FilteringModel filteringModel = this.i;
        if (filteringModel != null) {
            return filteringModel.getFilterState(str);
        }
        return ImmutableMap.of();
    }

    public s<ImmutableMap<String, Boolean>> g(String str) {
        if (this.g == null) {
            this.g = this.c.N0(1).o0(this.d).J0(new k0(this)).M(Functions.f(), new n0(this)).v0(1).h1();
        }
        return this.g.E0(this.i != null ? s.i0("") : o.a).Q(new o0(str)).j0(new i0(this, str)).E();
    }

    public void i(String str, String str2, Boolean bool) {
        FilteringModel filteringModel;
        if (this.g != null && (filteringModel = this.i) != null) {
            filteringModel.setFilterState(str, str2, bool);
            io.reactivex.subjects.a<a> aVar = this.f;
            int i2 = a.b;
            aVar.onNext(new w0(str));
        }
    }
}

package com.spotify.music.libs.search.ondemand.editorial.cache;

import android.text.TextUtils;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.music.json.e;
import java.util.Collections;
import java.util.List;

public class b implements a {
    private static final SpSharedPreferences.b<Object, String> c = SpSharedPreferences.b.e("searchEditorialOnDemandInfo");
    private final SpSharedPreferences<Object> a;
    private final ObjectMapper b;

    class a extends TypeReference<List<EditorialOnDemandCachedInfo>> {
        a(b bVar) {
        }
    }

    public b(SpSharedPreferences<Object> spSharedPreferences, e eVar) {
        this.a = spSharedPreferences;
        this.b = eVar.build();
    }

    @Override // com.spotify.music.libs.search.ondemand.editorial.cache.a
    public void a(List<EditorialOnDemandCachedInfo> list) {
        String writeValueAsString = this.b.writeValueAsString(list);
        SpSharedPreferences.a<Object> b2 = this.a.b();
        b2.f(c, writeValueAsString);
        b2.j();
    }

    @Override // com.spotify.music.libs.search.ondemand.editorial.cache.a
    public List<EditorialOnDemandCachedInfo> read() {
        List<EditorialOnDemandCachedInfo> list = null;
        String m = this.a.m(c, null);
        if (!TextUtils.isEmpty(m)) {
            list = (List) this.b.readValue(m, new a(this));
        }
        if (list != null) {
            return list;
        }
        return Collections.emptyList();
    }
}

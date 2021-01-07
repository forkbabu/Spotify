package com.spotify.mobile.android.rx;

import com.google.common.base.Optional;
import com.google.common.collect.Collections2;
import com.google.common.collect.ImmutableMap;
import io.reactivex.functions.c;
import java.util.HashMap;
import java.util.Map;

public final /* synthetic */ class b implements c {
    public static final /* synthetic */ b a = new b();

    private /* synthetic */ b() {
    }

    @Override // io.reactivex.functions.c
    public final Object a(Object obj, Object obj2) {
        Map map = (Map) obj;
        Optional optional = (Optional) obj2;
        if (!optional.isPresent()) {
            return ImmutableMap.of();
        }
        HashMap newHashMapWithExpectedSize = Collections2.newHashMapWithExpectedSize(((Map) optional.get()).size() + map.size());
        newHashMapWithExpectedSize.putAll(map);
        newHashMapWithExpectedSize.putAll((Map) optional.get());
        return ImmutableMap.copyOf(newHashMapWithExpectedSize);
    }
}

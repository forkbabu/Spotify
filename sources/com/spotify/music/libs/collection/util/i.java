package com.spotify.music.libs.collection.util;

import com.google.common.base.Predicate;
import com.google.common.collect.Collections2;
import com.google.common.collect.ImmutableList;
import io.reactivex.functions.l;
import java.util.Map;

public final /* synthetic */ class i implements l {
    public static final /* synthetic */ i a = new i();

    private /* synthetic */ i() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        Map map = (Map) obj;
        int i = ImmutableList.a;
        ImmutableList.Builder builder = new ImmutableList.Builder();
        if (map.isEmpty()) {
            return builder.build();
        }
        builder.addAll(Collections2.transform(Collections2.filter((Iterable) map.entrySet(), (Predicate) g.a), a.a));
        return builder.build();
    }
}

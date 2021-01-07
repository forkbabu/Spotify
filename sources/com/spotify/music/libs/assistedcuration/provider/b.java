package com.spotify.music.libs.assistedcuration.provider;

import io.reactivex.functions.l;
import java.util.Map;

public final /* synthetic */ class b implements l {
    public final /* synthetic */ Map a;

    public /* synthetic */ b(Map map) {
        this.a = map;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        Map map = this.a;
        map.putAll((Map) obj);
        return map;
    }
}

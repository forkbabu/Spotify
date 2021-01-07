package com.spotify.music.libs.collection.util;

import com.spotify.mobile.android.spotlets.collection.util.CollectionStateProvider;
import io.reactivex.functions.l;
import java.util.Map;

public final /* synthetic */ class c implements l {
    public static final /* synthetic */ c a = new c();

    private /* synthetic */ c() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        Map map = (Map) obj;
        Boolean bool = Boolean.FALSE;
        if (map.isEmpty()) {
            return bool;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (!((CollectionStateProvider.a) entry.getValue()).b()) {
                return bool;
            }
        }
        return Boolean.TRUE;
    }
}

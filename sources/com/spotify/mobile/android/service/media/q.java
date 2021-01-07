package com.spotify.mobile.android.service.media;

import com.spotify.mobile.android.spotlets.collection.util.CollectionStateProvider;
import io.reactivex.functions.l;
import java.util.Map;

public final /* synthetic */ class q implements l {
    public final /* synthetic */ String a;

    public /* synthetic */ q(String str) {
        this.a = str;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        String str = this.a;
        Map map = (Map) obj;
        return Boolean.valueOf(map.get(str) != null && ((CollectionStateProvider.a) map.get(str)).b());
    }
}

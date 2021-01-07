package com.spotify.music.libs.assistedcuration.provider;

import io.reactivex.functions.l;
import java.util.Map;

public final /* synthetic */ class c implements l {
    public final /* synthetic */ Map a;
    public final /* synthetic */ CardAction b;

    public /* synthetic */ c(Map map, CardAction cardAction) {
        this.a = map;
        this.b = cardAction;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        Map map = this.a;
        map.put(this.b.e(), (x) obj);
        return map;
    }
}

package com.spotify.music.libs.assistedcuration.provider;

import io.reactivex.functions.l;
import java.util.Map;

public final /* synthetic */ class g implements l {
    public final /* synthetic */ y a;
    public final /* synthetic */ Map b;

    public /* synthetic */ g(y yVar, Map map) {
        this.a = yVar;
        this.b = map;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        y yVar = this.a;
        Map map = this.b;
        yVar.d(map, (Map) obj);
        return map;
    }
}

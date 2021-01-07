package com.spotify.music.libs.assistedcuration.provider;

import io.reactivex.s;
import java.util.Map;
import java.util.concurrent.Callable;

public final /* synthetic */ class f implements Callable {
    public final /* synthetic */ Map a;
    public final /* synthetic */ CardAction b;

    public /* synthetic */ f(Map map, CardAction cardAction) {
        this.a = map;
        this.b = cardAction;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Map map = this.a;
        CardAction cardAction = this.b;
        for (Map.Entry entry : map.entrySet()) {
            x xVar = (x) entry.getValue();
            xVar.i(cardAction.g());
            entry.setValue(xVar);
        }
        return s.i0(map);
    }
}

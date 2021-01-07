package com.spotify.music.features.queue;

import com.google.common.base.Function;
import com.spotify.mobile.android.cosmos.player.v2.queue.PlayerQueueUtil;
import com.spotify.music.features.queue.v;

public final /* synthetic */ class f implements Function {
    public static final /* synthetic */ f a = new f();

    private /* synthetic */ f() {
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        v.a aVar = (v.a) obj;
        return PlayerQueueUtil.queuedExplicitly(((sx7) aVar.b).f(), aVar.a == 2);
    }
}

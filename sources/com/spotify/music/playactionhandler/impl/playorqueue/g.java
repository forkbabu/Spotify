package com.spotify.music.playactionhandler.impl.playorqueue;

import com.google.common.base.Optional;
import io.reactivex.functions.l;

public final /* synthetic */ class g implements l {
    public final /* synthetic */ Optional a;

    public /* synthetic */ g(Optional optional) {
        this.a = optional;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        Boolean bool = (Boolean) obj;
        return this.a;
    }
}

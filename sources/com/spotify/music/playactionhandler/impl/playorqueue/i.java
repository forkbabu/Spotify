package com.spotify.music.playactionhandler.impl.playorqueue;

import com.google.common.base.Optional;
import io.reactivex.functions.l;

public final /* synthetic */ class i implements l {
    public final /* synthetic */ o a;
    public final /* synthetic */ String b;

    public /* synthetic */ i(o oVar, String str) {
        this.a = oVar;
        this.b = str;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.e(this.b, (Optional) obj);
    }
}

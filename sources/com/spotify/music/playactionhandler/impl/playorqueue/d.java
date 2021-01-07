package com.spotify.music.playactionhandler.impl.playorqueue;

import io.reactivex.functions.l;

public final /* synthetic */ class d implements l {
    public final /* synthetic */ o a;
    public final /* synthetic */ String b;

    public /* synthetic */ d(o oVar, String str) {
        this.a = oVar;
        this.b = str;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.d(this.b, (Boolean) obj);
    }
}

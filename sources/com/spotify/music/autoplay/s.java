package com.spotify.music.autoplay;

import com.google.common.base.MoreObjects;
import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.l;
import io.reactivex.internal.operators.observable.o;

public final /* synthetic */ class s implements l {
    public final /* synthetic */ String a;

    public /* synthetic */ s(String str) {
        this.a = str;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        String str = this.a;
        String str2 = (String) obj;
        if (!MoreObjects.isNullOrEmpty(str2)) {
            return io.reactivex.s.i0(str2);
        }
        Logger.n("Autoplay not triggered: context uri: %s", str);
        return o.a;
    }
}

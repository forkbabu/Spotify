package com.spotify.music.autoplay;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.l;
import io.reactivex.internal.operators.observable.o;
import io.reactivex.s;

public final /* synthetic */ class q implements l {
    public final /* synthetic */ s a;

    public /* synthetic */ q(s sVar) {
        this.a = sVar;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        s sVar = this.a;
        Boolean bool = (Boolean) obj;
        Logger.b("Applying Flag. Value is:%s", bool);
        return bool.booleanValue() ? sVar : o.a;
    }
}

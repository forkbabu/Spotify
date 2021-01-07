package com.spotify.music.builtinauth.authenticator;

import io.reactivex.a;
import io.reactivex.functions.l;
import io.reactivex.internal.operators.completable.b;

public final /* synthetic */ class s implements l {
    public final /* synthetic */ Exception a;

    public /* synthetic */ s(Exception exc) {
        this.a = exc;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        Exception exc = this.a;
        if (((Boolean) obj).booleanValue()) {
            return a.t(exc);
        }
        return b.a;
    }
}

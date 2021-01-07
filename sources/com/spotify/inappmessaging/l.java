package com.spotify.inappmessaging;

import com.spotify.base.java.logging.Logger;
import defpackage.mo0;

public class l implements da2<lo0> {
    private boolean a;

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.da2
    public void accept(lo0 lo0) {
        mo0 e = lo0.e();
        e.getClass();
        boolean z = e instanceof mo0.b;
        this.a = z;
        Logger.b("[ModelObserver] Check has loaded triggers: %s", Boolean.valueOf(z));
    }
}

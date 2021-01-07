package com.spotify.mobile.android.spotlets.appprotocol;

import io.reactivex.functions.a;

public final /* synthetic */ class r0 implements a {
    public final /* synthetic */ Object a;
    public final /* synthetic */ String b;

    public /* synthetic */ r0(Object obj, String str) {
        this.a = obj;
        this.b = str;
    }

    @Override // io.reactivex.functions.a
    public final void run() {
        Object obj = this.a;
        String str = this.b;
        if (obj == null) {
            throw IapException.a(str, "wamp.error.invalid_argument");
        }
    }
}

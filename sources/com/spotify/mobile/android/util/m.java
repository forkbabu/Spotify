package com.spotify.mobile.android.util;

import android.net.Uri;
import io.reactivex.functions.g;

public final /* synthetic */ class m implements g {
    public final /* synthetic */ q0 a;

    public /* synthetic */ m(q0 q0Var) {
        this.a = q0Var;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        q0.a(this.a, (Uri) obj);
    }
}

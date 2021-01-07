package com.spotify.imageresolve;

import android.net.Uri;
import com.google.common.base.Function;

public final /* synthetic */ class i implements Function {
    public static final /* synthetic */ i a = new i();

    private /* synthetic */ i() {
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        return ((Uri) obj).toString();
    }
}

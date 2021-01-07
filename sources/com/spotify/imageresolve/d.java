package com.spotify.imageresolve;

import android.net.Uri;
import com.google.common.base.Function;
import com.spotify.imageresolve.CacheStatusResponse;

public final /* synthetic */ class d implements Function {
    public static final /* synthetic */ d a = new d();

    private /* synthetic */ d() {
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        return Uri.parse(((CacheStatusResponse.Entry) obj).uri());
    }
}

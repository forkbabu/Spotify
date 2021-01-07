package com.spotify.music.builtinauth.cache;

import com.spotify.music.builtinauth.cache.OfflineAuthCacheException;
import io.reactivex.a;
import io.reactivex.functions.l;

public final /* synthetic */ class d implements l {
    public static final /* synthetic */ d a = new d();

    private /* synthetic */ d() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        Throwable th = (Throwable) obj;
        return a.t(new OfflineAuthCacheException(OfflineAuthCacheException.ErrorMessage.CACHE_UPDATE_ERROR));
    }
}

package com.spotify.music.builtinauth.cache;

import com.spotify.music.builtinauth.cache.OfflineAuthCacheException;
import io.reactivex.functions.l;
import io.reactivex.z;

public final /* synthetic */ class c implements l {
    public static final /* synthetic */ c a = new c();

    private /* synthetic */ c() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        Throwable th = (Throwable) obj;
        return z.q(new OfflineAuthCacheException(OfflineAuthCacheException.ErrorMessage.CACHE_GET_ENTRY_ERROR));
    }
}

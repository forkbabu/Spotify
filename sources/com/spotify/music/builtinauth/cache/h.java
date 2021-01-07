package com.spotify.music.builtinauth.cache;

import com.spotify.music.builtinauth.cache.OfflineAuthCacheException;
import io.reactivex.a;
import io.reactivex.functions.l;

public final /* synthetic */ class h implements l {
    public static final /* synthetic */ h a = new h();

    private /* synthetic */ h() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        Throwable th = (Throwable) obj;
        return a.t(new OfflineAuthCacheException(OfflineAuthCacheException.ErrorMessage.CACHE_REMOVE_ENTRY_ERROR));
    }
}

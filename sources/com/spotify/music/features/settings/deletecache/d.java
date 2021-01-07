package com.spotify.music.features.settings.deletecache;

import io.reactivex.functions.g;

public final /* synthetic */ class d implements g {
    public final /* synthetic */ StorageDeleteCacheActivity a;

    public /* synthetic */ d(StorageDeleteCacheActivity storageDeleteCacheActivity) {
        this.a = storageDeleteCacheActivity;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Throwable th = (Throwable) obj;
        this.a.finish();
    }
}
